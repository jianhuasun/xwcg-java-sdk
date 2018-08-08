/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @Description 交易 对账文件确认
 * @author sunjianhua
 * @date 2018年1月30日 上午10:15:49
 */
public class TransactionConfirmCheckfileReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "CONFIRM_CHECKFILE";

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 对账文件日期
	 */
	private String fileDate;

	/**
	 * 对账文件日期
	 */
	private List<TransactionConfirmCheckfileDetailReqData> detail = new ArrayList<TransactionConfirmCheckfileDetailReqData>();

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public List<TransactionConfirmCheckfileDetailReqData> getDetail() {
		return detail;
	}

	public void setDetail(List<TransactionConfirmCheckfileDetailReqData> detail) {
		this.detail = detail;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("fileDate", getFileDate());
		reqData.put("detail", getDetail());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("交易 对账文件确认明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
