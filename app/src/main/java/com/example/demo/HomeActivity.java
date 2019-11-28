package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;

public class HomeActivity extends AppCompatActivity {

    private Country country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        country = getIntent().getParcelableExtra("name");

        System.out.println("Title:-" + country.getTitle());
    }
}
