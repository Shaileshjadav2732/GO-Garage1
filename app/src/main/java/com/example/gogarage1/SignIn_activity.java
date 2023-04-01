package com.example.gogarage1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn_activity extends AppCompatActivity {

EditText iemail,ipass;
Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        iemail=findViewById(R.id.iemail);
        ipass=findViewById(R.id.ipass);
        signin=findViewById(R.id.signin);

        getSupportActionBar().setTitle("Sign In");
        TextView createac;
        createac=findViewById(R.id.createac);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        createac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignIn_activity.this,signUp_activity.class);
                startActivity(intent);
            }
        });
        DatabaseHelper1 db = new DatabaseHelper1(SignIn_activity.this,"company_sign_in",null,1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Sign In");
        TextView signuptosignin;
        signuptosignin=findViewById(R.id.signin);
        signuptosignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignIn_activity.this,SignIn_activity.class);
                startActivity(intent);
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mail=iemail.getText().toString();
                String password=ipass.getText().toString();
                long recordid= db.savenewuserdata(mail,password);
                if(recordid>0){
                    Toast.makeText(SignIn_activity.this, "Saved Successfully", Toast.LENGTH_SHORT).show();
                iemail.setText("");
                ipass.setText("");
                    Intent intent=new Intent(SignIn_activity.this,recycleview.class);
                    startActivity(intent);
                }

                else{
                    Toast.makeText(SignIn_activity.this, "Saved Successfully", Toast.LENGTH_SHORT).show();
                signin.setText("");
                ipass.setText("");
                }
            }
        });

    }
}
