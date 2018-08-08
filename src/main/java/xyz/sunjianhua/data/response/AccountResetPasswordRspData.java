/**
 * 
 */
package xyz.sunjianhua.data.response;

import java.io.Serializable;

import xyz.sunjianhua.data.common.CommonRspData;

/**
 * @Description 账户修改密码 回调
 * @author sunjianhua
 * @date 2018年1月27日 下午3:55:36
 */
public class AccountResetPasswordRspData extends CommonRspData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 请求流水号
	 */
	private String requestNo;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
