import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num[] = new int[5], result;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o 1º nuúmero de 5: ");
        num[0]= in.nextInt();
        System.out.println("Informe o 2º nuúmero de 5: ");
        num[1] = in.nextInt();
        System.out.println("Informe o 3º nuúmero de 5: ");
        num[2] = in.nextInt();
        System.out.println("Informe o 4º nuúmero de 5: ");
        num[3] = in.nextInt();
        System.out.println("Informe o 5º nuúmero de 5: ");
        num[4] = in.nextInt();

        result = (num[0]+num[1]+num[2]+num[3]+num[4])/5;

        System.out.println("A média dos dois números é: " +result);
    }
}