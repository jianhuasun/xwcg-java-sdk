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
 * @Description 查询 用户信息查询
 * @author sunjianhua
 * @date 2018年1月27日 下午5:39:17  
 */
public class QueryUserInformationReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName="QUERY_USER_INFORMATION";
	
	/**
	 * 平台用户编号
	 */
	private String platformUserNo;
	
	/**
	 * 商户当前系统时间戳
	 */
	private String timestamp;

	public String getPlatformUserNo() {
		return platformUserNo;
	}

	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
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
	public Map<String, Object> getReqDataMap(){
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("platformUserNo", getPlatformUserNo());
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("查询 用户信息查询明文>>>>"+JSON.toJSONString(reqData,SerializerFeature.WriteMapNullValue,SerializerFeature.MapSortField));
		return reqData;
	}
}
