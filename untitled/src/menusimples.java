import java.util.Scanner;

public class menusimples {
    void main(){
        Scanner sc =new Scanner(System.in);
        int sair = 0;
        do{
            IO.println("Escolhe o que voce deseja: ");
            IO.println("(1)Olá |(2)Boa escolha|(3)sair");
            int atitude = sc.nextInt();

            if(atitude ==1){
                IO.println("Olá!");

            }else if (atitude == 2) {
                IO.println("é hora de arrasar");

            }else if (atitude == 3){
                sair += atitude;

            }else
                IO.println("na real que nao tem.");

        }while( sair !=3);
        IO.println("Saiu");
    }
}