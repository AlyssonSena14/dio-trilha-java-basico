package Set.OrdenacaoSet;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;

public class Produto implements Comparable<Produto> {
    private long codigo;
    private String name;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String name, double preco, int quantidade) {
        this.codigo = codigo;
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public long getCodigo() {
        return codigo;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "Produto " +
                "codigo = " + codigo +
                " , name = " + name + '\'' +
                ", preco = " + preco +
                ", quantidade = " + quantidade +
                '}';
    }
    public int compareTo(Produto p) {
        return name.compareToIgnoreCase(p.getName());
    }
}
class comparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
