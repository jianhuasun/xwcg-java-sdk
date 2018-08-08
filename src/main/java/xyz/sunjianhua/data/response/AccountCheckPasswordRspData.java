/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 账户验证密码 回调
 * @author sunjianhua
 * @date 2018年1月27日 下午3:59:58
 */
public class AccountCheckPasswordRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 平台根据自定的业务描述
	 */
	private String bizTypeDescription;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getBizTypeDescription() {
		return bizTypeDescription;
	}

	public void setBizTypeDescription(String bizTypeDescription) {
		this.bizTypeDescription = bizTypeDescription;
	}

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

}
