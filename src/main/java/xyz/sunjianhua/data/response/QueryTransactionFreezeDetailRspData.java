/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

/**
 * @Description 查询 单笔交易查询 冻结明细
 * @author sunjianhua
 * @date 2018年1月29日 上午9:58:26
 */
public class QueryTransactionFreezeDetailRspData implements Serializable {

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 冻结流水号
	 */
	private String requestNo;

	/**
	 * 冻结金额
	 */
	private String amount;

	/**
	 * 累计已解冻金额
	 */
	private String unfreezeAmount;

	/**
	 * FREEZED 表示尚有冻结，UNFREEZED 表示已解冻，FAIL 表示失败，INIT 表示初始化，ERROR 表示异常
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

	public String getUnfreezeAmount() {
		return unfreezeAmount;
	}

	public void setUnfreezeAmount(String unfreezeAmount) {
		this.unfreezeAmount = unfreezeAmount;
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
		return "QueryTransactionFreezeDetailRspData [platformUserNo=" + platformUserNo + ", requestNo=" + requestNo
				+ ", amount=" + amount + ", unfreezeAmount=" + unfreezeAmount + ", status=" + status + ", createTime="
				+ createTime + ", transactionTime=" + transactionTime + "]";
	}

}
