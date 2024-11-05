import java.util.*;
public class KnapsackDP{
    public static int KnapsackDP(int W,int[] weights,int[] values,int items){

        int table[][]=new int[items+1][W+1];

        for(int i=0;i<=items;i++){
            for(int w=0;w<=W;w++){

                if(i==0 || w==0){
                    table[i][w]=0;
                }
                else if(weights[i-1]<=w){
                    table[i][w]=Math.max(values[i-1]+table[i-1][w-weights[i-1]],table[i-1][w]);
                }
                else{
                    table[i][w]=table[i-1][w];
                }
            }
        }
        return table[items][W];

    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
       
        System.out.print("Enter Values of items:");
        String intVal=sc.nextLine();
        String[] valArray=intVal.split(" ");
        int[] values=new int[valArray.length];

        for(int i=0;i<valArray.length;i++){
            values[i]=Integer.parseInt(valArray[i].trim());
        }

        System.out.print("Enter Weights of items:");
        String intWeight=sc.nextLine();
        String[] weightsArray=intWeight.split(" ");
        int[] weights=new int[weightsArray.length];

        for(int i=0;i<weightsArray.length;i++){
            weights[i]=Integer.parseInt(weightsArray[i].trim());
        }

        System.out.print("Enter Knapsack Capacity:");
        int W=sc.nextInt();

        int n=values.length;

        int max_profit=KnapsackDP(W,weights,values,n);
        System.out.println("Maximum Profit:"+ max_profit);
        sc.close();
    }
    
}