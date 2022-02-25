package com.example.dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {
    TextView tv_1, v_dki;
    Button btnLogin;
    EditText edt_nhaptk, edt_nhapmk1, edt_nhaplaimk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    void init() {
        tv_1 = findViewById(R.id.tv_1);
        v_dki = findViewById(R.id.v_dki);
        btnLogin = findViewById(R.id.bt_1);
        edt_nhaptk = findViewById(R.id.edt_nhaptk);
        edt_nhapmk1 = findViewById(R.id.edt_nhapmk1);
        edt_nhaplaimk = findViewById(R.id.edt_nhaplaimk);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sUserName = edt_nhaptk.getText().toString();

                if (sUserName.equals("")) {
                    tv_1.setText("Vui lòng nhập tên tài khoản");
                } else if (!validateEmailString(sUserName)) {
                    tv_1.setText("Vui lòng nhập đúng định dạng email!");
                } else if (edt_nhapmk1.getText().toString().equals("")) {
                    tv_1.setText("Vui lòng nhập mật khẩu");
                } else if (edt_nhaplaimk.getText().toString().equals("")) {
                    tv_1.setText("Vui lòng nhập lại mật khẩu");
                } else {
                    tv_1.setText("Đăng ký thành công");
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    startActivity(intent);
                }

            }

        });


    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validateEmailString(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
}