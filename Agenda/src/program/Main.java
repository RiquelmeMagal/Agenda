package program;

import java.util.Scanner;

import agenda.Agenda;
import entities.Contatos;

public class Main {

    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();

        while (true) {
        	Scanner sc = new Scanner(System.in);
            System.out.println("1 - Para adicionar;");
            System.out.println("2 - Para listar todos os contatos;");
            System.out.println("3 - Para atualizar contato;");
            System.out.println("4 - Para remover contato;");
            System.out.println("5 - Para finalizar programa;");

            int opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine(); 
                    System.out.println("Digite o telefone: ");
                    String telefone = sc.nextLine();
                    System.out.println("Digite o endereço: ");
                    String endereco = sc.nextLine();
                    Contatos novoContato = new Contatos(nome, idade, telefone, endereco);
                    agenda.adicionarContato(novoContato);
                    break;
                case 2:
                    agenda.listarContatos();
                    break;
                case 3:
                    System.out.print("Nome a ser buscado: ");
                    String nomeAtualizar = sc.nextLine();
                    agenda.atualizarContatos(nomeAtualizar);
                    break;
                case 4:
                    System.out.print("Precisamos do nome para ser removido: ");
                    String nomeRemover = sc.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;
                case 5:
                    System.out.println("Programa sendo finalizado.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        }
    }
}
