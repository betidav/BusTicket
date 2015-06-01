package com.david.trydav;


import android.os.AsyncTask;
import android.os.Bundle;

import android.widget.TextView;
import org.json.JSONObject;

import org.json.JSONArray;
import org.json.JSONException;
import android.app.Activity;

public class RatingsActivity extends Activity {
    private  TextView textViewResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratings);
        textViewResults = (TextView)findViewById(R.id.textViewResults);

        // we will using AsyncTask during parsing
        new AsyncTaskParseJson().execute();
    }

    // you can make this class as another java file so it will be separated from your main activity.
    public class AsyncTaskParseJson extends AsyncTask<String, String, String> {

        final String TAG = "AsyncTaskParseJson.java";

        // set your json string url here
        String yourJsonStringUrl = "http://www.nabusticket.space/nabusticketphp/get_all_products.php";

        // contacts JSONArray
        JSONArray dataJsonArr = null;

        @Override
        protected void onPreExecute() {}

        @Override
        protected String doInBackground(String... arg0) {

            String temp = "";

            try {

                // instantiate our json parser
                JSONParser jParser = new JSONParser();

                // get json string from url
                JSONObject json = jParser.getJSONFromUrl(yourJsonStringUrl);

                // get the array of users
                dataJsonArr = json.getJSONArray("Destinations");

                // loop through all users
                for (int i = 0; i < dataJsonArr.length(); i++) {

                    JSONObject c = dataJsonArr.getJSONObject(i);

                    // Storing each json item in variable
                    String id = c.getString("ID");
                    String from = c.getString("From");
                    String to = c.getString("To");
                    String agency = c.getString("Agency");
                    String price = c.getString("Price");
                    String time = c.getString("Time");

                    temp +=id+" "+from+" "+to+" "+agency+" "+price+" "+time+"\n\n\n";

                    // show the values in our logcat

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return temp;
        }

        @Override
        protected void onPostExecute(String strFromDoInBg) {
            textViewResults.setText(""+strFromDoInBg);
        }
    }
}
