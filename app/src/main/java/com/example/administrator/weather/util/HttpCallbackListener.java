package com.example.administrator.weather.util;

/**
 * Created by Administrator on 2016/5/9.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
