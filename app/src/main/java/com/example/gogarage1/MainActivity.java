package com.example.gogarage1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login,register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        getSupportActionBar();

        login=findViewById(R.id.btnlogin);
        register=findViewById(R.id.btnregister);
login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(MainActivity.this,SignIn_activity.class);
        startActivity(intent);

    }
});

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Register", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,signUp_activity.class);
                startActivity(intent);

            }
        });

    }
}