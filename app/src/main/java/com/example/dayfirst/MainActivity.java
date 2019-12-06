package com.example.dayfirst;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    TextView banner;
    EditText email;
    EditText password;
    Button login;
    TextView dm;
    Switch sw;
    //Id for layout
    ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        banner = findViewById(R.id.txtBanner);
        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);
        dm = findViewById(R.id.txtDarkmode);
        sw = findViewById(R.id.swdm);
        cl = findViewById(R.id.clLayout);
        login.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                if (email.getText().toString().trim().length() != 0) {

                    if (email.getText().toString().equals("Anmol") && password.getText().toString().equals("sharma")) {
                        Toast.makeText(MainActivity.this, "You are loggedin.", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        intent.putExtra("et",email.getText().toString());
                        intent.putExtra("pd",password.getText().toString());startActivity(intent);
                        finish();
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

        //Change Color Button
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (sw.isChecked()) {

                        cl.setBackgroundColor(Color.BLACK);
                        ColorStateList colorstatelist = ColorStateList.valueOf(Color.rgb(216,27,96));
                        email.setBackgroundTintList(colorstatelist);
                        email.setTextColor(Color.WHITE);
                        password.setBackgroundTintList(colorstatelist);
                        password.setTextColor(Color.WHITE);
                        login.setBackgroundTintList(colorstatelist);

                        //email.setBackgroundColor(Color.rgb(216,27,96));

                } else {
                    cl.setBackgroundColor(Color.WHITE);
                    ColorStateList colorstatelist = ColorStateList.valueOf(Color.rgb(216,27,96));
                    email.setBackgroundTintList(colorstatelist);
                    email.setTextColor(Color.BLACK);
                    password.setBackgroundTintList(colorstatelist);
                    password.setTextColor(Color.BLACK);
                    login.setBackgroundTintList(colorstatelist);
                }
            }

        });

    }

    //option menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater minflatter = getMenuInflater();
        minflatter.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //option menu item selcted


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.btnAbout:
                Toast.makeText(MainActivity.this,"About us not yet aVAILAIBLE.",Toast.LENGTH_SHORT).show();
            case R.id.btnLogOut:
                Toast.makeText(MainActivity.this,"Logout Feature not yet availaible.",Toast.LENGTH_SHORT).show();
            case R.id.op1:
                Toast.makeText(MainActivity.this,"Option 1 is not yet aVAILAIBLE.",Toast.LENGTH_SHORT).show();
            case R.id.op2:
                Toast.makeText(MainActivity.this,"Option 2 is not yet aVAILAIBLE.",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    //Context menu
    

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

