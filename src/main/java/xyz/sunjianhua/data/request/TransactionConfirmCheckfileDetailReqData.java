/**
 * 
 */
package xyz.sunjianhua.data.request;

import java.io.Serializable;

/**
 * @Description 交易 对账文件确认
 * @author sunjianhua
 * @date 2018年1月30日 上午11:25:25
 */
public class TransactionConfirmCheckfileDetailReqData implements Serializable {

	/**
	 * 对账文件类型
	 */
	private String fileType;

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileType() {
		return fileType;
	}

}
