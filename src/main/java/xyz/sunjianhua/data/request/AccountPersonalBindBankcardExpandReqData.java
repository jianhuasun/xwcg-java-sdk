/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import xyz.sunjianhua.data.constant.XwcgConstant;

/**
 * @Description 账户个人绑卡
 * @author sunjianhua
 * @date 2018年1月27日 下午3:26:59
 */
public class AccountPersonalBindBankcardExpandReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "PERSONAL_BIND_BANKCARD_EXPAND";

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

	/**
	 * 银行预留手机号
	 */
	private String mobile;

	/**
	 * 银行卡号
	 */
	private String bankcardNo;

	/**
	 * 鉴权验证类型
	 */
	private String checkType;

	/**
	 * 绑定类型
	 */
	private String bindType = "UPDATE_BANKCARD";

	public String getUserDevice() {
		return userDevice;
	}

	public void setUserDevice(String userDevice) {
		this.userDevice = userDevice;
	}

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getBankcardNo() {
		return bankcardNo;
	}

	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
	}

	public String getCheckType() {
		return checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public String getBindType() {
		return bindType;
	}

	public void setBindType(String bindType) {
		this.bindType = bindType;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("redirectUrl", getRedirectUrl());
		reqData.put("platformUserNo", getPlatformUserNo());
		if (StringUtils.isNotBlank(getMobile())) {
			reqData.put("mobile", getMobile());
		}
		if (StringUtils.isNotBlank(getBankcardNo())) {
			reqData.put("bankcardNo", getBankcardNo());
		}
		reqData.put("checkType", getCheckType());
		reqData.put("bindType", this.bindType);
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("账户个人绑卡明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
