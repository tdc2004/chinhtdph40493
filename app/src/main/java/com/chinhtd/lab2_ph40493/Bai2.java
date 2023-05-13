package com.chinhtd.lab2_ph40493;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        Button btn = findViewById(R.id.btnClick);
        EditText name = findViewById(R.id.name);
        EditText id = findViewById(R.id.id);
        EditText age = findViewById(R.id.age);
        RadioButton male = findViewById(R.id.male);
        RadioButton female = findViewById(R.id.female);
        CheckBox chk1 = findViewById(R.id.chk1);
        CheckBox chk2 =findViewById(R.id.chk2);
        TextView tv = findViewById(R.id.tv1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten  =  name.getText().toString();
                String msv = id.getText().toString();
                String tuoi = age.getText().toString();
                String gender = male.isChecked() ? "Nam" : female.isChecked() ? "Nữ" :" chưa chọn gì cả";
                String soThich = chk1.isChecked() && chk2.isChecked() ? "Đá bóng và chơi Game" : chk1.isChecked() ? "Đá Bóng" : chk2.isChecked()? "Chơi Game" : "Chưa chọn gì cả";
                tv.setText("Tên: "+ten+"\nMSSV: "+msv+"\nTuổi: "+tuoi+"\nGiới tính: "+gender+"\nSở Thích: "+soThich);
            }
        });

    }
}