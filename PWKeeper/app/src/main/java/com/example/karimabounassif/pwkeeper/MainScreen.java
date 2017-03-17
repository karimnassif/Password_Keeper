package com.example.karimabounassif.pwkeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainScreen extends AppCompatActivity {


    ArrayAdapter<String> listAdapter;
    ArrayAdapter<String> encryptedAdapter;
    ArrayList<String> arrList;
    ArrayList<String> encrypted = new ArrayList<>();
    ListView displayList;
    encrypt encrypt = new encrypt();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen2);

        //Defining ListView that displays pw's and its adapter.
        //Adapter takes stored passwords from Storage.java
        //Storage.keys is the list and Store.displayPWList turns it into an ArrayList which is the needed format.
        displayList = (ListView) findViewById(R.id.display);

        arrList = Storage.displayPWList(Storage.keys);
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, arrList);
        displayList.setAdapter(listAdapter);


    }


        //Method to add passwords that goes with the add button (duh).
    public void addPW(View view)
    {
        //Open new screen? Ask for new password and description, merge them to a single String, then add them
        //by using listAdapter.add(Their shit);
    }

    public void encrypt(View view) {
        //Loop through all current passwords and run appropriate encryption (different file) on each.
        //Clicking the button a second time should then decrypt them.


        //if (encrypted.size() != arrList.size()) {
        if (arrList.size() != 0) {
            for (String s : arrList) {
                encrypted.add(encrypt.encrypts(s));
            }
            encryptedAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, encrypted);
            displayList.setAdapter(encryptedAdapter);
            //}
        }
    }
}
