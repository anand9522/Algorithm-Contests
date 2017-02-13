package Java.LeetCode.WeeklyContest19;

import java.util.Scanner;

/**
 * Created by anand on 12/02/17.
 */
 class q1 {
    public String convertTo7(int num) {
        Scanner in = new Scanner(System.in);
        String n= Integer.toString(Math.abs(num),7);
        if (num<0){
            return "-"+n;
        }
        else {
            return n;
        }
    }
}