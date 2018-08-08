/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

/**
 * @Description 查询 单笔交易查询 提现明细
 * @author sunjianhua
 * @date 2018年1月29日 上午9:31:58
 */
public class QueryTransactionWithdrawDetailRspData implements Serializable {

	/**
	 * 提现金额
	 */
	private String amount;

	/**
	 * 提现分佣
	 */
	private String commission;

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
	 * 出款时间
	 */
	private String remitTime;

	/**
	 * 到账时间
	 */
	private String completedTime;

	/**
	 * 提现交易状态 见XwConstant
	 */
	private String status;

	/**
	 * 提现银行卡号
	 */
	private String bankcardNo;

	/**
	 * 提现类型，IMMEDIATE 为直接提现，CONFIRMED 为待确认提现，默认为直接提现方式
	 */
	private String withdrawForm;

	/**
	 * 提现失败的订单回充后会返回该状态：SUCCESS（已回退）、PENDDING（回退中）INIT（初始化）
	 */
	private String backRollStatus;

	/**
	 * 出款类型
	 */
	private String remitType;

	/**
	 * 提现方式
	 */
	private String withdrawWay;

	/**
	 * 垫资金额
	 */
	private String floatAmount;

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

	public String getRemitTime() {
		return remitTime;
	}

	public void setRemitTime(String remitTime) {
		this.remitTime = remitTime;
	}

	public String getCompletedTime() {
		return completedTime;
	}

	public void setCompletedTime(String completedTime) {
		this.completedTime = completedTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBankcardNo() {
		return bankcardNo;
	}

	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
	}

	public String getWithdrawForm() {
		return withdrawForm;
	}

	public void setWithdrawForm(String withdrawForm) {
		this.withdrawForm = withdrawForm;
	}

	public String getBackRollStatus() {
		return backRollStatus;
	}

	public void setBackRollStatus(String backRollStatus) {
		this.backRollStatus = backRollStatus;
	}

	public String getRemitType() {
		return remitType;
	}

	public void setRemitType(String remitType) {
		this.remitType = remitType;
	}

	public String getWithdrawWay() {
		return withdrawWay;
	}

	public void setWithdrawWay(String withdrawWay) {
		this.withdrawWay = withdrawWay;
	}

	public String getFloatAmount() {
		return floatAmount;
	}

	public void setFloatAmount(String floatAmount) {
		this.floatAmount = floatAmount;
	}

	@Override
	public String toString() {
		return "QueryTransactionWithdrawDetailRspData [amount=" + amount + ", commission=" + commission
				+ ", platformUserNo=" + platformUserNo + ", createTime=" + createTime + ", transactionTime="
				+ transactionTime + ", remitTime=" + remitTime + ", completedTime=" + completedTime + ", status="
				+ status + ", bankcardNo=" + bankcardNo + ", withdrawForm=" + withdrawForm + ", backRollStatus="
				+ backRollStatus + ", remitType=" + remitType + ", withdrawWay=" + withdrawWay + ", floatAmount="
				+ floatAmount + "]";
	}

}
