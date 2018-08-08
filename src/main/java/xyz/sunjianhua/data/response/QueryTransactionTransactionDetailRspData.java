/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

/**
 * @Description 查询 单笔交易查询 交易确认明细
 * @author sunjianhua
 * @date 2018年1月29日 上午9:53:11
 */
public class QueryTransactionTransactionDetailRspData implements Serializable {

	/**
	 * 标的号
	 */
	private String projectNo;

	/**
	 * 预处理业务类型
	 */
	private String confirmTradeType;

	/**
	 * 交易确认请求流水号
	 */
	private String requestNo;

	/**
	 * 平台佣金
	 */
	private String commission;

	/**
	 * 交易发起时间
	 */
	private String createTime;

	/**
	 * SUCCESS 表示成功，FAIL 表示失败，INIT 表示初始化，ERROR 表示异常，ACCEPT表示已受理， PROCESSING
	 * 表示处理中
	 */
	private String status;

	/**
	 * 交易完成时间
	 */
	private String transactionTime;

	/**
	 * 错误码
	 */
	private String errorCode;

	/**
	 * 错误描述
	 */
	private String errorMessage;

	public String getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getConfirmTradeType() {
		return confirmTradeType;
	}

	public void setConfirmTradeType(String confirmTradeType) {
		this.confirmTradeType = confirmTradeType;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
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

	@Override
	public String toString() {
		return "QueryTransactionTransactionDetailRspData [projectNo=" + projectNo + ", confirmTradeType="
				+ confirmTradeType + ", requestNo=" + requestNo + ", commission=" + commission + ", createTime="
				+ createTime + ", status=" + status + ", transactionTime=" + transactionTime + ", errorCode="
				+ errorCode + ", errorMessage=" + errorMessage + "]";
	}

}
