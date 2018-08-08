/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 交易 用户授权 回调
 * @author sunjianhua
 * @date 2018年1月30日 上午9:37:32
 */
public class TransactionUserAuthorizationRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 见【用户授权列表】
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

}
