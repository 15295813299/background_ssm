package com.fl.utils;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpPos {
//    public static boolean httpPostWithJson(JSONObject jsonObj,String url,String appId){
//        boolean isSuccess = false;
//
//        HttpPost post = null;
//        try {
//            HttpClient httpClient = new DefaultHttpClient();
//
//            // 设置超时时间
//            httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 2000);
//            httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 2000);
//
//            post = new HttpPost(url);
//            // 构造消息头
//            post.setHeader("Content-type", "application/json; charset=utf-8");
//            post.setHeader("Connection", "Close");
//            String sessionId = getSessionId();
//            post.setHeader("SessionId", sessionId);
//            post.setHeader("appid", appid);
//
//            // 构建消息实体
//            StringEntity entity = new StringEntity(jsonObj.toString(), Charset.forName("UTF-8"));
//            entity.setContentEncoding("UTF-8");
//            // 发送Json格式的数据请求
//            entity.setContentType("application/json");
//            post.setEntity(entity);
//
//            HttpResponse response = httpClient.execute(post);
//
//            // 检验返回码
//            int statusCode = response.getStatusLine().getStatusCode();
//            if(statusCode != HttpStatus.SC_OK){
//                LogUtil.info("请求出错: "+statusCode);
//                isSuccess = false;
//            }else{
//                int retCode = 0;
//                String sessendId = "";
//                // 返回码中包含retCode及会话Id
//                for(Header header : response.getAllHeaders()){
//                    if(header.getName().equals("retcode")){
//                        retCode = Integer.parseInt(header.getValue());
//                    }
//                    if(header.getName().equals("SessionId")){
//                        sessendId = header.getValue();
//                    }
//                }
//
//                if(ErrorCodeHelper.IAS_SUCCESS != retCode ){
//                    // 日志打印
//                    LogUtil.info("error return code,  sessionId: "sessendId"\t"+"retCode: "+retCode);
//                    isSuccess = false;
//                }else{
//                    isSuccess = true;
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            isSuccess = false;
//        }finally{
//            if(post != null){
//                try {
//                    post.releaseConnection();
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return isSuccess;
//    }
//
//    // 构建唯一会话Id
//    public static String getSessionId(){
//        UUID uuid = UUID.randomUUID();
//        String str = uuid.toString();
//        return str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
//    }
public static void main(String[] args) {
    HttpPos httpClientDemo = new HttpPos();
    String url = "http://t.weather.sojson.com/api/weather/city/101030100";
    httpClientDemo.httpClientGetDemo(url);
}

    public void httpClientGetDemo(String url){
        //模拟一个浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        //设置长连接
        httpGet.setHeader("Connection","keep-alive");
        //设置请求头的浏览器属性，欺骗服务器告诉它是一个浏览器向服务器发送请求
        httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36");

        CloseableHttpResponse httpResponse = null;

        try {
            //执行get请求
            httpResponse=httpClient.execute(httpGet);
            HttpEntity entity = httpResponse.getEntity();
            String jsonStr = EntityUtils.toString(entity);
            System.out.println(jsonStr);
            //创建对象映射类,用于转换字符串-->对象
            ObjectMapper mapper = new ObjectMapper();

//            mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, Boolean.TRUE);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
