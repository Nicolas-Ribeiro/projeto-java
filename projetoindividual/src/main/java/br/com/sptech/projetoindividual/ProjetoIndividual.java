package br.com.sptech.projetoindividual;

import java.util.Scanner;

public class ProjetoIndividual {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos conversar sobre música? \n"
                + "quantos minutos você ouve, sujestões de estilo e muito mais. \n"
                + "1- Músicas você escuta por dia? \n"
                + "2- Qual estilo mais gosta? \n"
                + "3- Quiz! \n"
                + "4- Sair do menu! \n");

        Integer alteracao = leitor.nextInt();

        while (alteracao == 1 || alteracao == 2 || alteracao == 3) {

            switch (alteracao) {
                case 1:
                    System.out.println("Quantas músicas você escuta por dia?");
                    alteracao = leitor.nextInt();
                    System.out.println("Você escuta " + alteracao * 7 + " por \n"
                            + " semana e " + alteracao * 30 + " por mês");

                    System.out.println("Vamos conversar sobre música? \n"
                            + "quantos minutos você ouve, sujestões de estilo e muito mais. \n"
                            + "1- Músicas você escuta por dia? \n"
                            + "2- Qual estilo mais gosta? \n"
                            + "3- Quiz! \n"
                            + "4- Sair do menu! \n");
                    alteracao = leitor.nextInt();

                    break;

                case 2:
                    System.out.println("Qual estilo de música você mais gosta?\n"
                            + "1-Rock, 2-Rap, 3-Pop, 4-Funk ou 5-Sertanejo?");
                    alteracao = leitor.nextInt();
                    if (alteracao == 1) {
                        System.out.println("O Rock surgiu na decada de 50, e é \n"
                                + "uma mistura de Blues, Country e Jazz");
                    } else if (alteracao == 2) {
                        System.out.println("O Rap surgiu no inicio dos anos 70 \n"
                                + "em nova york");
                    } else if (alteracao == 3) {
                        System.out.println("O Pop Nasceu na década de 30 derivado \n"
                                + "do blues e country");
                    } else if (alteracao == 4) {
                        System.out.println("Funk é gênero musical inspirado no \n"
                                + "Rhythm and blues e no gospel dos EUA");
                    } else {
                        System.out.println("A música sertaneja tem sua origem nas \n"
                                + "modas de viola, quando as pessoas se reuniam em \n"
                                + "roda para contar histórias");
                    }

                    System.out.println("Vamos conversar sobre música? \n"
                            + "quantos minutos você ouve, sujestões de estilo e muito mais. \n"
                            + "1- Músicas você escuta por dia? \n"
                            + "2- Qual estilo mais gosta? \n"
                            + "3- Quiz! \n"
                            + "4- Sair do menu! \n");
                    alteracao = leitor.nextInt();

                    break;

                case 3:
                    System.out.println("Quiz!");
                    System.out.println("Verdadeiro ou Falso: É verdade que o "
                            + "cantor Elvis Presley morreu aos 27 anos?(1 = Sim 2 = Não)");
                    alteracao = leitor.nextInt();
                    if (alteracao == 2) {
                        System.out.println("Certa resposta!");
                    } else {
                        System.err.println("Vish, Resposta errada heim!");
                    }
                    System.out.println("Verdadeiro ou Falso: O Rap é um estilo "
                            + "musical muito ritimico e com rimas, e é derivado "
                            + "do hip-hop(1 = Sim 2 = Não)");
                    alteracao = leitor.nextInt();
                    if (alteracao == 1) {
                        System.out.println("Certa resposta!");
                    } else {
                        System.err.println("Vish, Resposta errada heim!");
                    }
                    System.out.println("Verdadeiro ou Falso: O sertanejo é \n"
                            + "conhecido como sofrencia e as pessoas choram \n"
                            + "por ex.(1 = Sim 2 = Não)");
                    alteracao = leitor.nextInt();
                    if (alteracao == 1) {
                        System.out.println("Certa resposta!");
                    } else {
                        System.err.println("Vish, Resposta errada heim!");
                    }
                    System.out.println("Verdadeiro ou Falso: James Brown, "
                            + "Mano Brown, Carlinhos Brown e Ashley Brown são "
                            + "cantores de Funk!(1 = Sim 2 = Não) ");
                    alteracao = leitor.nextInt();
                    if (alteracao == 2) {
                        System.out.println("Certa resposta!");
                    } else {
                        System.err.println("Vish, Resposta errada heim!");
                    }
                    System.out.println("Verdadeiro ou Falso: M. Jackson e "
                            + "Madonna são idolos Pop(1 = Sim 2 = Não)");
                    alteracao = leitor.nextInt();
                    if (alteracao == 1) {
                        System.out.println("Certa resposta!");
                    } else {
                        System.err.println("Vish, Resposta errada heim!");
                    }

                    System.out.println("Vamos conversar sobre música? \n"
                            + "quantos minutos você ouve, sujestões de estilo e muito mais. \n"
                            + "1- Músicas você escuta por dia? \n"
                            + "2- Qual estilo mais gosta? \n"
                            + "3- Quiz! \n"
                            + "4- Sair do menu! \n");
                    alteracao = leitor.nextInt();

                    break;

                case 4:
                    System.out.println("Sair do sistema");
                    break;

                default:
                    System.out.println("Opção invalida");
            }

        }
    }

}