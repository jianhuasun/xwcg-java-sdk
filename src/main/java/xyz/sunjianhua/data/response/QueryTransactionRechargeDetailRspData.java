/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

/**
 * @Description 查询 单笔交易查询 充值明细
 * @author sunjianhua
 * @date 2018年1月29日 上午9:16:21
 */
public class QueryTransactionRechargeDetailRspData implements Serializable {

	/**
	 * 充值金额
	 */
	private String amount;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 交易发起时间
	 */
	private String createTime;

	/**
	 * 交易完成时间
	 */
	private String transactionTime;

	/**
	 * SUCCESS 表示支付成功， FAIL 表示支付失败，ERROR 表示支付错误，PENDDING 表示支付中
	 */
	private String status;

	/**
	 * 支付方式
	 */
	private String rechargeWay;

	/**
	 * 银行编码
	 */
	private String bankcode;

	/**
	 * 支付公司
	 */
	private String payCompany;

	/**
	 * 支付公司订单号
	 */
	private String payCompanyRequestNo;

	/**
	 * 存管错误码
	 */
	private String errorCode;

	/**
	 * 存管错误描述
	 */
	private String errorMessage;

	/**
	 * 支付通道错误码
	 */
	private String channelErrorCode;

	/**
	 * 支付通道返回错误消息
	 */
	private String channelErrorMessage;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getPayCompany() {
		return payCompany;
	}

	public void setPayCompany(String payCompany) {
		this.payCompany = payCompany;
	}

	public String getPayCompanyRequestNo() {
		return payCompanyRequestNo;
	}

	public void setPayCompanyRequestNo(String payCompanyRequestNo) {
		this.payCompanyRequestNo = payCompanyRequestNo;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	@Override
	public String toString() {
		return "QueryTransactionRechargeDetailRspData [amount=" + amount + ", platformUserNo=" + platformUserNo
				+ ", createTime=" + createTime + ", transactionTime=" + transactionTime + ", status=" + status
				+ ", rechargeWay=" + rechargeWay + ", bankcode=" + bankcode + ", payCompany=" + payCompany
				+ ", payCompanyRequestNo=" + payCompanyRequestNo + ", errorCode=" + errorCode + ", errorMessage="
				+ errorMessage + ", channelErrorCode=" + channelErrorCode + ", channelErrorMessage="
				+ channelErrorMessage + "]";
	}

	
	
}
