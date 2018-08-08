/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 交易 单笔债权出让 回调
 * @author sunjianhua
 * @date 2018年1月30日 上午9:26:37
 */
public class TransactionDebentureSaleRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 债权出让状态，ONSALE（出让中）
	 */
	private String debentureStatus;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getDebentureStatus() {
		return debentureStatus;
	}

	public void setDebentureStatus(String debentureStatus) {
		this.debentureStatus = debentureStatus;
	}

}
