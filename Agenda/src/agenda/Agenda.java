package agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contatos;

public class Agenda {
    private List<Contatos> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contatos contato) {
        this.contatos.add(contato);
        System.out.println("Contato adicionado com sucesso.");
        return;
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        for (Contatos todosContatos : contatos) {
            System.out.println("-----------");
            System.out.println("Nome: " + todosContatos.getNome());
            System.out.println("Idade: " + todosContatos.getIdade());
            System.out.println("Telefone: " + todosContatos.getTelefone());
            System.out.println("Endereço: " + todosContatos.getEndereco());
            System.out.println("-----------");
        }
    }

    public void atualizarContatos(String nome) {
        Scanner sc = new Scanner(System.in);
        boolean contatoEncontrado = false;
        
        for (Contatos todosContatos : contatos) {
            if (todosContatos.getNome().equals(nome)) {
            	
                System.out.println("Digite a nova idade:");
                Integer novaIdade = sc.nextInt();
                sc.nextLine();
                todosContatos.setIdade(novaIdade);

                System.out.println("Digite o novo telefone:");
                String novoTelefone = sc.nextLine();
                todosContatos.setTelefone(novoTelefone);
                System.out.println("Digite o novo endereço:");
                String novoEndereco = sc.nextLine();
                todosContatos.setEndereco(novoEndereco);
                System.out.println("Lista 100% atualizada.");
                contatoEncontrado = true;
            }
            
        }
        if (!contatoEncontrado) {
        	System.out.println("Não achamos esse nome na lista!");
        }
        return;
        
        
    }

    public void removerContato(String nome) {
        for (Contatos todosContatos : contatos) {
            if (todosContatos.getNome().equals(nome)) {
                contatos.remove(todosContatos);
                System.out.println("Contato removido com sucesso!");
                return;
            }
        }
        System.out.println("Não achamos esse nome na lista!");
    }
}
