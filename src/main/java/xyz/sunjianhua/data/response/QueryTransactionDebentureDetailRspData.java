/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

/**
 * @Description 查询 单笔交易查询 债权出让明细
 * @author sunjianhua
 * @date 2018年1月29日 上午10:06:17
 */
public class QueryTransactionDebentureDetailRspData implements Serializable {

	/**
	 * 债权出让平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 标的号
	 */
	private String projectNo;

	/**
	 * 出让份额
	 */
	private String saleShare;

	/**
	 * 累计预处理中份额
	 */
	private String preSalingShare;

	/**
	 * 累计已确认份额
	 */
	private String confirmedShare;

	/**
	 * 债权出让订单状态，ONSALE 表示出让中，COMPLETED 表示已结束,
	 */
	private String status;

	/**
	 * 交易发起时间
	 */
	private String createTime;

	/**
	 * 交易完成时间，预处理中份额全部解冻的时间
	 */
	private String transactionTime;

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	public String getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getSaleShare() {
		return saleShare;
	}

	public void setSaleShare(String saleShare) {
		this.saleShare = saleShare;
	}

	public String getPreSalingShare() {
		return preSalingShare;
	}

	public void setPreSalingShare(String preSalingShare) {
		this.preSalingShare = preSalingShare;
	}

	public String getConfirmedShare() {
		return confirmedShare;
	}

	public void setConfirmedShare(String confirmedShare) {
		this.confirmedShare = confirmedShare;
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
		return "QueryTransactionDebentureDetailRspData [platformUserNo=" + platformUserNo + ", projectNo=" + projectNo
				+ ", saleShare=" + saleShare + ", preSalingShare=" + preSalingShare + ", confirmedShare="
				+ confirmedShare + ", status=" + status + ", createTime=" + createTime + ", transactionTime="
				+ transactionTime + "]";
	}

}
