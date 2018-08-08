package xyz.sunjianhua.util;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import xyz.sunjianhua.data.constant.XwcgConstant;

/**
 * 
 * @author sunjianhua
 * @date 2018-1-27 10:02:44
 * @version 1.0
 */
public class AppUtil {

	private final static Log logger = LogFactory.getLog(AppUtil.class);

	/**
	 * 生成参数<br>
	 * 签名加密
	 */
	public static Map<String, String> createFormParam(String serviceName,String userDevice,
			Map<String, Object> reqDataMap) throws GeneralSecurityException {
		Map<String, String> result = new HashMap<String, String>();

		AppConfig config = AppConfig.getConfig();
		String privateStr = config.getPrivateKey();

		String reqData = JSON.toJSONString(reqDataMap,SerializerFeature.WriteMapNullValue,SerializerFeature.MapSortField,SerializerFeature.UseSingleQuotes);
		logger.info("请求接口为 : "+serviceName+",\n参数reqData:" + reqData);
		PrivateKey privateKey = SignatureUtils.getRsaPkcs8PrivateKey(Base64.decodeBase64(privateStr));
		byte[] sign = SignatureUtils.sign(SignatureAlgorithm.SHA1WithRSA,privateKey, reqData);

		// 拼装网关参数
		result.put("serviceName", serviceName);
		result.put("platformNo", config.getPlatformNo());
		result.put("reqData", reqData);
		result.put("userDevice", (userDevice!=null && !"".equals(userDevice))?userDevice:XwcgConstant.TERMINAL_PC);
		result.put("keySerial", config.getKeySerial());
		result.put("sign", Base64.encodeBase64String(sign));

		return result;
	}
	
	/**
	 * 生成参数<br>
	 * 签名加密
	 */
	public static Map<String, String> createHttpPostParam(String serviceName,
			Map<String, Object> reqDataMap) throws GeneralSecurityException {
		Map<String, String> result = new HashMap<String, String>();

		AppConfig config = AppConfig.getConfig();
		String privateStr = config.getPrivateKey();

		String reqData = JSON.toJSONString(reqDataMap,SerializerFeature.WriteMapNullValue,SerializerFeature.MapSortField,SerializerFeature.UseSingleQuotes);
		logger.info("请求接口为 : "+serviceName+",\n参数reqData:" + reqData);
		PrivateKey privateKey = SignatureUtils.getRsaPkcs8PrivateKey(Base64.decodeBase64(privateStr));
		byte[] sign = SignatureUtils.sign(SignatureAlgorithm.SHA1WithRSA,privateKey, reqData);

		// 拼装网关参数
		result.put("serviceName", serviceName);
		result.put("platformNo", config.getPlatformNo());
		result.put("reqData", reqData);
		result.put("keySerial", config.getKeySerial());
		result.put("sign", Base64.encodeBase64String(sign));

		return result;
	}
	
	

	/**
	 * 对新网存管返回的数据进行验签
	 * @param src 返回数据明文
	 * @param signValue 返回数据签名
	 * @return
	 */
	public static boolean verifySign(String respData,String returnSign) {
		  boolean bool = false;
		  try {
			  Map<String, Object> respMap = JSON.parseObject(respData);
				//接口返回code!=0 || status!=SUCCESS时，不做验签处理
			  	if(respMap.containsKey("code") && respMap.containsKey("status")){
			  		if( !"0".equals(respMap.get("code")) ||  !"SUCCESS".equals(respMap.get("status"))) {
						throw new Exception("接口请求失败!");
					}
			  	}
				
				byte[] keyByte = Base64.decodeBase64(AppConfig.getConfig().getLmPublicKey());
				byte[] signByte = Base64.decodeBase64(returnSign);
				try {
					PublicKey publicKey = SignatureUtils.getRsaX509PublicKey(keyByte);

					boolean b = SignatureUtils.verify(SignatureAlgorithm.SHA1WithRSA, publicKey, respData, signByte);
					if (!b) {
						throw new Exception("验签失败，sign与respData不匹配");
					}
					bool=true;
				} catch (InvalidKeySpecException e) {
					throw new InvalidKeySpecException("验签错误，生成商户公钥失败", e);
				} catch (NoSuchAlgorithmException e) {
					throw new NoSuchAlgorithmException("验签错误" + e.getMessage(), e);
				} catch (GeneralSecurityException e) {
					throw new GeneralSecurityException("验签错误" + e.getMessage(), e);
				} 
	        }catch (Exception e) {
	        	e.printStackTrace();
	        	logger.info("验签异常 : "+e.getMessage());
	        }
		return bool;
	}
	
}
