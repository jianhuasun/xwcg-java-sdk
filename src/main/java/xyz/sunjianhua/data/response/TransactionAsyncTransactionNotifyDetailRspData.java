/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

/**
 * @Description 交易 批量交易 主动异步回调明细
 * @author sunjianhua
 * @date 2018年1月30日 上午9:20:45
 */
public class TransactionAsyncTransactionNotifyDetailRspData implements Serializable {

	/**
	 * 交易明细订单号
	 */
	private String asyncRequestNo;

	/**
	 * 见【交易类型】
	 */
	private String bizType;

	/**
	 * 见【业务来源】
	 */
	private String bizOrigin;

	/**
	 * 交易发起时间
	 */
	private String createTime;

	/**
	 * 交易完成时间
	 */
	private String transactionTime;

	/**
	 * 交易状态，SUCCESS 表示成功，FAIL 表示失败
	 */
	private String status;

	/**
	 * 错误码
	 */
	private String errorCode;

	/**
	 * 错误码描述
	 */
	private String errorMessage;

	public String getAsyncRequestNo() {
		return asyncRequestNo;
	}

	public void setAsyncRequestNo(String asyncRequestNo) {
		this.asyncRequestNo = asyncRequestNo;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizOrigin() {
		return bizOrigin;
	}

	public void setBizOrigin(String bizOrigin) {
		this.bizOrigin = bizOrigin;
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

}
