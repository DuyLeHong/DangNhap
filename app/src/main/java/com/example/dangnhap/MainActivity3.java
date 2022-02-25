package com.example.dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;
import java.text.ParsePosition;

public class MainActivity3 extends AppCompatActivity {
    EditText nhapso1,nhapso2;
    TextView ketqua;
    Button btcong,bttru,btnhan,btchia;
    float a,b,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        nhapso1 = findViewById(R.id.edt_nhapso1);
        nhapso2 = findViewById(R.id.edt_nhapso2);
        ketqua = findViewById(R.id.tv_3);
        btcong = findViewById(R.id.bt_cong);
        bttru = findViewById(R.id.bt_tru);
        btnhan = findViewById(R.id.bt_nhan);
        btchia = findViewById(R.id.bt_chia);

        btcong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInput(nhapso1.getText().toString(), nhapso2.getText().toString())) {
                    a = Float.parseFloat(nhapso1.getText().toString());
                    b = Float.parseFloat(nhapso2.getText().toString());
                    y = a + b;

                    ketqua.setText(y + "");
                }

            }
        });
        bttru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInput(nhapso1.getText().toString(), nhapso2.getText().toString())) {
                    a = Float.parseFloat(nhapso1.getText().toString());
                    b = Float.parseFloat(nhapso2.getText().toString());
                    y = a - b;

                    ketqua.setText(String.valueOf(y));
                }

            }
        });
        btnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInput(nhapso1.getText().toString(), nhapso2.getText().toString())) {
                    a = Float.parseFloat(nhapso1.getText().toString());
                    b = Float.parseFloat(nhapso2.getText().toString());
                    y = a * b;

                    ketqua.setText(String.valueOf(y));
                }

            }
        });
        btchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInput(nhapso1.getText().toString(), nhapso2.getText().toString())) {
                    a = Float.parseFloat(nhapso1.getText().toString());
                    b = Float.parseFloat(nhapso2.getText().toString());
                    y = a / b;
                    y = (float) (Math.round(y*10000.0)/ (10000.0));
                    ketqua.setText(String.valueOf(y));
                }

            }
        });
    }

    private boolean validateInput(String text1, String text2) {
        if (text1.trim().equals("")) {
            ketqua.setText("Hãy nhập số 1");
            return false;
        } else if (!isNumeric(text1)) {
            ketqua.setText("Hãy nhập số thứ 1 đúng định dạng");
            return false;
        } else if (text2.trim().equals("")) {
            ketqua.setText("Hãy nhập số 2");
            return false;
        } else if (!isNumeric(text2)) {
            ketqua.setText("Hãy nhập số thứ 2 đúng định dạng");
            return false;
        }

        return true;
    }

    public static boolean isNumeric(String str) {
//        try {
//            Float.parseFloat(str);
//            return true;
//        } catch(NumberFormatException e){
//            return false;
//        }

        ParsePosition pos = new ParsePosition(0);
        NumberFormat.getInstance().parse(str, pos);
        return str.length() == pos.getIndex();
    }
}