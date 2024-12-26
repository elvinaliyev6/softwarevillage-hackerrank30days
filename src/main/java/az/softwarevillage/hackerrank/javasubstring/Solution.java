package az.softwarevillage.hackerrank.javasubstring;

import java.util.Scanner;

public class Solution {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           int a=sc.nextInt();
           int b=sc.nextInt();
           int n=sc.nextInt();
            int two=1;
            int cem= a+b;
           for (int i=0;i<n;i++){


                   two*=2;
               System.out.println(cem);

               cem=cem+(b*two);
           }

        }
    }

