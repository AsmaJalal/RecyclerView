package com.asma.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button listBtn,gridBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is all ids
        recyclerView = findViewById(R.id.recyclerView);
        listBtn = findViewById(R.id.listBtn);
        gridBtn = findViewById(R.id.gridBtn);

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food("Simple Chicken Burger", R.drawable.burger));
        foods.add(new Food("Chicken Pizza", R.drawable.piza));
        foods.add(new Food("KFC Super Chicken Crispy", R.drawable.kfc));
        foods.add(new Food("Seven Layer Choco Creamy Cake", R.drawable.cake));
        foods.add(new Food("venla strawberry chocoholic Delight Ice Cream", R.drawable.icecream));
        foods.add(new Food("Strawberry Cream Roll", R.drawable.creamroll));
        foods.add(new Food("Chicken Biryani", R.drawable.biryani));
        foods.add(new Food("Mix Fruit Creamy chart", R.drawable.creamchat));
        foods.add(new Food("Chat patty Gpl Gapy", R.drawable.golggapy));
        foods.add(new Food("Chizu all chicken cheez", R.drawable.kfc2));
        foods.add(new Food("Fresh Fruit Chaat Desi maze", R.drawable.fruitchaat));


        FoodAdapter adapter = new FoodAdapter(this,foods);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        //  linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);

        listBtn.setOnClickListener(view -> recyclerView.setLayoutManager(linearLayoutManager));

        gridBtn.setOnClickListener(view -> recyclerView.setLayoutManager(gridLayoutManager));

        //you can changed "linearLayoutManager" to "gridLayoutManager" to set default
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);


    }



}