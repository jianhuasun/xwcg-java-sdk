/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 查询 标的信息查询 回调
 * @author sunjianhua
 * @date 2018年1月27日 下午5:53:20
 */
public class QueryProjectInformationRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 借款方平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 标的号
	 */
	private String projectNo;

	/**
	 * 标的金额
	 */
	private String projectAmount;

	/**
	 * 标的名称
	 */
	private String projectName;

	/**
	 * 见【标的产品类型】
	 */
	private String projectType;

	/**
	 * 标的期限（单位：天）
	 */
	private String projectPeriod;

	/**
	 * 标的属性（STOCK 为存量标的，NEW 为新增标的）
	 */
	private String projectProperties;

	/**
	 * 年化利率
	 */
	private String annnualInterestRate;

	/**
	 * 还款方式
	 */
	private String repaymentWay;

	/**
	 * 标的状态
	 */
	private String projectStatus;

	/**
	 * 已投标确认金额
	 */
	private String loanAmount;

	/**
	 * 累计投标金额
	 */
	private String totalTenderAmount;

	/**
	 * 剩余投标金额
	 */
	private String remainTenderAmount;

	/**
	 * 已还款确认本金
	 */
	private String repaymentAmount;

	/**
	 * 已还利息
	 */
	private String income;

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	public String getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getProjectAmount() {
		return projectAmount;
	}

	public void setProjectAmount(String projectAmount) {
		this.projectAmount = projectAmount;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getProjectPeriod() {
		return projectPeriod;
	}

	public void setProjectPeriod(String projectPeriod) {
		this.projectPeriod = projectPeriod;
	}

	public String getProjectProperties() {
		return projectProperties;
	}

	public void setProjectProperties(String projectProperties) {
		this.projectProperties = projectProperties;
	}

	public String getAnnnualInterestRate() {
		return annnualInterestRate;
	}

	public void setAnnnualInterestRate(String annnualInterestRate) {
		this.annnualInterestRate = annnualInterestRate;
	}

	public String getRepaymentWay() {
		return repaymentWay;
	}

	public void setRepaymentWay(String repaymentWay) {
		this.repaymentWay = repaymentWay;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getTotalTenderAmount() {
		return totalTenderAmount;
	}

	public void setTotalTenderAmount(String totalTenderAmount) {
		this.totalTenderAmount = totalTenderAmount;
	}

	public String getRemainTenderAmount() {
		return remainTenderAmount;
	}

	public void setRemainTenderAmount(String remainTenderAmount) {
		this.remainTenderAmount = remainTenderAmount;
	}

	public String getRepaymentAmount() {
		return repaymentAmount;
	}

	public void setRepaymentAmount(String repaymentAmount) {
		this.repaymentAmount = repaymentAmount;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

}
