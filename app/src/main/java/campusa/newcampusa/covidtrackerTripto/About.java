package campusa.newcampusa.covidtrackerTripto;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setTitle("About Covid Tracker BD");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}