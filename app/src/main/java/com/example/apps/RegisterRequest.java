package com.example.apps;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    // 서버 url 설정 (php 파일 연동)
    final static private String URL = ""; // "http:// 퍼블릭 DNS 주소/Register.php"
    private Map<String, String> parameters;


    public RegisterRequest(String userID, String userPassword, String userName, String userBirth, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);

        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userName", userName);
        parameters.put("userBirth", userBirth);
    }


    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }

}