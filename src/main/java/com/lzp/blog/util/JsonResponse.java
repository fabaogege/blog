package com.lzp.blog.util;

import org.springframework.stereotype.Component;


/**
 * @description: 统一的响应结果
 * @author: lizhipeng
 * @create: 2019-12-07 22:39
 **/
@Component
public class JsonResponse <T>{
    public static final int SUCESSCODE = 200;
    public static final String SUCESSMSG = "成功";
    public static final int FAILCODE = 200;
    public static final String FAILMSG = "失败";

    private int rtnCode;//响应码
    private String rtnMsg;//响应信息
    private T data;//返回结果
    public JsonResponse(){}
    public  JsonResponse Success(T data){
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.rtnCode = SUCESSCODE;
        jsonResponse.rtnMsg = SUCESSMSG;
        jsonResponse.data = data;
        return jsonResponse;
    }
    public  JsonResponse Fail(T data){
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.rtnCode = FAILCODE;
        jsonResponse.rtnMsg = FAILMSG;
        jsonResponse.data = data;
        return jsonResponse;
    }
    public JsonResponse(int rtnCode,String rtnMsg,T data){
        this.data = data;
        this.rtnMsg = rtnMsg;
        this.rtnCode = rtnCode;
    }

    public int getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(int rtnCode) {
        this.rtnCode = rtnCode;
    }

    public String getRtnMsg() {
        return rtnMsg;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
