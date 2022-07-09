package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtTo, txtSub, txtMsg;
    Button b;
    String strTo, strSub, strMsg;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTo=(EditText)findViewById(R.id.editTextTextPersonName);
        txtSub=(EditText)findViewById(R.id.editTextTextPersonName2);
        txtMsg=(EditText)findViewById(R.id.editTextName3);
        b=(Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                strTo=txtTo.getText().toString();
                strSub=txtSub.getText().toString();
                strMsg=txtMsg.getText().toString();
                in=new Intent(Intent.ACTION_SEND);
//in.putExtra(Intent.EXTRA_EMAIL, new String[]{strTo});
                in.putExtra(Intent.EXTRA_EMAIL, strTo);
                in.putExtra(Intent.EXTRA_SUBJECT, strSub);
                in.putExtra(Intent.EXTRA_TEXT, strMsg);
                in.setType("message/rfc822");

                startActivity(Intent.createChooser(in, "Choose an email client..."));

            }
        });

    }
}