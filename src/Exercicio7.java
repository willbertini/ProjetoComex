import java.util.Calendar;

public class Exercicio7 {
    public static void main(String[] args) {
        String nomeCliente1 = "Fulano";
        String nomeCliente2 = "Ciclano";
        int dataNascimentoCliente1 = 1980;
        int dataNascimentoCliente2 = 2000;
        String classEtariaCliente1;
        String classEtariaCliente2;

        String anoAtual = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
        int idadeCliente1 = Integer.parseInt(anoAtual) - dataNascimentoCliente1;
        int idadeCliente2 = Integer.parseInt(anoAtual) - dataNascimentoCliente2;


        if ( idadeCliente1 <= 17) {
            classEtariaCliente1 = "ADOLESCENTE";
        } else if (idadeCliente1 >= 18 && idadeCliente1 <= 29){
            classEtariaCliente1 = "JOVEM";
        } else if (idadeCliente1 >= 30 && idadeCliente1 <= 59){
            classEtariaCliente1 = "ADULTO";
        } else {
            classEtariaCliente1 = "IDOSO";
        }

        if ( idadeCliente2 <= 17) {
            classEtariaCliente2 = "ADOLESCENTE";
        } else if (idadeCliente1 >= 18 && idadeCliente1 <= 29){
            classEtariaCliente2 = "JOVEM";
        } else if (idadeCliente1 >= 30 && idadeCliente1 <= 59){
            classEtariaCliente2 = "ADULTO";
        } else {
            classEtariaCliente2 = "IDOSO";
        }

        System.out.println(">>> Listagem dos Clientes");
        System.out.println("____________________________________");
        System.out.println("Nome:" + nomeCliente1);
        System.out.println("Data de Nascimento: " + dataNascimentoCliente1);
        System.out.println("Característica Etária: " + classEtariaCliente1);
        System.out.println("____________________________________");
        System.out.println("Nome:" + nomeCliente2);
        System.out.println("Data de Nascimento: " + dataNascimentoCliente2);
        System.out.println("Característica Etária: " + classEtariaCliente2);
    }
}
