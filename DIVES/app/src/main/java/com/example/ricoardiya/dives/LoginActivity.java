package com.example.ricoardiya.dives;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    public Button bSignUp2;

    public void init(){
        bSignUp2 = (Button) findViewById(R.id.bSignUp2);
        bSignUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signup = new Intent(LoginActivity.this,SignupActivity.class);

                startActivity(signup);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLogIn = (Button) findViewById(R.id.bLogIn);

//        RegisterLink.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent RegisterIntent = new Intent(LoginActivity.this, SignupActivity.class);
//                LoginActivity.this.startActivity(RegisterIntent);
//            }
//        });

        init();
    }
}
