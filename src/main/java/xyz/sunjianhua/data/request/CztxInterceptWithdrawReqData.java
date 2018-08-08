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
 * @Description 冲提 提现拦截
 * @author sunjianhua
 * @date 2018年1月29日 上午11:26:25
 */
public class CztxInterceptWithdrawReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "INTERCEPT_WITHDRAW";

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 提现请求流水号
	 */
	private String withdrawRequestNo;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getWithdrawRequestNo() {
		return withdrawRequestNo;
	}

	public void setWithdrawRequestNo(String withdrawRequestNo) {
		this.withdrawRequestNo = withdrawRequestNo;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap(){
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("withdrawRequestNo", getWithdrawRequestNo());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("冲提 提现拦截明文>>>>"+JSON.toJSONString(reqData,SerializerFeature.WriteMapNullValue,SerializerFeature.MapSortField));
		return reqData;
	}

}
