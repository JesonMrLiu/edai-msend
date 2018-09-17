package com.edai.msend;

public class SendTest {
	//用户名
	private static String Uid = "liugang";
	//接口安全秘钥
	private static String Key = "d41d8cd98f00b204e980";
	//手机号码，多个号码如13800000000,13800000001,13800000002
	private static String smsMob = "13600435547";
	//短信内容
	private static String smsText = "验证码：8888";
	
	public static void main(String[] args) {
		
		HttpClientUtil client = HttpClientUtil.getInstance();
		
		//GBK发送
		int resultGbk = client.sendMsgGbk(Uid, Key, smsText, smsMob );
		if(resultGbk>0){
			System.out.println("GBK成功发送条数=="+resultGbk);
		}else{
			System.out.println(client.getErrorMsg(resultGbk));
		}
	}
}
