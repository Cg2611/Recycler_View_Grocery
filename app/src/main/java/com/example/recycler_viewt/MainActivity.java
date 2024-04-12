package com.example.recycler_viewt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    //1.Adapter View
    RecyclerView recyclerView;

    //2.Data Source
    List<Item> itemList;

    //3.Adapter
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        itemList= new ArrayList<>();

        Item item1 = new Item(R.drawable.fruit,"Fruits", "Fresh Fruits from the Garden");
        Item item2= new Item(R.drawable.vegetables,"Vegetables", "Delecious Vegetables");
        Item item3= new Item(R.drawable.bread,"Bread", "Bread, wheat and beans");
        Item item4= new Item(R.drawable.beverages,"Beverages", "Juice, Tea, Carbonated Water");
        Item item5= new Item(R.drawable.milk,"Milk", "Milk, Shakes, Yougurt");
        Item item6= new Item(R.drawable.popcorn,"Snacks","PopCorn, Donut and Drinks");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter=new MyAdapter(itemList);
        recyclerView.setAdapter((myAdapter));



    }
}