/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 账户预留手机号更新 回调
 * @author sunjianhua
 * @date 2018年1月27日 下午4:04:09
 */
public class AccountModifyMobileExpandRspData extends CommonRspData implements Serializable {

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
	 * 银行账户号
	 */
	private String bankcardNo;

	/**
	 * 银行编码
	 */
	private String bankcode;

	/**
	 * 更新后用户的手机号
	 */
	private String mobile;

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

}
