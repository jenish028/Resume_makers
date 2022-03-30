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

public class Two extends AppCompatActivity {
    private TextView name1_txt,surname1_txt,id1_txt,mobile1_txt,gender1_txt,age1_txt,birth1_txt,marrid1_txt,email1_txt,addres1_txt;
    private TextView skills11_txt,skills21_txt,skills31_txt,skills41_txt,english1_txt,hindi1_txt,gujarati1_txt,tenschool1_txt,twalschool1_txt;
    private TextView collage1_txt,degrr1_txt ,insta1_txt,facebook1_txt,about1_txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        blinding();

        name1_txt.setText(name1);
        surname1_txt.setText(surname);
        id1_txt.setText(idno);
        mobile1_txt.setText(mobile);
        gender1_txt.setText(gender);
        age1_txt.setText(age);
        birth1_txt.setText(brithdate);
        marrid1_txt.setText(mariatal);
        email1_txt.setText(email);
        addres1_txt.setText(address);
        skills11_txt.setText(android);
        skills21_txt.setText(communication);
        skills31_txt.setText(leadership);
        skills41_txt.setText(problem);
        english1_txt.setText(english);
        hindi1_txt.setText(hindi);
        gujarati1_txt.setText(gujarati);
        tenschool1_txt.setText(ten);
        twalschool1_txt.setText(twal);
        collage1_txt.setText(collage);
        degrr1_txt.setText(dgree);
        insta1_txt.setText(insta);
        facebook1_txt.setText(facebook);
        about1_txt.setText(about);



        mobile1_txt.setOnClickListener(new View.OnClickListener() {
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
        name1_txt=findViewById(R.id.name1_txt);
        surname1_txt=findViewById(R.id.surname1_txt);
        id1_txt=findViewById(R.id.id1_txt);
        mobile1_txt=findViewById(R.id.mobile1_txt);
        gender1_txt=findViewById(R.id.gender1_txt);
        age1_txt=findViewById(R.id.age1_txt);
        birth1_txt=findViewById(R.id.birth1_txt);
        marrid1_txt=findViewById(R.id.marrid1_txt);
        email1_txt=findViewById(R.id.email1_txt);
        addres1_txt=findViewById(R.id.addres1_txt);
        skills11_txt=findViewById(R.id.skills11_txt);
        skills21_txt=findViewById(R.id.skills21_txt);
        skills31_txt=findViewById(R.id.skills31_txt);
        skills41_txt=findViewById(R.id.skills41_txt);
        english1_txt=findViewById(R.id.english1_txt);
        hindi1_txt=findViewById(R.id.hindi1_txt);
        gujarati1_txt=findViewById(R.id.gujarati1_txt);
        tenschool1_txt=findViewById(R.id.tenschool1_txt);
        twalschool1_txt=findViewById(R.id.twalschool1_txt);
        collage1_txt=findViewById(R.id.collage1_txt);
        degrr1_txt=findViewById(R.id.degrr1_txt);
        insta1_txt=findViewById(R.id.insta1_txt);
        facebook1_txt=findViewById(R.id.facebook1_txt);
        about1_txt=findViewById(R.id.about1_txt);

    }

}
