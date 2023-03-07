package br.pc.oo.algaworks.desafio6_13;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Principal {

    /*
        O custo com políticos no Brasil é um dos mais altos no mundo.

        O valor do contra-cheque de um político corresponde a cerca de um quarto de tudo o que
        recebem por meio de inúmeras verbas e auxílios extraordinários.

        Você, político honesto e programador Java, resolveu desenvolver um software para calcular
        os salários dos políticos por partido e cargo. Esse software irá lhe ajudar a
        propor mudanças dentro do governo.

        As classes Cargo e Politico foram fornecidas para você pelo Ministério Público Eleitoral.

        A classe Cargo representa o cargo de um político, como por exemplo "vereador",
        "deputado estadual" ou "prefeito". Um cargo possui uma descrição e o valor do salário.

        Agora que você já tem as classes Cargo e Politico, precisa criar uma outra classe para
        organizar os políticos e seus partidos e calcular os gastos totais dos salários.

        Para sua sorte, estamos entregando para você a classe Governo, que está quase pronta.
        As únicas coisas que faltam são as implementações os métodos calcularGastosComSalario()
        e calcularGastosComSalarioParaCargo().



     */


    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

        // instancia governo
        Governo governo = new Governo();

        // instancia cargos
        Cargo vereador = new Cargo();
        vereador.setDescricao("Vereador");
        vereador.setSalario(new BigDecimal(16000));

        Cargo deputadoEstadual = new Cargo();
        deputadoEstadual.setDescricao("Deputado estadual");
        deputadoEstadual.setSalario(new BigDecimal(25000));

        Cargo prefeito = new Cargo();
        prefeito.setDescricao("Prefeito");
        prefeito.setSalario(new BigDecimal(27000));

        // adiciona vereadores
        Politico politico = new Politico();
        politico.setNome("João das Couves");
        politico.setCargo(vereador);
        governo.adicionarPolitico("RBLH", politico);

        politico = new Politico();
        politico.setNome("Zé Mané");
        politico.setCargo(vereador);
        governo.adicionarPolitico("PCOR", politico);

        politico = new Politico();
        politico.setNome("Maria Carvalho");
        politico.setCargo(vereador);
        governo.adicionarPolitico("LDRS", politico);

        politico = new Politico();
        politico.setNome("Maria Carvalho");
        politico.setCargo(vereador);
        governo.adicionarPolitico("LDRS", politico);

        // adiciona deputados estaduais
        politico = new Politico();
        politico.setNome("Josefa Silva");
        politico.setCargo(deputadoEstadual);
        governo.adicionarPolitico("LDRS", politico);

        politico = new Politico();
        politico.setNome("Fátima Gonçalves");
        politico.setCargo(deputadoEstadual);
        governo.adicionarPolitico("LDRS", politico);

        // adiciona prefeito
        politico = new Politico();
        politico.setNome("Sebastião Mendes");
        politico.setCargo(prefeito);
        governo.adicionarPolitico("LDRS", politico);

        // calcula gastos com partidos
        BigDecimal gastosPcor = governo.calcularGastosComSalario("PCOR");
        System.out.println("Gastos com partido PCOR: " + formatador.format(gastosPcor.doubleValue()));

        BigDecimal gastosLdrs = governo.calcularGastosComSalario("LDRS");
        System.out.println("Gastos com partido LDRS: " + formatador.format(gastosLdrs.doubleValue()));

        // calcula gastos com partidos para determinados cargos
        BigDecimal gastosVereadoresLdrs = governo.calcularGastosComSalarioParaCargo(vereador, "LDRS");
        System.out.println("Gastos com vereadores do partido LDRS: "
                + formatador.format(gastosVereadoresLdrs.doubleValue()));

        BigDecimal gastosDeputadosEstaduaisLdrs = governo.calcularGastosComSalarioParaCargo(deputadoEstadual, "LDRS");
        System.out.println("Gastos com deputados estaduais do partido LDRS: "
                + formatador.format(gastosDeputadosEstaduaisLdrs.doubleValue()));

        BigDecimal gastosPrefeitosLdrs = governo.calcularGastosComSalarioParaCargo(prefeito, "LDRS");
        System.out.println("Gastos com prefeitos do partido LDRS: "
                + formatador.format(gastosPrefeitosLdrs.doubleValue()));
    }
}
