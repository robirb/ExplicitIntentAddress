package com.example.robirb.explicitintentaddress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText etName,etEmail,etAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.et_name);
        etEmail = (EditText) findViewById(R.id.et_email);
        etAddress = (EditText) findViewById(R.id.et_address);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                String email =etEmail.getText().toString();
                String address =etAddress.getText().toString();

                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("A",name);
                intent.putExtra("B",email);
                intent.putExtra("C",address);
                startActivity(intent);
            }
        });
    }
}
