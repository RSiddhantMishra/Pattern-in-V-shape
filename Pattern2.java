import java.util.*;
import java.lang.*;

class Pattern2
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=1;
        for(int i=n;i>=0;i--)
        {
            for(int k=(i);k>0;k--)
            {
                System.out.print(m);
                m++;
            }
            for(int j=0;j<(n-i)*2;j++)
            {
                System.out.print(" ");
            }
            m--;
            for(int p=0;p<i;p++)
            {
                System.out.print(m);
                m--;
            }
            m=1;
            System.out.println();
        }
    }
}
/*
Input:9
Output:
123456789987654321
12345678  87654321
1234567    7654321
123456      654321
12345        54321
1234          4321
123            321
12              21
1                1
end*/