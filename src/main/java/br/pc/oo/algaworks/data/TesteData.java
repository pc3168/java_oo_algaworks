package br.pc.oo.algaworks.data;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class TesteData {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João da Silva", LocalDate.of(1987, Month.MAY,07));

        System.out.println(cliente);

        int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();

        if (idade >= 18){
            System.out.printf("OK, pode ser cadastrado. Sua idade é %d ", idade);
        }else{
            System.out.printf("Sua idade é %d. Então não pode ter carteira.", idade);
        }

        System.out.println("\n\n----------------------------------------------------");

        Carro carro1 = new Carro("Gol", 90.0, Year.of(2012) );
        Carro carro2 = new Carro("Cruze", 200.0, Year.parse("2013"));
        Carro carro3 = new Carro("Celta", 80.0, Year.of(2011) );

        List<Carro> carros = Arrays.asList(carro1, carro2, carro3);

        carros.stream()
                .filter(c -> c.getAnoFabricacao().isAfter(Year.of(2012)))
                .forEach(c -> System.out.println(c.getModelo()));

        LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(),
                LocalTime.of(LocalTime.now().getHour(), 0));

        LocalDateTime dataEHoraDaPrevista = LocalDateTime.now().plusDays(3).plusHours(2);

        Aluguel aluguel = new Aluguel(cliente, carro1, dataEHoraDaRetirada, dataEHoraDaPrevista);

        System.out.println(">>>>>>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<<<<<");
        System.out.println("Carro: " + aluguel.getCarro().getModelo());
        System.out.println("Cliente: "+ aluguel.getCliente().getNome());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data e hora da retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
        System.out.println("Data e hora prevista para devolução: " + aluguel.getDataEhoraPrevistaDevolucao().format(formatter));


        LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(
                LocalDate.now().plusDays(5), LocalTime.now());

        aluguel.setDataEHoraRealDaDevolucao(dataEHoraRealDaDevolucao);
        aluguel.imprimeFatura();




    }
}
