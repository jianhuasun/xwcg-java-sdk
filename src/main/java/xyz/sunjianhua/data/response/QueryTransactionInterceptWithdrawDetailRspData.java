/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

/**
 * @Description 查询 单笔交易查询 提现拦截明细
 * @author sunjianhua
 * @date 2018年1月29日 上午10:17:45
 */
public class QueryTransactionInterceptWithdrawDetailRspData implements Serializable {

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 提现请求流水号
	 */
	private String withdrawRequestNo;

	/**
	 * 发起时间
	 */
	private String createTime;

	/**
	 * 完成时间
	 */
	private String completedTime;

	/**
	 * 提现拦截状态
	 */
	private String status;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getWithdrawRequestNo() {
		return withdrawRequestNo;
	}

	public void setWithdrawRequestNo(String withdrawRequestNo) {
		this.withdrawRequestNo = withdrawRequestNo;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
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

	@Override
	public String toString() {
		return "QueryTransactionInterceptWithdrawDetailRspData [requestNo=" + requestNo + ", withdrawRequestNo="
				+ withdrawRequestNo + ", createTime=" + createTime + ", completedTime=" + completedTime + ", status="
				+ status + "]";
	}

}
