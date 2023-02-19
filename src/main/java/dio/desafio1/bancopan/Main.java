package dio.desafio1.bancopan;

import java.util.*;

public class Main{

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite o valor do custo de fábrica do veículo?");
        int custoFabrica = scan.nextInt();
	    System.out.println("Qual a porcentagem do distribuidor do veículo?");
	    int porcentagemDistribuidor = scan.nextInt();
        System.out.println("Qual o percentual de impostos a serem pagos na aquisição do veículo?");
	    int percentualImpostos = scan.nextInt();

        int distribuidor = (custoFabrica*porcentagemDistribuidor)/100;
        int valorImpostos = (custoFabrica*percentualImpostos)/100;
        int custoConsumidor = custoFabrica + distribuidor + valorImpostos;;
    
        System.out.println("O valor total do veículo é: " + custoConsumidor);
	}
}