package com.example.resume_makers;

import static com.example.resume_makers.Editpage.name1;
import static com.example.resume_makers.Editpage.surname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class onepage extends AppCompatActivity {


    private TextView name1_txt,surname1_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onepage);
        blinding();

//        Integer in =getIntent();
    // name1=getIntent().getStringExtra("n1");



    name1_txt.setText(name1);
        surname1_txt.setText(surname);

    }

    void blinding()
    {
        name1_txt=findViewById(R.id.name1_txt);
        surname1_txt=findViewById(R.id.surname1_txt);
    }

}