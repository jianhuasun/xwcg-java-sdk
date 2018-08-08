package xyz.sunjianhua.service;

import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import xyz.sunjianhua.data.constant.XwcgConstant;
import xyz.sunjianhua.data.exception.LanmaoLyException;
import xyz.sunjianhua.data.request.AccountActivateStockedUserReqData;
import xyz.sunjianhua.data.request.AccountAuditBindCardReqData;
import xyz.sunjianhua.data.request.AccountChangeUserBankcardReqData;
import xyz.sunjianhua.data.request.AccountCheckPasswordReqData;
import xyz.sunjianhua.data.request.AccountEnterpriseBindBankcardReqData;
import xyz.sunjianhua.data.request.AccountEnterpriseInformationUpdateReqData;
import xyz.sunjianhua.data.request.AccountEnterpriseRegisterReqData;
import xyz.sunjianhua.data.request.AccountModifyMobileExpandReqData;
import xyz.sunjianhua.data.request.AccountPersonalBindBankcardExpandReqData;
import xyz.sunjianhua.data.request.AccountPersonalRegisterExpandReqData;
import xyz.sunjianhua.data.request.AccountResetPasswordReqData;
import xyz.sunjianhua.data.request.AccountUnbindBankcardReqData;
import xyz.sunjianhua.data.request.CztxAutoWithdrawReqData;
import xyz.sunjianhua.data.request.CztxCancelWithdrawReqData;
import xyz.sunjianhua.data.request.CztxConfirmWithdrawReqData;
import xyz.sunjianhua.data.request.CztxDirectRechargeReqData;
import xyz.sunjianhua.data.request.CztxInterceptWithdrawReqData;
import xyz.sunjianhua.data.request.CztxRechargeReqData;
import xyz.sunjianhua.data.request.CztxWithdrawReqData;
import xyz.sunjianhua.data.request.QueryProjectInformationReqData;
import xyz.sunjianhua.data.request.QueryTransactionReqData;
import xyz.sunjianhua.data.request.QueryUserInformationReqData;
import xyz.sunjianhua.data.request.TransactionFreezePreTransactionReqData;
import xyz.sunjianhua.data.request.TransactionAsyncTransactionReqData;
import xyz.sunjianhua.data.request.TransactionCancelDebentureSaleReqData;
import xyz.sunjianhua.data.request.TransactionCancelPreTransactionReqData;
import xyz.sunjianhua.data.request.TransactionCancelUserAuthorizationReqData;
import xyz.sunjianhua.data.request.TransactionConfirmCheckfileReqData;
import xyz.sunjianhua.data.request.TransactionDebentureSaleReqData;
import xyz.sunjianhua.data.request.TransactionDownloadCheckfileReqData;
import xyz.sunjianhua.data.request.TransactionEstablishProjectReqData;
import xyz.sunjianhua.data.request.TransactionFreezeReqData;
import xyz.sunjianhua.data.request.TransactionModifyProjectReqData;
import xyz.sunjianhua.data.request.TransactionSyncTransactionReqData;
import xyz.sunjianhua.data.request.TransactionUnFreezeReqData;
import xyz.sunjianhua.data.request.TransactionUnFreezeTradePasswordReqData;
import xyz.sunjianhua.data.request.TransactionUserAuthorizationReqData;
import xyz.sunjianhua.data.request.TransactionUserAutoPreTransactionReqData;
import xyz.sunjianhua.data.request.TransactionUserPreTransactionReqData;
import xyz.sunjianhua.data.request.TransactionVerifyDeductReqData;
import xyz.sunjianhua.data.response.AccountAuditBindCardRspData;
import xyz.sunjianhua.data.response.AccountChangeUserBankcardRspData;
import xyz.sunjianhua.data.response.CztxAutoWithdrawRspData;
import xyz.sunjianhua.data.response.CztxCancelWithdrawRspData;
import xyz.sunjianhua.data.response.CztxConfirmWithdrawRspData;
import xyz.sunjianhua.data.response.CztxDirectRechargeRspData;
import xyz.sunjianhua.data.response.CztxInterceptWithdrawRspData;
import xyz.sunjianhua.data.response.QueryProjectInformationRspData;
import xyz.sunjianhua.data.response.QueryTransactionCancelPreTransactionRspData;
import xyz.sunjianhua.data.response.QueryTransactionDebentureRspData;
import xyz.sunjianhua.data.response.QueryTransactionFreezeRspData;
import xyz.sunjianhua.data.response.QueryTransactionGeneralFreezeRspData;
import xyz.sunjianhua.data.response.QueryTransactionInterceptWithdrawRspData;
import xyz.sunjianhua.data.response.QueryTransactionPreTransactionRspData;
import xyz.sunjianhua.data.response.QueryTransactionRechargeRspData;
import xyz.sunjianhua.data.response.QueryTransactionTransactionRspData;
import xyz.sunjianhua.data.response.QueryTransactionUnFreezeRspData;
import xyz.sunjianhua.data.response.QueryTransactionUpdateBankcardAuditRspData;
import xyz.sunjianhua.data.response.QueryTransactionWithdrawRspData;
import xyz.sunjianhua.data.response.QueryUserInformationRspData;
import xyz.sunjianhua.data.response.TransactionFreezePreTransactionRspData;
import xyz.sunjianhua.data.response.TransactionAsyncTransactionRspData;
import xyz.sunjianhua.data.response.TransactionCancelDebentureSaleRspData;
import xyz.sunjianhua.data.response.TransactionCancelPreTransactionRspData;
import xyz.sunjianhua.data.response.TransactionCancelUserAuthorizationRspData;
import xyz.sunjianhua.data.response.TransactionConfirmCheckfileRspData;
import xyz.sunjianhua.data.response.TransactionDebentureSaleRspData;
import xyz.sunjianhua.data.response.TransactionEstablishProjectRspData;
import xyz.sunjianhua.data.response.TransactionFreezeRspData;
import xyz.sunjianhua.data.response.TransactionModifyProjectRspData;
import xyz.sunjianhua.data.response.TransactionSyncTransactionRspData;
import xyz.sunjianhua.data.response.TransactionUnFreezeRspData;
import xyz.sunjianhua.data.response.TransactionUnFreezeTradePasswordRspData;
import xyz.sunjianhua.data.response.TransactionUserAuthorizationRspData;
import xyz.sunjianhua.data.response.TransactionUserAutoPreTransactionRspData;
import xyz.sunjianhua.util.AppConfig;
import xyz.sunjianhua.util.AppUtil;
import xyz.sunjianhua.util.WebUtils;

