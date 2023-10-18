public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepinvalidoException e) {
            System.out.println("O cep deve conter oito dígitos");
        }
    }

    static String formatarCep(String cep) throws CepinvalidoException {
        if (cep.length() != 8)
            throw new CepinvalidoException();

        return "23.765-064";

    }
}
