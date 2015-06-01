package com.david.trydav;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class RateYourTravel extends ActionBarActivity {

    private boolean haveNotYetRated = true;

    private CheckBox checkBox1,checkBox1_1,checkBox1_2,checkBox1_3,checkBox1_4, checkBox2, checkBox3,checkBox3_1,checkBox3_2,checkBox3_3,checkBox4,checkBox5,checkBox6,checkBox6_1,checkBox6_2,checkBox7;
    private CheckBox checkBox8, checkBox9, checkBox10,checkBox10_1,checkBox11,checkBox12,checkBox13,checkBox14,checkBox15;
    private Button button2Rate;
    int RatingValue = 1;

    int CleanRatingValue = 0;
    int SpeedRatingValue = 0;
    int LogageHandling = 0;
    int busDriverRate = 0;
    int overalComfortability = 0;
    int[] Rating = new int[5];
    int SumOfAllRatings = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_your_travel);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox1_1=(CheckBox) findViewById(R.id.checkBox1_1);
        checkBox1_2=(CheckBox) findViewById(R.id.checkBox1_2);
        checkBox1_3=(CheckBox) findViewById(R.id.checkBox1_3);
        checkBox1_4=(CheckBox) findViewById(R.id.checkBox1_4);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox3_1=(CheckBox) findViewById(R.id.checkBox3_1);
        checkBox3_2=(CheckBox) findViewById(R.id.checkBox3_2);
        checkBox3_3=(CheckBox) findViewById(R.id.checkBox3_3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkBox6_1=(CheckBox) findViewById(R.id.checkBox6_1);
        checkBox6_2=(CheckBox) findViewById(R.id.checkBox6_2);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
        checkBox10_1=(CheckBox) findViewById(R.id.checkBox10_1);
        checkBox11 = (CheckBox) findViewById(R.id.checkBox11);
        checkBox12 = (CheckBox) findViewById(R.id.checkBox12);
        checkBox13 = (CheckBox) findViewById(R.id.checkBox13);
        checkBox14 = (CheckBox) findViewById(R.id.checkBox14);
        checkBox15 = (CheckBox) findViewById(R.id.checkBox15);

        button2Rate = (Button) findViewById(R.id.button2Rate);

        RateListenr();
    }

    public void RateListenr(){
        button2Rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBoxCleanLinessMethod();
                luggageHandlingMethod();
                speedRatingMethod();
                busDriverMethod();
                busComfortMethod();
                SumOfAllRatings = Rating[0]+Rating[1]+Rating[2]+Rating[3]+Rating[4];
                dialogBox();
            }
        });
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox1.isChecked())){
                    CleanRatingValue = 1;
                    checkBox1.setChecked(true);
                    checkBox1_1.setChecked(false);
                    checkBox1_2.setChecked(false);
                    checkBox1_3.setChecked(false);
                    checkBox1_4.setChecked(false);
                }else if(!checkBox1.isChecked()){
                    CleanRatingValue =0;
                    checkBox1.setChecked(false);
                    checkBox1_1.setChecked(false);
                    checkBox1_2.setChecked(false);
                    checkBox1_3.setChecked(false);
                    checkBox1_4.setChecked(false);
                }
            }
        });
        checkBox1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox1_1.isChecked())){
                    CleanRatingValue = 2;
                    checkBox1.setChecked(true);
                    checkBox1_1.setChecked(true);
                    checkBox1_2.setChecked(false);
                    checkBox1_3.setChecked(false);
                    checkBox1_4.setChecked(false);
                }else if(!checkBox1_1.isChecked()){
                    CleanRatingValue =0;
                    checkBox1.setChecked(false);
                    checkBox1_1.setChecked(false);
                    checkBox1_2.setChecked(false);
                    checkBox1_3.setChecked(false);
                    checkBox1_4.setChecked(false);
                }
            }
        });
        checkBox1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox1_2.isChecked())){
                    CleanRatingValue = 3;
                    checkBox1.setChecked(true);
                    checkBox1_1.setChecked(true);
                    checkBox1_2.setChecked(true);
                    checkBox1_3.setChecked(false);
                    checkBox1_4.setChecked(false);
                }else if(!checkBox1_2.isChecked()){
                    CleanRatingValue =0;
                    checkBox1.setChecked(false);
                    checkBox1_1.setChecked(false);
                    checkBox1_2.setChecked(false);
                    checkBox1_3.setChecked(false);
                    checkBox1_4.setChecked(false);
                }
            }
        });
        checkBox1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox1_3.isChecked())){
                    CleanRatingValue = 4;
                    checkBox1.setChecked(true);
                    checkBox1_1.setChecked(true);
                    checkBox1_2.setChecked(true);
                    checkBox1_3.setChecked(true);
                    checkBox1_4.setChecked(false);
                }else if(!checkBox1_3.isChecked()){
                    CleanRatingValue =0;
                    checkBox1.setChecked(false);
                    checkBox1_1.setChecked(false);
                    checkBox1_2.setChecked(false);
                    checkBox1_3.setChecked(false);
                    checkBox1_4.setChecked(false);
                }
            }
        });
        checkBox1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox1_4.isChecked())){
                    CleanRatingValue = 5;
                    checkBox1.setChecked(true);
                    checkBox1_1.setChecked(true);
                    checkBox1_2.setChecked(true);
                    checkBox1_3.setChecked(true);
                    checkBox1_4.setChecked(true);
                }else if(!checkBox1_4.isChecked()){
                    CleanRatingValue =0;
                    checkBox1.setChecked(false);
                    checkBox1_1.setChecked(false);
                    checkBox1_2.setChecked(false);
                    checkBox1_3.setChecked(false);
                    checkBox1_4.setChecked(false);
                }
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox2.isChecked())){
                    LogageHandling = 1;
                    checkBox2.setChecked(true);
                    checkBox3.setChecked(false);
                    checkBox3_1.setChecked(false);
                    checkBox3_2.setChecked(false);
                    checkBox3_3.setChecked(false);
                }else if(!checkBox2.isChecked()){
                    LogageHandling =0;
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                    checkBox3_1.setChecked(false);
                    checkBox3_2.setChecked(false);
                    checkBox3_3.setChecked(false);
                }
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox3.isChecked())){
                    LogageHandling = 2;
                    checkBox2.setChecked(true);
                    checkBox3.setChecked(true);
                    checkBox3_1.setChecked(false);
                    checkBox3_2.setChecked(false);
                    checkBox3_3.setChecked(false);
                }else if(!checkBox3.isChecked()){
                    LogageHandling =0;
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                    checkBox3_1.setChecked(false);
                    checkBox3_2.setChecked(false);
                    checkBox3_3.setChecked(false);
                }
            }
        });
        checkBox3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox3_1.isChecked())){
                    LogageHandling = 3;
                    checkBox2.setChecked(true);
                    checkBox3.setChecked(true);
                    checkBox3_1.setChecked(true);
                    checkBox3_2.setChecked(false);
                    checkBox3_3.setChecked(false);
                }else if(!checkBox2.isChecked()){
                    LogageHandling =0;
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                    checkBox3_1.setChecked(false);
                    checkBox3_2.setChecked(false);
                    checkBox3_3.setChecked(false);
                }
            }
        });
        checkBox3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox3_2.isChecked())){
                    LogageHandling = 4;
                    checkBox2.setChecked(true);
                    checkBox3.setChecked(true);
                    checkBox3_1.setChecked(true);
                    checkBox3_2.setChecked(true);
                    checkBox3_3.setChecked(false);
                }else if(!checkBox3_2.isChecked()){
                    LogageHandling =0;
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                    checkBox3_1.setChecked(false);
                    checkBox3_2.setChecked(false);
                    checkBox3_3.setChecked(false);
                }
            }
        });
        checkBox3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox3_3.isChecked())){
                    LogageHandling = 5;
                    checkBox2.setChecked(true);
                    checkBox3.setChecked(true);
                    checkBox3_1.setChecked(true);
                    checkBox3_2.setChecked(true);
                    checkBox3_3.setChecked(true);
                }else if(!checkBox3_3.isChecked()){
                    LogageHandling =0;
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                    checkBox3_1.setChecked(false);
                    checkBox3_2.setChecked(false);
                    checkBox3_3.setChecked(false);
                }
            }
        });
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox4.isChecked())){
                    SpeedRatingValue = 1;
                    checkBox4.setChecked(true);
                    checkBox5.setChecked(false);
                    checkBox6.setChecked(false);
                    checkBox6_1.setChecked(false);
                    checkBox6_2.setChecked(false);
                }else if(!checkBox4.isChecked()){
                    SpeedRatingValue =0;
                    checkBox4.setChecked(false);
                    checkBox5.setChecked(false);
                    checkBox6.setChecked(false);
                    checkBox6_1.setChecked(false);
                    checkBox6_2.setChecked(false);
                }
            }
        });
        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox5.isChecked())){
                    SpeedRatingValue = 2;
                    checkBox4.setChecked(true);
                    checkBox5.setChecked(true);
                    checkBox6.setChecked(false);
                    checkBox6_1.setChecked(false);
                    checkBox6_2.setChecked(false);
                }else if(!checkBox5.isChecked()){
                    SpeedRatingValue =0;
                    checkBox4.setChecked(false);
                    checkBox5.setChecked(false);
                    checkBox6.setChecked(false);
                    checkBox6_1.setChecked(false);
                    checkBox6_2.setChecked(false);
                }
            }
        });
        checkBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox6.isChecked())){
                    SpeedRatingValue = 3;
                    checkBox4.setChecked(true);
                    checkBox5.setChecked(true);
                    checkBox6.setChecked(true);
                    checkBox6_1.setChecked(false);
                    checkBox6_2.setChecked(false);
                }else if(!checkBox6.isChecked()){
                    SpeedRatingValue =0;
                    checkBox4.setChecked(false);
                    checkBox5.setChecked(false);
                    checkBox6.setChecked(false);
                    checkBox6_1.setChecked(false);
                    checkBox6_2.setChecked(false);
                }
            }
        });
        checkBox6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox6_1.isChecked())){
                    SpeedRatingValue = 4;
                    checkBox4.setChecked(true);
                    checkBox5.setChecked(true);
                    checkBox6.setChecked(true);
                    checkBox6_1.setChecked(true);
                    checkBox6_2.setChecked(false);
                }else if(!checkBox6_1.isChecked()){
                    SpeedRatingValue =0;
                    checkBox4.setChecked(false);
                    checkBox5.setChecked(false);
                    checkBox6.setChecked(false);
                    checkBox6_1.setChecked(false);
                    checkBox6_2.setChecked(false);
                }
            }
        });
        checkBox6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((checkBox6_2.isChecked())) {
                    SpeedRatingValue = 5;
                    checkBox4.setChecked(true);
                    checkBox5.setChecked(true);
                    checkBox6.setChecked(true);
                    checkBox6_1.setChecked(true);
                    checkBox6_2.setChecked(true);
                } else if (!checkBox6_2.isChecked()) {
                    SpeedRatingValue = 0;
                    checkBox4.setChecked(false);
                    checkBox5.setChecked(false);
                    checkBox6.setChecked(false);
                    checkBox6_1.setChecked(false);
                    checkBox6_2.setChecked(false);
                }
            }
        });
        checkBox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox7.isChecked())){
                    busDriverRate=1;
                    checkBox7.setChecked(true);
                    checkBox8.setChecked(false);
                    checkBox9.setChecked(false);
                    checkBox10.setChecked(false);
                    checkBox10_1.setChecked(false);
                }else if(!checkBox7.isChecked()){
                    busDriverRate =0;
                    checkBox7.setChecked(false);
                    checkBox8.setChecked(false);
                    checkBox9.setChecked(false);
                    checkBox10.setChecked(false);
                    checkBox10_1.setChecked(false);
                }
            }
        });
        checkBox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox8.isChecked())){
                    busDriverRate=2;
                    checkBox7.setChecked(true);
                    checkBox8.setChecked(true);
                    checkBox9.setChecked(false);
                    checkBox10.setChecked(false);
                    checkBox10_1.setChecked(false);
                }else if(!checkBox8.isChecked()){
                    busDriverRate =0;
                    checkBox7.setChecked(false);
                    checkBox8.setChecked(false);
                    checkBox9.setChecked(false);
                    checkBox10.setChecked(false);
                    checkBox10_1.setChecked(false);
                }
            }
        });
        checkBox9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox9.isChecked())){
                    busDriverRate=3;
                    checkBox7.setChecked(true);
                    checkBox8.setChecked(true);
                    checkBox9.setChecked(true);
                    checkBox10.setChecked(false);
                    checkBox10_1.setChecked(false);
                }else if(!checkBox9.isChecked()){
                    busDriverRate =0;
                    checkBox7.setChecked(false);
                    checkBox8.setChecked(false);
                    checkBox9.setChecked(false);
                    checkBox10.setChecked(false);
                    checkBox10_1.setChecked(false);
                }
            }
        });
        checkBox10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox10.isChecked())){
                    busDriverRate=4;
                    checkBox7.setChecked(true);
                    checkBox8.setChecked(true);
                    checkBox9.setChecked(true);
                    checkBox10.setChecked(true);
                    checkBox10_1.setChecked(false);
                }else if(!checkBox10.isChecked()){
                    busDriverRate =0;
                    checkBox7.setChecked(false);
                    checkBox8.setChecked(false);
                    checkBox9.setChecked(false);
                    checkBox10.setChecked(false);
                    checkBox10_1.setChecked(false);
                }
            }
        });
        checkBox10_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox10_1.isChecked())){
                    busDriverRate=5;
                    checkBox7.setChecked(true);
                    checkBox8.setChecked(true);
                    checkBox9.setChecked(true);
                    checkBox10.setChecked(true);
                    checkBox10_1.setChecked(true);
                }else if(!checkBox10_1.isChecked()){
                    busDriverRate =0;
                    checkBox7.setChecked(false);
                    checkBox8.setChecked(false);
                    checkBox9.setChecked(false);
                    checkBox10.setChecked(false);
                    checkBox10_1.setChecked(false);
                }
            }
        });
        checkBox11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox11.isChecked())){
                    overalComfortability =1;
                    checkBox11.setChecked(true);
                    checkBox12.setChecked(false);
                    checkBox13.setChecked(false);
                    checkBox14.setChecked(false);
                    checkBox15.setChecked(false);
                }else if(!checkBox11.isChecked()){
                    overalComfortability =0;
                    checkBox11.setChecked(false);
                    checkBox12.setChecked(false);
                    checkBox13.setChecked(false);
                    checkBox14.setChecked(false);
                    checkBox15.setChecked(false);
                }
            }
        });
        checkBox12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox12.isChecked())){
                    overalComfortability=2;
                    checkBox11.setChecked(true);
                    checkBox12.setChecked(true);
                    checkBox13.setChecked(false);
                    checkBox14.setChecked(false);
                    checkBox15.setChecked(false);
                }else if(!checkBox12.isChecked()){
                    overalComfortability =0;
                    checkBox11.setChecked(false);
                    checkBox12.setChecked(false);
                    checkBox13.setChecked(false);
                    checkBox14.setChecked(false);
                    checkBox15.setChecked(false);
                }
             }
        });
        checkBox13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox13.isChecked())){
                    overalComfortability=3;
                    checkBox11.setChecked(true);
                    checkBox12.setChecked(true);
                    checkBox13.setChecked(true);
                    checkBox14.setChecked(false);
                    checkBox15.setChecked(false);
                }else if(!checkBox13.isChecked()){
                    overalComfortability =0;
                    checkBox11.setChecked(false);
                    checkBox12.setChecked(false);
                    checkBox13.setChecked(false);
                    checkBox14.setChecked(false);
                    checkBox15.setChecked(false);
                }
            }
        });
        checkBox14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox14.isChecked())){
                    overalComfortability =4;
                    checkBox11.setChecked(true);
                    checkBox12.setChecked(true);
                    checkBox13.setChecked(true);
                    checkBox14.setChecked(true);
                    checkBox15.setChecked(false);
                }else if(!checkBox14.isChecked()){
                    overalComfortability =0;
                    checkBox11.setChecked(false);
                    checkBox12.setChecked(false);
                    checkBox13.setChecked(false);
                    checkBox14.setChecked(false);
                    checkBox15.setChecked(false);
                }
            }
        });
        checkBox15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((checkBox15.isChecked())){
                    overalComfortability=5;
                    checkBox11.setChecked(true);
                    checkBox12.setChecked(true);
                    checkBox13.setChecked(true);
                    checkBox14.setChecked(true);
                    checkBox15.setChecked(true);
                }else if(!checkBox15.isChecked()){
                    overalComfortability =0;
                    checkBox11.setChecked(false);
                    checkBox12.setChecked(false);
                    checkBox13.setChecked(false);
                    checkBox14.setChecked(false);
                    checkBox15.setChecked(false);
                }
            }
        });
    }

    public void checkBoxCleanLinessMethod(){
        Rating[0] = CleanRatingValue;
    }


    public void luggageHandlingMethod() {
        Rating[1] = LogageHandling;
    }

    public void speedRatingMethod(){
        Rating[2] = SpeedRatingValue;
    }
    public void busDriverMethod(){
        Rating[3] = busDriverRate;
    }

    public void busComfortMethod(){
        Rating[4] = overalComfortability;

    }

    public void dialogBox() {
        SumOfAllRatings = Rating[0]+Rating[1]+Rating[2]+Rating[3]+Rating[4];
        AlertDialog.Builder alertDialogBuilder = new        AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Your total rate: " + SumOfAllRatings+ " /25");
        alertDialogBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                });
        alertDialogBuilder.setNegativeButton("cancel",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }


   //Toast.makeText(getApplicationContext(), "Rated "+SumOfAllRatings + " point(s)", Toast.LENGTH_SHORT).show();
}
