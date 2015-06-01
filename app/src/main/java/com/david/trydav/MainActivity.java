package com.david.trydav;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Button button,button2RateTravel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button2RateTravel = (Button)findViewById(R.id.button2RateTravel);
        pressMethod();
    }


    public void pressMethod(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentPressMethod();
            }
        });
        button2RateTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentRatingMethod();
            }
        });
    }
    public void intentPressMethod(){
        Intent i = new Intent(getApplication(),RatingsActivity.class);
        startActivity(i);
    }

    public void intentRatingMethod(){
        Intent i = new Intent(getApplication(),RateYourTravel.class);
        startActivity(i);
    }

}
