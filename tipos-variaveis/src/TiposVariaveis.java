import java.util.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // double salarioMinimo = 2500;

        // Tipos
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // Se começar com zero, o ideal é definir como string
        long cpf = 98765432109L; // Se começar com zero, o ideal é definir como string
        float pi = 3.14F;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        String meuNome = "Luan Marchi";

        // char é representado por apenas 1 caracter com aspas simples
        char sexo = 'M';

        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        ////////////////////////////////////////////////////////////

        // Variáveis x Constantes

        // Variável:
        int numero = 5;

        numero = 10;

        System.out.print(numero);

        // Constante:
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 3.15; // Esta linha vai acusar erro

    }
}
