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
 * @Description 账户预留手机号更新
 * @author sunjianhua
 * @date 2018年1月27日 下午4:01:43
 */
public class AccountModifyMobileExpandReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "MODIFY_MOBILE_EXPAND";

	/**
	 * 设备类型
	 */
	private String userDevice;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 更新后用户手机号
	 */
	private String mobile;

	/**
	 * 页面回跳URL
	 */
	private String redirectUrl;

	/**
	 * 鉴权验证类型
	 */
	private String checkType;

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

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getCheckType() {
		return checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("platformUserNo", getPlatformUserNo());
		if (StringUtils.isNotBlank(getMobile())) {
			reqData.put("mobile", getMobile());
		}
		reqData.put("redirectUrl", getRedirectUrl());
		if (StringUtils.isNotBlank(getCheckType())) {
			reqData.put("checkType", getCheckType());
		}
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("账户预留手机号更新明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
