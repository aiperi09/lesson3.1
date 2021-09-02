package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        double[] day = {5.1, -3.8, -0.2, 3.3, -1.6, 5.4, 3.1, 8.2, 2.2, 5.4, 1.3, -2.5, 6.1, -8.6, 3.2};
        for (int i = 0; i < day.length;i++) {
            if (day[i]<0){
                continue;
        }
            double result = 0;
            for (double a:day) {
                result +=a;


            }
                System.out.println(Arrays.toString(day) +"=" +(+ result / day.length));


        }

        }




        }


















