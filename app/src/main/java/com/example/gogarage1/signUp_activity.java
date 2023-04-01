package com.example.gogarage1;

import static com.example.gogarage1.R.id.username;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signUp_activity extends AppCompatActivity {
    EditText username,phone,email,pass;
    Button register ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        username = findViewById(R.id.username);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        register = findViewById(R.id.register);

        DatabaseHelper db = new DatabaseHelper(signUp_activity.this,"company",null,1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Sign Up");
        TextView signuptosignin;
       signuptosignin=findViewById(R.id.signuptosignin);
        signuptosignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(signUp_activity.this,SignIn_activity.class);
                startActivity(intent);
            }
        });
register.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name=username.getText().toString();
        String contact =phone.getText().toString();
        String mail=email.getText().toString();
        String password=pass.getText().toString();
       long recordid= db.savenewuserdata(name,contact,mail,password);
        Intent intent=new Intent(signUp_activity.this,recycleview.class);
        startActivity(intent);
       if(recordid>0){
           Toast.makeText(signUp_activity.this, "Saved Successfully", Toast.LENGTH_SHORT).show();
           username.setText("");
           phone.setText("");
           email.setText("");
           pass.setText("");
       }
       else{
           Toast.makeText(signUp_activity.this, "Saved Successfully", Toast.LENGTH_SHORT).show();
            username.setText("");
            phone.setText("");
            email.setText("");
         pass.setText("");
           }
       }
    });

    }
}