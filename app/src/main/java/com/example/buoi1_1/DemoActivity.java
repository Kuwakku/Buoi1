package com.example.buoi1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        Intent intent = getIntent();
//        String message = intent.getStringExtra("UserName");
//        int age = intent.getIntExtra("age", -1);
//        Toast.makeText(this, "" + message+ "" +age, Toast.LENGTH_LONG).show();

        UserModel userModel = (UserModel) intent.getSerializableExtra(Constants.USER_MODEL_KEY);
        Toast.makeText(this, ""+ userModel.toString(), Toast.LENGTH_SHORT).show();

    }
}