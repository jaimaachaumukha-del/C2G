import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int  BATTERY= sc.nextInt();
         if(BATTERY<20){
            System.out.print("Charge Soon");
         }else{
            System.out.print("Battery OK");
         }
        
    }
}