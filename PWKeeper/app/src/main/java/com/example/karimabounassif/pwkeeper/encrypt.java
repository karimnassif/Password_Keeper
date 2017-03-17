package com.example.karimabounassif.pwkeeper;

import java.util.Hashtable;

/**
 * Created by karimabounassif on 3/17/17.
 */

public class encrypt {


    enigma enigma = new enigma();
    public String encrypts(String s)
    {
        return enigma.encrypt(s, enigma.setup, enigma.p, enigma.r, enigma.ht);
    }


}
