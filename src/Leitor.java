import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Leitor {
    /**
     * Lê um inteiro, tendo em conta os mínimos e máximos introduzidos.
     */
    public static int lerInteiro(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        int input = -1;
        do {
            try {
                if (scanner.hasNextInt()) {
                    input = scanner.nextInt();
                } else {
                    throw new InputMismatchException("Valor invalido, introduza um valor inteiro: ");
                }

                if (input < min || input > max) {
                    throw new InputMismatchException("Valor invalido, introduza um valor entre " + min + " e " + max + ": ");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            scanner.nextLine();
        } while (input < min || input > max || input == -1);

        return input;
    }

    /**
     * Lê um long, tendo em conta os mínimos e máximos introduzidos.
     */
    public static long lerLong(long min, long max) {
        Scanner scanner = new Scanner(System.in);

        long input = -1;
        do {
            try {
                if (scanner.hasNextLong()) {
                    input = scanner.nextLong();
                } else {
                    throw new InputMismatchException("Valor invalido, introduza um valor inteiro: ");
                }

                if (input < min || input > max) {
                    throw new InputMismatchException("Valor invalido, introduza um valor entre " + min + " e " + max + ": ");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            scanner.nextLine();
        } while (input < min || input > max || input == -1);

        return input;
    }

    /**
     * Lê um double, tendo em conta os mínimos e máximos introduzidos.
     */
    public static double lerDouble(double min, double max) {
        Scanner scanner = new Scanner(System.in);

        double input = -1;
        do {
            try {
                if (scanner.hasNextDouble()) {
                    input = scanner.nextDouble();
                } else {
                    throw new InputMismatchException("Valor invalido, introduza um valor decimal: ");
                }

                if (input < min || input > max) {
                    throw new InputMismatchException("Valor invalido, introduza um valor entre " + min + " e " + max + ": ");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            scanner.nextLine();
        } while (input < min || input > max || input == -1);

        return input;
    }
}