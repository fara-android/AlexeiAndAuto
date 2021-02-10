package com.abdusatarov.alexeyandauto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RashidActivity extends AppCompatActivity {
 TextView enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rashid);
        enter=findViewById(R.id.rashod);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(RashidActivity.this,AutoActivity.class);
                startActivity(myIntent);
            }
        });
    }
}