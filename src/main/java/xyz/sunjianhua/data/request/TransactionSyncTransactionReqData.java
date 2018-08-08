/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @Description 交易 单笔交易
 * @author sunjianhua
 * @date 2018年1月29日 下午6:04:32
 */
public class TransactionSyncTransactionReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "SYNC_TRANSACTION";

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 见【交易类型】
	 */
	private String tradeType;

	/**
	 * 标的号
	 */
	private String projectNo;

	/**
	 * 债权出让请求流水号
	 */
	private String saleRequestNo;

	/**
	 * 业务明细
	 */
	private List<TransactionSyncTransactionDetailReqData> details = new ArrayList<TransactionSyncTransactionDetailReqData>();

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getSaleRequestNo() {
		return saleRequestNo;
	}

	public void setSaleRequestNo(String saleRequestNo) {
		this.saleRequestNo = saleRequestNo;
	}

	public List<TransactionSyncTransactionDetailReqData> getDetails() {
		return details;
	}

	public void setDetails(List<TransactionSyncTransactionDetailReqData> details) {
		this.details = details;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap(){
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("tradeType", getTradeType());
		reqData.put("projectNo", getProjectNo());
		reqData.put("saleRequestNo", getSaleRequestNo());
		reqData.put("details", getDetails());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("冲提 取消提现明文>>>>"+JSON.toJSONString(reqData,SerializerFeature.WriteMapNullValue,SerializerFeature.MapSortField));
		return reqData;
	}

}
