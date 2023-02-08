import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] input = new int[n];
        for (int i=0;i<n;i++){
            input[i]= scan.nextInt();
        }
        sortMyArray(input,n);

    }

    public static void sortMyArray(int [] input,int n) {

        Arrays.sort(input);
        int sum1 = 0, sum2 = 0;
        int i=0,j=1;
        ArrayList<Integer> s1 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();

        while (i<n && j<n){

            if (sum1>=sum2){
                sum1+=Math.min(input[i],input[j]);
                sum2+=Math.max(input[i],input[j]);
                s1.add(Math.min(input[i],input[j]));
                s2.add(Math.max(input[i],input[j]));
            }else{
                s1.add(Math.max(input[i],input[j]));
                s2.add(Math.min(input[i],input[j]));

                sum1+=Math.max(input[i],input[j]);
                sum2+=Math.min(input[i],input[j]);
            }
            i+=2;
            j+=2;


        }
        System.out.println(s1+"\n"+s2+"\n"+Math.abs(sum1-sum2));
        return;
    }
}