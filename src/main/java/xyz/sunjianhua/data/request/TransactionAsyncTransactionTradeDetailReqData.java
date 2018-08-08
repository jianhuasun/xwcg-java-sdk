/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 交易 批量交易 交易明细
 * @author sunjianhua
 * @date 2018年1月30日 上午9:09:42
 */
public class TransactionAsyncTransactionTradeDetailReqData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 交易明细订单号
	 */
	private String requestNo;

	/**
	 *  交易类型
	 */
	private String tradeType;

	/**
	 * 标的编号
	 */
	private String projectNo;

	/**
	 * 债权出让请求流水号
	 */
	private String saleRequestNo;

	/**
	 * 业务明细
	 */
	private List<TransactionAsyncTransactionBizDetailReqData> details = new ArrayList<TransactionAsyncTransactionBizDetailReqData>();

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getProjectNo() {
		return projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getSaleRequestNo() {
		return saleRequestNo;
	}

	public void setSaleRequestNo(String saleRequestNo) {
		this.saleRequestNo = saleRequestNo;
	}

	public List<TransactionAsyncTransactionBizDetailReqData> getDetails() {
		return details;
	}

	public void setDetails(List<TransactionAsyncTransactionBizDetailReqData> details) {
		this.details = details;
	}

	public TransactionAsyncTransactionTradeDetailReqData() {
		super();
	}

	public TransactionAsyncTransactionTradeDetailReqData(String requestNo, String tradeType, String projectNo,
			String saleRequestNo, List<TransactionAsyncTransactionBizDetailReqData> details) {
		super();
		this.requestNo = requestNo;
		this.tradeType = tradeType;
		this.projectNo = projectNo;
		this.saleRequestNo = saleRequestNo;
		this.details = details;
	}

	public TransactionAsyncTransactionTradeDetailReqData(String requestNo, String tradeType,
			List<TransactionAsyncTransactionBizDetailReqData> details) {
		super();
		this.requestNo = requestNo;
		this.tradeType = tradeType;
		this.details = details;
	}

}
