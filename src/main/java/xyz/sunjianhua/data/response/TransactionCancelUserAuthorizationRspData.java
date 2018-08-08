/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 交易 取消用户授权 回调
 * @author sunjianhua
 * @date 2018年1月30日 上午9:41:12
 */
public class TransactionCancelUserAuthorizationRspData extends CommonRspData implements Serializable {

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
	 * 取消授权业务列表， TENDER 表示自动投标授权，REPAYMENT 表示自动还款授 权， CREDIT_ASSIGNMENT
	 * 表示自动购买债权授权，WITHDRAW 表示自动提 现授权，RECHARGE 自动充值，COMPENSATORY 表示自动代偿，此处根据请
	 * 求返回以上的一个或多个值, 传多个值用“,”英文半角逗号分隔
	 */
	private String authList;

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

}
