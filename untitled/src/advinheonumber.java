import java.util.Scanner;

public class advinheonumber {   static void main() {
    Scanner sc = new Scanner(System.in);
    int numero=42;
    int sugestao=0;
    do {
        IO.println("Digite um numero");
       sugestao= sc.nextInt();
    }while (sugestao!=numero);
    IO.println("arrasou!");
}}

