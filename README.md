使用方法: 

1.在项目工程目录下放入xwcg.properties
2.请求存管直连接口或网关接口可使用LanmaoLyReqService.方法
3.网关接口都有对应的回调方法,可使用LanmaoLyRspParseService.方法
4.接口实体类说明
	
	账户接口:
		a.请求: Account + 接口名 +ReqData
		b.请求: Account + 接口名 +RspData
	冲提接口: 
		a.请求 : Cztx  + 接口名 +ReqData
		b.响应 : Cztx  + 接口名 +RspData
	交易接口: 
		a.请求 : Transation  + 接口名 +ReqData
		b.响应 : Transation  + 接口名 +RspData
	查询接口: 
		a.请求 : Query  + 接口名 +ReqData
		b.响应 : Query  + 接口名 +RspData
注 : 

1.请根据实际情况修改SDK!
2.所有接口交易金额为元! 
3.接口返回后需验证金额是否和平台金额一致!

