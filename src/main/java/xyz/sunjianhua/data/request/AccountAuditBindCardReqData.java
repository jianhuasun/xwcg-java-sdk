/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import xyz.sunjianhua.data.constant.XwcgConstant;

/**
 * @Description 账户 换卡审核
 * @author sunjianhua
 * @date 2018年2月6日 上午9:51:05
 */
public class AccountAuditBindCardReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "AUDIT_BIND_CARD";

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 原换卡请求流水号
	 */
	private String originalRequestNo;

	/**
	 * 复核结果，复核通过（PASSED），复核拒绝（BACK）
	 */
	private String auditType;

	/**
	 * 商户当前系统时间戳
	 */
	private String timestamp;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getOriginalRequestNo() {
		return originalRequestNo;
	}

	public void setOriginalRequestNo(String originalRequestNo) {
		this.originalRequestNo = originalRequestNo;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("originalRequestNo", getOriginalRequestNo());
		reqData.put("auditType", getAuditType());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("账户换卡审核明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
