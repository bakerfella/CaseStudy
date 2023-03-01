import java.util.Scanner;

public class Transaction {
    private Product product;
    private double valueInserted;
    private double change;

    public static void executeTransaction(Product product, ) {
        int option = 0;

        System.out.println("Bem-vind@ à maquina de sumos, selecione o produto que pretende");
        option = menu();

        switch (option) {
            case 1:

        }


    }
    public static int menu () {
        System.out.println("\n\t1. Coca-cola 0.70€");
        System.out.println("\n\t2. Pepsi 0.65€");
        System.out.println("\n\t3. Ice Tea 0.60€");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}
