package com.example.resume_makers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Editpage extends AppCompatActivity {

    private Button submit_btn;
    private EditText name_edt,surname_edt;
    public static String name1,surname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editpage);
        blinding();

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 name1=name_edt.getText().toString();
                 surname=surname_edt.getText().toString();

                Intent a=new Intent(Editpage.this,pageview.class);

                startActivity(a);


            }
        });


    }

    void   blinding()
    {
        submit_btn=findViewById(R.id.submit_btn);
        name_edt=findViewById(R.id.name_edt);
        surname_edt=findViewById(R.id.surname_edt);
    }
}