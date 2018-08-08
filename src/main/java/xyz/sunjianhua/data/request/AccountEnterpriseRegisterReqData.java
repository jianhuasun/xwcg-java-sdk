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
 * @Description 账户企业绑卡注册
 * @author sunjianhua
 * @date 2018年1月27日 下午3:11:36
 */
public class AccountEnterpriseRegisterReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "ENTERPRISE_REGISTER";

	/**
	 * 设备类型
	 */
	private String userDevice;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 企业名称
	 */
	private String enterpriseName;

	/**
	 * 开户银行许可证号
	 */
	private String bankLicense;

	/**
	 * 组织机构代码
	 */
	private String orgNo;

	/**
	 * 营业执照编号
	 */
	private String businessLicense;

	/**
	 * 税务登记号
	 */
	private String taxNo;

	/**
	 * 统一社会信用代码
	 */
	private String unifiedCode;

	/**
	 * 机构信用代码
	 */
	private String creditCode;

	/**
	 * 法人姓名
	 */
	private String legal;

	/**
	 * 证件类型
	 */
	private String idCardType;

	/**
	 * 法人证件号
	 */
	private String legalIdCardNo;

	/**
	 * 企业联系人
	 */
	private String contact;

	/**
	 * 联系人手机号
	 */
	private String contactPhone;

	/**
	 * 用户角色
	 */
	private String userRole;

	/**
	 * 企业对公账户显示后四位
	 */
	private String bankcardNo;

	/**
	 * 银行编码
	 */
	private String bankcode;

	/**
	 * 页面回跳URL
	 */
	private String redirectUrl;

	/**
	 * 用户授权列表
	 */
	private String authList;

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

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getBankLicense() {
		return bankLicense;
	}

	public void setBankLicense(String bankLicense) {
		this.bankLicense = bankLicense;
	}

	public String getOrgNo() {
		return orgNo;
	}

	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getBusinessLicense() {
		return businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getUnifiedCode() {
		return unifiedCode;
	}

	public void setUnifiedCode(String unifiedCode) {
		this.unifiedCode = unifiedCode;
	}

	public String getCreditCode() {
		return creditCode;
	}

	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getLegal() {
		return legal;
	}

	public void setLegal(String legal) {
		this.legal = legal;
	}

	public String getIdCardType() {
		return idCardType;
	}

	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}

	public String getLegalIdCardNo() {
		return legalIdCardNo;
	}

	public void setLegalIdCardNo(String legalIdCardNo) {
		this.legalIdCardNo = legalIdCardNo;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getBankcardNo() {
		return bankcardNo;
	}

	public void setBankcardNo(String bankcardNo) {
		this.bankcardNo = bankcardNo;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getAuthList() {
		return authList;
	}

	public void setAuthList(String authList) {
		this.authList = authList;
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
		reqData.put("platformUserNo", getPlatformUserNo());
		reqData.put("enterpriseName", getEnterpriseName());
		reqData.put("bankLicense", getBankLicense());
		if (StringUtils.isNotBlank(getOrgNo())) {
			reqData.put("orgNo", getOrgNo());
		}
		if (StringUtils.isNotBlank(getBusinessLicense())) {
			reqData.put("businessLicense", getBusinessLicense());
		}
		if (StringUtils.isNotBlank(getTaxNo())) {
			reqData.put("taxNo", getTaxNo());
		}
		if (StringUtils.isNotBlank(getUnifiedCode())) {
			reqData.put("unifiedCode", getUnifiedCode());
		}
		if (StringUtils.isNotBlank(getCreditCode())) {
			reqData.put("creditCode", getCreditCode());
		}
		reqData.put("legal", getLegal());
		reqData.put("idCardType", getIdCardType());
		reqData.put("legalIdCardNo", getLegalIdCardNo());
		reqData.put("contact", getContact());
		reqData.put("contactPhone", getContactPhone());
		reqData.put("userRole", getUserRole());
		reqData.put("bankcardNo", getBankcardNo());
		reqData.put("bankcode", getBankcode());
		reqData.put("redirectUrl", getRedirectUrl());
		if (StringUtils.isNotBlank(getAuthList())) {
			reqData.put("authList", getAuthList());
		}
		if (StringUtils.isNotBlank(getFailTime())) {
			reqData.put("failTime", getFailTime());
		}
		if (StringUtils.isNotBlank(getAmount())) {
			reqData.put("amount", getAmount());
		}
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("账户企业绑卡注册明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
