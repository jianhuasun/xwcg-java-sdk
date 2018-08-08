/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 账户企业信息修改 主动异步回调
 * @author sunjianhua
 * @date 2018年1月27日 下午4:10:30
 */
public class AccountEnterpriseInformationUpdateResultData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 修改后审核状态； PASSED 表示审核通过，REFUSED 表示审核拒绝
	 */
	private String reviewStatus;

	/**
	 * 审核描述信息，审核拒绝会返回拒绝原因
	 */
	private String reviewDescription;

	/**
	 * 企业资质编码是否发生变更，YES 变更，NO 未变更
	 */
	private String qualificationModify;

	/**
	 * 变更后企业名称
	 */
	private String enterpriseName;

	/**
	 * 变更后开户银行许可证号
	 */
	private String bankLicense;

	/**
	 * 变更后组织机构代码
	 */
	private String orgNo;

	/**
	 * 变更后营业执照编号
	 */
	private String businessLicense;

	/**
	 * 变更后税务登记号
	 */
	private String taxNo;

	/**
	 * 变更后统一社会信用代码（可替代三证）
	 */
	private String unifiedCode;

	/**
	 * 变更后法人姓名
	 */
	private String legal;

	/**
	 * 变更后法人身份证号
	 */
	private String legalIdCardNo;

	/**
	 * 变更后企业联系人
	 */
	private String contact;

	/**
	 * 变更后联系人手机号
	 */
	private String contactPhone;

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

	public String getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public String getReviewDescription() {
		return reviewDescription;
	}

	public void setReviewDescription(String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}

	public String getQualificationModify() {
		return qualificationModify;
	}

	public void setQualificationModify(String qualificationModify) {
		this.qualificationModify = qualificationModify;
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

	public String getLegal() {
		return legal;
	}

	public void setLegal(String legal) {
		this.legal = legal;
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

}
