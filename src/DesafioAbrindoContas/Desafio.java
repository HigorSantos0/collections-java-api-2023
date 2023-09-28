package DesafioAbrindoContas;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.

        System.out.println("Informacoes:");
        System.out.println("Conta: " + conta.numero);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + conta.saldo);
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
    }
}
class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }


    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}