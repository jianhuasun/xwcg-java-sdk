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
 * @Description 冲提 提现确认
 * @author sunjianhua
 * @date 2018年1月29日 上午11:26:25
 */
public class CztxConfirmWithdrawReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "CONFIRM_WITHDRAW";

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 待确认提现请求流水号
	 */
	private String preTransactionNo;

	/**
	 * 提现方式
	 */
	private String withdrawWay;

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

	public String getWithdrawWay() {
		return withdrawWay;
	}

	public void setWithdrawWay(String withdrawWay) {
		this.withdrawWay = withdrawWay;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("preTransactionNo", getPreTransactionNo());
		if (StringUtils.isNotBlank(getWithdrawWay())) {
			reqData.put("withdrawWay", getWithdrawWay());
		}
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("冲提 提现确认明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
