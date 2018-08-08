/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询单笔交易查询 返回
 * @author sunjianhua
 * @date 2018年1月29日 上午9:15:04
 */
public class QueryTransactionRechargeRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 充值明细
	 */
	private List<QueryTransactionRechargeDetailRspData> records = new ArrayList<QueryTransactionRechargeDetailRspData>();

	public List<QueryTransactionRechargeDetailRspData> getRecords() {
		return records;
	}

	public void setRecords(List<QueryTransactionRechargeDetailRspData> records) {
		this.records = records;
	}

}
