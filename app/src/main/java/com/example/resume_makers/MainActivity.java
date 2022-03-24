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
    private TextView viewresume_txt;
    private ImageView creatresume_img;
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
                Toast.makeText(MainActivity.this, "Plase enter the creat resume", Toast.LENGTH_SHORT).show();
            }
        });

    }

    void   Blinding()
    {
        createresume_txt=findViewById(R.id.createresume_txt);
        viewresume_txt=findViewById(R.id.viewresume_txt);
        creatresume_img=findViewById(R.id.creatresume_img);
    }
}