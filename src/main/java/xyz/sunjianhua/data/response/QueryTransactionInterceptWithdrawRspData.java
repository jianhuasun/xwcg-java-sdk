/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 单笔交易查询 提现拦截
 * @author sunjianhua
 * @date 2018年1月29日 上午10:19:44
 */
public class QueryTransactionInterceptWithdrawRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 提现拦截明细
	 */
	List<QueryTransactionInterceptWithdrawDetailRspData> records = new ArrayList<QueryTransactionInterceptWithdrawDetailRspData>();

	public List<QueryTransactionInterceptWithdrawDetailRspData> getRecords() {
		return records;
	}

	public void setRecords(List<QueryTransactionInterceptWithdrawDetailRspData> records) {
		this.records = records;
	}

}
