/* PROGRAM TO PRINT ALL SUBSETS OF AN ARRAY*/
/*ARRAY = 10 20 30 
  OUTPUT: 
 10
 10 20
 10 20 30
 20
 20 30
 30
           */




import java.io.*;
import java.util.*;

public class SubArray{

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
    System.out.print("\n\n OUTPUT: \n");
    for(int i=0;i<n;i++)
    {
        
        for(int j=i;j<n;j++)
        {
            for(int k=i;k<=j;k++)
			{
                System.out.print(+a[k]+"\t");
			}
             System.out.println();
        }
    }
 }

}
