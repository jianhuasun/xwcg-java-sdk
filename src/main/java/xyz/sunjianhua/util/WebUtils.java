package xyz.sunjianhua.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;

/**
 * 请求存管工具类(网关或者直连)
 * 
 * @author sunjianhua
 * @since 2018-1-27 13:59:53
 */
public class WebUtils {

	public static final int cache = 10 * 1024;

	public static String sendHttp(String url, Object parameters, int connectionTimeout, int readTimeout)
			throws Exception {
		String outStr = "";
		try {
			String charSet = "UTF-8";
			outStr = HttpClientHelper.doHttp(url, charSet, parameters, connectionTimeout, readTimeout);
			if (outStr == null) {
				throw new Exception("请求接口失败!");
			}
			System.out.println("接口返回=" + outStr);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("请求接口失败!");
		}
		return outStr;
	}

	public static String sendHttp(String url, Map parameters, int connectionTimeout, int readTimeout) throws Exception {
		String outStr = "";
		try {
			String charSet = "UTF-8";
			outStr = HttpClientHelper.doHttp(url, charSet, parameters, connectionTimeout, readTimeout);
			if (outStr == null) {
				throw new Exception("请求接口失败!");
			}
			System.out.println("接口返回=" + outStr);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("请求接口失败!");
		}
		return outStr;
	}

	public static Map<String, String> doHttpPost(String url, Map parameters, int connectionTimeout, int readTimeout)
			throws Exception {
		Map<String, String> outMap;
		try {
			String charSet = "UTF-8";
			outMap = HttpClientHelper.doHttpPost(url, charSet, parameters, connectionTimeout, readTimeout);
			if (outMap == null) {
				throw new Exception("请求接口失败!");
			}
			System.out.println("接口返回=" + JSON.toJSONString(outMap));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("请求接口失败!");
		}
		return outMap;
	}

	public static String genForwardHtml(String url, Map<String, String> parameters, String charset) {
		StringBuffer returnHtml = new StringBuffer("");
		if (!"".equals(url)) {
			returnHtml.append("<html>");
			String head = "<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=" + charset
					+ "\" pageEncoding=\"" + charset + "\" />";
			returnHtml.append(head);
			returnHtml.append("<title>loading</title>");
			returnHtml.append("<style type=\"text/css\">");
			returnHtml.append(
					"body{margin:200px auto;font-family: \"宋体\", Arial;font-size: 12px;color: #369;text-align: center;}");
			returnHtml.append("#1{height:auto; width:78px; margin:0 auto;}");
			returnHtml.append("#2{height:auto; width:153px; margin:0 auto;}");
			returnHtml.append("vertical-align: bottom;}");
			returnHtml.append("</style>");
			returnHtml.append("</head>");
			returnHtml.append("<body>");
			returnHtml.append("<div id=\"3\">交易处理中...</div>");
			returnHtml.append("<form name=\"forwardForm\" action=\"").append(url).append("\" method=\"POST\">");
			System.out.println("WebUtils genForwardHtml::url=" + url);
			Iterator keyIterator = parameters.keySet().iterator();
			while (keyIterator.hasNext()) {
				Object key = keyIterator.next();
				returnHtml.append("  <input type=\"hidden\" name=\"").append(key.toString()).append("\" value=\"")
						.append((String) parameters.get(key)).append("\"/>");
				System.out.println("WebUtils genForwardHtml::" + key.toString() + "=" + parameters.get(key));
			}
			returnHtml.append("</form>");
			returnHtml.append("<SCRIPT LANGUAGE=\"Javascript\">");
			returnHtml.append("    document.forwardForm.submit();");
			returnHtml.append("</SCRIPT>");
			returnHtml.append("</body>");
			returnHtml.append("</html>");
		}
		return returnHtml.toString();
	}

	/**
	 * 根据url下载文件，保存到filepath中
	 * 
	 * @param url
	 * @param paramMap 
	 * @param filepath
	 * @return
	 */
	public static String download(String url, Map<String, String> paramMap, String filepath) {
		try {
			if (filepath == null) {
				throw new Exception("保存路径不能为空!");
			}
			
			List<NameValuePair> params = new ArrayList<NameValuePair>();  
			for (Map.Entry<String, String> entry : paramMap.entrySet()) {  
				params.add(new BasicNameValuePair(entry.getKey(),entry.getValue()));  
            } 
			HttpClient client = new DefaultHttpClient();
			HttpGet httpget = new HttpGet(url+"?"+EntityUtils.toString(new UrlEncodedFormEntity(params, Consts.UTF_8)));
			HttpResponse response = client.execute(httpget);

			HttpEntity entity = response.getEntity();
			InputStream is = entity.getContent();
			File file = new File(filepath);
			file.getParentFile().mkdirs();
			FileOutputStream fileout = new FileOutputStream(file);
			/**
			 * 根据实际运行效果 设置缓冲区大小
			 */
			byte[] buffer = new byte[cache];
			int ch = 0;
			while ((ch = is.read(buffer)) != -1) {
				fileout.write(buffer, 0, ch);
			}
			is.close();
			fileout.flush();
			fileout.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 获取response header中Content-Disposition中的filename值
	 * 
	 * @param response
	 * @return
	 */
	public static String getFileName(HttpResponse response) {
		Header contentHeader = response.getFirstHeader("Content-Disposition");
		String filename = null;
		if (contentHeader != null) {
			HeaderElement[] values = contentHeader.getElements();
			if (values.length == 1) {
				NameValuePair param = values[0].getParameterByName("filename");
				if (param != null) {
					try {
						// filename = new
						// String(param.getValue().toString().getBytes(),
						// "utf-8");
						// filename=URLDecoder.decode(param.getValue(),"utf-8");
						filename = param.getValue();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		return filename;
	}

	/**
	 * 获取随机文件名
	 * 
	 * @return
	 */
	public static String getRandomFileName() {
		return String.valueOf(System.currentTimeMillis());
	}

}