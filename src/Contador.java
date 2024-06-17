import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o seugndo numero: ");
        int numero2 = sc.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
          System.out.println("O segundo numero tem que ser maior que o primeiro");
        }

    }

    static void contar (int numero1, int numero2) throws ParametrosInvalidosException{
        if (numero1 >= numero2) {throw new ParametrosInvalidosException();
        }else {int contagem = numero2 - numero1;
        for(int nContado = 1; nContado <= contagem; nContado++){
            System.out.println("Numero " + nContado);}
        }    
    }
}
