package com.example.satriadimaspermana.tes_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Model> modelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private  MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);
        adapter = new MyAdapter(modelList);
        recyclerView.setAdapter(adapter);

        listModel();
    }

    private void listModel(){
        Model model;
        model = new Model("ali", "banyuwangi");
        modelList.add(model);
        model = new Model("budi", "blitar");
        modelList.add(model);
        model = new Model("wawan", "jember");
        modelList.add(model);
        model = new Model("riski", "ngawi");
        modelList.add(model);
        model = new Model("alfin", "malang");
        modelList.add(model);
        model = new Model("feri", "kudus");
        modelList.add(model);

        adapter.notifyDataSetChanged();
    }
}
