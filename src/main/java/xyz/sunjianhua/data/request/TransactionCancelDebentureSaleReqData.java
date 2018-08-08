/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @Description 交易 取消债权转让
 * @author sunjianhua
 * @date 2018年1月30日 上午9:28:05
 */
public class TransactionCancelDebentureSaleReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "CANCEL_DEBENTURE_SALE";

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 债权出让请求流水号
	 */
	private String creditsaleRequestNo;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getCreditsaleRequestNo() {
		return creditsaleRequestNo;
	}

	public void setCreditsaleRequestNo(String creditsaleRequestNo) {
		this.creditsaleRequestNo = creditsaleRequestNo;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap(){
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("creditsaleRequestNo", getCreditsaleRequestNo());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("交易 取消债权转让明文>>>>"+JSON.toJSONString(reqData,SerializerFeature.WriteMapNullValue,SerializerFeature.MapSortField));
		return reqData;
	}

}
