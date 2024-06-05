

public class TesteFrete {
    public static void main(String[] args) {
        // criando objetos
        Exemplar exemplar = new Exemplar(123, 20, 15, 5, 500);
        Endereco endereco = new Endereco(123, "Rua A", "Cidade B", "SP", "12345-678");
        Usuario usuario = new Usuario(456, "João", endereco);
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setExemplar(exemplar);
        emprestimo.setUsuario(usuario);

        // testando as calculadoras de frete
        CalculadoraFrete[] calculadoras = {
                new CalculadoraFreteA(),
                new CalculadoraFreteB(),
                new CalculadoraFreteC(),
                new CalculadoraFreteD() 
        };

        for (CalculadoraFrete calculadora : calculadoras) {
            emprestimo.setCalculadoraFrete(calculadora);
            double frete = emprestimo.calcularFrete();
            System.out.println("Frete " + calculadora.getClass().getSimpleName() + ": " + frete);
        }
    }
}
