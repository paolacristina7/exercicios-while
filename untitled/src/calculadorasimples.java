import java.util.Scanner;

public class calculadorasimples {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite um number");
        int numero1= sc.nextInt();
        IO.println("Digite outro number");
        int opcão=0;
        int numero2= sc.nextInt();
        int calculo =0;
        do {
            IO.println("veja uma opção para continuar");
            IO.println("somar(1)");
            IO.println("subtrair(2)");
            IO.println("multiplicar(3)");
            IO.println("dividir(4)");
            IO.println("sair(5)");
            opcão= sc.nextInt();
            if (opcão==1){
                calculo = numero2+numero1;
                IO.println("A soma é igual a :"+ calculo);

            } else if (opcão==2) {
                calculo = numero2-numero1;
                IO.println("A subtração é igual a:"+ calculo);

            } else if (opcão==3) {
                calculo = numero2*numero1;
                IO.println("A multiplicação é igual a:"+ calculo);

            }else if (opcão==4){
                calculo = numero2/numero1;
                IO.println("A divisão é igual a:"+ calculo);

            } else if (opcão==5) {
            }else {
                IO.println("alternativa incorreta");
            }
        }while (opcão!=5);

    }}