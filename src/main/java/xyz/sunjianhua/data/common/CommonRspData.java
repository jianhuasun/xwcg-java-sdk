package xyz.sunjianhua.data.common;

/**
 * 
 * @Description 新网存管接口返回公共参数
 * @author sunjianhua
 * @date 2018年1月27日 下午4:27:52
 */
public class CommonRspData {

	/**
	 * 0 为调用成功、1 为调用失败，返回1 时请看【调用失败错误码】及错误码描述
	 */
	private String code;

	/**
	 * 业务处理状态（处理失败INIT；处理成功SUCCESS）
	 */
	private String status;

	/**
	 * 100001 系统错误 100002 json 参数格式错误 100003 签名验证失败 100004 平台编号不存在 100005 平台状态异常
	 * 100006 业务未开通 100007 查询对象不存在 100008 业务受理失败 100009 用户不存在 100010 用户账户不可用
	 * 100011 该用户无此操作权限 100012 非常抱歉，暂不支持此银行 100013 请求流水号重复 100014 余额不足 100015
	 * 标的状态与业务不匹配
	 */
	private String errorCode;

	/**
	 * 错误码描述
	 */
	private String errorMessage;

	/**
	 * 获取系统错误码
	 */
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取业务处理状态
	 */
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 获取调用失败错误码
	 */
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * 获取错误码描述
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "CommonRspData [code=" + code + ", status=" + status + ", errorCode=" + errorCode + ", errorMessage="
				+ errorMessage + "]";
	}

	

}
