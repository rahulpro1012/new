package com.example.myappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edittext1,edittext2;
    private Button Btn_Add ;
    private Button Btn_Sub ;
    private Button Btn_Mul ;
    private Button Btn_Div ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        edittext1=(EditText)findViewById(R.id.editTextTextPersonName);
        edittext2=(EditText)findViewById(R.id.editTextTextPersonName2);
        Btn_Add=(Button)findViewById(R.id.button);
        Btn_Sub=(Button)findViewById(R.id.button2);
        Btn_Mul=(Button)findViewById(R.id.button3);
        Btn_Div=(Button)findViewById(R.id.button4);

        Btn_Add.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sum=a+b;
                Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG
                ).show();
            }
        });
        Btn_Sub.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int sub=a-b;
                Toast.makeText(getApplicationContext(),String.valueOf(sub),Toast.LENGTH_LONG
                ).show();
            }
        });



        Btn_Mul.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int m=a*b;
                Toast.makeText(getApplicationContext(),String.valueOf(m),Toast.LENGTH_LONG).
                        show();
            }
        });
        Btn_Div.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int n=a/b;
                Toast.makeText(getApplicationContext(),String.valueOf(n),Toast.LENGTH_LONG).show();
            }
        });
    }
   // @Override
    //public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
    //      getMenuInflater().inflate(R.menu.menu, menu);
   //     return true;
    //}

}