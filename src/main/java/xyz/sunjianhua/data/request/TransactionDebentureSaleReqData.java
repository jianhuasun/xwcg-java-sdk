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
 * @Description 交易 单笔债权出让
 * @author sunjianhua
 * @date 2018年1月30日 上午9:24:52
 */
public class TransactionDebentureSaleReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "DEBENTURE_SALE";

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 标的号
	 */
	private String projectNo;

	/**
	 * 出让份额
	 */
	private String saleShare;

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}

	public String getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getSaleShare() {
		return saleShare;
	}

	public void setSaleShare(String saleShare) {
		this.saleShare = saleShare;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap(){
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("platformUserNo", getPlatformUserNo());
		reqData.put("projectNo", getProjectNo());
		reqData.put("saleShare", getSaleShare());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("账户企业绑卡注册明文>>>>"+JSON.toJSONString(reqData,SerializerFeature.WriteMapNullValue,SerializerFeature.MapSortField));
		return reqData;
	}

}
