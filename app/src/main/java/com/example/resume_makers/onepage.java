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

public class onepage extends AppCompatActivity {
    private TextView name_txt,surname_txt,id_txt,mobile_txt,gender_txt,age_txt,birth_txt,marrid_txt,email_txt,addres_txt;
    private TextView skills1_txt,skills2_txt,skills3_txt,skills4_txt,english_txt,hindi_txt,gujarati_txt,tenschool_txt,twalschool_txt;
    private TextView collage_txt,degrr_txt ,insta_txt,facebook_txt,about_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_onepage);
        blinding();

        name_txt.setText(name1);
        surname_txt.setText(surname);
        id_txt.setText(idno);
        mobile_txt.setText(mobile);
        gender_txt.setText(gender);
        age_txt.setText(age);
        birth_txt.setText(brithdate);
        marrid_txt.setText(mariatal);
        email_txt.setText(email);
        addres_txt.setText(address);
        skills1_txt.setText(android);
        skills2_txt.setText(communication);
        skills3_txt.setText(leadership);
        skills4_txt.setText(problem);
        english_txt.setText(english);
        hindi_txt.setText(hindi);
        gujarati_txt.setText(gujarati);
        tenschool_txt.setText(ten);
        twalschool_txt.setText(twal);
        collage_txt.setText(collage);
        degrr_txt.setText(dgree);
        insta_txt.setText(insta);
        facebook_txt.setText(facebook);
        about_txt.setText(about);

        mobile_txt.setOnClickListener(new View.OnClickListener() {
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
        name_txt=findViewById(R.id.name_txt);
        surname_txt=findViewById(R.id.surname_txt);
        id_txt=findViewById(R.id.id_txt);
        mobile_txt=findViewById(R.id.mobile_txt);
        gender_txt=findViewById(R.id.gender_txt);
        age_txt=findViewById(R.id.age_txt);
        birth_txt=findViewById(R.id.birth_txt);
        marrid_txt=findViewById(R.id.marrid_txt);
        email_txt=findViewById(R.id.email_txt);
        addres_txt=findViewById(R.id.addres_txt);
        skills1_txt=findViewById(R.id.skills1_txt);
        skills2_txt=findViewById(R.id.skills2_txt);
        skills3_txt=findViewById(R.id.skills3_txt);
        skills4_txt=findViewById(R.id.skills4_txt);
        english_txt=findViewById(R.id.english_txt);
        hindi_txt=findViewById(R.id.hindi_txt);
        gujarati_txt=findViewById(R.id.gujarati_txt);
        tenschool_txt=findViewById(R.id.tenschool_txt);
        twalschool_txt=findViewById(R.id.twalschool_txt);
        collage_txt=findViewById(R.id.collage_txt);
        degrr_txt=findViewById(R.id.degrr_txt);
        insta_txt=findViewById(R.id.insta_txt);
        facebook_txt=findViewById(R.id.facebook_txt);
        about_txt=findViewById(R.id.about_txt);

    }

}