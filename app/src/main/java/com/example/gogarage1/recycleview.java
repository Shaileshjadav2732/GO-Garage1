package com.example.gogarage1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class recycleview extends AppCompatActivity {
Spinner spinner;
AutoCompleteTextView actxtview;
Button next;
ArrayList <String> arrayIds=new ArrayList<>();
ArrayList <String> arraylogo=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);

        spinner=findViewById(R.id.spinner);
        actxtview=findViewById(R.id.actxtview);
        next=findViewById(R.id.next);


arrayIds.add("Hundai");
arrayIds.add("Mahindra");
arrayIds.add("Honda");
arrayIds.add("Datsun");
arrayIds.add("Fiat");
arrayIds.add("isuzu");
arrayIds.add("Ford");
arrayIds.add("Nissan");
arrayIds.add("BMW");
arrayIds.add("audi");
arrayIds.add("TATA");
arrayIds.add("Toyota");
arrayIds.add("Mahindra");
arrayIds.add("Jeep");
arrayIds.add("Chevrolet");
arrayIds.add("Kia");
arrayIds.add("Scoda");
arrayIds.add("Valkswagen");
arrayIds.add("MG");
arrayIds.add("Mercedes");
arrayIds.add("Volvo");

        ArrayAdapter<String> stringArrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrayIds);
        spinner.setAdapter(stringArrayAdapter);



        arraylogo.add("Maruti Suzuki");
        arraylogo.add("Hundai");
        arraylogo.add("Mahindra");
        arraylogo.add("Honda");
        arraylogo.add("Datsun");
        arraylogo.add("Fiat");
        arraylogo.add("isuzu");
        arraylogo.add("Ford");
        arraylogo.add("Nissan");
        arraylogo.add("BMW");
        arraylogo.add("audi");
        arraylogo.add("TATA");
        arraylogo.add("Toyota");
        arraylogo.add("Mahindra");
        arraylogo.add("Jeep");
        arraylogo.add("Chevrolet");
        arraylogo.add("Kia");
        arraylogo.add("Scoda");
        arraylogo.add("Valkswagen");
        arraylogo.add("MG");
        arraylogo.add("Mercedes");
        arraylogo.add("Volvo");
        ArrayAdapter<String> adtvAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arraylogo);
actxtview.setAdapter(adtvAdapter);
actxtview.setThreshold(1);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  Intent i=new Intent(recycleview.this,otpverification.class);
                startActivity(i);
            }
        });

    }
}



