package com.example.diabetestracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    EditText f_name;
    EditText l_name;
    EditText phone;
    EditText reg_email;
    EditText reg_password;
    EditText reg_cnf_password;
    Button reg_sign_up;
    TextView reg_sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        f_name = (EditText) findViewById(R.id.f_name);
        l_name = (EditText) findViewById(R.id.l_name);
        phone = (EditText) findViewById(R.id.phone);
        reg_email = (EditText) findViewById(R.id.reg_email);
        reg_password = (EditText) findViewById(R.id.reg_password);
        reg_cnf_password = (EditText) findViewById(R.id.reg_cnf_password);
        reg_sign_up = (Button) findViewById(R.id.reg_sign_up);
        reg_sign_in = (TextView) findViewById(R.id.reg_sign_in);
        reg_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign_in_Intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(sign_in_Intent);
            }
        });

    }
}
