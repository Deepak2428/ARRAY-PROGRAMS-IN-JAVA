/* PROGRAM TO PRINT ALL SUBSETS OF AN ARRAY*/
/*ARRAY = 10 20 30 
  OUTPUT: 
 -    -   -
 -    -   30
 -    20  -
 -    20  30
 10   -   -
 10   -   30
 10   20  -
 10   20  30    */

import java.io.*;
import java.util.*;

public class SubSet{

public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("\n enter size of array : ");
    int n=scn.nextInt();
    int a[]=new int[n];
    System.out.print("\n enter elements in array : ");
    for(int i=0;i<n;i++)
    {
        a[i]=scn.nextInt();
    }
    int l=(int)Math.pow(2,n);
    System.out.print("\n output : \n");
    for(int i=0;i<l;i++)
    {
       int temp=i;
       String b="";
       int ct=n;
       while(ct>0)
       {
           b=Integer.toString(temp%2)+b;
           temp=temp/2;
           ct--;
       }
        for(int j=0;j<n;j++)
        {
            if(b.charAt(j)=='0')
            {
                System.out.print("-\t");
            }
            else
            {
                System.out.print(a[j]+"\t");
            }
        }
        System.out.println();
    }
 }

}
