package com.example.karimabounassif.pwkeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;


public class MainScreen extends AppCompatActivity {


    ArrayAdapter<String> listAdapter;
    ArrayAdapter<String> encryptedAdapter;
    ArrayList<String> arrList;
    ArrayList<String> encrypted = new ArrayList<>();
    ArrayList<String> temp = new ArrayList<>();
    ListView displayList;
    boolean isEncrypted;
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
        encrypt encrypt = new encrypt();
        if(!isEncrypted) {
            temp.addAll(arrList);
            if (arrList.size() != 0) {
                for (String s : arrList) {
                    encrypted.add(encrypt.encrypts(s));
                }
                listAdapter.clear();
                listAdapter.addAll(encrypted);
                listAdapter.notifyDataSetChanged();
                encrypted.clear();
                isEncrypted=true;
            }
        }
        else if(isEncrypted){
            listAdapter.clear();
            arrList.clear();
            listAdapter.addAll(temp);
            listAdapter.notifyDataSetChanged();
            arrList.addAll(temp);
            isEncrypted = false;
            //TODO: make this delete the encrypted data so clicking encrypt twice doesnt just double the list.
        }
    }
}
