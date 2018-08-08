/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 冲提 资金回退充值
 * @author sunjianhua
 * @date 2018年1月29日 上午11:22:01
 */
public class CztxBackrollRechargeRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 回退充值请求流水号
	 */
	private String requestNo;

	/**
	 * 回退到账金额（提现实际入账金额）
	 */
	private String rollbackAmount;

	/**
	 * 回退佣金（提现佣金）
	 */
	private String rollbackCommission;

	/**
	 * 提现请求流水号（提现失败对应的提现请求流水号）
	 */
	private String withdrawRequestNo;

	/**
	 * 回退充值完成时间
	 */
	private String completedTime;

	/**
	 * 回退充值状态 :SUCCESS
	 */
	private String status;

	/**
	 * 资金回退类型 :INTERCEPT (表示拦截提现以后系统发起的回充), REMITFAIL (表示提现出款失败后系统发起的回充)
	 */
	private String rollbackType;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRollbackAmount() {
		return rollbackAmount;
	}

	public void setRollbackAmount(String rollbackAmount) {
		this.rollbackAmount = rollbackAmount;
	}

	public String getRollbackCommission() {
		return rollbackCommission;
	}

	public void setRollbackCommission(String rollbackCommission) {
		this.rollbackCommission = rollbackCommission;
	}

	public String getWithdrawRequestNo() {
		return withdrawRequestNo;
	}

	public void setWithdrawRequestNo(String withdrawRequestNo) {
		this.withdrawRequestNo = withdrawRequestNo;
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

	public String getRollbackType() {
		return rollbackType;
	}

	public void setRollbackType(String rollbackType) {
		this.rollbackType = rollbackType;
	}

}
