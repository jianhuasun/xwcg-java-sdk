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
 * @Description 冲提 自动充值
 * @deprecated
 * @author sunjianhua
 * @date 2018年1月29日 上午10:58:40
 */
public class CztxDirectRechargeReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "DIRECT_RECHARGE";

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 充值金额
	 */
	private String amount;

	/**
	 * 平台佣金
	 */
	private String commission;

	/**
	 * 偏好支付公司，见【支付公司】
	 */
	private String expectPayCompany;

	/**
	 * 支付方式 仅支持代扣充值PROXY
	 */
	private String rechargeWay;

	/**
	 * 银行编码
	 */
	private String bankcode;

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

	public String getExpectPayCompany() {
		return expectPayCompany;
	}

	public void setExpectPayCompany(String expectPayCompany) {
		this.expectPayCompany = expectPayCompany;
	}

	public String getRechargeWay() {
		return rechargeWay;
	}

	public void setRechargeWay(String rechargeWay) {
		this.rechargeWay = rechargeWay;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("platformUserNo", getPlatformUserNo());
		reqData.put("requestNo", getPlatformUserNo());
		reqData.put("amount", getPlatformUserNo());
		reqData.put("commission", getPlatformUserNo());
		reqData.put("expectPayCompany", getPlatformUserNo());
		reqData.put("rechargeWay", XwcgConstant.RECHARGE_WAY_PROXY);
		reqData.put("bankcode", getPlatformUserNo());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("冲提 自动充值明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
