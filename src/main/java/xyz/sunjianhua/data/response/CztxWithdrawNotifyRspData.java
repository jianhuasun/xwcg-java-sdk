/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 冲提 提现 主动异步回调
 * @author sunjianhua
 * @date 2018年1月29日 上午11:12:37
 */
public class CztxWithdrawNotifyRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 提现交易状态
	 */
	private String withdrawStatus;

	/**
	 * 请求流水号
	 */
	private String requestNo;

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
	 * 提现银行卡号
	 */
	private String bankcardNo;

	/**
	 * 提现类型
	 */
	private String remitType;
	/**
	 * 提现方式
	 */
	private String withdrawWay;

	/**
	 * 提现类型
	 */
	private String withdrawForm;

	/**
	 * 垫资金额
	 */
	private String floatAmount;

	public String getWithdrawStatus() {
		return withdrawStatus;
	}

	public void setWithdrawStatus(String withdrawStatus) {
		this.withdrawStatus = withdrawStatus;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
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

	public String getBankcardNo() {
		return bankcardNo;
	}

	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
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

	public String getWithdrawForm() {
		return withdrawForm;
	}

	public void setWithdrawForm(String withdrawForm) {
		this.withdrawForm = withdrawForm;
	}

	public String getFloatAmount() {
		return floatAmount;
	}

	public void setFloatAmount(String floatAmount) {
		this.floatAmount = floatAmount;
	}

}
