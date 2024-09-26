package modelo;

public class Casa extends Financiamento {

    public Casa(double valordesejadoimovel, int prazoFinanciamentoAnos, double taxadejuros){
        super(valordesejadoimovel, prazoFinanciamentoAnos, taxadejuros);
    }


    double CalcularpagamentoMensal() {
        return super.CalcularpagamentoMensal() + 80;


    }
}
