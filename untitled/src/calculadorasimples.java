import java.util.Scanner;

public class calculadorasimples {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um numero");
        int numero1= sc.nextInt();
        IO.println("Digite outro numero");
        int numero2= sc.nextInt();
        int opcão=0;
        int conta=0;
        do {
            IO.println("Escolha uma opção para continuar");
            IO.println("Somar(1)");
            IO.println("Subtrair(2)");
            IO.println("Multiplicar(3)");
            IO.println("Dividir(4)");
            IO.println("Sair(5)");
            opcão= sc.nextInt();
            if (opcão==1){
                conta= numero2+numero1;
                IO.println("A soma é igual a :"+conta);

            } else if (opcão==2) {
                conta= numero2-numero1;
                IO.println("A subtração é igual a:"+conta);

            } else if (opcão==3) {
                conta= numero2*numero1;
                IO.println("A multiplicação é igual a:"+conta);

            }else if (opcão==4){
                conta= numero2/numero1;
                IO.println("A divisão é igual a:"+conta);

            } else if (opcão==5) {
            }else {
                IO.println("Opção inválida");
            }
        }while (opcão!=5);

    }
}