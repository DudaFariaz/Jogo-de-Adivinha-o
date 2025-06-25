import java.util.Scanner; 
public class jogoAdvinhacao {

 public static void main(String[] args) {

 Scanner entrada = new Scanner(System.in);
 int numero = (int)(Math.random() * 101);
 int numDigitado=0;
 
do {
 System.out.println("Digite um numero de 0 a 100: ");
 numDigitado = entrada.nextInt();
 
 if (numDigitado > numero ) {
      System.out.println("Numero gerado é menor.");
 } else if (numDigitado < numero) {
    System.out.println("Numero gerado é maior.");
 } else {
    System.out.println("Voce acertou!!!");
 }
 
}while (numDigitado != numero);

 }
 }
