package br.pc.oo.algaworks.desafio6_13;

import java.math.BigDecimal;

public class Cargo {

    private String descricao;
    private BigDecimal salario;

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "descricao='" + descricao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
