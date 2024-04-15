import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println(">>>>Cabeçalho Dinâmico");
        System.out.println("Informe o valor da varíavel: ");
        int valorVariavel = leitura.nextInt();
        char[] cabecalho = new char[valorVariavel];

        int i = 0;
        while (i < valorVariavel){
            cabecalho[i] = '*';
            System.out.print(cabecalho[i]);
            if (i == (cabecalho.length - 1)) {
                System.out.println("\nBem vindo ao Comex");
            }
            i++;
        }

        i = 0;
        while (i < valorVariavel){
            cabecalho[i] = '*';
            System.out.print(cabecalho[i]);
            i++;
        }
    }
}
