/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 交易 批量交易 回调
 * @author sunjianhua
 * @date 2018年1月30日 上午9:17:15
 */
public class TransactionAsyncTransactionRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
