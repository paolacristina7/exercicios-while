import java.util.Scanner;

public class senhasimples{
void main() {
    Scanner sc = new Scanner(System.in);
    int senha;
    do{
        IO.println("Digite a senha: ");
        senha = sc.nextInt();
    }while(senha != 1234);
    IO.println("Acesso permitido!");
} }