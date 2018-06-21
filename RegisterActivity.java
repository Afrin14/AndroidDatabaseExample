package com.github.afrin14.androiddatabaseexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText name, surname, age, username, password;
    String str_name, str_surname, str_age, str_username, str_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText)findViewById(R.id.etname);
        surname = (EditText)findViewById(R.id.etsurname);
        age= (EditText)findViewById(R.id.etage);
        username = (EditText)findViewById(R.id.etuname);
        password = (EditText)findViewById(R.id.etpassword);
    }

    public void onReg(View view){
        str_name = name.getText().toString();
        str_surname = surname.getText().toString();
        str_age = age.getText().toString();
        str_username = username.getText().toString();
        str_password = password.getText().toString();
        String type = "register";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_name, str_surname, str_age, str_username, str_password);
    }

}
