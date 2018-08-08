/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 冲提 自动提现 回调
 * @author sunjianhua
 * @date 2018年1月29日 上午11:34:17
 */
public class CztxAutoWithdrawRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 提现交易状态
	 */
	private String withdrawStatus;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 提现金额
	 */
	private String amount;

	/**
	 * 提现分佣
	 */
	private String commission;

	/**
	 * 提现方式
	 */
	private String withdrawType;

	/**
	 * 提现银行卡号
	 */
	private String bankcardNo;

	/**
	 * 银行编码
	 */
	private String bankcode;

	/**
	 * 交易完成时间
	 */
	private String transactionTime;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getWithdrawStatus() {
		return withdrawStatus;
	}

	public void setWithdrawStatus(String withdrawStatus) {
		this.withdrawStatus = withdrawStatus;
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

	public String getWithdrawType() {
		return withdrawType;
	}

	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
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

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

}
