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
 * @Description 账户会员激活
 * @author sunjianhua
 * @date 2018年1月27日 下午4:15:23
 */
public class AccountActivateStockedUserReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "ACTIVATE_STOCKED_USER";

	/**
	 * 设备类型
	 */
	private String userDevice;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 页面回跳URL
	 */
	private String redirectUrl;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 用户授权列表
	 */
	private String authList;

	/**
	 * 鉴权验证类型
	 */
	private String checkType = "LIMIT";

	/**
	 * 激活页面中银行卡号是否可以修改 【固定值】UNMOD
	 */
	private String cardChange = "UNMOD";

	/**
	 * 用户授权期限
	 */
	private String failTime;

	/**
	 * 用户授权金额
	 */
	private String amount;

	public String getUserDevice() {
		return userDevice;
	}

	public void setUserDevice(String userDevice) {
		this.userDevice = userDevice;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	public String getAuthList() {
		return authList;
	}

	public void setAuthList(String authList) {
		this.authList = authList;
	}

	public String getCheckType() {
		return checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public String getCardChange() {
		return cardChange;
	}

	public void setCardChange(String cardChange) {
		this.cardChange = cardChange;
	}

	public String getFailTime() {
		return failTime;
	}

	public void setFailTime(String failTime) {
		this.failTime = failTime;
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
		reqData.put("requestNo", getRequestNo());
		reqData.put("redirectUrl", getRedirectUrl());
		reqData.put("platformUserNo", getPlatformUserNo());
		if (StringUtils.isNotBlank(getAuthList())) {
			reqData.put("authList", getAuthList());
		}
		if (StringUtils.isNotBlank(getCheckType())) {
			reqData.put("checkType", getCheckType());
		}
		if (StringUtils.isNotBlank(getCardChange())) {
			reqData.put("cardChange", getCardChange());
		}
		if (StringUtils.isNotBlank(getFailTime())) {
			reqData.put("failTime", getFailTime());
		}
		if (StringUtils.isNotBlank(getAmount())) {
			reqData.put("amount", getAmount());
		}
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("账户会员激活明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
