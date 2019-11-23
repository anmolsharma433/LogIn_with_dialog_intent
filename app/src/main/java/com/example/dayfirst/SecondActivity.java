package com.example.dayfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    String st;
    String pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final TextView output;
        Button btnUpcase;
        Button btnLcase;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        output = findViewById(R.id.txtOutput);
        btnUpcase = findViewById(R.id.btnupper);
        btnLcase = findViewById(R.id.btnLower);
        btnUpcase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String tup = st.toUpperCase()
                output.setText(tup);

            }
        });
        btnLcase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lwr = st.toLowerCase();
                output.setText(lwr);
            }
        });

        //Bundle bundle = getIntent().getExtras();
        //if (bundle != null)
        //{
        //    String name = bundle.toString();
        //    Log.d("Name",name);
        //}

        st = getIntent().getExtras().getString("et");
        pwd = getIntent().getExtras().getString("pd");


        output.setText("Your Username is : "+st + " " + "And your password is :" + pwd);
    }
}
