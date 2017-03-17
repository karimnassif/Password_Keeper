package com.example.karimabounassif.pwkeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.*;

import static com.example.karimabounassif.pwkeeper.R.id.login;

public class MainActivity extends AppCompatActivity {

//=================Initializations======================

    Storage storage = new Storage();

//=================Widget Methods========================


//=================Utilities======================

    //Utility variables
    static Scanner request = new Scanner(System.in);


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Pushes text to display box
    public void login(View view) {
        Intent login = new Intent(this, MainScreen.class);
        if (checkPW()) {
            startActivity(login);
        }

    }

    //Checks for pw and returns true or false
    public boolean checkPW() {
        EditText attempt = (EditText) findViewById(R.id.initialPW);
        TextView display = (TextView) findViewById(R.id.display);
        String login = attempt.getText().toString();
        if (!login.equals(Storage.passwords[0])) {
            for (int x = 1; x < Storage.passwords.length; x++) {
                if (login.equals(Storage.passwords[x])) {
                    display.setText("Old password");
                    return false;
                }
            }
            display.setText("Wrong password");
            return false;
        }
        return true;
    }
}


