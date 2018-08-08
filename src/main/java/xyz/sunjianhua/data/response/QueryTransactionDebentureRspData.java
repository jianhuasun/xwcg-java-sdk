/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 交易明细 债权出让
 * @author sunjianhua
 * @date 2018年1月29日 上午10:08:33
 */
public class QueryTransactionDebentureRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 债权出让明细
	 */
	List<QueryTransactionDebentureDetailRspData> records = new ArrayList<QueryTransactionDebentureDetailRspData>();

	public List<QueryTransactionDebentureDetailRspData> getRecords() {
		return records;
	}

	public void setRecords(List<QueryTransactionDebentureDetailRspData> records) {
		this.records = records;
	}

}
