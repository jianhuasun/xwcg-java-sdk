/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

/**
 * @Description 查询 单笔交易查询 取消预处理明细
 * @author sunjianhua
 * @date 2018年1月29日 上午10:10:31
 */
public class QueryTransactionCancelPreTransactionDetailRspData implements Serializable {

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 预处理业务流水号
	 */
	private String preTransactionNo;

	/**
	 * 取消金额
	 */
	private String amount;

	/**
	 * 交易发起时间
	 */
	private String createTime;

	/**
	 * 交易完成时间，预处理中份额全部解冻的时间
	 */
	private String transactionTime;

	/**
	 * SUCCESS 表示成功，FAIL 表示失败，INIT 表示初始化，ERROR 表示异常
	 */
	private String status;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getPreTransactionNo() {
		return preTransactionNo;
	}

	public void setPreTransactionNo(String preTransactionNo) {
		this.preTransactionNo = preTransactionNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
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

	@Override
	public String toString() {
		return "QueryTransactionCancelPreTransactionDetailRspData [requestNo=" + requestNo + ", preTransactionNo="
				+ preTransactionNo + ", amount=" + amount + ", createTime=" + createTime + ", transactionTime="
				+ transactionTime + ", status=" + status + "]";
	}

}
