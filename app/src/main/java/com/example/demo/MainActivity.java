package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DemoAdapter demoAdapter;
    private List<Country> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recycle_view);
        demoAdapter = new DemoAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(demoAdapter);
        prepareData();
    }

    private void prepareData() {
        Country india = new Country("INDIA", R.drawable.in);
        list.add(india);
        Country pak = new Country("PAKISTAN", R.drawable.pk);
        list.add(pak);
        Country can = new Country("CANADA", R.drawable.ca);
        list.add(can);
        Country us = new Country("US", R.drawable.us);
        list.add(us);
        Country au = new Country("AUS", R.drawable.au);
        list.add(au);
        Country nz = new Country("NZ", R.drawable.nz);
        list.add(nz);
        Country india2 = new Country("INDIA", R.drawable.in);
        list.add(india2);

        Country india3 = new Country("INDIA", R.drawable.in);
        list.add(india3);

        demoAdapter.notifyDataSetChanged();
    }
}
