package com.example.weathergo.Activitis;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weathergo.Adapter.TommorowAdapter;
import com.example.weathergo.Domains.TommorowDomain;
import com.example.weathergo.R;

import java.util.ArrayList;

public class TommorowActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTommorow;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        setVariable();
    }

    private void setVariable() {
        ConstraintLayout backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener (v -> startActivities(new Intent[]{new Intent(TommorowActivity.this, MainActivity.class)}));
    }

    private void initRecyclerView() {
        ArrayList<TommorowDomain> items =new ArrayList<>();

        items.add (new TommorowDomain("Sat", "storm", "Storm", 25,10));
        items.add (new TommorowDomain("Sun", "cloudy", "Rain_sunny", 24,16));
        items.add (new TommorowDomain("Mon", "cloudy_3", "Cloudy", 26,15));
        items.add (new TommorowDomain("Tue", "cloudy_sunny", "Cloudy_Sunny", 27,22));
        items.add (new TommorowDomain("Wen", "sun", "Sunny", 29,11));
        items.add (new TommorowDomain("Thu", "rainy", "Rainy", 22,10));

        recyclerView=findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        //recyclerView.setLayoutManager(new linearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapterTommorow= new TommorowAdapter(items);
        recyclerView.setAdapter(adapterTommorow);
    }

}
