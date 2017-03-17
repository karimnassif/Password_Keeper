package com.example.karimabounassif.pwkeeper;

import java.util.Hashtable;

/**
 * Created by Karimnassif on 5/1/2016.
 */

public class plugboard {

    Hashtable<Character, Character> ht=new Hashtable<>();

    public plugboard(Hashtable<Character, Character> hash)
    {
        this.ht=hash;
    }


    //Method to set plugboard: Feed it a plugboard and a char[] where every two chars next to each other are wired (a,b,c,d wires b to a, d to c
    public void setPlugboard(plugboard p, char[] a){
        int counter=0;
        while(a.length>1)
        {
            p.ht.put(a[counter], a[counter+1]);
            p.ht.put(a[counter+1],a[counter]);
            counter=counter+2;
        }
    }

}
