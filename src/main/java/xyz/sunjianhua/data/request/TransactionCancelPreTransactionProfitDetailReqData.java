/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;

/**
 * @Description 预处理取消 分润明细
 * @author sunjianhua
 * @date 2018年2月6日 上午11:44:51
 */
public class TransactionCancelPreTransactionProfitDetailReqData implements Serializable {

	/**
	 * 平台会员编号
	 */
	private String platformUserNo;

	/**
	 * 分润金额
	 */
	private String amount;

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

}
