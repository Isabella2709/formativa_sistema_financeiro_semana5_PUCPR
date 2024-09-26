package modelo;

public class Terreno extends Financiamento{
    public Terreno(double valordesejadoimovel, int prazoFinanciamentoAnos, double taxadejuros){
        super(valordesejadoimovel, prazoFinanciamentoAnos, taxadejuros);
    }

    double CalcularpagamentoMensal(){
        double valornoromal = (valordesejadoimovel / prazoFinanciamentoAnos * 12) * (1 + taxadejuros / 12);
        double valoratualizadoJuros = valornoromal * 0.02;
        System.out.println("O valor atualizado com as correçoes é: +"+ valoratualizadoJuros);
        return 0;
    }
}


