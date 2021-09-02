package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {
        double[] day = {5.1, -3.8, -0.2, 3.3, -1.6, 5.4, 3.1, 8.2, 2.2, 5.4, 1.3, -2.5, 6.1, -8.6, 3.2};
        double result = 0;
        int i =0;
        boolean negetive =false;
        for (double a: day) {
            if (a > 0 && negetive){
                result +=a;
                System.out.println(a);


            }else {
                negetive = true;
                continue;
            }
        }
        System.out.println(result / i);
    }

    }



















