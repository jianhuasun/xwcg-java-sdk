/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;
import java.util.List;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 用户信息查询 回调
 * @author sunjianhua
 * @date 2018年1月27日 下午5:41:54
 */
public class QueryUserInformationRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 用户类型
	 */
	private String userType;

	/**
	 * 用户角色
	 */
	private String userRole;

	/**
	 * 审核状态
	 */
	private String auditStatus;

	/**
	 * 用户状态
	 */
	private String activeStatus;

	/**
	 * 账户余额
	 */
	private String balance;

	/**
	 * 已到账余额
	 */
	private String arriveBalance;

	/**
	 * 未到账余额
	 */
	private String floatBalance;

	/**
	 * 可用余额
	 */
	private String availableAmount;

	/**
	 * 冻结金额
	 */
	private String freezeAmount;

	/**
	 * 绑定的卡号,没有则表示没有绑卡
	 */
	private String bankcardNo;

	/**
	 * 银行代码
	 */
	private String bankcode;

	/**
	 * 企业用户联系人手机号或个人用户手机号
	 */
	private String mobile;

	/**
	 * 用户授权列表
	 */
	private String authlist;

	/**
	 * 迁移导入会员状态，true 表示已激活，false 表示未激活，正常注册成功会员则默认状态为true
	 */
	private String isImportUserActivate;

	/**
	 * 鉴权通过类型
	 */
	private String accessType;

	/**
	 * 证件类型
	 */
	private String idCardType;

	/**
	 * 用户证件号，个人返回个人证件号，企业返回企业法人证件号
	 */
	private String idCardNo;

	/**
	 * 开户名称，个人返回姓名，企业返回企业名称
	 */
	private String name;

	/**
	 * 开户银行许可证号 （企业用户时返回）
	 */
	private String bankLicensebankLicense;

	/**
	 * 组织机构代码 （企业用户时返回）
	 */
	private String orgNo;
	/**
	 * 营业执照编号 （企业用户时返回）
	 */
	private String businessLicense;
	/**
	 * 税务登记号 （企业用户时返回）
	 */
	private String taxNo;
	/**
	 * 统一社会信用代码 （企业用户时返回）
	 */
	private String unifiedCode;
	/**
	 * 机构信用代码（企业用户时返回）
	 */
	private String creditCode;
	/**
	 * 法人姓名 （企业用户时返回）
	 */
	private String legal;

	/**
	 * 授权限制列表
	 */
	private List<QueryUserInformationAuthLimitResultListData> authLimitResultList;

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getArriveBalance() {
		return arriveBalance;
	}

	public void setArriveBalance(String arriveBalance) {
		this.arriveBalance = arriveBalance;
	}

	public String getFloatBalance() {
		return floatBalance;
	}

	public void setFloatBalance(String floatBalance) {
		this.floatBalance = floatBalance;
	}

	public String getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getFreezeAmount() {
		return freezeAmount;
	}

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAuthlist() {
		return authlist;
	}

	public void setAuthlist(String authlist) {
		this.authlist = authlist;
	}

	public String getIsImportUserActivate() {
		return isImportUserActivate;
	}

	public void setIsImportUserActivate(String isImportUserActivate) {
		this.isImportUserActivate = isImportUserActivate;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getIdCardType() {
		return idCardType;
	}

	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankLicensebankLicense() {
		return bankLicensebankLicense;
	}

	public void setBankLicensebankLicense(String bankLicensebankLicense) {
		this.bankLicensebankLicense = bankLicensebankLicense;
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

	public List<QueryUserInformationAuthLimitResultListData> getAuthLimitResultList() {
		return authLimitResultList;
	}

	public void setAuthLimitResultList(List<QueryUserInformationAuthLimitResultListData> authLimitResultList) {
		this.authLimitResultList = authLimitResultList;
	}

}
