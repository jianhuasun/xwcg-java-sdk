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

/**
 * @Description 交易 资金解冻
 * @author sunjianhua
 * @date 2018年1月30日 上午10:01:03
 */
public class TransactionUnFreezeReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "UNFREEZE";

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 原冻结的请求流水号 (通用冻结的不能传入改参数)
	 */
	private String originalFreezeRequestNo;

	/**
	 * 通用冻结金额解冻时需要传入的参数
	 */
	private String platformUserNo;

	/**
	 * 解冻金额
	 */
	private String amount;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getOriginalFreezeRequestNo() {
		return originalFreezeRequestNo;
	}

	public void setOriginalFreezeRequestNo(String originalFreezeRequestNo) {
		this.originalFreezeRequestNo = originalFreezeRequestNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
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
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		if (StringUtils.isNotBlank(getOriginalFreezeRequestNo())) {
			reqData.put("originalFreezeRequestNo", getOriginalFreezeRequestNo());
		}
		reqData.put("amount", getAmount());
		if (StringUtils.isNotBlank(getPlatformUserNo())) {
			reqData.put("platformUserNo", getPlatformUserNo());
		}
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("交易 资金解冻明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
