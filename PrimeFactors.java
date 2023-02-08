import java.util.*;
import java.lang.*;
public class PrimeFactors
{
    static int temp = 10000000;
    static boolean[] arr = new boolean[temp];
    public static void main(String[] args) {
        for(int i=0;i<temp;i++)
            arr[i]=true;
        arr[0]=false;
        Arrays.fill(arr,true);
//        computePrimeFactors(24);
        for(int i=2;i<temp;i++)
        {
            if(arr[i] == true)
            {
                for(int j=2;j<temp;j++)
                {
                    if(i<(temp/j))
                    {
                        arr[i*j]=false;
                    }
                    else
                        break;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        computePrimeFactors(X);
    }

    public static void computePrimeFactors(int X) {
        int y=X;
        while(X>0)
        {
            if(arr[y]){
                System.out.print(y+" ");
                X-=y;
                y=X;
            }
            else
                y--;
        }
        return;
    }
}
