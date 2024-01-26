import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x ;
        x = sc.nextInt();

        if (x >= 0) {
            System.out.println("O número digitado não é negativo");
        } else {
            System.out.println("O número digitado é negativo");
        }

        sc.close();
    }  
}
