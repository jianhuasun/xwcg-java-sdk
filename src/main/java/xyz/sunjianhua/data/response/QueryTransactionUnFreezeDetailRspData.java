/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

/**
 * @Description 查询 单笔交易查询 解冻明细
 * @author sunjianhua
 * @date 2018年1月29日 上午9:58:26
 */
public class QueryTransactionUnFreezeDetailRspData implements Serializable {

	/**
	 * 冻结流水号
	 */
	private String requestNo;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 解冻金额
	 */
	private String amount;

	/**
	 * SUCCESS 表示已成功
	 */
	private String status;

	/**
	 * 交易发起时间
	 */
	private String createTime;

	/**
	 * 交易完成时间
	 */
	private String transactionTime;

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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	@Override
	public String toString() {
		return "QueryTransactionUnFreezeDetailRspData [requestNo=" + requestNo + ", platformUserNo=" + platformUserNo
				+ ", amount=" + amount + ", status=" + status + ", createTime=" + createTime + ", transactionTime="
				+ transactionTime + "]";
	}

}
