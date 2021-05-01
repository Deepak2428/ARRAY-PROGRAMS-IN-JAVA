import java.io.*;
import java.util.*;

public class Twoarraydifference{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int a[]=new int [n];
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
     if(m>n)
    {
        int c[]=new int[m];
        int d[]=new int[m];
        int i=0;
        for( i=0;i<m-n;i++)
        {
            c[i]=0;
        }
        for(int k=0;i<m;i++,k++)
        {
            c[i]=a[k];
        }
        for(i=m-1;i>=0;i--)
        {
            if(b[i]<c[i])
            {
                b[i]+=10;
                if(i-1>=0){
                b[i-1]--;}
                d[i]=b[i]-c[i];
            }
            else
            {
                d[i]=b[i]-c[i];
            }
        }
        int flag=0;
        for( i=0;i<m;i++)
        {
            if(d[i]!=0)
            {
                flag=1;
            }
            if(flag==1){
            System.out.println(d[i]);}
        }
    }
 }

}