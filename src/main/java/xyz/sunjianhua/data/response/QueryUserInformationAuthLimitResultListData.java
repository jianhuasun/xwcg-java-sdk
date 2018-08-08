/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

/**
 * @Description 查询 用户信息查询 回调 授权限制列表
 * @author sunjianhua
 * @date 2018年2月6日 下午1:07:35
 */
public class QueryUserInformationAuthLimitResultListData implements Serializable {

	/**
	 * 授权金额
	 */
	private String amount;

	/**
	 * 授权期限
	 */
	private String failTime;

	/**
	 * 授权类型
	 */
	private String authType;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFailTime() {
		return failTime;
	}

	public void setFailTime(String failTime) {
		this.failTime = failTime;
	}

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

}
