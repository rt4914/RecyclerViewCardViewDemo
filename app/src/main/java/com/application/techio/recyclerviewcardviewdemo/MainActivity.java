package com.application.techio.recyclerviewcardviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMain;
    RecyclerView.Adapter rvAdapter;
    RecyclerView.LayoutManager rvLM;

    //More on ArrayList
    ArrayList<MainModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = (RecyclerView)findViewById(R.id.rvMain);

        arrayList.add(new MainModel("Cupcake","1.5"));
        arrayList.add(new MainModel("Donut", "1.6"));
        arrayList.add(new MainModel("Eclair", "2.0 – 2.1"));
        arrayList.add(new MainModel("Froyo","2.2 – 2.2.3"));
        arrayList.add(new MainModel("Gingerbread","2.3 – 2.3.7"));
        arrayList.add(new MainModel("Honeycomb", "3.0 – 3.2.6"));
        arrayList.add(new MainModel("Ice Cream Sandwich", "4.0 – 4.0.4"));
        arrayList.add(new MainModel("Jelly Bean", "4.1 – 4.3.1"));
        arrayList.add(new MainModel("KitKat", "4.4 – 4.4.4"));
        arrayList.add(new MainModel("Lollipop", "5.0 – 5.1.1"));
        arrayList.add(new MainModel("Marshmallow", "6.0 – 6.0.1"));
        arrayList.add(new MainModel("Nougat", "7.0"));

        rvAdapter = new MainAdapter(arrayList,MainActivity.this);
        //Explain this
        rvMain.setHasFixedSize(true);
        //For linear Orientation
        rvLM = new LinearLayoutManager(this);
        //For Grid Orientation: 3 = number of columns
        //rvLM = new GridLayoutManager(this,3);
        //For StaggeredGrid
        //rvLM = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

        rvMain.setLayoutManager(rvLM);
        rvMain.setAdapter(rvAdapter);
    }
}
