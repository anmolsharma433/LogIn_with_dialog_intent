package com.example.dayfirst;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView banner;
    EditText email;
    EditText password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner = findViewById(R.id.txtBanner);
        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                if (email.getText().toString().trim().length() != 0) {

                    if (email.getText().toString().equals("Anmol") && password.getText().toString().equals("1234")) {
                        Toast.makeText(MainActivity.this, "You are loggedin.", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Your email id or password is incorrect.", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    alertDialog();
                }
            }
        });

    }
    private void alertDialog()
    {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Login Error");
        dialog.setMessage("Please Enter the required Fields");
        dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
}
