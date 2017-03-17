package com.example.karimabounassif.pwkeeper;

import java.util.*;


/**
 * Created by karimabounassif on 3/13/17.
 */

/*Class where we will store the keys locally. Didn't put protection since they will be saved on the phone itself so
I didn't think its neccesary, but if you think we do go nuts bruh. Right now very simple/not worthy of its own class,
but since down the line methods might be added I made it a class.
It is a private package which doesn't do much but it can't be accessed just anywhere.
*/

class Storage {
    //Note: Normally we retrieve the encrypted pw and use keys to decrypt locally, for now just saving pws in keys.
    static HashMap<String, String> keys = new HashMap<String, String>();

    static String[] passwords = {"password", "12345"};

    //Will display list of all password/password types. Can decide if this should show encrypted or decrypted.
    public static ArrayList<String> displayPWList(HashMap<String, String> passwords) {
        populate(passwords);
        ArrayList<String> lists = new ArrayList<String>();
        int x = 0;
        for (Map.Entry<String, String> pw : passwords.entrySet()) {
            String key = pw.getKey();
            String value = pw.getValue();
            lists.add((key + " : " + value + "\n"));
        }
        return lists;
    }


    //Populating password hm for testing (this only works in a class idk why)
    public static void populate(HashMap keys) {
        keys.put("Facebook password", "12345");
        keys.put("Twitter password", "12345");
        keys.put("I like big butts", "and I cannot lie");
    }
}
