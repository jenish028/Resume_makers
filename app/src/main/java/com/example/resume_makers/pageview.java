package com.example.resume_makers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class pageview extends AppCompatActivity {

    private ImageButton one_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageview);
        blinding();


        one_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b= new Intent(pageview.this,onepage.class);


//                Toast.makeText(pageview.this, "", Toast.LENGTH_SHORT).show();
                startActivity(b);
            }
        });

    }

    void blinding()
    {
        one_btn=findViewById(R.id.one_btn);
    }
}