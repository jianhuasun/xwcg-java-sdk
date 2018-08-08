/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 单笔交易 通用冻结 回调
 * @author sunjianhua
 * @date 2018年2月6日 上午10:20:49
 */
public class QueryTransactionGeneralFreezeRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	List<QueryTransactionGeneralFreezeDetailRspData> records = new ArrayList<QueryTransactionGeneralFreezeDetailRspData>();

	public List<QueryTransactionGeneralFreezeDetailRspData> getRecords() {
		return records;
	}

	public void setRecords(List<QueryTransactionGeneralFreezeDetailRspData> records) {
		this.records = records;
	}

}
