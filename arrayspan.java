import java.io.*;
import java.util.*;

public class arrayspan{

public static void main(String[] args) throws Exception {
    Scanner scn= new Scanner(System.in);
    int n=0;
    n=scn.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=scn.nextInt();
    }
    int min=a[0];
    int max=a[0];
    for(int i=1;i<n;i++)
    {
        if(a[i]<min)
        {
            min=a[i];
        }
        else if(a[i]>max)
        {
            max=a[i];
        }
    }
    System.out.println(+max-min);
 }

}