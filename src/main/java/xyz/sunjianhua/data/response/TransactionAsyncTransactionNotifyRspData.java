/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 交易 批量交易 回调
 * @author sunjianhua
 * @date 2018年1月30日 上午9:17:15
 */
public class TransactionAsyncTransactionNotifyRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 请求流水号
	 */
	private List<TransactionAsyncTransactionNotifyDetailRspData> details = new ArrayList<TransactionAsyncTransactionNotifyDetailRspData>();

	public List<TransactionAsyncTransactionNotifyDetailRspData> getDetails() {
		return details;
	}

	public void setDetails(List<TransactionAsyncTransactionNotifyDetailRspData> details) {
		this.details = details;
	}

}
