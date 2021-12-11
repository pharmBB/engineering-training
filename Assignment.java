package com.blessying;
      // first list number of items
      //open two variables and call them even and odd number each
      // run through the loop and check for the one which %2 != 0 and call that and odd number
public class Assignment {
          public static void main(String[] args) {
              int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
              int evenNumber = 0;
              int oddNumber = 0;

              for (int i = 0; i < number.length; i++)
                  if (number[i] % 2 == 0)
                      System.out.print(evenNumber + number[i] + ",");


          }
      }


