package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int sum2 = 0;
        while (true)
        {
            String a = reader.readLine();
            if (a.equals("-1")) break;
            else
            {
                sum++;
                sum2 += Integer.parseInt(a);
            }
        }

        System.out.println((sum2*1.0)/sum*1.0);
        //напишите тут ваш код
    }
}

