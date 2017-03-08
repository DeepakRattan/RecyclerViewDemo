package com.example.deepakrattan.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String[] title, desc;
    private int[] images;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private ListItem listItem;
    private ArrayList<ListItem> itemArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewById
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Data Source
        title = new String[]{"Title1", "Title2", "Title3", "Title4", "Title5", "Title6", "Title7", "Title8"};
        desc = new String[]{"Desc1", "Desc2", "Desc3", "Desc4", "Desc5", "Desc6", "Desc7", "Desc8"};
        images = new int[]{R.drawable.pic, R.drawable.pic, R.drawable.pic, R.drawable.pic, R.drawable.pic, R.drawable.pic, R.drawable.pic, R.drawable.pic};

        itemArrayList = new ArrayList<ListItem>();
        //Adding data items in ArrayList
        for (int i = 0; i < title.length; i++) {
            listItem = new ListItem(title[i], desc[i], images[i]);
            itemArrayList.add(listItem);
        }

        //adapter = new RecyclerAdapter(title, desc, images);
        adapter = new RecyclerAdapter(itemArrayList);
        recyclerView.setAdapter(adapter);


    }
}
