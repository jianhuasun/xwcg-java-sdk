/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 单笔交易 换卡记录 回调
 * @author sunjianhua
 * @date 2018年2月6日 上午10:31:26
 */
public class QueryTransactionUpdateBankcardAuditRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	List<QueryTransactionUpdateBankcardAuditDetailRspData> records = new ArrayList<QueryTransactionUpdateBankcardAuditDetailRspData>();

	public List<QueryTransactionUpdateBankcardAuditDetailRspData> getRecords() {
		return records;
	}

	public void setRecords(List<QueryTransactionUpdateBankcardAuditDetailRspData> records) {
		this.records = records;
	}

}
