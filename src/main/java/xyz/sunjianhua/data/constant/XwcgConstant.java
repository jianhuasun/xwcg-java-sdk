package xyz.sunjianhua.data.constant;

/**
 * 新网存管 常量类
 * @author sunjianhua
 *@since 2018-1-24 17:02:04
 */
public final class XwcgConstant {
	
	/** 调用状态 调用成功 0 */
	public static final String RSP_DATA_CODE_0="0";
	/** 调用状态 调用失败 1 */
	public static final String RSP_DATA_CODE_1="1";
	
	/** 业务处理状态 处理成功 */
	public static final String RSP_DATA_STATUS_SUCCESS="SUCCESS";
	/** 业务处理状态 处理失败 */
	public static final String RSP_DATA_STATUS_INIT="INIT";

	/** 终端类型 PC 端 */
	public static final String TERMINAL_PC="PC";
	/** 终端类型 移动端 */
	public static final String TERMINAL_MOBILE="MOBILE";
	
	/** 接口类型 网关接口 **/
	public static final String SERVICE_TYPE_GATEWAY="GATEWAY";
	/** 接口类型 直连接口 **/
	public static final String SERVICE_TYPE_SERVICE_DIRECT="SERVICE_DIRECT";
	/** 接口类型 对账接口 **/
	public static final String SERVICE_TYPE_DOWNLOAD="DOWNLOAD";
	
	
	/** 回调类型 浏览器返回 */
	public static final String RESPONSETYPE_DIRECT_CALLBACK="CALLBACK";
	/** 回调类型 服务器异步通知 */
	public static final String RESPONSETYPE_NOTIFY="NOTIFY";
	
	
	/** 证件类型 身份证 */
	public static final String IDTYPE_PRC_ID="PRC_ID";
	/** 证件类型 护照 */
	public static final String IDTYPE_PASSPORT="PASSPORT";
	/** 证件类型 港澳台通行证 */
	public static final String IDTYPE_COMPATRIOTS_CARD="COMPATRIOTS_CARD";
	/** 证件类型 外国人永久居留证 */
	public static final String IDTYPE_PERMANENT_RESIDENCE="PERMANENT_RESIDENCE";
	
	
	
