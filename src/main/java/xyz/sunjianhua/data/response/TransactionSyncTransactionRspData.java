/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 交易 单笔交易 回调
 * @author sunjianhua
 * @date 2018年1月30日 上午9:02:29
 */
public class TransactionSyncTransactionRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 交易状态，SUCCESS 表示成功，FAIL 表示失败
	 */
	private String transactionStatus;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 交易发起时间
	 */
	private String createTime;

	/**
	 * 交易完成时间
	 */
	private String transactionTime;

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
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

}
