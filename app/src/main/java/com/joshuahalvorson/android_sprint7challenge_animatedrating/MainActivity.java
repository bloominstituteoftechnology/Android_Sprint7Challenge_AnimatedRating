package com.joshuahalvorson.android_sprint7challenge_animatedrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomView customView = findViewById(R.id.custom_view);
        customView.setMaxRating(10);
        customView.setStartingRating(5);
    }
}
