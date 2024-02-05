package Python_Programs;

import java.util.Scanner;

public class pat {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    int a,b=n;
    for(int i=n;i>0;i--){
        a=n;
        for(int j=1;j<=n;j++){
            if(a==j){
                System.out.println(i);
                
            }
            else{
        System.out.print(i-1+" ");
        }
    }
        System.out.println();
    }
   } 
}
