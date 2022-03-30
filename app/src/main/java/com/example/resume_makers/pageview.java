package com.example.resume_makers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class pageview extends AppCompatActivity {

    private ImageButton one_btn,two_btn,three_btn,four_btn,five_btn;
    private ImageView arrow1_img;
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
        two_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b= new Intent(pageview.this,Two.class);

//                Toast.makeText(pageview.this, "two", Toast.LENGTH_SHORT).show();
                startActivity(b);
            }
        });
        three_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b= new Intent(pageview.this,Threepage.class);
//                Toast.makeText(pageview.this, "Three", Toast.LENGTH_SHORT).show();
                startActivity(b);
            }
        });
        four_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b= new Intent(pageview.this,Fourpage.class);


//                Toast.makeText(pageview.this, "Four", Toast.LENGTH_SHORT).show();
                startActivity(b);
            }
        });
        five_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b= new Intent(pageview.this,Fivepage.class);


//                Toast.makeText(pageview.this, "Four", Toast.LENGTH_SHORT).show();
                startActivity(b);
            }
        });

        arrow1_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b=new Intent(pageview.this,Editpage.class);
                startActivity(b);
            }
        });

    }

    void blinding()
    {
        one_btn=findViewById(R.id.one_btn);
        two_btn=findViewById(R.id.two_btn);
        three_btn=findViewById(R.id.three_btn);
        four_btn=findViewById(R.id.four_btn);
        five_btn=findViewById(R.id.five_btn);
        arrow1_img=findViewById(R.id.arrow1_img);

    }
}