package xyz.sunjianhua.data.common;

import java.io.Serializable;

/**
 * 网关和异步接口返回参数
 * 
 * @author sunjianhua
 * @since 2018-1-27 13:37:51
 */
public class XwcgRspData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 接口名称，见每个接口的详细定义
	 */
	private String serviceName;

	/**
	 * 平台编号
	 */
	private String platformNo;

	/**
	 * 用户终端设备类型，见枚举【终端类型】，如果该参数为空，则系统会根据请求head
	 * 中userAgent 信息判断是PC 还是移动设备
	 * 仅网关接口返回
	 */
	private String userDevice;

	/**
	 * 回调类型，见枚举“回调类型“，用来区分是浏览器返回还是服务端异步通知
	 */
	private String responseType;

	/**
	 * 证书序号，用于多证书密钥切换，默认值为1
	 */
	private String keySerial;

	/**
	 * 业务数据报文，JSON 格式，具体见各接口定义
	 */
	private String respData;

	/**
	 * 对respData 参数的签名，签名算法见下方“参数签名”章节
	 */
	private String sign;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getPlatformNo() {
		return platformNo;
	}

	public void setPlatformNo(String platformNo) {
		this.platformNo = platformNo;
	}

	public String getUserDevice() {
		return userDevice;
	}

	public void setUserDevice(String userDevice) {
		this.userDevice = userDevice;
	}

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

	public String getKeySerial() {
		return keySerial;
	}

	public void setKeySerial(String keySerial) {
		this.keySerial = keySerial;
	}

	public String getRespData() {
		return respData;
	}

	public void setRespData(String respData) {
		this.respData = respData;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Override
	public String toString() {
		return "GatewayRspData [serviceName=" + serviceName + ", platformNo=" + platformNo + ", userDevice="
				+ userDevice + ", responseType=" + responseType + ", keySerial=" + keySerial + ", respData=" + respData
				+ ", sign=" + sign + "]";
	}

	
	
}
