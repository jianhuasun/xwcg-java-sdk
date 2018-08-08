/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 冲提 自动充值 返回
 * @author sunjianhua
 * @date 2018年1月29日 上午11:02:15
 */
public class CztxDirectRechargeRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 充值状态；SUCCESS 支付成功、FAIL 支付失败、PENDDING 支付中
	 */
	private String rechargeStatus;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 充值金额
	 */
	private String amount;

	/**
	 * 平台佣金
	 */
	private String commission;

	/**
	 * 见【支付公司】
	 */
	private String payCompany;

	/**
	 * 见【支付方式】
	 */
	private String rechargeWay;

	/**
	 * 见【银行编码】（只有快捷会返回）
	 */
	private String bankcode;

	/**
	 * 本次充值手机号
	 */
	private String payMobile;

	/**
	 * 交易完成时间
	 */
	private String transactionTime;

	/**
	 * 支付通道错误码
	 */
	private String channelErrorCode;

	/**
	 * 支付通道返回错误消息
	 */
	private String channelErrorMessage;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRechargeStatus() {
		return rechargeStatus;
	}

	public void setRechargeStatus(String rechargeStatus) {
		this.rechargeStatus = rechargeStatus;
	}

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getPayCompany() {
		return payCompany;
	}

	public void setPayCompany(String payCompany) {
		this.payCompany = payCompany;
	}

	public String getRechargeWay() {
		return rechargeWay;
	}

	public void setRechargeWay(String rechargeWay) {
		this.rechargeWay = rechargeWay;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getPayMobile() {
		return payMobile;
	}

	public void setPayMobile(String payMobile) {
		this.payMobile = payMobile;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getChannelErrorCode() {
		return channelErrorCode;
	}

	public void setChannelErrorCode(String channelErrorCode) {
		this.channelErrorCode = channelErrorCode;
	}

	public String getChannelErrorMessage() {
		return channelErrorMessage;
	}

	public void setChannelErrorMessage(String channelErrorMessage) {
		this.channelErrorMessage = channelErrorMessage;
	}

}
