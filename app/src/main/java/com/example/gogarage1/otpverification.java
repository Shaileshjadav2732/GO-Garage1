package com.example.gogarage1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class otpverification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpverification);
        final EditText phone=findViewById(R.id.phone);
        Button getotp=findViewById(R.id.getotp);

        getotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(phone.getText().toString().trim().isEmpty()){
                    Toast.makeText(otpverification.this, "Enter Mobail", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent i=new Intent(otpverification.this,verify.class);
              i.putExtra("name",phone.getText().toString());
              startActivity(i);
            }
        });
    }
}