import java.util.*;

public class TailRecursive {
    int sum(int n){
        if(n==0)
        return 0;
        
        return n+sum(n-1);//tail recursive
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        TailRecursive a=new TailRecursive();
        int n=sc.nextInt();
        System.out.println(a.sum(n));
        sc.close();
    }
}
