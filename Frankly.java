package com.blessying;

public class Frankly {
    public static void main(String args[])
    {
        int a[] = {0,1,1,0,0,1,1,1,0,1,1,0,0,1,0,1,1};   //Declare and Initialize an array
        int red=0;           //Declare variable to count the number of elements in an array and initialize it to 0
        int white=0;           //Declare variable to count the number of elements in an array and initialize it to 0

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
                red++;
            else
                white++;






        }

        System.out.println(red);
        System.out.println(white);

    }
}
