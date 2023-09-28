package UltimaTransacao;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String entrada = scanner.nextLine();

        // Divida a entrada em partes usando a vírgula como delimitador
        String[] partes = entrada.split(",");

        if (partes.length == 4) {
            String data = partes[0];
            String hora = partes[1];
            String descricao = partes[2];

            // Converte a parte do valor em um double
            double valor = Double.parseDouble(partes[3]);

            // Crie uma instância da classe Transacao com os valores fornecidos
            Transacao transacao = new Transacao(data, hora, descricao, valor);

            // Imprima os detalhes da transação
            transacao.imprimir();
        } else {
            System.out.println("Entrada inválida. Certifique-se de que os dados estão no formato correto.");
        }
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f", this.valor);
    }
}
