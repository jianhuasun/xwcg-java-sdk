/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 账户个人绑卡 回调
 * @author sunjianhua
 * @date 2018年1月27日 下午3:29:20
 */
public class AccountPersonalBindBankcardExpandRspData extends CommonRspData implements Serializable {

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
	 * 银行卡号
	 */
	private String bankcardNo;

	/**
	 * 银行编码
	 */
	private String bankcode;

	/**
	 * 银行预留手机号
	 */
	private String mobile;

	/**
	 * 鉴权通过类型
	 */
	private String accessType;

	/**
	 * 换卡状态 固定值 : AUDIT (审核中)
	 */
	private String auditStatus;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

}
