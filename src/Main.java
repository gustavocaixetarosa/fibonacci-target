import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numeroEscolhido = parseInt(scanner.nextLine());

        System.out.println(Fibonnaci.pertence(numeroEscolhido));
    }
}