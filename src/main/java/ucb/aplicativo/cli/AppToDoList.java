/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucb.aplicativo.cli;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;
import ucb.aplicativo.model.Tarefas;
import ucb.aplicativo.servico.TarefaService;
  
        
public class AppToDoList {
    /*
    Método principal
    */

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner entrada = new Scanner(System.in);
        TarefaService servico = new TarefaService();    
        
    
    while (true) {
    System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
    System.out.println("1. Criar Tarefa");
    System.out.println("2. Listar Tarefas");
    System.out.println("3. Atualizar Tarefa");
    System.out.println("4. Remover Tarefa");
    System.out.println("5. Sair");
    System.out.print("Escolha uma opção ");
    
    int opcao = entrada.nextInt ();
    entrada.nextLine (); //consumir quebra de linha
    
    switch (opcao) {
        case 1 -> {
            System.out.println("Título: ");
            String titulo = entrada.nextLine();
            System.out.print("Descrição: ");
            String descricao = entrada.nextLine();
            Tarefas nova = servico.criarTarefas(titulo, descricao);
            system.out.println("Tarefa criada: " + nova.getTitulo()); //Colocar o false, quando não foir concluido
            
        }
        case 2 -> {
            List<Tarefas> tarefas = servico.listarTarefas();
            if (tarefas.isEmpty()) {
                System.out.println("Nenhuma tarefa cadastrada.");
            }
            else {
                System.out.println("Lista de Tarefas");
                for (Tarefas t : tarefas){
                    System.out.println(" Titulo: " + t.getTitulo());
                    System.out.println(" Descrição: " + t.getDescricao());
                    System.out.println(" Data de criação: " + t.getdataAgoraFormatadaPtBr());
                    System.out.println (" >>>>>> \n");
                    
                    
                }
            }
        }
        case 3 -> {
            System.out.print("Digite o ID da tarefa que deseja atualizar: ");
            Long id = entrada.nextLong();
            entrada.nextLine();
            
            System.out.print("Novo título: ");
            String novoTitulo = entrada.nextLine();
            System.out.print("Nova descrição ");
            String novaDescricao = entrada.nextLine();
            System.out.print("Está completa? (true/false): ");
            boolean completa = entrada.nextBoolean();
            
            boolean atualizado = servico.atualizarTarefa (id, novoTitulo, novaDescricao, completa);
            if (atualizado) {
                System.out.println(" Tarefa atualizada com sucesso!");
            } else {
                System.out.println("Tarefa não encontrada. ");
            }
        }
    }
}
    
    
    

