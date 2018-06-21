package com.github.afrin14.androiddatabaseexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText user, pass;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText)findViewById(R.id.usernameet);
        pass = (EditText)findViewById(R.id.passwordet);
        bt = (Button)findViewById(R.id.button);
    }

    public void onLogin(View view){
        String username = user.getText().toString();
        String password = pass.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password);

    }

    public void openReg(View view){
        startActivity(new Intent(this, RegisterActivity.class));
    }

}
