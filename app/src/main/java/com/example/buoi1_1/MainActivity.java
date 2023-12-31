package com.example.buoi1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView tvHello;
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = findViewById(R.id.tvHello);
        btnClick = findViewById(R.id.btnClick);

        tvHello.setText("hi im thai");

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: ");
//                Toast.makeText(MainActivity.this, "User want to fucked u", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, DemoActivity.class);
//                intent.putExtra("UserName", "Helllo worlds");
//                intent.putExtra("age", 26);

                UserModel userModel = new UserModel();
                userModel.setUserName("thai");
                userModel.setAddress("hn");
                // truyền dữ liệu với khóa
                intent.putExtra(Constants.USER_MODEL_KEY, userModel);

                startActivity(intent);
            }
        });

        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }
}