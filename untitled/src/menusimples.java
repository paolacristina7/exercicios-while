public class menusimples {
}    void main(){
    Scanner sc =new Scanner(System.in);
    int sair = 0;
    do{
        IO.println("Escolhe o que voce quer faze: ");
        IO.println("(1)Dizer Olá |(2)Joinha|(3)sair");
        int acao = sc.nextInt();

        if(acao ==1){
            IO.println("Olá");

        }else if (acao == 2) {
            IO.println("👍");

        }else if (acao == 3){
            sair += acao;

        }else
            IO.println("Não temos Essa Opção.");

    }while( sair !=3);
    IO.println("Voce saiu");

}

