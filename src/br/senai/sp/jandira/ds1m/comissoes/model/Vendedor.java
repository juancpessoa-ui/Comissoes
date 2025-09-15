package br.senai.sp.jandira.ds1m.comissoes.model;

import java.util.Scanner;

public class Vendedor {
    String nomeVendedor;
    double totalDeVendas;
    double percentualDaComissao;
    double valorDaComissaoEmReais;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("** CALCULADORA DE COMISSÕES**");
        System.out.println("-----------------------------");
        //Obtem o nome do vendedor
        System.out.print("Qual nome do vendedor? ");
        nomeVendedor = leitor.nextLine();
        //Obtem total de vendas
        System.out.print("Qual total de vendas do(a) "+ nomeVendedor + "? ");
        totalDeVendas = leitor.nextDouble();
        calcularComissao();
    }
    public void calcularComissao(){
        if(totalDeVendas< 20000){
            percentualDaComissao = 5;
        } else{
            percentualDaComissao = 10;
        }
        valorDaComissaoEmReais = totalDeVendas * percentualDaComissao / 100;
        exibirResultados();
    }
    public void exibirResultados(){
        System.out.println("--------------------------");
        System.out.println("** R E S U L T A D O ** ");
        System.out.println("--------------------------");
        System.out.println("VENDEDOR: " + nomeVendedor);
        System.out.println("TOTAL DE VENDAS: R$ " + totalDeVendas);
        System.out.println("PERCENTUAL DA COMISSÃO: " + percentualDaComissao + "%");
        System.out.println("VALOR DA COMISSÃO PAGA:  R$ " + valorDaComissaoEmReais);
        System.out.println("--------------------------");
        iniciarPrograma();
    }
    public void iniciarPrograma(){
        Scanner leitor = new Scanner(System.in);
        int resposta;
        System.out.println("Calcular a comissão de outro vendedor? ");
        System.out.print("Digite 1 para sim e 0 para sair: ");
        resposta = leitor.nextInt();
        if(resposta == 1){
            obterDados();
        } else {
            System.out.print("Bye!");
        }
    }



}

