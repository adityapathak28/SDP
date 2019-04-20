package com.revauniversity.revasdpapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.jar.Attributes;



public class Form extends AppCompatActivity {

    EditText dept,yearvar,nameEdit,emailEdit,srnEdit,phoneEdit,progEdit;
    String name,email,phone,srn,depart,year,program;
    public String userId;
    public DatabaseReference mFirebaseDatabase;
    public FirebaseDatabase mFirebaseInstance;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        setTitle("Registration Form");
        ActionBar actionBar = getSupportActionBar();

        dept=findViewById(R.id.school);
        nameEdit=findViewById(R.id.name);
        emailEdit=findViewById(R.id.email);
        srnEdit=findViewById(R.id.srn);
        phoneEdit=findViewById(R.id.phone);
        yearvar=findViewById(R.id.year);
        progEdit=findViewById(R.id.prog);

        Intent i = getIntent();
        final String dep = i.getStringExtra("message");
        final String yr = i.getStringExtra("message2");
        final String prog =i.getStringExtra("message3");

        dept.setText(dep);
        yearvar.setText(yr);
        progEdit.setText(prog);

        mFirebaseInstance = FirebaseDatabase.getInstance();

        if(dep.equals("School of C & IT")) {
            if (yr.equals("First Year"))
            {
                if (prog.equals("System Servicing and Troubleshooting")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FirstYear/System Servicing and Troubleshooting");
                } else if (prog.equals("Linux Administration")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FirstYear/Linux Administration");
                } else if (prog.equals("Open Source Tools")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FirstYear/Open Source Tools");
                } else if (prog.equals("Website Design")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FirstYear/Website Design");
                } else if (prog.equals("Digital Photography")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FirstYear/Digital Photography");
                } else if (prog.equals("Python Basics")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FirstYear/Python Basics");
                } else if (prog.equals("Ethical Hacking")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FirstYear/Ethical Hacking");
                } else {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FirstYear/3D Animation");
                }

            }
            else if (yr.equals("Second Year")) {
                if (prog.equals("Machine learning using Python Programming")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/SecondYear/Machine learning using Python Programming");
                }
                else if (prog.equals("Mobile App Development")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/SecondYear/Mobile App Development");
                }
                else if (prog.equals("Technical Paper Writing-1")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/SecondYear/Technical Paper Writing-1");
                }
               else  if (prog.equals("Java")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/SecondYear/Java");
                }
                else if (prog.equals("Networking")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/SecondYear/Networking");
                }
                else if (prog.equals("Animation")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/SecondYear/Animation");
                }
                else if (prog.equals("Linux Administration")) {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/SecondYear/Linux Administration");
                }
                else  {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/SecondYear/R-Programming Basics");
                }
            }
            else if (yr.equals("Third Year"))
            {
                if (prog.equals("Deep Learning"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/ThirdYear/Deep Learning");
                }
                else if (prog.equals("IoT"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/ThirdYear/IoT");
                }
                else if (prog.equals("Data Analytics"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/ThirdYear/Data Analytics");
                }
                else if (prog.equals("Devops"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/ThirdYear/Devops");
                }
                else if (prog.equals("Technical Paper Writing-2"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/ThirdYear/Technical Paper Writing-2");
                }
                else if (prog.equals("Ethical Hacking"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/ThirdYear/Ethical Hacking");
                }
                else if (prog.equals("Cyber-Security"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/ThirdYear/Cyber-Security");
                }
                else if (prog.equals("Networking"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/ThirdYear/Networking");
                }
                else if (prog.equals("Python And Machine Learning"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/ThirdYear/Python And Machine Learning");
                }
                else
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/ThirdYear/Mobile App Development");
                }
            }
            else
            {
                if (prog.equals("Latex Based Documentation"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FourthYear/Latex Based Documentation");
                }
                else if (prog.equals("Advanced Java Programming"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FourthYear/Advanced Java Programming");
                }
                else if (prog.equals("Business Analytics with R"))
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FourthYear/Business Analytics with R");
                }
                else
                {
                    mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FourthYear/Global Certification");
                }

            }
        }



        final Button button = findViewById(R.id.register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                       name = nameEdit.getText().toString();
                       if (name.matches(""))
                       {
                           Toast.makeText(getApplicationContext(), "Please Enter your name", Toast.LENGTH_SHORT).show();
                           return;
                       }
                       email = emailEdit.getText().toString();
                       if (email.matches(""))
                       {
                            Toast.makeText(getApplicationContext(), "Please Enter your email", Toast.LENGTH_SHORT).show();
                            return;
                       }
                       phone = phoneEdit.getText().toString();
                       if (phone.matches(""))
                       {
                            Toast.makeText(getApplicationContext(), "Please Enter your phone number", Toast.LENGTH_SHORT).show();
                            return;
                       }
                       srn = srnEdit.getText().toString();
                       if (srn.matches(""))
                       {
                            Toast.makeText(getApplicationContext(), "Please Enter your SRN", Toast.LENGTH_SHORT).show();
                            return;
                        }
                       depart = dept.getText().toString();
                       year = yearvar.getText().toString();
                       program = progEdit.getText().toString();

                       createUser(name, email, phone, srn, depart, year, prog);

            }
        });
        final Button button2=findViewById(R.id.retrieve);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent ret = new Intent(getApplicationContext(), retrieve.class);
                startActivity(ret);
            }
            });


        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void createUser(String name, String email,String phone,String srn, String depart, String year, String prog)
    {
        userId=mFirebaseDatabase.push().getKey();
        Students students=new Students(name,email,phone,srn,depart,year,prog);
        mFirebaseDatabase.child(userId).setValue(students).addOnSuccessListener(new OnSuccessListener<Void>()
        {
            @Override
            public void onSuccess(Void aVoid)
            {
                Intent success = new Intent(getApplicationContext(), Success.class);
                startActivity(success);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
