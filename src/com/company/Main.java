package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        double[] day = {5.1, -3.8, -0.2, 3.3, -1.6, 5.4, 3.1, 8.2, 2.2, 5.4, 1.3, -2.5, 6.1, -8.6, 3.2};
        double result = 0;
        int i =0;
        boolean negetive =false;
        for (double a: day) {
            if (a > 0 && negetive){
                result +=a;
                i++;
                System.out.println(a);
            }else {
                negetive = true;
                continue;
            }
        }
      System.out.println(result / i);

        System.out.println("-------------------------------------------------------");
        word(day);

    }
    public static void word(double[]a){
        int size =a.length;
        for (int i = 0; i <size -1; i++) {
            for (int j = 0; j <size -i -1; j++) {
                if (a[j] > a[j +1]) {
                    double c = a[j];
                    a[j]=a[j + 1];
                    a[j+1] = c;

                }

            }
        }
          System.out.println(Arrays.toString(a));
    }
    }





















