package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

//String[] number = {"Mubarak"};

        Hero[] heroes = {magic, medic, warrior};
        for (int i = 0; i < heroes.length; i = i + 1) {
            heroes[i].applySuperAbiliti("");

        }

    }
}





















