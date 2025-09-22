import java.util.Scanner;
public class Produto{
    private String nome;
    private double preço;
    private int codigo;

    public Produto (String nome, double preço, int codigo) {
        this.nome = nome;
        this.preço = preço;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public double getPreço() {
        return preço;
    }
    public int getCodigo() {
        return codigo;
    }

    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preço=" + preço +
                ", codigo=" + codigo +
                '}';
    }
}
