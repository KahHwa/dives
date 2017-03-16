package com.example.ricoardiya.dives;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rico Ardiya on 3/14/2017.
 */

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://diveswebapp.azurewebsites.net/webdives/php_android/register.php";
    private Map<String, String> params;

    public RegisterRequest(String fname, String lname, String email, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("fname", fname);
        params.put("lname", lname);
        params.put("email", email);
        params.put("password", password);
    }

    @Override
    public  Map<String, String> getParams(){
        return params;
    }
}
