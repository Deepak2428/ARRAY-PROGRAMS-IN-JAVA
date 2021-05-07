/*  PROGRAM TO FIND SUM OF TWO ARRAYS . ARRAYS MAY HAVE DIFFRENET SIZE */
/*  SUM OF ARRAYS WILL FOLLOW DECIMAL ADDITION i.e  IF SUM OF TWO ELEMENTS OF ARRAY IS GREATER THAN 10 THEN IT WILL PASS A CARRY TO THE PREVIOUS ELEMENT.*/
/* ADDITION WILL DONE FROM RIGHT TO LEFT*/
/*EG: A[]= {1,2,3,4,5}
      B[]={6,7,8}
      OUTPUT : 13023
           
            12345
           +00678
     ANS    13023     SHOULD BE AN ARRAY */

import java.util.*;

public class Sumoftwoarray{

public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("\n enter size of first array : ");
    int n=scn.nextInt();
    int a[]=new int[n];
    System.out.print("\n fill array : ");
    // FIRST ARRAY INPUT 
    for(int i=0;i<n;i++)
    {
        a[i]=scn.nextInt();
    }
    System.out.print("\n enter size of second array : ");
    int m=scn.nextInt();
    int b[]=new int [m];
    System.out.print("\n fill array : ");
    // second array input
    for(int i=0;i<m;i++)
    {
        b[i]=scn.nextInt();
    }
    if(n>m)    // if size of first array is greater than second
    {
        int c[]=new int[n];     // creating third array of size same as that of first.
                                // eg  a[]= {1,2,3,4,5}
                                //     b[]={6,7,8}
                                // third array :  c[]={0,0,6,7,8}    i.e alligning the two arrays 
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
                c[i]=c[i]%10;                  //ADDING THE ELEMENTS OF ARRAY FROM RIGHT TO LEFT
                c[i-1]+=1;
            }
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(c[i]);           // PRINTING RESULTING ARRAY
        }
        
    }
    else if(n==m)         //IF SIZE IS SAME DIRECTLY ADDING
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
    else    // SECOND ARRAY SIZE IS GREATER THAN FIRST. DOING SAME THING AS DONE EARLIER
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
