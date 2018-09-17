package com.edai.msend;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class SMSSend {

	public static void main(String[] args) {
		try {
			HttpClient client = new HttpClient();
			String url = "http://gbk.sms.webchinese.cn";
			PostMethod post = new PostMethod(url);
			post.addRequestHeader("Content-Type", "application/x-www-form-urlencodeed;charset=gbk");
			NameValuePair[] data = {
				new NameValuePair("Uid", "liugang"),
				new NameValuePair("key", "d41d8cd98f00b204e980"),
				new NameValuePair("smsMob", "13600435547"),
				new NameValuePair("smsText", "您的验证码为134534，请勿泄露他人！")
			};
			post.setRequestBody(data);
			client.executeMethod(post);
			Header[] headers = post.getResponseHeaders();
			int statusCode = post.getStatusCode();
			System.out.println(statusCode);
			System.out.println("---------Header--------");
			for(Header h : headers){
				System.out.println(h.toString());
			}
			System.out.println("--------------------");
			String result = new String(post.getResponseBodyAsString().getBytes("GBK"));
			System.out.println("返回："+result);
			post.releaseConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
