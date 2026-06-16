import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        if(temperature>=30){
            System.out.print("Fan ON");
        }else{
            System.out.print("Fan OFF");
        }
        
    }
}