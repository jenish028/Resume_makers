package com.example.resume_makers;

import static com.example.resume_makers.Editpage.about;
import static com.example.resume_makers.Editpage.address;
import static com.example.resume_makers.Editpage.age;
import static com.example.resume_makers.Editpage.android;
import static com.example.resume_makers.Editpage.brithdate;
import static com.example.resume_makers.Editpage.collage;
import static com.example.resume_makers.Editpage.communication;
import static com.example.resume_makers.Editpage.dgree;
import static com.example.resume_makers.Editpage.email;
import static com.example.resume_makers.Editpage.english;
import static com.example.resume_makers.Editpage.facebook;
import static com.example.resume_makers.Editpage.gender;
import static com.example.resume_makers.Editpage.gujarati;
import static com.example.resume_makers.Editpage.hindi;
import static com.example.resume_makers.Editpage.idno;
import static com.example.resume_makers.Editpage.insta;
import static com.example.resume_makers.Editpage.leadership;
import static com.example.resume_makers.Editpage.mariatal;
import static com.example.resume_makers.Editpage.mobile;
import static com.example.resume_makers.Editpage.name1;
import static com.example.resume_makers.Editpage.problem;
import static com.example.resume_makers.Editpage.surname;
import static com.example.resume_makers.Editpage.ten;
import static com.example.resume_makers.Editpage.twal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Threepage extends AppCompatActivity {

    private TextView name3_txt,surname3_txt,id3_txt,mobile3_txt,gender3_txt,age3_txt,birth3_txt,marrid3_txt,email3_txt,addres3_txt;
    private TextView skills13_txt,skills23_txt,skills33_txt,skills43_txt,english3_txt,hindi3_txt,gujarati3_txt,tenschool3_txt,twalschool3_txt;
    private TextView collage3_txt,degrr3_txt ,insta3_txt,facebook3_txt,about3_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threepage);
        blinding();

        name3_txt.setText(name1);
        surname3_txt.setText(surname);
        id3_txt.setText(idno);
        mobile3_txt.setText(mobile);
        gender3_txt.setText(gender);
        age3_txt.setText(age);
        birth3_txt.setText(brithdate);
        marrid3_txt.setText(mariatal);
        email3_txt.setText(email);
        addres3_txt.setText(address);
        skills13_txt.setText(android);
        skills23_txt.setText(communication);
        skills33_txt.setText(leadership);
        skills43_txt.setText(problem);
        english3_txt.setText(english);
        hindi3_txt.setText(hindi);
        gujarati3_txt.setText(gujarati);
        tenschool3_txt.setText(ten);
        twalschool3_txt.setText(twal);
        collage3_txt.setText(collage);
        degrr3_txt.setText(dgree);
        insta3_txt.setText(insta);
        facebook3_txt.setText(facebook);
        about3_txt.setText(about);


        mobile3_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:"+mobile));
                startActivity(i);
            }
        });


    }

    void blinding()
    {
        name3_txt=findViewById(R.id.name3_txt);
        surname3_txt=findViewById(R.id.surname3_txt);
        id3_txt=findViewById(R.id.id3_txt);
        mobile3_txt=findViewById(R.id.mobile3_txt);
        gender3_txt=findViewById(R.id.gender3_txt);
        age3_txt=findViewById(R.id.age3_txt);
        birth3_txt=findViewById(R.id.birth3_txt);
        marrid3_txt=findViewById(R.id.marrid3_txt);
        email3_txt=findViewById(R.id.email3_txt);
        addres3_txt=findViewById(R.id.addres3_txt);
        skills13_txt=findViewById(R.id.skills13_txt);
        skills23_txt=findViewById(R.id.skills23_txt);
        skills33_txt=findViewById(R.id.skills33_txt);
        skills43_txt=findViewById(R.id.skills43_txt);
        english3_txt=findViewById(R.id.english3_txt);
        hindi3_txt=findViewById(R.id.hindi3_txt);
        gujarati3_txt=findViewById(R.id.gujarati3_txt);
        tenschool3_txt=findViewById(R.id.tenschool3_txt);
        twalschool3_txt=findViewById(R.id.twalschool3_txt);
        collage3_txt=findViewById(R.id.collage3_txt);
        degrr3_txt=findViewById(R.id.degrr3_txt);
        insta3_txt=findViewById(R.id.insta3_txt);
        facebook3_txt=findViewById(R.id.facebook3_txt);
        about3_txt=findViewById(R.id.about3_txt);

    }

}
