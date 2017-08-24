package com.example.robirb.explicitintentaddress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button button;

    private TextView tvName,tvEmail,tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvName = (TextView) findViewById(R.id.tv_name);
        tvEmail = (TextView) findViewById(R.id.tv_email);
        tvAddress = (TextView) findViewById(R.id.tv_address);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondActivity.this.finish();
            }
        });

        Intent intent = getIntent();

        String name = intent.getStringExtra("A");
        String email = intent.getStringExtra("B");
        String address = intent.getStringExtra("C");

        tvName.setText(name);
        tvEmail.setText(email);
        tvAddress.setText(address);


    }
};

