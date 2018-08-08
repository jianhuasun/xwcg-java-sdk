/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 单笔交易查询 提现
 * @author sunjianhua
 * @date 2018年1月29日 上午9:39:39
 */
public class QueryTransactionWithdrawRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 提现明细
	 */
	List<QueryTransactionWithdrawDetailRspData> records = new ArrayList<QueryTransactionWithdrawDetailRspData>();

	public List<QueryTransactionWithdrawDetailRspData> getRecords() {
		return records;
	}

	public void setRecords(List<QueryTransactionWithdrawDetailRspData> records) {
		this.records = records;
	}

}
