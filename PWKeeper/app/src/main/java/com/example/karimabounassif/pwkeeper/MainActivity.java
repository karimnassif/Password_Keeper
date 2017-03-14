package com.example.karimabounassif.pwkeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    /*
=====================MAIN=========================
     */
    public static void main(String[] args) {
    System.out.println("Not sure what goes in main");
    }

//=================Methods========================


//=================Utilities======================

    //Utility variables
    static Scanner request = new Scanner(System.in);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Pushes text to display box
    public void display(){
        if(checkPW(getPW())) {
            String passwords = Storage.displayPWList(Storage.keys);
            TextView display = (TextView) findViewById(R.id.display);
            display.setText(passwords);
        }
    }

    //gets password from password textfield
    public String getPW() {
        final EditText edit = (EditText) findViewById(R.id.initialPW);
        return edit.getText().toString();
    }

    //Checks for pw and returns true or false
    public static boolean checkPW(String login){
        if(!login.equals(Storage.passwords[0])){
            for(int x=1;x<=Storage.passwords.length;x++){
                if(login.equals(Storage.passwords[x])){
                    String text ="This is an old password. Try again: ";
                    return false;
                }
            }
            String text = "Wrong password dipshit.";
            return false;
        }
        return true;
    }



}