	/** 用户类型 个人用户 */
	public static final String USERTYPE_PERSONAL="PERSONAL";
	/** 用户类型 企业用户 */
	public static final String USERTYPE_ORGANIZATION="ORGANIZATION";
	
	
	/** 用户角色 担保机构 */
	public static final String USERROLE_GUARANTEECORP="GUARANTEECORP";
	/** 用户角色 投资人 */
	public static final String USERROLE_INVESTOR="INVESTOR";
	/** 用户角色 借款人 */
	public static final String USERROLE_BORROWERS="BORROWERS";
	/** 用户角色 居间人 */
	public static final String USERROLE_INTERMEDIATOR="INTERMEDIATOR"; //新文档无此角色
	/** 用户角色 合作机构 */
	public static final String USERROLE_COLLABORATOR="COLLABORATOR";
	/** 用户角色 供应商 */
	public static final String USERROLE_SUPPLIER="SUPPLIER";
	/** 用户角色 平台代偿账户 */
	public static final String USERROLE_PLATFORM_COMPENSATORY="PLATFORM_COMPENSATORY"; //新文档无此角色
	/** 用户角色 平台营销款账户 */
	public static final String USERROLE_PLATFORM_MARKETING="PLATFORM_MARKETING";
	/** 用户角色 平台分润账户 */
	public static final String USERROLE_PLATFORM_PROFIT="PLATFORM_PROFIT"; //新文档无此角色
	/** 用户角色 平台收入账户 */
	public static final String USERROLE_PLATFORM_INCOME="PLATFORM_INCOME";
	/** 用户角色 平台派息账户 */
	public static final String USERROLE_PLATFORM_INTEREST="PLATFORM_INTEREST";
	/** 用户角色 平台代充值账户 */
	public static final String USERROLE_PLATFORM_ALTERNATIVE_RECHARGE="PLATFORM_ALTERNATIVE_RECHARGE"; //新文档无
	/** 用户角色 平台总账户 */
	public static final String USERROLE_PLATFORM_FUNDS_TRANSFER="PLATFORM_FUNDS_TRANSFER";
	
	
	/** 用户状态 可用 */
	public static final String USERSTATUS_ACTIVATED="ACTIVATED";
	/** 用户状态 不可用 */
	public static final String USERSTATUS_DEACTIVATED="DEACTIVATED";
	
	
	/** 审核状态 审核中 */
	public static final String AUDITSTATUS_AUDIT="AUDIT";
	/** 审核状态 审核通过 */
	public static final String AUDITSTATUS_PASSED="PASSED";
	/** 审核状态 审核回退 */
	public static final String AUDITSTATUS_BACK="BACK";
	/** 审核状态 审核拒绝 */
	public static final String AUDITSTATUS_REFUSED="REFUSED";
	
	
	/** 预处理业务类型 投标 */
	public static final String PRE_TRANSACTION_TYPE_TENDER="TENDER";
	/** 预处理业务类型 还款 */
	public static final String PRE_TRANSACTION_TYPE_REPAYMENT="REPAYMENT";
	/** 预处理业务类型 债权认购 */
	public static final String PRE_TRANSACTION_TYPE_CREDIT_ASSIGNMENT="CREDIT_ASSIGNMENT";
	/** 预处理业务类型 代偿 */
	public static final String PRE_TRANSACTION_TYPE_COMPENSATORY="COMPENSATORY";
	/** 预处理业务类型 交易预处理 */
	public static final String PRE_TRANSACTION_TYPE_PRETRANSACTION="PRETRANSACTION";
	 
	
	/** 交易类型 投标 */
	public static final String TRANSACTION_TYPE_TENDER="TENDER"; //新文档无
	/** 交易类型 还款 */
	public static final String TRANSACTION_TYPE_REPAYMENT="REPAYMENT";
	/** 交易类型 债权认购 */
	public static final String TRANSACTION_TYPE_CREDIT_ASSIGNMENT="CREDIT_ASSIGNMENT";
	/** 交易类型 直接代偿 */
	public static final String TRANSACTION_TYPE_COMPENSATORY="COMPENSATORY";
	/** 交易类型 间接代偿 */
	public static final String TRANSACTION_TYPE_INDIRECT_COMPENSATORY="INDIRECT_COMPENSATORY";
	/** 交易类型 独立分润 */
	public static final String TRANSACTION_TYPE_PLATFORM_INDEPENDENT_PROFIT="PLATFORM_INDEPENDENT_PROFIT";
	/** 交易类型 平台营销款 */
	public static final String TRANSACTION_TYPE_MARKETING="MARKETING";
	/** 交易类型 收费 */
	public static final String TRANSACTION_TYPE_PLATFORM_SERVICE_DEDUCT="PLATFORM_SERVICE_DEDUCT";
	/** 交易类型 平台资金划拨 */
	public static final String TRANSACTION_TYPE_FUNDS_TRANSFER="FUNDS_TRANSFER";
	/** 交易类型 追加冻结 */
	public static final String TRANSACTION_TYPE_APPEND_FREEZE="APPEND_FREEZE";
	
