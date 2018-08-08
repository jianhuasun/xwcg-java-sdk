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
import xyz.sunjianhua.data.constant.XwcgConstant;

/**
 * @Description 冲提 自动提现
 * @author sunjianhua
 * @date 2018年1月29日 上午11:32:30
 */
public class CztxAutoWithdrawReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "AUTO_WITHDRAW";

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 见【提现方式】，目前仅支持正常提现
	 */
	private String withdrawType;

	/**
	 * 提现金额
	 */
	private String amount;

	/**
	 * 提现分佣
	 */
	private String commission;

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

	public String getWithdrawType() {
		return withdrawType;
	}

	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
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

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap(){
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("platformUserNo", getPlatformUserNo());
		reqData.put("requestNo", getRequestNo());
		reqData.put("withdrawType", XwcgConstant.WITHDRAW_TYPE_NORMAL);
		reqData.put("amount", getAmount());
		reqData.put("commission", getCommission());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("冲提 自动提现明文>>>>"+JSON.toJSONString(reqData,SerializerFeature.WriteMapNullValue,SerializerFeature.MapSortField));
		return reqData;
	}

}
