import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
// a variável "n" vai abrigar o número escolhido pelo o usuário.
// a variável "x" vai variar de 0 a 10 após sua repetição.
        int n;
        int x;
        
        
// Esse comando vai pedir um número ao usuário e irá ler, guardando-o na variável "n".

     System.out.printf("Digite um número! ");
     n = ler.nextInt();
     System.out.print("A Tabuada de Multiplicação desse número é: "+"\n");
 
// x começará a partir do número 0 e deverá ser igual ou menor do que 10, de maneira que a cada repetição do bloco "for" ele aumente seu valor de um em um.

     for(x = 0; x <= 10; x++){
//dentro do bloco adicionamos os sinais que desejamos de acordo com sua tabuada e os posicionamos junto com as variáveis.
       System.out.print(n + "×" + x + "=");

// e por fim, imprimos na tela a operação das variáveis da tabuada que queremos

       System.out.println(x * n);
 
     }
     
     System.out.print("_______________"+"\n");
     
   }
    
}

// Para melhor entendimento, rode o código e leia os comando atentamente! （ つ﹏╰）