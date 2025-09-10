/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.aplicativo.servico;

import java.util.List;
import ucb.aplicativo.model.Tarefas;
import java.util.ArrayList;

/**
 *
 * @author ludimila.guerra
 */
public class TarefaServico {
    private List<Tarefas> tarefas = new ArrayList<>();
    private Long contadorId = 1L; //LITERAL

    //Crir tarefas
    public Tarefas criarTarefas(String Titulo, String Descricao) {
        //Método construtor da classe tarefa
        Tarefas tarefa = new Tarefas(contadorId++, Titulo, Descricao, false);
        tarefas.add(tarefa);
        return tarefa;
    }
    
    //Listar todas as tarefas
   public List<Tarefas> listarTarefas() {
   return tarefas;
   }
   
    /**
     *
     * @param Id
     * @param novoTitulo
     * @param novaDescricao
     * @param Concluida
     * @return
     */
    public boolean atualizarTarefa(Long Id, String novoTitulo, String novaDescricao, boolean Concluida) {
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefas t = tarefas.get(1);
            if (t.getId().equals(Id)) {
            t.setConcluida(Concluida);
            t.setTitulo(novoTitulo);     
            t.setDescricao(novaDescricao);
            return true;
            }
        }
        return false;
    }
    
    
    public boolean concluirTarefa(Long Id){
        for (int i = 0; i < tarefas.size(); i++){
            Tarefas t = tarefas.get(i);
            if (t.getId().equals(Id)){
                if (t.isConcluida()){
                    t.setConcluida(false);
                }
                else{
                    t.setConcluida(true);
                }
                return true;
            }
            
        }
        return false;
    }
    
    public boolean removerTarefa(Long Id){
        for (int i = 0; i < tarefas.size(); i++){
            if(tarefas.get(i).getId().equals(Id)){
                tarefas.remove(i);
                return true;
            }
        }
        return false;
    }
    //git lab samuel novais}
    
}