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
 * @Description 冲提 充值
 * @author sunjianhua
 * @date 2018年1月29日 上午10:45:52
 */
public class CztxRechargeReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "RECHARGE";

	/**
	 * 设备类型
	 */
	private String userDevice;

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
	 * 【支付方式】，支持网银（WEB）、快捷支付（SWIFT）
	 */
	private String rechargeWay;

	/**
	 * 【见银行编码】若支付方式为快捷支付，此处必填；若支付方式为网银，此处可以 不填；网银支付方式下，若此处填写，则直接跳转至银行页面，不填则跳转至支付
	 * 公司收银台页面；
	 */
	private String bankcode;

	/**
	 * 【网银类型】，若支付方式填写为网银，且对【银行编码】进行了填写，则此处必填
	 */
	private String payType;

	/**
	 * 【授权交易类型】，若想实现充值+投标单次授权，则此参数必传，固定“TENDER”
	 */
	private String authtradeType;

	/**
	 * 授权投标金额，充值成功后可操作对应金额范围内的投标授权预处理；若传入了【授权交易类型】，则此参数必传
	 */
	private String authtenderAmount;

	/**
	 * 标的号；若传入了【授权交易类型】，则此参数必传
	 */
	private String projectNo;

	/**
	 * 页面回跳URL
	 */
	private String redirectUrl;

	/**
	 * 超过此时间即页面过期
	 */
	private String expired;

	/**
	 * 快捷充值回调模式，如传入DIRECT_CALLBACK，则订单支付不论成功、失败、处理中均直接同步、异步通知商户；
	 * 未传入订单仅在支付成功时通知商户；
	 */
	private String callbackMode;

	public String getUserDevice() {
		return userDevice;
	}

	public void setUserDevice(String userDevice) {
		this.userDevice = userDevice;
	}

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

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getAuthtradeType() {
		return authtradeType;
	}

	public void setAuthtradeType(String authtradeType) {
		this.authtradeType = authtradeType;
	}

	public String getAuthtenderAmount() {
		return authtenderAmount;
	}

	public void setAuthtenderAmount(String authtenderAmount) {
		this.authtenderAmount = authtenderAmount;
	}

	public String getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

	public String getCallbackMode() {
		return callbackMode;
	}

	public void setCallbackMode(String callbackMode) {
		this.callbackMode = callbackMode;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("platformUserNo", getPlatformUserNo());
		reqData.put("requestNo", getRequestNo());
		reqData.put("amount", getAmount());
		if (StringUtils.isNotBlank(getCommission())) {
			reqData.put("commission", getCommission());
		}
		reqData.put("expectPayCompany", getExpectPayCompany());
		reqData.put("rechargeWay", getRechargeWay());
		if (XwcgConstant.RECHARGE_WAY_WEB.equals(getRechargeWay())) {
			if (StringUtils.isNotBlank(getBankcode())) {
				reqData.put("bankcode", getBankcode());
			}
			if (StringUtils.isNotBlank(getPayType())) {
				reqData.put("payType", getPayType());
			}
		} else if (XwcgConstant.RECHARGE_WAY_SWIFT.equals(getRechargeWay())) {
			if (StringUtils.isNotBlank(getBankcode())) {
				reqData.put("bankcode", getBankcode());
			}
		}
		if (StringUtils.isNotBlank(getAuthtradeType())) {
			reqData.put("authtradeType", getAuthtradeType());
			reqData.put("authtenderAmount", getAuthtenderAmount());
			reqData.put("projectNo", getProjectNo());
		}
		reqData.put("redirectUrl", getRedirectUrl());
		reqData.put("expired", getExpired());
		if (StringUtils.isNotBlank(getCallbackMode())) {
			reqData.put("callbackMode", getCallbackMode());
		}
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("冲提 充值明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
