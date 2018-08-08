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
 * @Description 账户个人绑卡注册
 * @author sunjianhua
 * @date 2018年1月27日 10:17:21
 */
public class AccountPersonalRegisterExpandReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "PERSONAL_REGISTER_EXPAND";

	/**
	 * 设备类型
	 */
	private String userDevice;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 用户真实姓名
	 */
	private String realName;

	/**
	 * 用户证件号
	 */
	private String idCardNo;

	/**
	 * 银行卡号
	 */
	private String bankcardNo;

	/**
	 * 银行预留手机号
	 */
	private String mobile;

	/**
	 * 证件类型
	 */
	private String idCardType;

	/**
	 * 用户角色
	 */
	private String userRole;

	/**
	 * 鉴权验证类型
	 */
	private String checkType;

	/**
	 * 页面回跳URL
	 */
	private String redirectUrl;

	/**
	 * 验证身份证唯一性，固定值ID_CARD_NO_UNIQUE
	 */
	private String userLimitType = "ID_CARD_NO_UNIQUE";

	/**
	 * 用户授权列表
	 */
	private String authList;

	/**
	 * 授权期限
	 */
	private String failTime;

	/**
	 * 授权金额
	 */
	private String amount;

	public String getUserDevice() {
		return userDevice;
	}

	public void setUserDevice(String userDevice) {
		this.userDevice = userDevice;
	}

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getBankcardNo() {
		return bankcardNo;
	}

	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIdCardType() {
		return idCardType;
	}

	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getCheckType() {
		return checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getUserLimitType() {
		return userLimitType;
	}

	public void setUserLimitType(String userLimitType) {
		this.userLimitType = userLimitType;
	}

	public String getAuthList() {
		return authList;
	}

	public void setAuthList(String authList) {
		this.authList = authList;
	}

	public String getFailTime() {
		return failTime;
	}

	public void setFailTime(String failTime) {
		this.failTime = failTime;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("platformUserNo", getPlatformUserNo());
		reqData.put("requestNo", getRequestNo());
		if (StringUtils.isNotBlank(getRealName())) {
			reqData.put("realName", getRealName());
		}
		if (StringUtils.isNotBlank(getIdCardNo())) {
			reqData.put("idCardNo", getIdCardNo());
		}
		if (StringUtils.isNotBlank(getBankcardNo())) {
			reqData.put("bankcardNo", getBankcardNo());
		}
		if (StringUtils.isNotBlank(getMobile())) {
			reqData.put("mobile", getMobile());
		}
		if (StringUtils.isNotBlank(getIdCardType())) {
			reqData.put("idCardType", getIdCardType());
		}
		reqData.put("userRole", getUserRole());
		reqData.put("checkType", getCheckType());
		reqData.put("redirectUrl", getRedirectUrl());
		if (StringUtils.isNotBlank(getUserLimitType())) {
			reqData.put("userLimitType", getUserLimitType());
		}
		if (StringUtils.isNotBlank(getAuthList())) {
			reqData.put("authList", getAuthList());
		}
		if (StringUtils.isNotBlank(getFailTime())) {
			reqData.put("failTime", getFailTime());
		}
		if (StringUtils.isNotBlank(getAmount())) {
			reqData.put("amount", getAmount());
		}
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("账户个人绑卡注册明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
