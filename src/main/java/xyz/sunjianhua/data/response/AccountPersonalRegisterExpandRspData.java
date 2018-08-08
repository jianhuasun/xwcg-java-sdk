package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 账户个人绑卡注册 回调
 * @author sunjianhua
 * @since 2018-1-27 13:31:57
 */
public class AccountPersonalRegisterExpandRspData extends CommonRspData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 请求流水号
	 */
	private String requestNo;
	
	/**
	 * 平台用户编号
	 */
	private String platformUserNo;
	
	/**
	 * 用户真实姓名
	 */
	private String realName;
	
	/**
	 * 证件类型
	 */
	private String idCardType;
	
	/**
	 * 用户角色
	 */
	private String userRole;
	
	/**
	 * 用户证件号
	 */
	private String idCardNo;
	
	/**
	 * 银行预留手机号
	 */
	private String mobile;
	
	/**
	 * 银行卡号
	 */
	private String bankcardNo;
	
	/**
	 * 银行编码
	 */
	private String bankcode;
	
	/**
	 * 鉴权通过类型
	 */
	private String accessType;
	
	/**
	 * 审核状态
	 */
	private String auditStatus;
	
	/**
	 * 用户授权期限
	 */
	private String failTime;

	/**
	 * 用户授权金额
	 */
	private String amount;
	
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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
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
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
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
	public String getBankcode() {
		return bankcode;
	}
	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}
	public String getAccessType() {
		return accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
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
	
}
