

public class Exemplar {
    private int codigo;
    private double[] dimensoes; // [comprimento, largura, altura] em centímetros
    private double peso; // em gramas

    public Exemplar() {
        dimensoes = new double[3]; // inicializa o array de dimensões
    }

    public Exemplar(int codigo, double comprimento, double largura, double altura, double peso) {
        this.codigo = codigo;
        this.dimensoes = new double[] { comprimento, largura, altura };
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double[] getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(double comprimento, double largura, double altura) {
        this.dimensoes[0] = comprimento;
        this.dimensoes[1] = largura;
        this.dimensoes[2] = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
