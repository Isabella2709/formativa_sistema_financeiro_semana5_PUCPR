package modelo;

public class Apartamento extends Financiamento {

    public Apartamento(double valordesejadoimovel, int prazoFinanciamentoAnos, double taxadejuros) {
        super(valordesejadoimovel, prazoFinanciamentoAnos, taxadejuros);
    }


    double CalcularPagamentoMensal() {
        double taxaMensal = (taxadejuros / 12);  // Acessando o atributo da classe Financiamento
        int meses = (prazoFinanciamentoAnos * 12);  // Acessando o atributo da classe Financiamento
        // Fórmula para calcular o pagamento mensal
        double valorTotal = (valordesejadoimovel * taxaMensal * Math.pow(1 + taxaMensal, meses))
                / (Math.pow(1 + taxaMensal, meses) - 1);


        System.out.println("O Valor total do financiamento é: " + valorTotal);
        return valorTotal;
    }
}


