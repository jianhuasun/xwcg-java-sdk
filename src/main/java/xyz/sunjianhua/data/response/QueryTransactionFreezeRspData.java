/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 单笔交易查询 冻结
 * @author sunjianhua
 * @date 2018年1月29日 上午10:00:54
 */
public class QueryTransactionFreezeRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 冻结明细
	 */
	List<QueryTransactionFreezeDetailRspData> records = new ArrayList<QueryTransactionFreezeDetailRspData>();

	public List<QueryTransactionFreezeDetailRspData> getRecords() {
		return records;
	}

	public void setRecords(List<QueryTransactionFreezeDetailRspData> records) {
		this.records = records;
	}

}
