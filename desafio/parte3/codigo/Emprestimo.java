

import java.util.Date;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataEntregaPrevista;
    private Date dataEntregaRealizada;
    private CalculadoraFrete calculadoraFrete;
    private Exemplar exemplar;
    private Usuario usuario;

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataEntregaPrevista() {
        return dataEntregaPrevista;
    }

    public void setDataEntregaPrevista(Date dataEntregaPrevista) {
        this.dataEntregaPrevista = dataEntregaPrevista;
    }

    public Date getDataEntregaRealizada() {
        return dataEntregaRealizada;
    }

    public void setDataEntregaRealizada(Date dataEntregaRealizada) {
        this.dataEntregaRealizada = dataEntregaRealizada;
    }

    public CalculadoraFrete getCalculadoraFrete() {
        return calculadoraFrete;
    }

    public void setCalculadoraFrete(CalculadoraFrete calculadoraFrete) {
        this.calculadoraFrete = calculadoraFrete;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double calcularFrete() {
        if (calculadoraFrete == null || exemplar == null || usuario == null || usuario.getEndereco() == null) {
            throw new IllegalStateException("Dados do empréstimo incompletos para calcular o frete.");
        }
        return calculadoraFrete.calcularFrete(exemplar, usuario.getEndereco());
    }
}
