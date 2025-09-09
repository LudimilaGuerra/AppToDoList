/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.aplicativo.model;

/**
 *
 * @author ludimila.guerra
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {
    private String Titulo;
    private String Descricao;
    private boolean Concluida;
}

class Tarefa {
private String descricao;
private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        return (concluida ? "[X] " : "[ ] ") + descricao;
    }


}

public class AppToDoList.java {
private static ArrayList<Tarefa> tarefas = new ArrayList<>();
private static Scanner scanner = new Scanner([System.in](http://system.in/));

public static void main(String[] args) {
    int opcao;
    do {
        System.out.println("\\n--- TO-DO LIST ---");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Listar tarefas");
        System.out.println("3. Concluir tarefa");
        System.out.println("4. Remover tarefa");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha

        switch (opcao) {
            case 1 -> adicionarTarefa();
            case 2 -> listarTarefas();
            case 3 -> concluirTarefa();
            case 4 -> removerTarefa();
            case 0 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida!");
        }
    } while (opcao != 0);
}

private static void adicionarTarefa() {
    System.out.print("Digite a descrição da tarefa: ");
    String descricao = scanner.nextLine();
    tarefas.add(new Tarefa(descricao));
    System.out.println("Tarefa adicionada!");
}

private static void listarTarefas() {
    if (tarefas.isEmpty()) {
        System.out.println("Nenhuma tarefa encontrada.");
        return;
    }
    System.out.println("\\n--- Lista de Tarefas ---");
    for (int i = 0; i < tarefas.size(); i++) {
        System.out.println(i + " - " + tarefas.get(i));
    }
}

private static void concluirTarefa() {
    listarTarefas();
    if (tarefas.isEmpty()) return;

    System.out.print("Digite o número da tarefa concluída: ");
    int index = scanner.nextInt();
    if (index >= 0 && index < tarefas.size()) {
        tarefas.get(index).concluir();
        System.out.println("Tarefa concluída!");
    } else {
        System.out.println("Índice inválido.");
    }
}

private static void removerTarefa() {
    listarTarefas();
    if (tarefas.isEmpty()) return;

    System.out.print("Digite o número da tarefa a remover: ");
    int index = scanner.nextInt();
    if (index >= 0 && index < tarefas.size()) {
        tarefas.remove(index);
        System.out.println("Tarefa removida!");
    } else {
        System.out.println("Índice inválido.");
    }
}

}