package com.revauniversity.revasdpapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.crypto.interfaces.PBEKey;

public class SCIT extends AppCompatActivity {
    Button fy,sy,ty,foy;
    final String deptcit="School of C & IT";
    final String year1="First Year";
    final String year2="Second Year";
    final String year3="Third Year";
    final String year4="Fourth Year";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scit);
        setTitle("School of C and IT");
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);


        }
        fy = (Button)findViewById(R.id.fy);
        fy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CreateAlertDialogWithButtonGroup() ;

            }
        });
        sy = (Button)findViewById(R.id.sy);
        sy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CreateAlertDialogWithButtonGroup2() ;

            }
        });
        ty = (Button)findViewById(R.id.ty);
        ty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CreateAlertDialogWithButtonGroup3() ;

            }
        });
        foy = (Button)findViewById(R.id.foy);
        foy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CreateAlertDialogWithButtonGroup4() ;

            }
        });

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    public void CreateAlertDialogWithButtonGroup(){


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose a program");



        String[] listcit1 = {"System Servicing and Troubleshooting", "Linux Administration", "Open Source Tools", "Website Design", "Digital Photography","Python Basics","Ethical Hacking","3D Animation"};
        builder.setItems(listcit1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        Intent sst = new Intent(getApplicationContext(), Form.class);
                        sst.putExtra("message",deptcit);
                        sst.putExtra("message2",year1);
                        sst.putExtra("message3","System Servicing and Troubleshooting");
                        startActivity(sst);
                        break;
                    case 1:
                        Intent linad1 = new Intent(getApplicationContext(), Form.class);
                        linad1.putExtra("message",deptcit);
                        linad1.putExtra("message2",year1);
                        linad1.putExtra("message3","Linux Administration");
                        startActivity(linad1);
                        break;
                    case 2:
                        Intent ost = new Intent(getApplicationContext(), Form.class);
                        ost.putExtra("message",deptcit);
                        ost.putExtra("message2",year1);
                        ost.putExtra("message3","Open Source Tools");
                        startActivity(ost);
                        break;
                    case 3:
                        Intent wd = new Intent(getApplicationContext(), Form.class);
                        wd.putExtra("message",deptcit);
                        wd.putExtra("message2",year1);
                        wd.putExtra("message3","Website Design");
                        startActivity(wd);
                        break;
                    case 4:
                        Intent dp = new Intent(getApplicationContext(), Form.class);
                        dp.putExtra("message",deptcit);
                        dp.putExtra("message2",year1);
                        dp.putExtra("message3","Digital Photography");
                        startActivity(dp);
                        break;
                    case 5:
                        Intent pb = new Intent(getApplicationContext(), Form.class);
                        pb.putExtra("message",deptcit);
                        pb.putExtra("message2",year1);
                        pb.putExtra("message3","Python Basics");
                        startActivity(pb);
                        break;
                    case 6:
                        Intent eh = new Intent(getApplicationContext(), Form.class);
                        eh.putExtra("message",deptcit);
                        eh.putExtra("message2",year1);
                        eh.putExtra("message3","Ethical Hacking");
                        startActivity(eh);
                        break;
                    case 7:
                        Intent anim3d = new Intent(getApplicationContext(), Form.class);
                        anim3d.putExtra("message",deptcit);
                        anim3d.putExtra("message2",year1);
                        anim3d.putExtra("message3","3D Animation");
                        startActivity(anim3d);
                        break;

                }
            }
        });

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }
    public void CreateAlertDialogWithButtonGroup2(){


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose a program");

        // add a list
        String[] listcit1 = {"Machine learning using Python Programming", "Mobile App Development", "Technical Paper Writing-1", "Java", "Networking","Animation","Linux Administration","R-Programming Basics"};
        builder.setItems(listcit1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        Intent ml = new Intent(getApplicationContext(), Form.class);
                        ml.putExtra("message",deptcit);
                        ml.putExtra("message2",year2);
                        ml.putExtra("message3","Machine learning using Python Programming");
                        startActivity(ml);
                        break;
                    case 1:
                        Intent mad = new Intent(getApplicationContext(), Form.class);
                        mad.putExtra("message",deptcit);
                        mad.putExtra("message2",year2);
                        mad.putExtra("message3","Mobile App Development");
                        startActivity(mad);
                        break;
                    case 2:
                        Intent tp1 = new Intent(getApplicationContext(), Form.class);
                        tp1.putExtra("message",deptcit);
                        tp1.putExtra("message2",year2);
                        tp1.putExtra("message3","Technical Paper Writing-1");
                        startActivity(tp1);
                        break;
                    case 3:
                        Intent jv = new Intent(getApplicationContext(), Form.class);
                        jv.putExtra("message",deptcit);
                        jv.putExtra("message2",year2);
                        jv.putExtra("message3","Java");
                        startActivity(jv);
                        break;
                    case 4:
                        Intent nwrk = new Intent(getApplicationContext(), Form.class);
                        nwrk.putExtra("message",deptcit);
                        nwrk.putExtra("message2",year2);
                        nwrk.putExtra("message3","Networking");
                        startActivity(nwrk);
                        break;
                    case 5:
                        Intent anim = new Intent(getApplicationContext(), Form.class);
                        anim.putExtra("message",deptcit);
                        anim.putExtra("message2",year2);
                        anim.putExtra("message3","Animation");
                        startActivity(anim);
                        break;
                    case 6:
                        Intent linad2 = new Intent(getApplicationContext(), Form.class);
                        linad2.putExtra("message",deptcit);
                        linad2.putExtra("message2",year2);
                        linad2.putExtra("message3","Linux Administration");
                        startActivity(linad2);
                        break;
                    case 7:
                        Intent rprog = new Intent(getApplicationContext(), Form.class);
                        rprog.putExtra("message",deptcit);
                        rprog.putExtra("message2",year2);
                        rprog.putExtra("message3","R-Programming Basics");
                        startActivity(rprog);
                        break;
                }
            }
        });

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }
    public void CreateAlertDialogWithButtonGroup3(){


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose a program");

        // add a list
        String[] listcit1 = {"Deep Learning", "IoT", "Data Analytics", "Devops", "Technical Paper Writing-2","Ethical Hacking","Cyber Security","Networking","Python And Machine Learning","Mobile App Development",};
        builder.setItems(listcit1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        Intent dl = new Intent(getApplicationContext(), Form.class);
                        dl.putExtra("message",deptcit);
                        dl.putExtra("message2",year3);
                        dl.putExtra("message3","Deep Learning");
                        startActivity(dl);
                        break;
                    case 1:
                        Intent iot3 = new Intent(getApplicationContext(), Form.class);
                        iot3.putExtra("message",deptcit);
                        iot3.putExtra("message2",year3);
                        iot3.putExtra("message3","IoT");
                        startActivity(iot3);
                        break;
                    case 2:
                        Intent da = new Intent(getApplicationContext(), Form.class);
                        da.putExtra("message",deptcit);
                        da.putExtra("message2",year3);
                        da.putExtra("message3","Data Analytics");
                        startActivity(da);
                        break;
                    case 3:
                        Intent devops = new Intent(getApplicationContext(), Form.class);
                        devops.putExtra("message",deptcit);
                        devops.putExtra("message2",year3);
                        devops.putExtra("message3","Devops");
                        startActivity(devops);
                        break;
                    case 4:
                        Intent tp2 = new Intent(getApplicationContext(), Form.class);
                        tp2.putExtra("message",deptcit);
                        tp2.putExtra("message2",year3);
                        tp2.putExtra("message3","Technical Paper Writing-2");
                        startActivity(tp2);
                        break;
                    case 5:
                        Intent eh3 = new Intent(getApplicationContext(), Form.class);
                        eh3.putExtra("message",deptcit);
                        eh3.putExtra("message2",year3);
                        eh3.putExtra("message3","Ethical Hacking");
                        startActivity(eh3);
                        break;
                    case 6:
                        Intent cs = new Intent(getApplicationContext(), Form.class);
                        cs.putExtra("message",deptcit);
                        cs.putExtra("message2",year3);
                        cs.putExtra("message3","Cyber-Security");
                        startActivity(cs);
                        break;
                    case 7:
                        Intent nw = new Intent(getApplicationContext(), Form.class);
                        nw.putExtra("message",deptcit);
                        nw.putExtra("message2",year3);
                        nw.putExtra("message3","Networking");
                        startActivity(nw);
                        break;
                    case 8:
                        Intent pml = new Intent(getApplicationContext(), Form.class);
                        pml.putExtra("message",deptcit);
                        pml.putExtra("message2",year3);
                        pml.putExtra("message3","Python And Machine Learning");
                        startActivity(pml);
                        break;
                    case 9:
                        Intent mad3 = new Intent(getApplicationContext(), Form.class);
                        mad3.putExtra("message",deptcit);
                        mad3.putExtra("message2",year3);
                        mad3.putExtra("message3","Mobile App Development");
                        startActivity(mad3);
                        break;
                }
            }
        });

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }
    public void CreateAlertDialogWithButtonGroup4(){


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose a program");

        // add a list
        String[] listcit1 = {"Latex Based Documentation", "Advanced Java Programming", "Business Analytics with R", "Global Certification"};
        builder.setItems(listcit1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        Intent lbd = new Intent(getApplicationContext(), Form.class);
                        lbd.putExtra("message",deptcit);
                        lbd.putExtra("message2",year4);
                        lbd.putExtra("message3","Latex Based Documentation");
                        startActivity(lbd);
                        break;
                    case 1:
                        Intent ajp = new Intent(getApplicationContext(), Form.class);
                        ajp.putExtra("message",deptcit);
                        ajp.putExtra("message2",year4);
                        ajp.putExtra("message3","Advanced Java Programming");
                        startActivity(ajp);
                        break;
                    case 2:
                        Intent bar = new Intent(getApplicationContext(), Form.class);
                        bar.putExtra("message",deptcit);
                        bar.putExtra("message2",year4);
                        bar.putExtra("message3","Business Analytics with R");
                        startActivity(bar);
                        break;
                    case 3:
                        Intent gc = new Intent(getApplicationContext(), Form.class);
                        gc.putExtra("message",deptcit);
                        gc.putExtra("message2",year4);
                        gc.putExtra("message3","Globa; Certification");
                        startActivity(gc);
                        break;

                }
            }
        });

        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }

}