	/** 业务类型 投标 */
	public static final String BUSINESS_TYPE_TENDER="TENDER";
	/** 业务类型 还款 */
	public static final String BUSINESS_TYPE_REPAYMENT="REPAYMENT";
	/** 业务类型 债权认购 */
	public static final String BUSINESS_TYPE_CREDIT_ASSIGNMENT="CREDIT_ASSIGNMENT";
	/** 业务类型 直接代偿 */
	public static final String BUSINESS_TYPE_COMPENSATORY="COMPENSATORY";
	/** 业务类型 还代偿款 */
	public static final String BUSINESS_TYPE_COMPENSATORY_REPAYMENT="COMPENSATORY_REPAYMENT";
	/** 业务类型 独立分润 */
	public static final String BUSINESS_TYPE_PLATFORM_INDEPENDENT_PROFIT="PLATFORM_INDEPENDENT_PROFIT";
	/** 业务类型 营销红包 */
	public static final String BUSINESS_TYPE_MARKETING="MARKETING";
	/** 业务类型 派息 */
	public static final String BUSINESS_TYPE_INTEREST="INTEREST";
	/** 业务类型 代充值 */
	public static final String BUSINESS_TYPE_ALTERNATIVE_RECHARGE="ALTERNATIVE_RECHARGE"; //新文档无
	/** 业务类型 还派息款 */
	public static final String BUSINESS_TYPE_INTEREST_REPAYMENT="INTEREST_REPAYMENT";
	/** 业务类型 佣金 */
	public static final String BUSINESS_TYPE_COMMISSION="COMMISSION";
	/** 业务类型 关联分润 */
	public static final String BUSINESS_TYPE_PROFIT="PROFIT";
	/** 业务类型 平台服务费 */
	public static final String BUSINESS_TYPE_DEDUCT="DEDUCT";
	/** 业务类型 平台资金划拨 */
	public static final String BUSINESS_TYPE_FUNDS_TRANSFER="FUNDS_TRANSFER";
	/** 业务类型 追加冻结 */
	public static final String BUSINESS_TYPE_APPEND_FREEZE="APPEND_FREEZE";
	
	
	/** 业务来源 散标 */
	public static final String BUSINESS_FROM_DISPERSION="DISPERSION";
	
	
	/** 提现方式 正常 */
	public static final String WITHDRAW_TYPE_NORMAL="NORMAL";
	
	
	/** 提现类型  提现类型，IMMEDIATE 为直接提现，CONFIRMED 为待确认提现，默认为直接提现方式 */
	public static final String WITHDRAW_FORM_IMMEDIATE="IMMEDIATE";
	public static final String WITHDRAW_FORM_CONFIRMED="CONFIRMED";
	
	/** 支付方式 网银 */
	public static final String RECHARGE_WAY_WEB="WEB";
	/** 支付方式 快捷支付 */
	public static final String RECHARGE_WAY_SWIFT="SWIFT";
	/** 支付方式 转账充值，仅适用迁移场景，调用单笔充值订单查询接口返回 */
	public static final String RECHARGE_WAY_BANK="BANK";
	/** 支付方式 资金回退充值 */
	public static final String RECHARGE_WAY_BACKROLL="BACKROLL";
	/** 支付方式 自动充值 */
	public static final String RECHARGE_WAY_PROXY="PROXY"; //新文档无
	
	
	/** 标的类型 散标 */
	public static final String BORROW_TYPE_STANDARDPOWDER="STANDARDPOWDER";
	
	
	/** 鉴权通过类型 四要素验证通过 */
	public static final String AUTH_TYPE_FULL_CHECKED="FULL_CHECKED";
	/** 鉴权通过类型 未鉴权 */
	public static final String AUTH_TYPE_NOT_AUTH="NOT_AUTH";
	/** 鉴权通过类型 特殊用户认证 */
	public static final String AUTH_TYPE_AUDIT_AUTH="AUDIT_AUTH";
	/** 鉴权通过类型 企业用户认证 */
	public static final String AUTH_TYPE_PART_CHECKED="PART_CHECKED";
	
	
	/** 标的状态 募集中 */
	public static final String BORROW_STATUS_COLLECTING="COLLECTING";
	/** 标的状态 还款中 */
	public static final String BORROW_STATUS_REPAYING="REPAYING";
	/** 标的状态 已截标 */
	public static final String BORROW_STATUS_FINISH="FINISH";
	/** 标的状态 流标 */
	public static final String BORROW_STATUS_MISCARRY="MISCARRY";
	
	
	/** 还款状态 一次性还本付息 */
	public static final String REPAYMENT_TYPE_ONE_TIME_SERVICING="ONE_TIME_SERVICING";
	/** 还款状态 先息后本 */
	public static final String REPAYMENT_TYPE_FIRSEINTREST_LASTPRICIPAL="FIRSEINTREST_LASTPRICIPAL";
	/** 还款状态 等额本息 */
	public static final String REPAYMENT_TYPE_FIXED_PAYMENT_MORTGAGE="FIXED_PAYMENT_MORTGAGE";
	/** 还款状态 等额本金 */
	public static final String REPAYMENT_TYPE_FIXED_BASIS_MORTGAGE="FIXED_BASIS_MORTGAGE";
	
	
	
