package com.example.karimabounassif.pwkeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainScreen extends AppCompatActivity {


    ArrayAdapter<String> listAdapter;
    ListView displayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen2);

        //Defining ListView that displays pw's and its adapter.
        //Adapter takes stored passwords from Storage.java
        //Storage.keys is the list and Store.displayPWList turns it into an ArrayList which is the needed format.
        displayList = (ListView) findViewById(R.id.display);
        ArrayList<String> arrList;
        arrList = Storage.displayPWList(Storage.keys);
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, arrList);
        displayList.setAdapter(listAdapter);

    }


        //Method to add passwords that goes with the add button (duh).
    public void addPW(View view)
    {

    }

}
