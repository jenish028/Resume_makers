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

public class Fourpage extends AppCompatActivity {
    private TextView name4_txt,surname4_txt,id4_txt,mobile4_txt,gender4_txt,age4_txt,birth4_txt,marrid4_txt,email4_txt,addres4_txt;
    private TextView skills14_txt,skills24_txt,skills34_txt,skills44_txt,english4_txt,hindi4_txt,gujarati4_txt,tenschool4_txt,twalschool4_txt;
    private TextView collage4_txt,degrr4_txt ,insta4_txt,facebook4_txt,about4_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourpage);
        blinding();

        name4_txt.setText(name1);
        surname4_txt.setText(surname);
        id4_txt.setText(idno);
        mobile4_txt.setText(mobile);
        gender4_txt.setText(gender);
        age4_txt.setText(age);
        birth4_txt.setText(brithdate);
        marrid4_txt.setText(mariatal);
        email4_txt.setText(email);
        addres4_txt.setText(address);
        skills14_txt.setText(android);
        skills24_txt.setText(communication);
        skills34_txt.setText(leadership);
        skills44_txt.setText(problem);
        english4_txt.setText(english);
        hindi4_txt.setText(hindi);
        gujarati4_txt.setText(gujarati);
        tenschool4_txt.setText(ten);
        twalschool4_txt.setText(twal);
        collage4_txt.setText(collage);
        degrr4_txt.setText(dgree);
        insta4_txt.setText(insta);
        facebook4_txt.setText(facebook);
        about4_txt.setText(about);


        mobile4_txt.setOnClickListener(new View.OnClickListener() {
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
        name4_txt=findViewById(R.id.name4_txt);
        surname4_txt=findViewById(R.id.surname4_txt);
        id4_txt=findViewById(R.id.id4_txt);
        mobile4_txt=findViewById(R.id.mobile4_txt);
        gender4_txt=findViewById(R.id.gender4_txt);
        age4_txt=findViewById(R.id.age4_txt);
        birth4_txt=findViewById(R.id.birth4_txt);
        marrid4_txt=findViewById(R.id.marrid4_txt);
        email4_txt=findViewById(R.id.email4_txt);
        addres4_txt=findViewById(R.id.addres4_txt);
        skills14_txt=findViewById(R.id.skills14_txt);
        skills24_txt=findViewById(R.id.skills24_txt);
        skills34_txt=findViewById(R.id.skills34_txt);
        skills44_txt=findViewById(R.id.skills44_txt);
        english4_txt=findViewById(R.id.english4_txt);
        hindi4_txt=findViewById(R.id.hindi4_txt);
        gujarati4_txt=findViewById(R.id.gujarati4_txt);
        tenschool4_txt=findViewById(R.id.tenschool4_txt);
        twalschool4_txt=findViewById(R.id.twalschool4_txt);
        collage4_txt=findViewById(R.id.collage4_txt);
        degrr4_txt=findViewById(R.id.degrr4_txt);
        insta4_txt=findViewById(R.id.insta4_txt);
        facebook4_txt=findViewById(R.id.facebook4_txt);
        about4_txt=findViewById(R.id.about4_txt);

    }

}