	/** 平台账户编号 平台总账户（系统自动生成平台用户编号） */
	public static final String SYSTEM_ACCOUNT_SYS_GENERATE_000="SYS_GENERATE_000";
	/** 平台账户编号 代偿金账户 */
	public static final String SYSTEM_ACCOUNT_SYS_GENERATE_001="SYS_GENERATE_001"; //新文档无
	/** 平台账户编号 营销款账户 */
	public static final String SYSTEM_ACCOUNT_SYS_GENERATE_002="SYS_GENERATE_002";
	/** 平台账户编号 分润账户 */
	public static final String SYSTEM_ACCOUNT_SYS_GENERATE_003="SYS_GENERATE_003"; //新文档无
	/** 平台账户编号 收入账户 */
	public static final String SYSTEM_ACCOUNT_SYS_GENERATE_004="SYS_GENERATE_004";
	/** 平台账户编号 派息账户 */
	public static final String SYSTEM_ACCOUNT_SYS_GENERATE_005="SYS_GENERATE_005";
	/** 平台账户编号 代充值账户 */
	public static final String SYSTEM_ACCOUNT_SYS_GENERATE_006="SYS_GENERATE_006"; //新文档无
	/** 平台账户编号 登录账户 */
	public static final String SYSTEM_ACCOUNT_SYS_GENERATE_007="SYS_GENERATE_007";
	
	
	
