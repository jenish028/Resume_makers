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

import android.os.Bundle;
import android.widget.TextView;

public class Fivepage extends AppCompatActivity {
    private TextView name5_txt,surname5_txt,id5_txt,mobile5_txt,gender5_txt,age5_txt,birth5_txt,marrid5_txt,email5_txt,addres5_txt;
    private TextView skills15_txt,skills25_txt,skills35_txt,skills45_txt,english5_txt,hindi5_txt,gujarati5_txt,tenschool5_txt,twalschool5_txt;
    private TextView collage5_txt,insta5_txt,facebook5_txt,about5_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivepage);
        blinding();
        name5_txt.setText(name1);
        surname5_txt.setText(surname);
        id5_txt.setText(idno);
        mobile5_txt.setText(mobile);
        gender5_txt.setText(gender);
        age5_txt.setText(age);
        birth5_txt.setText(brithdate);
        marrid5_txt.setText(mariatal);
        email5_txt.setText(email);
        addres5_txt.setText(address);
        skills15_txt.setText(android);
        skills25_txt.setText(communication);
        skills35_txt.setText(leadership);
        skills45_txt.setText(problem);
        english5_txt.setText(english);
        hindi5_txt.setText(hindi);
        gujarati5_txt.setText(gujarati);
        tenschool5_txt.setText(ten);
        twalschool5_txt.setText(twal);
        collage5_txt.setText(collage);
        insta5_txt.setText(insta);
        facebook5_txt.setText(facebook);
        about5_txt.setText(about);





    }


   void  blinding()
    {
        name5_txt=findViewById(R.id.name5_txt);
        surname5_txt=findViewById(R.id.surname5_txt);
        id5_txt=findViewById(R.id.id5_txt);
        gender5_txt=findViewById(R.id.gender5_txt);
        birth5_txt=findViewById(R.id.birth5_txt);
        marrid5_txt=findViewById(R.id.marrid5_txt);
        age5_txt=findViewById(R.id.age5_txt);
        mobile5_txt=findViewById(R.id.mobile5_txt);
        email5_txt=findViewById(R.id.email5_txt);
        addres5_txt=findViewById(R.id.addres5_txt);
        skills15_txt=findViewById(R.id.skills15_txt);
        skills25_txt=findViewById(R.id.skills25_txt);
        skills35_txt=findViewById(R.id.skills35_txt);
        skills45_txt=findViewById(R.id.skills45_txt);
        english5_txt=findViewById(R.id.english5_txt);
        hindi5_txt=findViewById(R.id.hindi5_txt);
        gujarati5_txt=findViewById(R.id.gujarati5_txt);
        tenschool5_txt=findViewById(R.id.tenschool5_txt);
        twalschool5_txt=findViewById(R.id.twalschool5_txt);
        collage5_txt=findViewById(R.id.collage5_txt);
        insta5_txt=findViewById(R.id.insta5_txt);
        facebook5_txt=findViewById(R.id.facebook5_txt);
        about5_txt=findViewById(R.id.about5_txt);
    }


}