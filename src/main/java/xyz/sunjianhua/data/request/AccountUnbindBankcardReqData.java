/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import xyz.sunjianhua.data.constant.XwcgConstant;

/**
 * @Description 账户解绑银行卡
 * @author sunjianhua
 * @date 2018年1月27日 下午3:48:41
 */
public class AccountUnbindBankcardReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "UNBIND_BANKCARD";

	/**
	 * 设备类型
	 */
	private String userDevice;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 页面回跳URL
	 */
	private String redirectUrl;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	public String getUserDevice() {
		return userDevice;
	}

	public void setUserDevice(String userDevice) {
		this.userDevice = userDevice;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("redirectUrl", getRedirectUrl());
		reqData.put("platformUserNo", getPlatformUserNo());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("账户解绑银行卡明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
