package br.pc.oo.algaworks.data;

import sun.util.resources.LocaleData;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {

    private Cliente cliente;
    private Carro carro;


    private LocalDateTime dataEHoraDaRetirada;
    private LocalDateTime dataEhoraPrevistaDevolucao;

    private LocalDateTime dataEHoraRealDaDevolucao;

    public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataEHoraDaRetirada, LocalDateTime dataEhoraPrevistaDevolucao) {
        this.cliente = cliente;
        this.carro = carro;
        this.dataEHoraDaRetirada = dataEHoraDaRetirada;
        this.dataEhoraPrevistaDevolucao = dataEhoraPrevistaDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }


    public void imprimeFatura(){
        Duration duration = Duration.between(dataEhoraPrevistaDevolucao, dataEHoraRealDaDevolucao);
        System.out.println(duration.toHours());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>> Fatura <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        if (!duration.isNegative()){
            double multa = duration.toHours() * carro.getValorDiaria() * 0.1;
            System.out.printf("Valor da multa: R$ %.2f. Pois você atradou %d dias.", multa, duration.toHours());
        }else{
            System.out.println("Obrigado. Você foi pontual.");
        }
    }

    public LocalDateTime getDataEHoraDaRetirada() {
        return dataEHoraDaRetirada;
    }

    public void setDataEHoraDaRetirada(LocalDateTime dataEHoraDaRetirada) {
        this.dataEHoraDaRetirada = dataEHoraDaRetirada;
    }

    public LocalDateTime getDataEhoraPrevistaDevolucao() {
        return dataEhoraPrevistaDevolucao;
    }

    public void setDataEhoraPrevistaDevolucao(LocalDateTime dataEhoraPrevistaDevolucao) {
        this.dataEhoraPrevistaDevolucao = dataEhoraPrevistaDevolucao;
    }

    public LocalDateTime getDataEHoraRealDaDevolucao() {
        return dataEHoraRealDaDevolucao;
    }

    public void setDataEHoraRealDaDevolucao(LocalDateTime dataEHoraRealDaDevolucao) {
        this.dataEHoraRealDaDevolucao = dataEHoraRealDaDevolucao;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "cliente=" + cliente +
                ", carro=" + carro +
                ", dataEHoraDaRetirada=" + dataEHoraDaRetirada +
                ", dataEhoraPrevistaDevolucao=" + dataEhoraPrevistaDevolucao +
                ", dataEHoraRealDaDevolucao=" + dataEHoraRealDaDevolucao +
                '}';
    }
}
