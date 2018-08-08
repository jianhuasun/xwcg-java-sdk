package xyz.sunjianhua.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

import com.alibaba.fastjson.JSON;
import xyz.sunjianhua.data.common.XwcgRspData;
import xyz.sunjianhua.data.exception.LanmaoLyException;
import xyz.sunjianhua.data.response.AccountActivateStockedUserRspData;
import xyz.sunjianhua.data.response.AccountCheckPasswordRspData;
import xyz.sunjianhua.data.response.AccountEnterpriseBindBankcardRspData;
import xyz.sunjianhua.data.response.AccountEnterpriseInformationUpdateResultData;
import xyz.sunjianhua.data.response.AccountEnterpriseInformationUpdateRspData;
import xyz.sunjianhua.data.response.AccountEnterpriseRegisterRspData;
import xyz.sunjianhua.data.response.AccountModifyMobileExpandRspData;
import xyz.sunjianhua.data.response.AccountPersonalBindBankcardExpandRspData;
import xyz.sunjianhua.data.response.AccountPersonalRegisterExpandRspData;
import xyz.sunjianhua.data.response.AccountResetPasswordRspData;
import xyz.sunjianhua.data.response.AccountUnbindBankcardRspData;
import xyz.sunjianhua.data.response.CztxBackrollRechargeRspData;
import xyz.sunjianhua.data.response.CztxRechargeRspData;
import xyz.sunjianhua.data.response.CztxWithdrawNotifyRspData;
import xyz.sunjianhua.data.response.CztxWithdrawPageReturnRspData;
import xyz.sunjianhua.data.response.TransactionAsyncTransactionNotifyRspData;
import xyz.sunjianhua.data.response.TransactionUserAuthorizationRspData;
import xyz.sunjianhua.data.response.TransactionUserPreTransactionRspData;
import xyz.sunjianhua.data.response.TransactionVerifyDeductRspData;
import xyz.sunjianhua.util.AppUtil;

/**
 * 新网存管回调数据验签解析
 * 
 * @author sunjianhua
 * @since 2018-1-27 13:21:48
 */
public class LanmaoLyRspParseService {

