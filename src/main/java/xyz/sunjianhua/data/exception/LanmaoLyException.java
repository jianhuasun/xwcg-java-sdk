/**
 * 
 */
package xyz.sunjianhua.data.exception;

import xyz.sunjianhua.data.constant.XwcgConstant;

/**
 * @Description 懒猫异常处理
 * @author sunjianhua
 * @date 2018年2月2日 下午1:07:13
 */
public class LanmaoLyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * 标的状态与业务不匹配 999000 返回报文为空或签名验证失败等其他接口错误
	 */
	private String errorCode;

	/**
	 * 错误码描述
	 */
	private String errorMessage;

	/**
	 * 任意对象
	 */
	protected Object object;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public LanmaoLyException() {
		super();
	}

	public LanmaoLyException(String code, String status, String errorCode, String errorMessage, Object object) {
		super();
		this.code = code;
		this.status = status;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.object = object;
	}

	public LanmaoLyException(String code, String status, String errorCode, String errorMessage) {
		super();
		this.code = code;
		this.status = status;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public LanmaoLyException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public LanmaoLyException(String code, String errorCode, String errorMessage, Object object) {
		super();
		this.code = code;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.object = object;
	}

	public LanmaoLyException(String code, String errorCode, String errorMessage) {
		super();
		this.code = code;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public LanmaoLyException(String errorMessage) {
		super();
		this.code=XwcgConstant.RSP_DATA_CODE_1;
		this.errorCode = "999000";
		this.errorMessage = errorMessage;
	}

	
	
}
