package br.pc.oo.algaworks.desafio6_13;

public class Politico {

    private String nome;
    private Cargo cargo;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Politico{" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo +
                '}';
    }
}
