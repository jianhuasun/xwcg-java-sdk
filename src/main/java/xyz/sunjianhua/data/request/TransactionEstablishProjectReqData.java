/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @Description 交易 创建标的
 * @author sunjianhua
 * @date 2018年1月29日 下午4:17:10
 */
public class TransactionEstablishProjectReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String serviceName = "ESTABLISH_PROJECT";

	/**
	 * 请求流水号
	 */
	private String requestNo;

	/**
	 * 借款方平台用户编号
	 */
	private String platformUserNo;

	/**
	 * 标的号
	 */
	private String projectNo;

	/**
	 * 标的号
	 */
	private String projectAmount;

	/**
	 * 标的号
	 */
	private String projectName;

	/**
	 * 标的描述
	 */
	private String projectDescription;

	/**
	 * 见【标的类型】
	 */
	private String projectType;

	/**
	 * 标的期限（单位：天）
	 */
	private String projectPeriod;

	/**
	 * 年化利率
	 */
	private String annnualInterestRate;

	/**
	 * 见【还款方式】（只做记录，不做严格校验）
	 */
	private String repaymentWay;

	/**
	 * 标的扩展信息
	 */
	private String extend;

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

	public String getProjectAmount() {
		return projectAmount;
	}

	public void setProjectAmount(String projectAmount) {
		this.projectAmount = projectAmount;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getProjectPeriod() {
		return projectPeriod;
	}

	public void setProjectPeriod(String projectPeriod) {
		this.projectPeriod = projectPeriod;
	}

	public String getAnnnualInterestRate() {
		return annnualInterestRate;
	}

	public void setAnnnualInterestRate(String annnualInterestRate) {
		this.annnualInterestRate = annnualInterestRate;
	}

	public String getRepaymentWay() {
		return repaymentWay;
	}

	public void setRepaymentWay(String repaymentWay) {
		this.repaymentWay = repaymentWay;
	}

	public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}

	/**
	 * 生成请求存管验签数据
	 */
	public Map<String, Object> getReqDataMap() {
		Map<String, Object> reqData = new HashMap<String, Object>();
		reqData.put("requestNo", getRequestNo());
		reqData.put("platformUserNo", getPlatformUserNo());
		reqData.put("projectNo", getProjectNo());
		reqData.put("projectAmount", getProjectAmount());
		reqData.put("projectName", getProjectName());
		if (StringUtils.isNoneBlank(getProjectDescription())) {
			reqData.put("projectDescription", getProjectDescription());
		}
		reqData.put("projectType", getProjectType());
		reqData.put("projectPeriod", getProjectPeriod());
		reqData.put("annnualInterestRate", getAnnnualInterestRate());
		reqData.put("repaymentWay", getRepaymentWay());
		if (StringUtils.isNoneBlank(getExtend())) {
			reqData.put("extend", getExtend());
		}
		reqData.put("timestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		System.out.println("交易 创建标的明文>>>>"
				+ JSON.toJSONString(reqData, SerializerFeature.WriteMapNullValue, SerializerFeature.MapSortField));
		return reqData;
	}

}
