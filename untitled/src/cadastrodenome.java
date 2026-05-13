import java.util.Scanner;

public class cadastrodenome {
    static void main() {
    Scanner sc = new Scanner(System.in);
    String input;
    int q=0;

    do {
        System.out.println("Qual input gostaria de cadastrar? (digite sair pra sair)");
        input = sc.nextLine();
        q++;
    } while (!input.equals("sair"));
    System.out.println("Total de nomes cadastrados: "+(q-1));
}
}