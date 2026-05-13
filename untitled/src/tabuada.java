public class tabuada {
}  void main(){
    Scanner sc = new Scanner(System.in);

    int tabuada = 0;
    int numero;

    IO.println("\nmostre um numero para mostrar a tabuada dele:");
    numero = sc.nextInt();
    do {
        tabuada++;
        int resultado = numero * tabuada;
        IO.println("Resultado: " + tabuada + " x " + numero + " = " + resultado);
    } while (tabuada < 10);
}

