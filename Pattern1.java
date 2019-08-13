import java.util.*;
import java.lang.*;

class Pattern1
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=1,q=1;
        for(int i=0;i<=n;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(m);
                if(k==i-1)
                {
                for(int j=0;j<(n*2-q)-2;j++)
                {
                    System.out.print(" ");
                }
                    for(int p=0;p<i;p++)
                    {
                    System.out.print(m);
                    m--;
                    }
                }
                m++;
            }
            q=i*2;
            System.out.println();
            m=1;
        }
    }
}
/*
Input:9
Output:
1                1
12              21
123            321
1234          4321
12345        54321
123456      654321
1234567    7654321
12345678  87654321
123456789987654321
end*/