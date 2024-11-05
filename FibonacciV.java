import java.util.*;
public class FibonacciV{

    static int rec_step=0;
    public static int fibonacci(int n){
        rec_step++;
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void recursive(int n){
        for(int i=0;i<n;i++){
            rec_step=0;
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
        System.out.println("Recursive_Step_Count:"+rec_step);
    }

    public static void iterative(int n){
        int a=0,b=1;
        int itr_steps=0;
        for(int i=0;i<n;i++){
            System.out.print(a+ " ");
            itr_steps++;
            int c=a+b;
            a=b;
            b=c;

        }
        System.out.println();
        System.out.println("Iterative_Step_Count:"+itr_steps);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item for Recursive Sequence: ");
        int rec=sc.nextInt();
        recursive(rec);

        System.out.println("Enter item for Iterative Sequence: ");
        int itr=sc.nextInt();
        iterative(itr);


    }
}