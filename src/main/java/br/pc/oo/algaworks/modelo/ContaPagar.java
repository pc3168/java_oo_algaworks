package br.pc.oo.algaworks.modelo;

public class ContaPagar {


    private Fornecedor fornecedor;
    private String descricao;

    private double valor;

    private String dataVencimento;

    private SituacaoConta situacaoConta;

    public ContaPagar() {
        situacaoConta = SituacaoConta.PENDENTE;
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
        this();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public void pagar() {

        if(SituacaoConta.CANCELADA.equals(situacaoConta)){
            System.out.println(("Não é possivel pagar uma conta cancelada."));
            return;
        }else if (SituacaoConta.PAGA.equals(situacaoConta)){
            System.out.println(("Uma conta que já foi paga não pode ser paga novamente e nem cancelada."));
            return;
        }

        situacaoConta = SituacaoConta.PAGA;

        System.out.println("Conta paga{" +
                "fornecedor=" + fornecedor.getNome() +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", dataVencimento='" + dataVencimento + '\'' +
                '}');
    }

    public void cancelar() {
        if (SituacaoConta.CANCELADA.equals(situacaoConta)
            || SituacaoConta.PAGA.equals(situacaoConta)) {
            System.out.println(("Uma conta que já foi cancelada não pode ser cancelada novamente e nem paga"));
            return;
        }
        situacaoConta = SituacaoConta.CANCELADA;
        System.out.println("Conta Cancelada.");
    }


    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

}
