import java .util.*;
class smallestnonsum
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		int n=0;
		System.out.print("\n\n ENTER LIMIT OF ARRAY : ");
		n=scn.nextInt();
		int a[]=new int[n];
		long ans=1;
        for(int i=0;i<n;i++)
        {
			a[i]=scn.nextInt();
            if(a[i]==ans)
            {
                ans++;
            }
        }
        if(ans==1)
        {
            System.out.print("\n\n ANSWER IS : 1");
			return;
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum=a[i]+a[j];
                if(sum==ans)
                {
                    ans++;
                }
            }
            int sum2=a[i];
            for(int j=i+1;j<n;j++)
            {
                sum2=sum2+a[j];
            }
            if(sum2==ans)
            {
                ans++;
            }
        }
		System.out.print("\n\n ANSWER IS : "+ans);
	}
}
		
		