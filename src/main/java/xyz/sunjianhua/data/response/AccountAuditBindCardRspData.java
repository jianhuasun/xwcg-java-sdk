/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 账户 换卡审核 回调
 * @author sunjianhua
 * @date 2018年2月6日 上午9:56:55
 */
public class AccountAuditBindCardRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 原换卡请求流水号
	 */
	private String originalRequestNo;

	/**
	 * 复核结果，复核通过（PASSED），复核拒绝（BACK）
	 */
	private String auditStatus;

	public String getOriginalRequestNo() {
		return originalRequestNo;
	}

	public void setOriginalRequestNo(String originalRequestNo) {
		this.originalRequestNo = originalRequestNo;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

}
