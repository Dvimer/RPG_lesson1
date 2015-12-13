package ru.dvimer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.*;
import java.io.*;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Main {
    public static void main(String[] args) throws Exception {

        Player[] gamepPayer = new Player[3];
        Player player1 = new Player("Леха истребитель вампироидов!!!", 10, 10, 1, 100);
        Player player2 = new Player("Lich", 10, 10, 1, 100);
        Player player3 = new Player("Vetarium", 10, 10, 1, 100);
        gamepPayer[0]= player1;
        gamepPayer[1]= player2;
        gamepPayer[2]= player3;


        Monster ogr = new Monster("Rubi" , 10 , 10 ,1, 100);

        System.out.println("Имя бойца: " + player1.getName() + " Сила: " + player1.getAttake() + " защита: "+ player1.getDefference() + " жизней: " + player1.getHp() );
        System.out.println("Имя бойца: " + player2.getName() + " Сила: " + player2.getAttake() + " защита: "+ player2.getDefference() + " жизней: " + player2.getHp() );
        System.out.println("Имя бойца: " + player3.getName() + " Сила: " + player3.getAttake() + " защита: "+ player3.getDefference() + " жизней: " + player3.getHp() );
        System.out.println(gamepPayer[0]);
        System.out.println("Prvivet");


    }
}