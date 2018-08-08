/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import xyz.sunjianhua.data.constant.XwcgConstant;

/**
 * @Description 查询单笔交易明细 
 * @author sunjianhua
 * @date 2018年1月29日 上午9:03:00
 */
public class QueryTransactionReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "QUERY_TRANSACTION";

	/**
	 * 业务的请求流水号（传入原 generalFreezeRequestNo时可以查询单笔通用冻结请求状态)
	 */
	private String requestNo;

	/**
	 * 请求流水号
	 */
	private String transactionType;

	/**
	 * 仅查询通用冻结中用户累计冻结、解冻金额时传入
	 */
	private String platformUserNo;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap(String transactionType) {
		Map<String, Object> reqData = new HashMap<String, Object>();
		if(StringUtils.isNotBlank(getRequestNo())){
			reqData.put("requestNo", getRequestNo());
		}
		reqData.put("transactionType", transactionType);
		if (getTransactionType().equals(XwcgConstant.TRANSACTION_QUERY_TYPE_GENERAL_FREEZE)
				&& StringUtils.isNotBlank(getPlatformUserNo())) {
			reqData.put("platformUserNo", getPlatformUserNo());
		}
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("查询单笔交易明细 明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
