package com.example.ricoardiya.dives;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

//    public Button bSignUp2;
//    public Button bLogIn;
//
//    public void init(){
//        bSignUp2 = (Button) findViewById(R.id.bSignUp2);
//        bSignUp2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent signup = new Intent(LoginActivity.this,SignupActivity.class);
//
//                startActivity(signup);
//            }
//        });
//
//    }
//
//    public void init2(){
//        bLogIn = (Button) findViewById(R.id.bLogIn);
//        bLogIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent login = new Intent(LoginActivity.this,MainActivity.class);
//
//                startActivity(login);
//            }
//        });
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLogIn = (Button) findViewById(R.id.bLogIn);
        final Button RegisterLink = (Button) findViewById(R.id.bSignUp2);

        RegisterLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, SignupActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });

        bLogIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final String email = etEmail.getText().toString();
                final String password = etPassword.getText().toString();

                //Response received from the server
                Response.Listener<String> responseListener = new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response){
                        try{
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success) {
                                String name = jsonResponse.getString("name");

                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                LoginActivity.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new  AlertDialog.Builder(LoginActivity.this);
                                builder.setMessage("Log In Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e){
                            e.printStackTrace();
                        }
                    }
                };
                LoginRequest loginRequest = new LoginRequest(email, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);

            }
        });

//        init();
//        init2();
    }
}