	/**
	 * 
	 * 1.1 个人绑卡注册 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static AccountPersonalRegisterExpandRspData personalRegisterExpandRsp(HttpServletRequest req)
			throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException(" 个人绑卡注册 接口返回签名错误!");
		}
		AccountPersonalRegisterExpandRspData personalRegisterExpandRspData = JSON
				.parseObject(gatewayRspData.getRespData(), AccountPersonalRegisterExpandRspData.class);
		return personalRegisterExpandRspData;
	}

	/**
	 * 
	 * 1.2 企业绑卡注册 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static AccountEnterpriseRegisterRspData enterpriseRegisterRsp(HttpServletRequest req) throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("企业绑卡注册 接口返回签名错误!");
		}
		AccountEnterpriseRegisterRspData enterpriseRegisterRspData = JSON.parseObject(gatewayRspData.getRespData(),
				AccountEnterpriseRegisterRspData.class);
		return enterpriseRegisterRspData;
	}

	/**
	 * 
	 * 1.3 个人绑卡 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static AccountPersonalBindBankcardExpandRspData personalBindBankcardExpandRsp(HttpServletRequest req)
			throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("个人绑卡 接口返回签名错误!");
		}
		AccountPersonalBindBankcardExpandRspData personalBindBankcardExpandRspData = JSON
				.parseObject(gatewayRspData.getRespData(), AccountPersonalBindBankcardExpandRspData.class);
		return personalBindBankcardExpandRspData;
	}

	/**
	 * 
	 * 1.4 企业绑卡 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static AccountEnterpriseBindBankcardRspData enterpriseBindBankcardRsp(HttpServletRequest req)
			throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("企业绑卡 接口返回签名错误!");
		}
		AccountEnterpriseBindBankcardRspData enterpriseBindBankcardRspData = JSON
				.parseObject(gatewayRspData.getRespData(), AccountEnterpriseBindBankcardRspData.class);
		return enterpriseBindBankcardRspData;
	}

	/**
	 * 
	 * 1.6 解绑银行卡 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static AccountUnbindBankcardRspData unbindBankcardRsp(HttpServletRequest req) throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("解绑银行卡 接口返回签名错误!");
		}
		AccountUnbindBankcardRspData unbindBankcardRspData = JSON.parseObject(gatewayRspData.getRespData(),
				AccountUnbindBankcardRspData.class);
		return unbindBankcardRspData;
	}

	/**
	 * 
	 * 1.7 修改密码 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static AccountResetPasswordRspData resetPasswordRsp(HttpServletRequest req) throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("修改密码 接口返回签名错误!");
		}
		AccountResetPasswordRspData resetPasswordRspData = JSON.parseObject(gatewayRspData.getRespData(),
				AccountResetPasswordRspData.class);
		return resetPasswordRspData;
	}

	/**
	 * 
	 * 1.8 验证密码 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static AccountCheckPasswordRspData checkPasswordRsp(HttpServletRequest req) throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("验证密码 接口返回签名错误!");
		}
		AccountCheckPasswordRspData checkPasswordRspData = JSON.parseObject(gatewayRspData.getRespData(),
				AccountCheckPasswordRspData.class);
		return checkPasswordRspData;
	}

	/**
	 * 
	 * 1.9 预留手机号更新 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static AccountModifyMobileExpandRspData modifyMobileExpandRsp(HttpServletRequest req) throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("预留手机号更新 接口返回签名错误!");
		}
		AccountModifyMobileExpandRspData modifyMobileExpandRspData = JSON.parseObject(gatewayRspData.getRespData(),
				AccountModifyMobileExpandRspData.class);
		return modifyMobileExpandRspData;
	}

	/**
	 * 
	 * 1.10 企业信息修改 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static AccountEnterpriseInformationUpdateRspData enterpriseInformationUpdateRsp(HttpServletRequest req)
			throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("企业信息修改 接口返回签名错误!");
		}
		AccountEnterpriseInformationUpdateRspData enterpriseInformationUpdateRspData = JSON
				.parseObject(gatewayRspData.getRespData(), AccountEnterpriseInformationUpdateRspData.class);
		return enterpriseInformationUpdateRspData;
	}

	/**
	 * 
	 * 1.10.1 企业信息修改 主动异步通知回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static AccountEnterpriseInformationUpdateResultData enterpriseInformationUpdateResult(HttpServletRequest req)
			throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("企业信息修改 主动异步通知回调 接口返回签名错误!");
		}
		AccountEnterpriseInformationUpdateResultData enterpriseInformationUpdateResultData = JSON
				.parseObject(gatewayRspData.getRespData(), AccountEnterpriseInformationUpdateResultData.class);
		return enterpriseInformationUpdateResultData;
	}

	/**
	 * 
	 * 1.11 会员激活 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static AccountActivateStockedUserRspData activateStockedUserRsp(HttpServletRequest req) throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("会员激活 接口返回签名错误!");
		}
		AccountActivateStockedUserRspData activateStockedUserRspData = JSON.parseObject(gatewayRspData.getRespData(),
				AccountActivateStockedUserRspData.class);
		return activateStockedUserRspData;
	}

	/**
	 * 
	 * 2.1 冲提 充值 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static CztxRechargeRspData cztxRechargeRsp(HttpServletRequest req) throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("冲提 充值 回调 接口返回签名错误!");
		}
		CztxRechargeRspData cztxRechargeRspData = JSON.parseObject(gatewayRspData.getRespData(),
				CztxRechargeRspData.class);
		return cztxRechargeRspData;
	}

	/**
	 * 
	 * 2.2.1 冲提 提现 页面回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static CztxWithdrawPageReturnRspData cztxWithdrawPageReturnRsp(HttpServletRequest req) throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("冲提 提现 页面回调返回签名错误!");
		}
		CztxWithdrawPageReturnRspData cztxWithdrawPageReturnRspData = JSON.parseObject(gatewayRspData.getRespData(),
				CztxWithdrawPageReturnRspData.class);
		return cztxWithdrawPageReturnRspData;
	}

	/**
	 * 
	 * 2.2.2 冲提 提现 主动异步回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static CztxWithdrawNotifyRspData cztxWithdrawNotifyRsp(HttpServletRequest req) throws Exception {
		XwcgRspData notifyRspData = new XwcgRspData();
		BeanUtils.populate(notifyRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(notifyRspData.getRespData(), notifyRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("冲提 提现主动异步返回签名错误!");
		}
		CztxWithdrawNotifyRspData cztxWithdrawNotifyRspData = JSON.parseObject(notifyRspData.getRespData(),
				CztxWithdrawNotifyRspData.class);
		return cztxWithdrawNotifyRspData;
	}

	/**
	 * 
	 * 2.2.3 冲提 自动回退充值 主动异步通知
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static CztxBackrollRechargeRspData cztxBackrollRechargeRsp(HttpServletRequest req) throws Exception {
		XwcgRspData notifyRspData = new XwcgRspData();
		BeanUtils.populate(notifyRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(notifyRspData.getRespData(), notifyRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("冲提 自动回退充值 主动异步通知返回签名错误!");
		}
		CztxBackrollRechargeRspData cztxBackrollRechargeRspData = JSON.parseObject(notifyRspData.getRespData(),
				CztxBackrollRechargeRspData.class);
		return cztxBackrollRechargeRspData;
	}

	/**
	 * 
	 * 3.4 交易 用户预处理 页面回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static TransactionUserPreTransactionRspData transactionUserPreTransactionRsp(HttpServletRequest req)
			throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("交易 用户预处理 页面回调 返回签名错误!");
		}
		TransactionUserPreTransactionRspData transactionUserPreTransactionRspData = JSON
				.parseObject(gatewayRspData.getRespData(), TransactionUserPreTransactionRspData.class);
		return transactionUserPreTransactionRspData;
	}

	/**
	 * 
	 * 3.6 交易 批量交易 主动异步通知
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static TransactionAsyncTransactionNotifyRspData transactionAsyncTransactionNotifyRsp(HttpServletRequest req)
			throws Exception {
		XwcgRspData notifyRspData = new XwcgRspData();
		BeanUtils.populate(notifyRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(notifyRspData.getRespData(), notifyRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("交易 批量交易 主动异步通知 返回签名错误!");
		}
		TransactionAsyncTransactionNotifyRspData transactionAsyncTransactionNotifyRspData = JSON
				.parseObject(notifyRspData.getRespData(), TransactionAsyncTransactionNotifyRspData.class);
		return transactionAsyncTransactionNotifyRspData;
	}

	/**
	 * 
	 * 3.9 交易 用户授权 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static TransactionUserAuthorizationRspData transactionUserAuthorizationRsp(HttpServletRequest req)
			throws Exception {
		XwcgRspData notifyRspData = new XwcgRspData();
		BeanUtils.populate(notifyRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(notifyRspData.getRespData(), notifyRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("交易 用户授权 返回签名错误!");
		}
		TransactionUserAuthorizationRspData transactionUserAuthorizationRspData = JSON
				.parseObject(notifyRspData.getRespData(), TransactionUserAuthorizationRspData.class);
		return transactionUserAuthorizationRspData;
	}

	/**
	 * 
	 * 3.12 交易 验密扣费 回调
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static TransactionVerifyDeductRspData transactionVerifyDeductRsp(HttpServletRequest req) throws Exception {
		XwcgRspData gatewayRspData = new XwcgRspData();
		BeanUtils.populate(gatewayRspData, req.getParameterMap());
		boolean signVal = AppUtil.verifySign(gatewayRspData.getRespData(), gatewayRspData.getSign());
		if (!signVal) {
			throw new LanmaoLyException("交易 验密扣费 回调 返回签名错误!");
		}
		TransactionVerifyDeductRspData transactionVerifyDeductRspData = JSON.parseObject(gatewayRspData.getRespData(),
				TransactionVerifyDeductRspData.class);
		return transactionVerifyDeductRspData;
	}

}
