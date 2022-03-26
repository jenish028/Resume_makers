package com.example.resume_makers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView createresume_txt;
    private TextView viewresume_txt,download_txt,feedback_txt;
    private ImageView creatresume_img,view_img,download_img,feedback_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Blinding();


        createresume_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,Editpage.class);
//                intent.putExtra();
                startActivity(intent);


            }
        });
        creatresume_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,Editpage.class);
//                intent.putExtra();
                startActivity(intent);

            }
        });
        viewresume_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " View Resume", Toast.LENGTH_SHORT).show();
            }
        });
        view_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "View Resume ", Toast.LENGTH_SHORT).show();
            }
        });
        download_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Download", Toast.LENGTH_SHORT).show();
            }
        });
        download_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " Download ", Toast.LENGTH_SHORT).show();
            }
        });
        feedback_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " Feedback ", Toast.LENGTH_SHORT).show();
            }
        });
        feedback_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, " Feedback ", Toast.LENGTH_SHORT).show();
            }
        });


    }

    void   Blinding()
    {
        createresume_txt=findViewById(R.id.createresume_txt);
        viewresume_txt=findViewById(R.id.viewresume_txt);
        creatresume_img=findViewById(R.id.creatresume_img);
        view_img=findViewById(R.id.view_img);
        download_img=findViewById(R.id.download_img);
        download_txt=findViewById(R.id.download_txt);
        feedback_img=findViewById(R.id.feedback_img);
        feedback_txt=findViewById(R.id.feedback_txt);
    }
}