public class LanmaoLyReqService {

	/**
	 * 1.1 商户端 个人用户绑卡注册（网关接口）
	 */
	public static void personalRegisterExpandReq(AccountPersonalRegisterExpandReqData personalRegisterExpandReqData,
			HttpServletResponse response) throws Exception {
		if (personalRegisterExpandReqData == null) {
			throw new LanmaoLyException("人用户绑卡注册 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(AccountPersonalRegisterExpandReqData.serviceName,personalRegisterExpandReqData.getUserDevice(),
				personalRegisterExpandReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 1.2 商户端 企业绑卡注册（网关接口）
	 */
	public static void enterpriseRegisterReq(AccountEnterpriseRegisterReqData enterpriseRegisterReqData,
			HttpServletResponse response) throws Exception {
		if (enterpriseRegisterReqData == null) {
			throw new LanmaoLyException("企业绑卡注册 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(AccountEnterpriseRegisterReqData.serviceName,enterpriseRegisterReqData.getUserDevice(),
				enterpriseRegisterReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 1.3 商户端 个人绑卡（网关接口）
	 */
	public static void personalBindBankcardExpandReq(
			AccountPersonalBindBankcardExpandReqData personalBindBankcardExpandReqData, HttpServletResponse response)
			throws Exception {
		if (personalBindBankcardExpandReqData == null) {
			throw new LanmaoLyException("个人绑卡 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(AccountPersonalBindBankcardExpandReqData.serviceName,personalBindBankcardExpandReqData.getUserDevice(),
				personalBindBankcardExpandReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	public static void main(String[] args) {
		AccountPersonalBindBankcardExpandReqData req = new AccountPersonalBindBankcardExpandReqData();
		System.out.println(JSON.toJSONString(req.getReqDataMap()));
	}

	/**
	 * 1.4 商户端 企业绑卡（网关接口）
	 */
	public static void enterpriseBankcardReq(AccountEnterpriseBindBankcardReqData enterpriseBankcardReqData,
			HttpServletResponse response) throws Exception {
		if (enterpriseBankcardReqData == null) {
			throw new LanmaoLyException("企业绑卡 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(AccountEnterpriseBindBankcardReqData.serviceName,enterpriseBankcardReqData.getUserDevice(),
				enterpriseBankcardReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 1.5 账户换卡审核 (直连接口)
	 */
	public static AccountAuditBindCardRspData accountAuditBindCardReq(
			AccountAuditBindCardReqData accountAuditBindCardReqData) throws Exception {
		if (accountAuditBindCardReqData == null) {
			throw new LanmaoLyException("账户换卡审核 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(AccountAuditBindCardReqData.serviceName,
				accountAuditBindCardReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(AccountAuditBindCardReqData.serviceName, resultMap);

		AccountAuditBindCardRspData accountAuditBindCardRspData = JSON.parseObject(resultMap.get("respData"),
				AccountAuditBindCardRspData.class);
		return accountAuditBindCardRspData;
	}

	/**
	 * 1.6 商户端 解绑银行卡（网关接口）
	 */
	public static void unbindBankcardReq(AccountUnbindBankcardReqData unbindBankcardReqData,
			HttpServletResponse response) throws Exception {
		if (unbindBankcardReqData == null) {
			throw new LanmaoLyException("解绑银行卡 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(AccountUnbindBankcardReqData.serviceName,unbindBankcardReqData.getUserDevice(),
				unbindBankcardReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 1.7 商户端 修改密码（网关接口）
	 */
	public static void resetPasswordReq(AccountResetPasswordReqData resetPasswordReqData, HttpServletResponse response)
			throws Exception {
		if (resetPasswordReqData == null) {
			throw new LanmaoLyException("修改密码 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(AccountResetPasswordReqData.serviceName,resetPasswordReqData.getUserDevice(),
				resetPasswordReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 1.8 商户端 验证密码（网关接口）
	 */
	public static void checkPasswordReq(AccountCheckPasswordReqData checkPasswordReqData, HttpServletResponse response)
			throws Exception {
		if (checkPasswordReqData == null) {
			throw new LanmaoLyException("验证密码 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(AccountCheckPasswordReqData.serviceName,checkPasswordReqData.getUserDevice(),
				checkPasswordReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 1.9 商户端 预留手机号更新（网关接口）
	 */
	public static void modifyMobileExpandReq(AccountModifyMobileExpandReqData modifyMobileExpandReqData,
			HttpServletResponse response) throws Exception {
		if (modifyMobileExpandReqData == null) {
			throw new LanmaoLyException("预留手机号更新 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(AccountModifyMobileExpandReqData.serviceName,modifyMobileExpandReqData.getUserDevice(),
				modifyMobileExpandReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 1.10 商户端 企业信息修改（网关接口）
	 */
	public static void enterpriseInformationUpdateReq(
			AccountEnterpriseInformationUpdateReqData enterpriseInformationUpdateReqData, HttpServletResponse response)
			throws Exception {
		if (enterpriseInformationUpdateReqData == null) {
			throw new LanmaoLyException("企业信息修改 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(AccountEnterpriseInformationUpdateReqData.serviceName,enterpriseInformationUpdateReqData.getUserDevice(),
				enterpriseInformationUpdateReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 1.11 商户端 会员激活（网关接口）
	 */
	public static void activateStockedUserReq(AccountActivateStockedUserReqData activateStockedUserReqData,
			HttpServletResponse response) throws Exception {
		if (activateStockedUserReqData == null) {
			throw new LanmaoLyException("会员激活 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(AccountActivateStockedUserReqData.serviceName,activateStockedUserReqData.getUserDevice(),
				activateStockedUserReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 账户未激活换卡 (直连接口) 已弃用
	 * 
	 * @deprecated
	 */
	public static AccountChangeUserBankcardRspData changeUserBankcardReq(
			AccountChangeUserBankcardReqData changeUserBankcardReqData) throws Exception {
		if (changeUserBankcardReqData == null) {
			throw new LanmaoLyException("账户未激活换卡 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(AccountChangeUserBankcardReqData.serviceName,
				changeUserBankcardReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(AccountChangeUserBankcardReqData.serviceName, resultMap);

		AccountChangeUserBankcardRspData changeUserBankcardRspData = JSON.parseObject(resultMap.get("respData"),
				AccountChangeUserBankcardRspData.class);
		return changeUserBankcardRspData;
	}

	/**
	 * 2.1 商户端 冲提 充值（网关接口）
	 */
	public static void cztxRechargeReq(CztxRechargeReqData cztxRechargeReqData, HttpServletResponse response)
			throws Exception {
		if (cztxRechargeReqData == null) {
			throw new LanmaoLyException("冲提 充值 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(CztxRechargeReqData.serviceName,cztxRechargeReqData.getUserDevice(),
				cztxRechargeReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 商户端 冲提 自动充值（直连接口） 已弃用
	 * 
	 * @deprecated
	 */
	public static CztxDirectRechargeRspData cztxDirectRechargeReq(CztxDirectRechargeReqData cztxDirectRechargeReqData)
			throws Exception {
		if (cztxDirectRechargeReqData == null) {
			throw new LanmaoLyException("冲提 自动充值 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(CztxDirectRechargeReqData.serviceName,
				cztxDirectRechargeReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(CztxDirectRechargeReqData.serviceName, resultMap);

		CztxDirectRechargeRspData cztxDirectRechargeRspData = JSON.parseObject(resultMap.get("respData"),
				CztxDirectRechargeRspData.class);
		return cztxDirectRechargeRspData;
	}

	/**
	 * 2.2 商户端 冲提 提现（网关接口）
	 */
	public static void cztxWithdrawReq(CztxWithdrawReqData cztxWithdrawReqData, HttpServletResponse response)
			throws Exception {
		if (cztxWithdrawReqData == null) {
			throw new LanmaoLyException("冲提 提现 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(CztxWithdrawReqData.serviceName,cztxWithdrawReqData.getUserDevice(),
				cztxWithdrawReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 2.3 商户端 冲提 提现确认（直连接口）
	 */
	public static CztxConfirmWithdrawRspData cztxConfirmWithdrawReq(
			CztxConfirmWithdrawReqData cztxConfirmWithdrawReqData) throws Exception {
		if (cztxConfirmWithdrawReqData == null) {
			throw new LanmaoLyException("冲提 提现确认 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(CztxConfirmWithdrawReqData.serviceName,
				cztxConfirmWithdrawReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(CztxConfirmWithdrawReqData.serviceName, resultMap);

		CztxConfirmWithdrawRspData cztxConfirmWithdrawRspData = JSON.parseObject(resultMap.get("respData"),
				CztxConfirmWithdrawRspData.class);
		return cztxConfirmWithdrawRspData;
	}

	/**
	 * 2.4 商户端 冲提 取消提现（直连接口）
	 */
	public static CztxCancelWithdrawRspData cztxCancelWithdrawReq(CztxCancelWithdrawReqData cztxCancelWithdrawReqData)
			throws Exception {
		if (cztxCancelWithdrawReqData == null) {
			throw new LanmaoLyException("冲提 取消提现 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(CztxCancelWithdrawReqData.serviceName,
				cztxCancelWithdrawReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(CztxCancelWithdrawReqData.serviceName, resultMap);

		CztxCancelWithdrawRspData cztxCancelWithdrawRspData = JSON.parseObject(resultMap.get("respData"),
				CztxCancelWithdrawRspData.class);
		return cztxCancelWithdrawRspData;
	}

	/**
	 * 商户端 冲提 自动提现（直连接口） 已弃用
	 * 
	 * @deprecated
	 */
	public static CztxAutoWithdrawRspData cztxAutoWithdrawReq(CztxAutoWithdrawReqData cztxAutoWithdrawReqData)
			throws Exception {
		if (cztxAutoWithdrawReqData == null) {
			throw new LanmaoLyException("冲提 自动提现 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(CztxAutoWithdrawReqData.serviceName,
				cztxAutoWithdrawReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(CztxAutoWithdrawReqData.serviceName, resultMap);

		CztxAutoWithdrawRspData cztxAutoWithdrawRspData = JSON.parseObject(resultMap.get("respData"),
				CztxAutoWithdrawRspData.class);
		return cztxAutoWithdrawRspData;
	}

	/**
	 * 2.5 商户端 冲提 提现拦截（直连接口）
	 */
	public static CztxInterceptWithdrawRspData cztxInterceptWithdrawReq(
			CztxInterceptWithdrawReqData cztxInterceptWithdrawReqData) throws Exception {
		if (cztxInterceptWithdrawReqData == null) {
			throw new LanmaoLyException("冲提 提现拦截 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(CztxInterceptWithdrawReqData.serviceName,
				cztxInterceptWithdrawReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(CztxInterceptWithdrawReqData.serviceName, resultMap);

		CztxInterceptWithdrawRspData cztxInterceptWithdrawRspData = JSON.parseObject(resultMap.get("respData"),
				CztxInterceptWithdrawRspData.class);
		return cztxInterceptWithdrawRspData;
	}

	/**
	 * 3.1商户端 交易 创建标的（直连接口）
	 */
	public static TransactionEstablishProjectRspData transactionEstablishProjectReq(
			TransactionEstablishProjectReqData transactionEstablishProjectReqData) throws Exception {
		if (transactionEstablishProjectReqData == null) {
			throw new LanmaoLyException("交易 创建标的 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionEstablishProjectReqData.serviceName,
				transactionEstablishProjectReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionEstablishProjectReqData.serviceName, resultMap);

		TransactionEstablishProjectRspData transactionEstablishProjectRspData = JSON
				.parseObject(resultMap.get("respData"), TransactionEstablishProjectRspData.class);
		return transactionEstablishProjectRspData;
	}

	/**
	 * 3.2商户端 交易 变更标的（直连接口）
	 */
	public static TransactionModifyProjectRspData transactionModifyProjectReq(
			TransactionModifyProjectReqData transactionModifyProjectReqData) throws Exception {
		if (transactionModifyProjectReqData == null) {
			throw new LanmaoLyException("交易 变更标的 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionModifyProjectReqData.serviceName,
				transactionModifyProjectReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionModifyProjectReqData.serviceName, resultMap);

		TransactionModifyProjectRspData transactionModifyProjectRspData = JSON.parseObject(resultMap.get("respData"),
				TransactionModifyProjectRspData.class);
		return transactionModifyProjectRspData;
	}

	/**
	 * 3.3商户端 交易 冻结预处理（直连接口）
	 */
	public static TransactionFreezePreTransactionRspData transactionFreezePreTransactionReq(
			TransactionFreezePreTransactionReqData transactionFreezePreTransactionReqData) throws Exception {
		if (transactionFreezePreTransactionReqData == null) {
			throw new LanmaoLyException("交易 变更标的 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionFreezePreTransactionReqData.serviceName,
				transactionFreezePreTransactionReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionFreezePreTransactionReqData.serviceName, resultMap);

		TransactionFreezePreTransactionRspData transactionFreezePreTransactionRspData = JSON
				.parseObject(resultMap.get("respData"), TransactionFreezePreTransactionRspData.class);
		return transactionFreezePreTransactionRspData;
	}

	/**
	 * 3.4 商户端 交易 用户预处理（网关接口）
	 */
	public static void transactionUserPreTransactionReq(
			TransactionUserPreTransactionReqData transactionUserPreTransactionReqData, HttpServletResponse response)
			throws Exception {
		if (transactionUserPreTransactionReqData == null) {
			throw new LanmaoLyException("交易 用户预处理 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(TransactionUserPreTransactionReqData.serviceName,transactionUserPreTransactionReqData.getUserDevice(),
				transactionUserPreTransactionReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 3.5 商户端 交易 预处理取消（直连接口）
	 */
	public static TransactionCancelPreTransactionRspData transactionCancelPreTransactionReq(
			TransactionCancelPreTransactionReqData transactionCancelPreTransactionReqData) throws Exception {
		if (transactionCancelPreTransactionReqData == null) {
			throw new LanmaoLyException("交易 预处理取消 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionCancelPreTransactionReqData.serviceName,
				transactionCancelPreTransactionReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionCancelPreTransactionReqData.serviceName, resultMap);

		TransactionCancelPreTransactionRspData transactionCancelPreTransactionRspData = JSON
				.parseObject(resultMap.get("respData"), TransactionCancelPreTransactionRspData.class);
		return transactionCancelPreTransactionRspData;
	}

	/**
	 * 商户端 交易 单笔交易（直连接口） 已弃用
	 * 
	 * @deprecated
	 */
	public static TransactionSyncTransactionRspData transactionSyncTransactionReq(
			TransactionSyncTransactionReqData transactionSyncTransactionReqData) throws Exception {
		if (transactionSyncTransactionReqData == null) {
			throw new LanmaoLyException("交易 单笔交易 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionSyncTransactionReqData.serviceName,
				transactionSyncTransactionReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionSyncTransactionReqData.serviceName, resultMap);

		TransactionSyncTransactionRspData transactionSyncTransactionRspData = JSON.parseObject(resultMap.get("respData"),
				TransactionSyncTransactionRspData.class);
		return transactionSyncTransactionRspData;
	}

	/**
	 * 3.6 商户端 交易 批量交易（直连接口,有异步）
	 */
	public static TransactionAsyncTransactionRspData transactionAsyncTransactionReq(
			TransactionAsyncTransactionReqData transactionAsyncTransactionReqData) throws Exception {
		if (transactionAsyncTransactionReqData == null) {
			throw new LanmaoLyException("交易 批量交易 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionAsyncTransactionReqData.serviceName,
				transactionAsyncTransactionReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionAsyncTransactionReqData.serviceName, resultMap);

		TransactionAsyncTransactionRspData transactionAsyncTransactionRspData = JSON.parseObject(resultMap.get("respData"),
				TransactionAsyncTransactionRspData.class);
		return transactionAsyncTransactionRspData;
	}

	/**
	 * 3.7 商户端 交易 单笔债权出让（直连接口）
	 */
	public static TransactionDebentureSaleRspData transactionDebentureSaleReq(
			TransactionDebentureSaleReqData transactionDebentureSaleReqData) throws Exception {
		if (transactionDebentureSaleReqData == null) {
			throw new LanmaoLyException("交易 单笔债权出让 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionDebentureSaleReqData.serviceName,
				transactionDebentureSaleReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionDebentureSaleReqData.serviceName, resultMap);

		TransactionDebentureSaleRspData transactionDebentureSaleRspData = JSON.parseObject(resultMap.get("respData"),
				TransactionDebentureSaleRspData.class);
		return transactionDebentureSaleRspData;
	}

	/**
	 * 3.8 商户端 交易 取消债权出让（直连接口）
	 */
	public static TransactionCancelDebentureSaleRspData transactionCancelDebentureSaleReq(
			TransactionCancelDebentureSaleReqData transactionCancelDebentureSaleReqData) throws Exception {
		if (transactionCancelDebentureSaleReqData == null) {
			throw new LanmaoLyException("交易 取消债权出让 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionCancelDebentureSaleReqData.serviceName,
				transactionCancelDebentureSaleReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionCancelDebentureSaleReqData.serviceName, resultMap);

		TransactionCancelDebentureSaleRspData transactionCancelDebentureSaleRspData = JSON
				.parseObject(resultMap.get("respData"), TransactionCancelDebentureSaleRspData.class);
		return transactionCancelDebentureSaleRspData;
	}

	/**
	 * 3.9 商户端 交易 用户授权（直连接口）
	 */
	public static TransactionUserAuthorizationRspData transactionUserAuthorizationReq(
			TransactionUserAuthorizationReqData transactionUserAuthorizationReqData) throws Exception {
		if (transactionUserAuthorizationReqData == null) {
			throw new LanmaoLyException("交易 用户授权 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionUserAuthorizationReqData.serviceName,
				transactionUserAuthorizationReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionUserAuthorizationReqData.serviceName, resultMap);

		TransactionUserAuthorizationRspData transactionUserAuthorizationRspData = JSON
				.parseObject(resultMap.get("respData"), TransactionUserAuthorizationRspData.class);
		return transactionUserAuthorizationRspData;
	}

	/**
	 * 3.10 商户端 交易 取消用户授权（直连接口）
	 */
	public static TransactionCancelUserAuthorizationRspData transactionCancelUserAuthorizationReq(
			TransactionCancelUserAuthorizationReqData transactionCancelUserAuthorizationReqData) throws Exception {
		if (transactionCancelUserAuthorizationReqData == null) {
			throw new LanmaoLyException("交易 取消用户授权 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionCancelUserAuthorizationReqData.serviceName,
				transactionCancelUserAuthorizationReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionCancelUserAuthorizationReqData.serviceName, resultMap);

		TransactionCancelUserAuthorizationRspData transactionCancelUserAuthorizationRspData = JSON
				.parseObject(resultMap.get("respData"), TransactionCancelUserAuthorizationRspData.class);
		return transactionCancelUserAuthorizationRspData;
	}

	/**
	 * 3.11 商户端 交易 授权预处理（直连接口）
	 */
	public static TransactionUserAutoPreTransactionRspData transactionUserAutoPreTransactionReq(
			TransactionUserAutoPreTransactionReqData transactionUserAutoPreTransactionReqData) throws Exception {
		if (transactionUserAutoPreTransactionReqData == null) {
			throw new LanmaoLyException("交易 授权预处理 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionUserAutoPreTransactionReqData.serviceName,
				transactionUserAutoPreTransactionReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionUserAutoPreTransactionReqData.serviceName, resultMap);

		TransactionUserAutoPreTransactionRspData transactionUserAutoPreTransactionRspData = JSON
				.parseObject(resultMap.get("respData"), TransactionUserAutoPreTransactionRspData.class);
		return transactionUserAutoPreTransactionRspData;
	}

	/**
	 * 3.12 商户端 交易 验密扣费（网关接口）
	 */
	public static void transactionVerifyDeductReq(TransactionVerifyDeductReqData transactionVerifyDeductReqData,
			HttpServletResponse response) throws Exception {
		if (transactionVerifyDeductReqData == null) {
			throw new LanmaoLyException("交易 验密扣费 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createFormParam(TransactionVerifyDeductReqData.serviceName,transactionVerifyDeductReqData.getUserDevice(),
				transactionVerifyDeductReqData.getReqDataMap());
		String result = WebUtils.genForwardHtml(AppConfig.getConfig().getXwcgGatewayUrl(), paramMap, "utf-8");
		OutputStream out = response.getOutputStream();
		out.write(result.getBytes("utf-8"));
		out.flush();
	}

	/**
	 * 3.13 商户端 交易 资金冻结（直连接口）
	 */
	public static TransactionFreezeRspData transactionFreezeReq(
			TransactionFreezeReqData transactionFreezeReqData) throws Exception {
		if (transactionFreezeReqData == null) {
			throw new LanmaoLyException("交易 资金冻结 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionFreezeReqData.serviceName,
				transactionFreezeReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionFreezeReqData.serviceName, resultMap);

		TransactionFreezeRspData transactionFreezeRspData = JSON.parseObject(resultMap.get("respData"),
				TransactionFreezeRspData.class);
		return transactionFreezeRspData;
	}

	/**
	 * 3.14 商户端 交易 资金解冻（直连接口）
	 */
	public static TransactionUnFreezeRspData transactionUnFreezeReq(TransactionUnFreezeReqData transactionUnFreezeReqData)
			throws Exception {
		if (transactionUnFreezeReqData == null) {
			throw new LanmaoLyException("交易 资金解冻 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionUnFreezeReqData.serviceName,
				transactionUnFreezeReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionUnFreezeReqData.serviceName, resultMap);

		TransactionUnFreezeRspData transactionUnFreezeRspData = JSON.parseObject(resultMap.get("respData"),
				TransactionUnFreezeRspData.class);
		return transactionUnFreezeRspData;
	}

	/**
	 * 3.15 商户端 交易 对账文件下载（对账接口）
	 */
	public static void transactionDownloadCheckfileReq(
			TransactionDownloadCheckfileReqData transactionDownloadCheckfileReqData) throws Exception {
		if (transactionDownloadCheckfileReqData == null) {
			throw new LanmaoLyException("交易 对账文件下载 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionDownloadCheckfileReqData.serviceName,
				transactionDownloadCheckfileReqData.getReqDataMap());
		WebUtils.download(AppConfig.getConfig().getXwcgDownloadUrl(), paramMap,
				transactionDownloadCheckfileReqData.getFilePath());

	}

	/**
	 * 3.16 商户端 交易 对账文件确认（直连接口）
	 */
	public static TransactionConfirmCheckfileRspData transactionConfirmCheckfileReq(
			TransactionConfirmCheckfileReqData transactionConfirmCheckfileReqData) throws Exception {
		if (transactionConfirmCheckfileReqData == null) {
			throw new LanmaoLyException("交易 对账文件确认 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionConfirmCheckfileReqData.serviceName,
				transactionConfirmCheckfileReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionConfirmCheckfileReqData.serviceName, resultMap);

		TransactionConfirmCheckfileRspData transactionConfirmCheckfileRspData = JSON
				.parseObject(resultMap.get("respData"), TransactionConfirmCheckfileRspData.class);
		return transactionConfirmCheckfileRspData;
	}

	/**
	 * 3.17 商户端 交易 交易密码解冻（直连接口）
	 */
	public static TransactionUnFreezeTradePasswordRspData transactionUnFreezeTradePasswordReq(
			TransactionUnFreezeTradePasswordReqData transactionUnFreezeTradePasswordReqData) throws Exception {
		if (transactionUnFreezeTradePasswordReqData == null) {
			throw new LanmaoLyException("交易 交易密码解冻 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(TransactionUnFreezeTradePasswordReqData.serviceName,
				transactionUnFreezeTradePasswordReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(TransactionUnFreezeTradePasswordReqData.serviceName, resultMap);

		TransactionUnFreezeTradePasswordRspData transactionUnFreezeTradePasswordRspData = JSON
				.parseObject(resultMap.get("respData"), TransactionUnFreezeTradePasswordRspData.class);
		return transactionUnFreezeTradePasswordRspData;
	}

	/**
	 * 4.1 查询用户信息查询 (直连接口)
	 */
	public static QueryUserInformationRspData queryUserInformationReq(
			QueryUserInformationReqData queryUserInformationReqData) throws Exception {
		if (queryUserInformationReqData == null) {
			throw new LanmaoLyException("查询用户信息查询 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryUserInformationReqData.serviceName,
				queryUserInformationReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryUserInformationReqData.serviceName, resultMap);

		QueryUserInformationRspData queryUserInformationRspData = JSON.parseObject(resultMap.get("respData"),
				QueryUserInformationRspData.class);
		return queryUserInformationRspData;
	}

	/**
	 * 4.2.1 查询 单笔交易充值 (直连接口)
	 */
	public static QueryTransactionRechargeRspData queryTransactionRechargeReq(
			QueryTransactionReqData queryTransactionRechargeReqData) throws Exception {
		if (queryTransactionRechargeReqData == null) {
			throw new LanmaoLyException("查询 单笔交易充值 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryTransactionReqData.serviceName,
				queryTransactionRechargeReqData.getReqDataMap(XwcgConstant.TRANSACTION_QUERY_TYPE_RECHARGE));
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryTransactionReqData.serviceName, resultMap);

		QueryTransactionRechargeRspData queryTransactionRechargeRspData = JSON.parseObject(resultMap.get("respData"),
				QueryTransactionRechargeRspData.class);
		return queryTransactionRechargeRspData;
	}

	/**
	 * 4.2.2 查询 单笔交易提现 (直连接口)
	 */
	public static QueryTransactionWithdrawRspData queryTransactionWithdrawReq(
			QueryTransactionReqData queryTransactionWithdrawReqData) throws Exception {
		if (queryTransactionWithdrawReqData == null) {
			throw new LanmaoLyException("查询 单笔交易提现 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryTransactionReqData.serviceName,
				queryTransactionWithdrawReqData.getReqDataMap(XwcgConstant.TRANSACTION_QUERY_TYPE_WITHDRAW));
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryTransactionReqData.serviceName, resultMap);

		QueryTransactionWithdrawRspData queryTransactionWithdrawRspData = JSON.parseObject(resultMap.get("respData"),
				QueryTransactionWithdrawRspData.class);
		return queryTransactionWithdrawRspData;
	}

	/**
	 * 4.2.3 查询 单笔交易 交易预处理 (直连接口)
	 */
	public static QueryTransactionPreTransactionRspData queryTransactionPreTransactionReq(
			QueryTransactionReqData queryTransactionPreTransactionReqData) throws Exception {
		if (queryTransactionPreTransactionReqData == null) {
			throw new LanmaoLyException("查询 单笔交易提现 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryTransactionReqData.serviceName,
				queryTransactionPreTransactionReqData.getReqDataMap(XwcgConstant.TRANSACTION_QUERY_TYPE_PRETRANSACTION));
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryTransactionReqData.serviceName, resultMap);

		QueryTransactionPreTransactionRspData queryTransactionPreTransactionRspData = JSON
				.parseObject(resultMap.get("respData"), QueryTransactionPreTransactionRspData.class);
		return queryTransactionPreTransactionRspData;
	}

	/**
	 * 4.2.4 查询 单笔交易 交易确认 (直连接口)
	 */
	public static QueryTransactionTransactionRspData queryTransactionTransactionReq(
			QueryTransactionReqData queryTransactionTransactionReqData) throws Exception {
		if (queryTransactionTransactionReqData == null) {
			throw new LanmaoLyException("查询 单笔交易 交易确认 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryTransactionReqData.serviceName,
				queryTransactionTransactionReqData.getReqDataMap(XwcgConstant.TRANSACTION_QUERY_TYPE_TRANSACTION));
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryTransactionReqData.serviceName, resultMap);

		QueryTransactionTransactionRspData queryTransactionTransactionRspData = JSON.parseObject(resultMap.get("respData"),
				QueryTransactionTransactionRspData.class);
		return queryTransactionTransactionRspData;
	}

	/**
	 * 4.2.5 查询 单笔交易 冻结 (直连接口)
	 */
	public static QueryTransactionFreezeRspData queryTransactionFreezeReq(
			QueryTransactionReqData queryTransactionFreezeReqData) throws Exception {
		if (queryTransactionFreezeReqData == null) {
			throw new LanmaoLyException("查询 单笔交易 冻结 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryTransactionReqData.serviceName,
				queryTransactionFreezeReqData.getReqDataMap(XwcgConstant.TRANSACTION_QUERY_TYPE_FREEZE));
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryTransactionReqData.serviceName, resultMap);

		QueryTransactionFreezeRspData queryTransactionFreezeRspData = JSON.parseObject(resultMap.get("respData"),
				QueryTransactionFreezeRspData.class);
		return queryTransactionFreezeRspData;
	}

	/**
	 * 4.2.6 查询 单笔交易 债权出让 (直连接口)
	 */
	public static QueryTransactionDebentureRspData queryTransactionDebentureReq(
			QueryTransactionReqData queryTransactionDebentureReqData) throws Exception {
		if (queryTransactionDebentureReqData == null) {
			throw new LanmaoLyException("查询 单笔交易 债权出让 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryTransactionReqData.serviceName,
				queryTransactionDebentureReqData.getReqDataMap(XwcgConstant.TRANSACTION_QUERY_TYPE_DEBENTURE_SALE));
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryTransactionReqData.serviceName, resultMap);

		QueryTransactionDebentureRspData queryTransactionDebentureRspData = JSON.parseObject(resultMap.get("respData"),
				QueryTransactionDebentureRspData.class);
		return queryTransactionDebentureRspData;
	}

	/**
	 * 4.2.7 查询 单笔交易 取消预处理 (直连接口)
	 */
	public static QueryTransactionCancelPreTransactionRspData queryTransactionCancelPreTransactionReq(
			QueryTransactionReqData queryTransactionCancelPreTransactionReqData) throws Exception {
		if (queryTransactionCancelPreTransactionReqData == null) {
			throw new LanmaoLyException("查询 单笔交易 取消预处理 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryTransactionReqData.serviceName,
				queryTransactionCancelPreTransactionReqData
						.getReqDataMap(XwcgConstant.TRANSACTION_QUERY_TYPE_CANCEL_PRETRANSACTION));
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryTransactionReqData.serviceName, resultMap);

		QueryTransactionCancelPreTransactionRspData queryTransactionCancelPreTransactionRspData = JSON
				.parseObject(resultMap.get("respData"), QueryTransactionCancelPreTransactionRspData.class);
		return queryTransactionCancelPreTransactionRspData;
	}

	/**
	 * 4.2.8 查询 单笔交易 解冻 (直连接口)
	 */
	public static QueryTransactionUnFreezeRspData queryTransactionUnFreezeReq(
			QueryTransactionReqData queryTransactionUnFreezeReqData) throws Exception {
		if (queryTransactionUnFreezeReqData == null) {
			throw new LanmaoLyException("查询 单笔交易 解冻 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryTransactionReqData.serviceName,
				queryTransactionUnFreezeReqData.getReqDataMap(XwcgConstant.TRANSACTION_QUERY_TYPE_UNFREEZE));
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryTransactionReqData.serviceName, resultMap);

		QueryTransactionUnFreezeRspData queryTransactionUnFreezeRspData = JSON.parseObject(resultMap.get("respData"),
				QueryTransactionUnFreezeRspData.class);
		return queryTransactionUnFreezeRspData;
	}

	/**
	 * 4.2.9 查询 单笔交易 提现拦截 (直连接口)
	 */
	public static QueryTransactionInterceptWithdrawRspData queryTransactionInterceptWithdrawReq(
			QueryTransactionReqData queryTransactionInterceptWithdrawReqData) throws Exception {
		if (queryTransactionInterceptWithdrawReqData == null) {
			throw new LanmaoLyException("查询 单笔交易 提现拦截 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryTransactionReqData.serviceName,
				queryTransactionInterceptWithdrawReqData
						.getReqDataMap(XwcgConstant.TRANSACTION_QUERY_TYPE_INTERCEPT_WITHDRAW));
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryTransactionReqData.serviceName, resultMap);

		QueryTransactionInterceptWithdrawRspData queryTransactionInterceptWithdrawRspData = JSON
				.parseObject(resultMap.get("respData"), QueryTransactionInterceptWithdrawRspData.class);
		return queryTransactionInterceptWithdrawRspData;
	}

	/**
	 * 4.2.10 查询 单笔交易 通用冻结 (直连接口)
	 */
	public static QueryTransactionGeneralFreezeRspData queryTransactionGeneralFreezeReq(
			QueryTransactionReqData queryTransactionGeneralFreezeReqData) throws Exception {
		if (queryTransactionGeneralFreezeReqData == null) {
			throw new LanmaoLyException("查询 单笔交易 通用冻结 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryTransactionReqData.serviceName,
				queryTransactionGeneralFreezeReqData.getReqDataMap(XwcgConstant.TRANSACTION_QUERY_TYPE_GENERAL_FREEZE));
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryTransactionReqData.serviceName, resultMap);

		QueryTransactionGeneralFreezeRspData queryTransactionGeneralFreezeRspData = JSON
				.parseObject(resultMap.get("respData"), QueryTransactionGeneralFreezeRspData.class);
		return queryTransactionGeneralFreezeRspData;
	}

	/**
	 * 4.2.11 查询 单笔交易 换卡记录 (直连接口)
	 */
	public static QueryTransactionUpdateBankcardAuditRspData queryTransactionUpdateBankcardAuditReq(
			QueryTransactionReqData queryTransactionUpdateBankcardAuditReqData) throws Exception {
		if (queryTransactionUpdateBankcardAuditReqData == null) {
			throw new LanmaoLyException("查询 单笔交易 换卡记录 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryTransactionReqData.serviceName,
				queryTransactionUpdateBankcardAuditReqData
						.getReqDataMap(XwcgConstant.TRANSACTION_QUERY_TYPE_UPDATE_BANKCARD_AUDIT));
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryTransactionReqData.serviceName, resultMap);

		QueryTransactionUpdateBankcardAuditRspData queryTransactionUpdateBankcardAuditRspData = JSON
				.parseObject(resultMap.get("respData"), QueryTransactionUpdateBankcardAuditRspData.class);
		return queryTransactionUpdateBankcardAuditRspData;
	}

	/**
	 * 4.3 查询标的信息查询 (直连接口)
	 */
	public static QueryProjectInformationRspData queryProjectInformationReq(
			QueryProjectInformationReqData queryProjectInformationReqData) throws Exception {
		if (queryProjectInformationReqData == null) {
			throw new LanmaoLyException("查询标的信息查询 请求参数为空");
		}
		Map<String, String> paramMap = AppUtil.createHttpPostParam(QueryProjectInformationReqData.serviceName,
				queryProjectInformationReqData.getReqDataMap());
		Map<String, String> resultMap = WebUtils.doHttpPost(AppConfig.getConfig().getXwcgServiceUrl(), paramMap,
				AppConfig.getConfig().getConnectionTimeout(), AppConfig.getConfig().getReadTimeout());

		confirmCodeAndStatus(QueryProjectInformationReqData.serviceName, resultMap);

		QueryProjectInformationRspData queryProjectInformationRspData = JSON.parseObject(resultMap.get("respData"),
				QueryProjectInformationRspData.class);
		return queryProjectInformationRspData;
	}

	public static void confirmCodeAndStatus(String serviceName, Map<String, String> resultMap) throws Exception {
		if (null == resultMap || StringUtils.isEmpty(JSON.toJSONString(resultMap))) {
			throw new LanmaoLyException("返回报文为空");
		}
		JSONObject jsonObject = JSON.parseObject(resultMap.get("respData"), JSONObject.class);
		if (!XwcgConstant.RSP_DATA_CODE_0.equals(String.valueOf(jsonObject.get("code")))
				|| (XwcgConstant.RSP_DATA_CODE_0.equals(String.valueOf(jsonObject.get("code")))
						&& !XwcgConstant.RSP_DATA_STATUS_SUCCESS.equals(String.valueOf(jsonObject.get("status"))))) {
			throw new LanmaoLyException(String.valueOf(jsonObject.get("code")),
					String.valueOf(jsonObject.get("status")), String.valueOf(jsonObject.get("errorCode")),
					String.valueOf(jsonObject.get("errorMessage")));
		}
		if (!AppUtil.verifySign(resultMap.get("respData"), resultMap.get("sign"))) {
			throw new LanmaoLyException("验签失败");
		}
		if (!XwcgConstant.RSP_DATA_STATUS_SUCCESS.equals(String.valueOf(jsonObject.get("status")))) {
			throw new LanmaoLyException(String.valueOf(jsonObject.get("code")),
					String.valueOf(jsonObject.get("status")), String.valueOf(jsonObject.get("errorCode")),
					String.valueOf(jsonObject.get("errorMessage")));
		}
	}

}