	/** 交易查询类型 充值 */
	public static final String TRANSACTION_QUERY_TYPE_RECHARGE="RECHARGE";
	/** 交易查询类型 提现 */
	public static final String TRANSACTION_QUERY_TYPE_WITHDRAW="WITHDRAW";
	/** 交易查询类型 交易预处理 */
	public static final String TRANSACTION_QUERY_TYPE_PRETRANSACTION="PRETRANSACTION";
	/** 交易查询类型 交易确认 */
	public static final String TRANSACTION_QUERY_TYPE_TRANSACTION="TRANSACTION";
	/** 交易查询类型 冻结 */
	public static final String TRANSACTION_QUERY_TYPE_FREEZE="FREEZE";
	/** 交易查询类型 债权出让 */
	public static final String TRANSACTION_QUERY_TYPE_DEBENTURE_SALE="DEBENTURE_SALE";
	/** 交易查询类型 取消预处理 */
	public static final String TRANSACTION_QUERY_TYPE_CANCEL_PRETRANSACTION="CANCEL_PRETRANSACTION";
	/** 交易查询类型 解冻 */
	public static final String TRANSACTION_QUERY_TYPE_UNFREEZE="UNFREEZE";
	/** 交易查询类型 提现拦截 */
	public static final String TRANSACTION_QUERY_TYPE_INTERCEPT_WITHDRAW="INTERCEPT_WITHDRAW";
	/** 交易查询类型 通用冻结 */
	public static final String TRANSACTION_QUERY_TYPE_GENERAL_FREEZE="GENERAL_FREEZE";
	/** 交易查询类型 换卡记录 */
	public static final String TRANSACTION_QUERY_TYPE_UPDATE_BANKCARD_AUDIT="UPDATE_BANKCARD_AUDIT";
	
	
	/** 对账文件类型 充值 */
	public static final String CHECKFILE_TYPE_RECHARGE="RECHARGE";
	/** 对账文件类型 提现 */
	public static final String CHECKFILE_TYPE_WITHDRAW="WITHDRAW";
	/** 对账文件类型 佣金 */
	public static final String CHECKFILE_TYPE_COMMISSION="COMMISSION";
	/** 对账文件类型 交易 */
	public static final String CHECKFILE_TYPE_TRANSACTION="TRANSACTION";
	/** 对账文件类型 资金回退充值 */
	public static final String CHECKFILE_TYPE_BACKROLL_RECHARGE="BACKROLL_RECHARGE";
	
	
	/** 支付公司 易宝支付 */
	public static final String PAY_COMPANY_YEEPAY="YEEPAY";
	/** 支付公司 富友支付 */
	public static final String PAY_COMPANY_FUIOU="FUIOU";
	/** 支付公司 通联支付 */
	public static final String PAY_COMPANY_ALLINPAY="ALLINPAY";
	/** 支付公司 爱农支付 */
	public static final String PAY_COMPANY_CHINAGPAY="CHINAGPAY"; //新文档无
	/** 支付公司 腾付通 */
	public static final String PAY_COMPANY_TFTPAY="TFTPAY"; //新文档无
	/** 支付公司 先锋支付 */
	public static final String PAY_COMPANY_UCFPAY="UCFPAY";
	/** 支付公司 宝付 */
	public static final String PAY_COMPANY_BAOFOO="BAOFOO";
	/** 支付公司 融宝 */
	public static final String PAY_COMPANY_REAPAL="REAPAL";
	/** 支付公司 快钱支付 */
	public static final String PAY_COMPANY_BILL99="BILL99";
	/** 支付公司 连连支付 */
	public static final String PAY_COMPANY_LIANLIAN="LIANLIAN";
	/** 支付公司 丰付 */
	public static final String PAY_COMPANY_SUMAPAY="SUMAPAY";
	/** 支付公司 新生支付 */
	public static final String PAY_COMPANY_NEWPAY="NEWPAY";
	/** 支付公司 邦付宝 */
	public static final String PAY_COMPANY_BFBPAY="BFBPAY";
	/** 支付公司 联动优势 */
	public static final String PAY_COMPANY_UMPAY="UMPAY";
	
	
	/** 提现交易状态 待确认 */
	public static final String WITHDRAW_STATUS_CONFIRMING="CONFIRMING";
	/** 提现交易状态 已受理 */
	public static final String WITHDRAW_STATUS_ACCEPT="ACCEPT";
	/** 提现交易状态 出款中 */
	public static final String WITHDRAW_STATUS_REMITING="REMITING";
	/** 提现交易状态 提现成功 */
	public static final String WITHDRAW_STATUS_SUCCESS="SUCCESS";
	/** 提现交易状态 提现失败 */
	public static final String WITHDRAW_STATUS_FAIL="FAIL";
	/** 提现交易状态 受理失败 */
	public static final String WITHDRAW_STATUS_ACCEPT_FAIL="ACCEPT_FAIL";
	
	
	/** 网银类型 个人网银 */
	public static final String BANK_TYPE_B2C="B2C";
	/** 网银类型 企业网银 */
	public static final String BANK_TYPE_B2B="B2B";
	
	
	/** 代偿业务类型 普通代偿 */
	public static final String COMPENSATORY_TYPE_COMPENSATORY="COMPENSATORY";
	
	
	/** 提现拦截状态 拦截成功 */
	public static final String INTERCEPT_WITHDRAW_STATUS_SUCCESS="SUCCESS";
	/** 提现拦截状态 拦截失败 */
	public static final String INTERCEPT_WITHDRAW_STATUS_FAIL="FAIL";
	
	
	/** 用户授权列表 自动投标 */
	public static final String UTHORIZATION_TYPE_SUCCESS="TENDER";
	/** 用户授权列表 自动还款 */
	public static final String UTHORIZATION_TYPE_REPAYMENT="REPAYMENT";
	/** 用户授权列表 自动债权认购 */
	public static final String UTHORIZATION_TYPE_CREDIT_ASSIGNMENT="CREDIT_ASSIGNMENT"; //新文档无
	/** 用户授权列表 自动代偿 */
	public static final String UTHORIZATION_TYPE_COMPENSATORY="COMPENSATORY"; //新文档无
	/** 用户授权列表 自动提现 */
	public static final String UTHORIZATION_TYPE_WITHDRAW="WITHDRAW";//新文档无
	/** 用户授权列表 自动充值 */
	public static final String UTHORIZATION_TYPE_RECHARGE="RECHARGE";//新文档无
}
