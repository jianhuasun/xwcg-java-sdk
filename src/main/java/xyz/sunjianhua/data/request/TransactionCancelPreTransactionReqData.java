/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @Description 交易 预处理取消
 * @author sunjianhua
 * @date 2018年1月29日 下午5:04:17
 */
public class TransactionCancelPreTransactionReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "CANCEL_PRE_TRANSACTION";

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 预处理业务流水号
	 */
	private String preTransactionNo;

	/**
	 * 取消金额
	 */
	private String amount;

	/**
	 * 平台佣金
	 */
	private String commission;

	/**
	 * 分润明细
	 */
	private List<TransactionCancelPreTransactionProfitDetailReqData> profitDetails;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getPreTransactionNo() {
		return preTransactionNo;
	}

	public void setPreTransactionNo(String preTransactionNo) {
		this.preTransactionNo = preTransactionNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public List<TransactionCancelPreTransactionProfitDetailReqData> getProfitDetails() {
		return profitDetails;
	}

	public void setProfitDetails(List<TransactionCancelPreTransactionProfitDetailReqData> profitDetails) {
		this.profitDetails = profitDetails;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("preTransactionNo", getPreTransactionNo());
		reqData.put("amount", getAmount());
		if (StringUtils.isNotBlank(getCommission())) {
			reqData.put("commission", getCommission());
		}
		if (getProfitDetails() != null && getProfitDetails().size() > 0) {
			reqData.put("profitDetails", getProfitDetails());
		}
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("交易 预处理取消的明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
