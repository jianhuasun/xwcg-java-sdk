/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 单笔交易查询 交易预处理 
 * @author sunjianhua
 * @date 2018年1月29日 上午9:50:11
 */
public class QueryTransactionPreTransactionRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 交易预处理明细
	 */
	List<QueryTransactionPreTransactionDetailRspData> records = new ArrayList<QueryTransactionPreTransactionDetailRspData>();

	public List<QueryTransactionPreTransactionDetailRspData> getRecords() {
		return records;
	}

	public void setRecords(List<QueryTransactionPreTransactionDetailRspData> records) {
		this.records = records;
	}

}
