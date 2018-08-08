/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

/**
 * @Description 查询 单笔交易 通用冻结明细
 * @author sunjianhua
 * @date 2018年2月6日 上午10:23:45
 */
public class QueryTransactionGeneralFreezeDetailRspData implements Serializable {

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 冻结金额
	 */
	private String amount;

	/**
	 * 累计解冻金额
	 */
	private String unfreezeAmount;

	/**
	 * 冻结金额
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

}
