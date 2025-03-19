package br.com.lorxr;

import java.util.Scanner;

public class ContaTerminal {

    private ContaBanco contaBanco = new ContaBanco();

    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        contaTerminal.criarContaBanco();
        contaTerminal.printarInfoContaBanco();
    }

    public void criarContaBanco() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem-Vindo! Vamos criar uma conta do banco!");

            System.out.print("Digite o número da conta: ");
            contaBanco.setNumero(Integer.parseInt(scanner.nextLine())); // Converte a entrada para inteiro

            System.out.print("Digite o número da agência (formatado): ");
            contaBanco.setAgencia(scanner.nextLine());

            System.out.print("Digite o nome do cliente: ");
            contaBanco.setNomeCliente(scanner.nextLine());

            System.out.print("Digite o saldo da conta: ");
            contaBanco.setSaldo(Double.parseDouble(scanner.nextLine())); // Converte a entrada para double

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printarInfoContaBanco() {
        System.out.println("O número da conta é: " + contaBanco.getNumero());
        System.out.println("O número da agência é: " + contaBanco.getAgencia());
        System.out.println("O nome do cliente é: " + contaBanco.getNomeCliente());
        System.out.println("O saldo da conta é: " + contaBanco.getSaldo());
    }
}
