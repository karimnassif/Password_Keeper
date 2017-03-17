package com.example.karimabounassif.pwkeeper;

import java.util.Hashtable;

public class rotor {
    char[] setup;
    char[] reverse;
    int notch;

    public rotor(char[] letters, char[] reverse, int turn)  //constructor

    {
        this.setup=letters;
        this.reverse=reverse;
        this.notch=turn;
    }

    public rotor[] chooseRotors(rotor rotor1, rotor rotor2, rotor rotor3)  //setting an array of the rotors user chooses to use
    {
        rotor[] chosenRotors = new rotor[3];
        chosenRotors[0]=rotor1;
        chosenRotors[1]=rotor2;
        chosenRotors[2]=rotor3;
        return chosenRotors;
    }
}
