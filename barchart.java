import java.io.*;
import java.util.*;

public class barchatarray{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int a[]= new int[n];
    int max=-1;
    for(int i=0;i<n;i++)
    {
        a[i]=scn.nextInt();
        if(a[i]>max)
        {
            max=a[i];
        }
    }
    for(int i=0;i<max;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(max-a[j]>i)
            {
                System.out.print("\t");
            }
            else
            {
                System.out.print("*\t");
            }
        }
        System.out.println();
    }
 }

}