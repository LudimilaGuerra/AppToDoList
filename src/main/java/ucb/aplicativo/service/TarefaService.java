/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.aplicativo.service;

import java.util.List;
import ucb.aplicativo.model.Tarefas;
import java.util.ArrayList;
/**
 *
 * @author ludimila.guerra
 */
public class TarefaService {
    private List<Tarefas> tarefas = new arrayList<>();
    private Long contadorId = 1L; //LITERAL

    //Crir tarefas
    public Tarefas criarTarefas(String titulo, String descricao) {
        //Método construtor da classe tarefa
        Tarefas tarefa = new Tarefas(contadorId++, titulo, descricao, false);
        tarefas.add(tarefa);
        return tarefa;
    }
    
    //Listar todas as tarefas
   public List<Tarefas> listarTarefas() {
   return tarefas;
   }
    //git lab samuel novais
}

