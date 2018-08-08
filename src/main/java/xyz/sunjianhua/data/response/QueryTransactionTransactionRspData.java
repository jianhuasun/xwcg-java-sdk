/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 单笔交易查询 交易确认
 * @author sunjianhua
 * @date 2018年1月29日 上午9:55:54
 */
public class QueryTransactionTransactionRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 交易确认明细
	 */
	List<QueryTransactionTransactionDetailRspData> records = new ArrayList<QueryTransactionTransactionDetailRspData>();

	public List<QueryTransactionTransactionDetailRspData> getRecords() {
		return records;
	}

	public void setRecords(List<QueryTransactionTransactionDetailRspData> records) {
		this.records = records;
	}

}
