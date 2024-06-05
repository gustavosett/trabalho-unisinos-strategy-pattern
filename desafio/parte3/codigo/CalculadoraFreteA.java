

public class CalculadoraFreteA implements CalculadoraFrete {

    @Override
    public double calcularFrete(Exemplar exemplar, Endereco endereco) {
        double valorPorKg = 0.5; // valor por quilo
        double valorDimensoes = 0.1; // valor por dimensão

        double peso = exemplar.getPeso();
        double[] dimensoes = exemplar.getDimensoes();
        double somaDimensoes = 0;
        for (double dimensao : dimensoes) {
            somaDimensoes += dimensao;
        }

        double frete = (peso * valorPorKg) + (somaDimensoes * valorDimensoes);

        return frete;
    }
}
