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
 * @Description 交易 资金冻结
 * @author sunjianhua
 * @date 2018年1月30日 上午10:01:03
 */
public class TransactionFreezeReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "FREEZE";

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 通用冻结请求流水号（若传入，则为“ 通用冻结”，且不能传入 requestNo
	 */
	private String generalFreezeRequestNo;

	/**
	 * 冻结金额
	 */
	private String amount;

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getGeneralFreezeRequestNo() {
		return generalFreezeRequestNo;
	}

	public void setGeneralFreezeRequestNo(String generalFreezeRequestNo) {
		this.generalFreezeRequestNo = generalFreezeRequestNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("platformUserNo", getPlatformUserNo());
		if (StringUtils.isNotBlank(getGeneralFreezeRequestNo())) {
			reqData.put("generalFreezeRequestNo", getGeneralFreezeRequestNo());
		}else{
			if (StringUtils.isNotBlank(getRequestNo())) {
				reqData.put("requestNo", getRequestNo());
			}
		}
		reqData.put("amount", getAmount());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("交易 资金冻结明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
