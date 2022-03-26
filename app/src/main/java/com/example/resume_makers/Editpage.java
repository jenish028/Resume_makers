package com.example.resume_makers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Editpage extends AppCompatActivity {

    private Button submit_btn,reset_btn;
    private EditText name_edt,surname_edt,idno_edt,mobile_edt,brithdate_edt,email_btn,addres_btn,ten_edt,twal_edt;
    private  EditText about_edt,collage_edt,dgree_edt,insta_edt,facebook_edt;
    private SeekBar age_seek;
    private TextView Age1_txt;
    private ImageView arrow_img;
    private CheckBox android_chk,communication_chk,problem_chk,leadership_chk,english_chk,hindi_chk,gujarati_chk;
    private RadioGroup rg_group,rg1_group;
    private RadioButton male_rg_btn,female_rg_btn,single_rg1_btn,married_rg1_btn;
    public static String name1,surname,idno,mobile,gender,brithdate,age,mariatal,email,address,android,communication,leadership;
    public static String problem,english,hindi,gujarati,ten,twal,collage,dgree,insta,facebook,about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editpage);
        blinding();

        android_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    android="Android Development ";
                }
                else
                {
                    android="";
                }
            }
        });
        communication_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    communication="Communication";
                }
                else
                {
                    communication="";
                }
            }
        });
        leadership_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    leadership="Leadership";
                }
                else
                {
                    leadership="";
                }
            }
        });
        problem_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    problem="Problem solving  ";
                }
                else
                {
                    problem="";
                }
            }
        });
        english_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    english="English";
                }
                else
                {
                    english="";
                }
            }
        });
        hindi_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                   hindi="Hindi";
                }
                else
                {
                    hindi="";
                }
            }
        });
        gujarati_chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    gujarati="Gujarati  ";
                }
                else
                {
                    gujarati="";
                }
            }
        });

        age_seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Age1_txt.setText(""+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 name1=name_edt.getText().toString();
                 surname=surname_edt.getText().toString();
                 idno=idno_edt.getText().toString();
                 mobile=mobile_edt.getText().toString();
                 age=Age1_txt.getText().toString();
                 brithdate=brithdate_edt.getText().toString();
                 email=email_btn.getText().toString();
                 address=addres_btn.getText().toString();
                 ten=ten_edt.getText().toString();
                 twal=twal_edt.getText().toString();
                 collage=collage_edt.getText().toString();
                 dgree=dgree_edt.getText().toString();
                 insta=insta_edt.getText().toString();
                 facebook=facebook_edt.getText().toString();
                 about=about_edt.getText().toString();

                if(rg_group.getCheckedRadioButtonId()==R.id.male_rg_btn)
                {
                    gender="Male";
                }
                else if(rg_group.getCheckedRadioButtonId()==R.id.female_rg_btn)
                {
                    gender="Female";
                }

                if(rg1_group.getCheckedRadioButtonId()==R.id.single_rg1_btn)
                {
                    mariatal="Single";
                }
                else if(rg1_group.getCheckedRadioButtonId()==R.id.married_rg1_btn)
                {
                    mariatal="married";
                }

                if(name_edt.getText().length()==0)
                {
                    name_edt.setError("Enter Name");
                }
                else if(surname_edt.getText().length()==0)
                {
                    surname_edt.setError("Enter Surname");
                }
                else
                {
                    Intent a=new Intent(Editpage.this,pageview.class);

                    startActivity(a);

                }




            }
        });
        arrow_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a=new Intent(Editpage.this,MainActivity.class);
                startActivity(a);
            }
        });

        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            name_edt.setText("");
            surname_edt.setText("");
            idno_edt.setText("");
            mobile_edt.setText("");
            Age1_txt.setText("");
            brithdate_edt.setText("");
                email_btn.setText("");
                addres_btn.setText("");
                ten_edt.setText("");
                twal_edt.setText("");
                collage_edt.setText("");
                dgree_edt.setText("");
                insta_edt.setText("");
                facebook_edt.setText("");
                about_edt.setText("");

            }
        });
    }

    void   blinding()
    {
        submit_btn=findViewById(R.id.submit_btn);
        name_edt=findViewById(R.id.name_edt);
        surname_edt=findViewById(R.id.surname_edt);
        idno_edt=findViewById(R.id.idno_edt);
        mobile_edt=findViewById(R.id.mobile_edt);
        rg_group=findViewById(R.id.rg_group);
        male_rg_btn=findViewById(R.id.male_rg_btn);
        female_rg_btn=findViewById(R.id.female_rg_btn);
        age_seek=findViewById(R.id.age_seek);
        Age1_txt=findViewById(R.id.Age1_txt);
        brithdate_edt=findViewById(R.id.brithdate_edt);
        rg1_group=findViewById(R.id.rg1_group);
        single_rg1_btn=findViewById(R.id.single_rg1_btn);
        married_rg1_btn=findViewById(R.id.married_rg1_btn);
        email_btn=findViewById(R.id.email_btn);
        addres_btn=findViewById(R.id.addres_btn);
        android_chk=findViewById(R.id.android_chk);
        communication_chk=findViewById(R.id.communication_chk);
        leadership_chk=findViewById(R.id.leadership_chk);
        problem_chk=findViewById(R.id.problem_chk);
        english_chk=findViewById(R.id.english_chk);
        hindi_chk=findViewById(R.id.hindi_chk);
        gujarati_chk=findViewById(R.id.gujarati_chk);
        ten_edt=findViewById(R.id.ten_edt);
        twal_edt=findViewById(R.id.twal_edt);
        collage_edt=findViewById(R.id.collage_edt);
        dgree_edt=findViewById(R.id.dgree_edt);
        insta_edt=findViewById(R.id.insta_edt);
        facebook_edt=findViewById(R.id.facebook_edt);
        about_edt=findViewById(R.id.about_edt);
        reset_btn=findViewById(R.id.reset_btn);
        arrow_img=findViewById(R.id.arrow_img);


    }
}