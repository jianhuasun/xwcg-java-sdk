/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;

/**
 * @Description 交易 批量交易 业务明细
 * @author sunjianhua
 * @date 2018年1月30日 上午9:12:22
 */
public class TransactionAsyncTransactionBizDetailReqData implements Serializable {

	/**
	 * 业务类型
	 */
	private String bizType;

	/**
	 * 预处理请求流水号
	 */
	private String freezeRequestNo;

	/**
	 * 出款方用户编号
	 */
	private String sourcePlatformUserNo;

	/**
	 * 收款方用户编号
	 */
	private String targetPlatformUserNo;

	/**
	 * 交易金额（有利息时为本息和）
	 */
	private String amount;

	/**
	 * 利息
	 */
	private String income;

	/**
	 * 债权份额（债权认购且需校验债权关系的必传）
	 */
	private String share;

	/**
	 * 平台商户自定义参数，平台交易时传入的自定义参数
	 */
	private String customDefine;

	/**
	 * 备注
	 */
	private String remark;

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getFreezeRequestNo() {
		return freezeRequestNo;
	}

	public void setFreezeRequestNo(String freezeRequestNo) {
		this.freezeRequestNo = freezeRequestNo;
	}

	public String getSourcePlatformUserNo() {
		return sourcePlatformUserNo;
	}

	public void setSourcePlatformUserNo(String sourcePlatformUserNo) {
		this.sourcePlatformUserNo = sourcePlatformUserNo;
	}

	public String getTargetPlatformUserNo() {
		return targetPlatformUserNo;
	}

	public void setTargetPlatformUserNo(String targetPlatformUserNo) {
		this.targetPlatformUserNo = targetPlatformUserNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getShare() {
		return share;
	}

	public void setShare(String share) {
		this.share = share;
	}

	public String getCustomDefine() {
		return customDefine;
	}

	public void setCustomDefine(String customDefine) {
		this.customDefine = customDefine;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public TransactionAsyncTransactionBizDetailReqData() {
		super();
	}

	public TransactionAsyncTransactionBizDetailReqData(String bizType, String freezeRequestNo,
			String sourcePlatformUserNo, String targetPlatformUserNo, String amount, String income, String share,
			String customDefine, String remark) {
		super();
		this.bizType = bizType;
		this.freezeRequestNo = freezeRequestNo;
		this.sourcePlatformUserNo = sourcePlatformUserNo;
		this.targetPlatformUserNo = targetPlatformUserNo;
		this.amount = amount;
		this.income = income;
		this.share = share;
		this.customDefine = customDefine;
		this.remark = remark;
	}

	public TransactionAsyncTransactionBizDetailReqData(String bizType, String amount) {
		super();
		this.bizType = bizType;
		this.amount = amount;
	}

}
