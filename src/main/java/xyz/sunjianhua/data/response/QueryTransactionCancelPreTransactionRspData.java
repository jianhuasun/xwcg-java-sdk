/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 单笔交易查询 取消预处理
 * @author sunjianhua
 * @date 2018年1月29日 上午10:13:03
 */
public class QueryTransactionCancelPreTransactionRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 取消预处理明细
	 */
	List<QueryTransactionCancelPreTransactionDetailRspData> records = new ArrayList<QueryTransactionCancelPreTransactionDetailRspData>();

	public List<QueryTransactionCancelPreTransactionDetailRspData> getRecords() {
		return records;
	}

	public void setRecords(List<QueryTransactionCancelPreTransactionDetailRspData> records) {
		this.records = records;
	}

}
