package com.chinhtd.lab2_ph40493;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button1);
        EditText etxt = findViewById(R.id.editText1);
        RadioButton rdo1 = findViewById(R.id.rdo1);
        RadioButton rdo2 = findViewById(R.id.rdo2);
        CheckBox chk1 = findViewById(R.id.chk1);
        CheckBox chk2 = findViewById(R.id.chk2);
        CheckBox chk3 = findViewById(R.id.chk3);
        TextView txt = findViewById(R.id.txt1);

        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.P)
            @Override
            public void onClick(View v) {
                String name = etxt.getText().toString();
                String he = rdo1.isChecked() ? rdo1.getText().toString() : rdo2.isChecked() ? rdo2.getText().toString() : "Ban chua chon ??";
                String soThich = chk1.isChecked() && chk2.isChecked() && chk3.isChecked()
                        ? "Java and C++ and JavaScript"
                        : chk1.isChecked() && chk2.isChecked()
                        ? "Java and C++"
                        : chk1.isChecked() && chk3.isChecked()
                        ? "Java and JavaScript"
                        : chk2.isChecked() && chk3.isChecked()
                        ? "C++ and JavaScript"
                        :chk1.isChecked()
                        ? chk1.getText().toString()
                        :chk2.isChecked()
                        ? chk2.getText().toString()
                        :chk3.isChecked()
                        ?chk3.getText().toString()
                        :"Khong chon nganh nao";
                txt.setText("Ho ten: "+name+"\nHe hoc: "+he+"\nNgon Ngu: "+soThich);
            }
        });
    }

}