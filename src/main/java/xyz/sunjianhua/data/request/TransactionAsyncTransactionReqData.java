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
 * @Description 交易 批量交易
 * @author sunjianhua
 * @date 2018年1月29日 下午6:04:32
 */
public class TransactionAsyncTransactionReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "ASYNC_TRANSACTION";

	/**
	 * 批次号
	 */
	private String batchNo;

	/**
	 * 交易明细
	 */
	private List<TransactionAsyncTransactionTradeDetailReqData> bizDetails = new ArrayList<TransactionAsyncTransactionTradeDetailReqData>();

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public List<TransactionAsyncTransactionTradeDetailReqData> getBizDetails() {
		return bizDetails;
	}

	public void setBizDetails(List<TransactionAsyncTransactionTradeDetailReqData> bizDetails) {
		this.bizDetails = bizDetails;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("batchNo", getBatchNo());
		reqData.put("bizDetails", getBizDetails());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("交易 批量交易明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
