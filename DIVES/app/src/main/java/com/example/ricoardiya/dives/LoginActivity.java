package com.example.ricoardiya.dives;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLogIn = (Button) findViewById(R.id.bLogIn);
        final TextView RegisterLink = (TextView) findViewById(R.id.tvRegisterHere);

        RegisterLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent RegisterIntent = new Intent(LoginActivity.this, SignupActivity.class);
                LoginActivity.this.startActivity(RegisterIntent);
            }
        });
    }
}
