package com.example.ricoardiya.dives;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class SignupActivity extends AppCompatActivity {

//    public Button bLogIn2;
//    public Button bSignUp;
//
//    public void init(){
//        bLogIn2 = (Button) findViewById(R.id.bLogIn2);
//        bLogIn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent login = new Intent(SignupActivity.this,LoginActivity.class);
//
//                startActivity(login);
//            }
//        });
//
//    }
//
//    public void init2(){
//        bSignUp = (Button) findViewById(R.id.bSignUp);
//        bSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent login = new Intent(SignupActivity.this,MainActivity.class);
//
//                startActivity(login);
//            }
//        });
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        final EditText etFirstName = (EditText) findViewById(R.id.etFirstName);
        final EditText etLastName = (EditText) findViewById(R.id.etLastName);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bSignUp = (Button) findViewById(R.id.bSignUp);
        final Button bLogIn2 = (Button) findViewById(R.id.bLogIn2);

        bLogIn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SignupActivity.this, LoginActivity.class);
                SignupActivity.this.startActivity(loginIntent);
            }
        });

        bSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final  String fname = etFirstName.getText().toString();
                final  String lname = etLastName.getText().toString();
                final  String email = etEmail.getText().toString();
                final  String password = etPassword.getText().toString();

                Response.Listener<String> responseListener = new  Response.Listener<String>(){
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success){
                                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                                SignupActivity.this.startActivity(intent);
                            }else{
                                AlertDialog.Builder builder = new AlertDialog.Builder(SignupActivity.this);
                                builder.setMessage("Register Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };


                RegisterRequest registerRequest = new RegisterRequest(fname, lname, email, password, responseListener );
                RequestQueue queue = Volley.newRequestQueue(SignupActivity.this);
                queue.add(registerRequest);
            }
        });

//        init();
//        init2();
    }


}
