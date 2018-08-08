/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 单笔交易查询 解冻
 * @author sunjianhua
 * @date 2018年1月29日 上午10:03:54
 */
public class QueryTransactionUnFreezeRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 解冻明细
	 */
	List<QueryTransactionUnFreezeDetailRspData> records = new ArrayList<QueryTransactionUnFreezeDetailRspData>();

	public List<QueryTransactionUnFreezeDetailRspData> getRecords() {
		return records;
	}

	public void setRecords(List<QueryTransactionUnFreezeDetailRspData> records) {
		this.records = records;
	}

}
