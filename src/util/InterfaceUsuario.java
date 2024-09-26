package util;

import java.util.Scanner;

public class InterfaceUsuario {


    Scanner input = new Scanner(System.in);

    public double pedirValorImovel() {

        System.out.print("Digite o valor do imovel: ");
        double valorImovel = input.nextDouble();

        while ((valorImovel < 150.000) && (valorImovel > 0)) {
            System.out.print("Digite o valor do imovel: ");
            double novoValor = input.nextDouble();


            if (novoValor > valorImovel) {
                System.out.print("O valor do imovel é: ");
            }

            while(novoValor < valorImovel) {
                System.out.print("Digite o valor do imovel: ");
                novoValor = input.nextDouble();
            }
        }


            if (valorImovel < 150.000) {
                System.out.print("O valor informado do imovel é invalido");

            } else {
                System.out.println("O valor do imovel é: " + valorImovel);

            }


        return valorImovel;
    }

        public double pedirPrazoFinanciamento() {
            System.out.print("Digite o prazo do financiamento: ");
            double prazoFinanciamento = input.nextDouble();

            while(prazoFinanciamento < 36){
                System.out.print("Digite o prazo do financiamento: ");
                prazoFinanciamento = input.nextDouble();

                if(prazoFinanciamento < 36){
                    System.out.print("O prazo informado é invalido");

                    System.out.print("Digite o prazo do financiamento: ");
                    prazoFinanciamento = input.nextDouble();
                }

                else{
                    System.out.print("O prazo do financiamento é: "+prazoFinanciamento);
                }



            }





            return prazoFinanciamento;
        }

        public double pedirTaxaJuros() {

            System.out.print("Digite a taxa dos Juros: ");
            double taxaJuros = input.nextDouble();

            while(taxaJuros < 3.5){
                System.out.print("Digite a taxa dos Juros: ");
                taxaJuros = input.nextDouble();

                if(taxaJuros < 3.5){
                    System.out.print("O taxa dos Juros: ");
                    taxaJuros = input.nextDouble();
                }

                else{

                    System.out.print("O taxa dos Juros é: "+ taxaJuros);
                }
            }



            return taxaJuros;
        }




}