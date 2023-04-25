package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :  ");
        int num1 = scanner.nextInt();
      int sum= 0;

      for (int i = 1 ; i<num1 ;i++)
      {
          if(num1 % i == 0)
          {
              sum = sum+ i;
          }
      }

      if(sum == num1)
      {
          System.out.println("Number is Perfect");
      }else {
          System.out.println("Number is not perfect");
      }

    }
}
