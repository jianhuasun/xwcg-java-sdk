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

/**
 * @Description 交易 修改标的
 * @author sunjianhua
 * @date 2018年1月29日 下午4:42:31
 */
public class TransactionModifyProjectReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "MODIFY_PROJECT";

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 标的号
	 */
	private String projectNo;

	/**
	 * 更新标的状态，见【标的状态】
	 */
	private String status;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("projectNo", getProjectNo());
		reqData.put("status", getStatus());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("交易 修改标的明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
