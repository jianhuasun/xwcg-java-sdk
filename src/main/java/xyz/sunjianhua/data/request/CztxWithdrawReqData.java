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
 * @Description 冲提 提现
 * @author sunjianhua
 * @date 2018年1月29日 上午11:07:06
 */
public class CztxWithdrawReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "WITHDRAW";

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
	 * 超过此时间即页面过期
	 */
	private String expired;

	/**
	 * 页面回跳URL
	 */
	private String redirectUrl;

	/**
	 * 见【提现方式】，目前仅支持正常提现
	 */
	private String withdrawType;

	/**
	 * 提现类型，IMMEDIATE 为直接提现，CONFIRMED 为待确认提现，默认为直接提现方式
	 */
	private String withdrawForm;

	/**
	 * 提现金额
	 */
	private String amount;

	/**
	 * 平台佣金
	 */
	private String commission;

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

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getWithdrawType() {
		return withdrawType;
	}

	public void setWithdrawType(String withdrawType) {
		this.withdrawType = withdrawType;
	}

	public String getWithdrawForm() {
		return withdrawForm;
	}

	public void setWithdrawForm(String withdrawForm) {
		this.withdrawForm = withdrawForm;
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
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("platformUserNo", getPlatformUserNo());
		reqData.put("requestNo", getRequestNo());
		reqData.put("expired", getExpired());
		reqData.put("redirectUrl", getRedirectUrl());
		if (StringUtils.isNoneBlank(getWithdrawType())) {
			reqData.put("withdrawType", getWithdrawType());
		}
		if (StringUtils.isNoneBlank(getWithdrawForm())) {
			reqData.put("withdrawForm", getWithdrawForm());
		}
		reqData.put("amount", getAmount());
		if (StringUtils.isNoneBlank(getCommission())) {
			reqData.put("commission", getCommission());
		}
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("冲提 提现明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
