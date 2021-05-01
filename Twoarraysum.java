import java.io.*;
import java.util.*;

public class Twoarraysum{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=scn.nextInt();
    }
    int m=scn.nextInt();
    int b[]=new int [m];
    for(int i=0;i<m;i++)
    {
        b[i]=scn.nextInt();
    }
    if(n>m)
    {
        int c[]=new int[n];
        for(int i=0,k=0;i<n;i++)
        {
            if(i<n-m){
            c[i]=0;}
            else{
            c[i]=b[k];
            k++;}
        }
        for(int i=n-1;i>=0;i--)
        {
            c[i]+=a[i];
            if(c[i]>9)
            {
                c[i]=c[i]%10;
                c[i-1]+=1;
            }
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(c[i]);
        }
        
    }
    else if(n==m)
    {
        for(int i=n-1;i>=0;i--)
        {
            a[i]+=b[i];
            if(a[i]>9)
            {
                a[i]=a[i]%10;
                a[i-1]++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    else
    {
        int c[]=new int[m];
        for(int i=0,k=0;i<m;i++)
        {
            if(i<m-n)
            c[i]=0;
            else{
            c[i]=a[k];
            k++;}
        }
        for(int i=m-1;i>=0;i--)
        {
            c[i]+=b[i];
            if(c[i]>9)
            {
                c[i]=c[i]%10;
                c[i-1]++;
            }
        }
        for(int i=0;i<m;i++)
        {
            System.out.println(c[i]);
        }
    }
 }

}