package com.example.dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tv_2, v_nhaptt;
    Button bt_2;
    EditText edt_nhapsdt,edt_nhapemail,edt_nhapten,edt_nhaptencq,edt_nhapmk2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();


    }
    void init(){
        tv_2 = findViewById(R.id.tv_2);
        v_nhaptt = findViewById(R.id.v_thongtincn);
        bt_2 = findViewById(R.id.bt_2);
        edt_nhapsdt = findViewById(R.id.edt_nhapsdt);
        edt_nhapemail = findViewById(R.id.edt_nhapgmail);
        edt_nhapten = findViewById(R.id.edt_nhapten);
        edt_nhaptencq = findViewById(R.id.edt_nhaptencq);
        edt_nhapmk2 = findViewById(R.id.edt_nhapmk2);

        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt_nhapsdt.getText().toString().equals("")){
                    tv_2.setText("Số điện thoại của bạn không đúng vui lòng nhập lại");
                }
                else if (edt_nhapemail.getText().toString().equals("")){
                    tv_2.setText("Email của bạn không đúng vui lòng nhập lại");
                }
                else if (edt_nhapten.getText().toString().equals("")){
                    tv_2.setText("Tên của bạn không đúng vui lòng nhập lại");
                }
                else if (edt_nhaptencq.getText().toString().equals("")){
                    tv_2.setText("Tên cơ quan của bạn không đúng vui lòng nhập lại");
                }
                else if (edt_nhapmk2.getText().toString().equals("")){
                    tv_2.setText("Mật khẩu của bạn không đúng vui lòng nhập lại");
                }
                else {
                    tv_2.setText("Đăng ký thành công");
                    Intent intent = new  Intent(Activity2.this, MainActivity3.class);
                    startActivity(intent);
                }

            }

        });


    }
}