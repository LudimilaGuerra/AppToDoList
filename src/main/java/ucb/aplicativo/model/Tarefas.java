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
import java.time.LocalDateTime;

public class Tarefas {
    private Long Id;
    private String Titulo;
    private String Descricao;
    private LocalDateTime DataAgora;
    private boolean Concluida;
    
    public Tarefas(Long Id, String Titulo, String Descricao, boolean concluida){ //construtor
        this.Id = Id;
        this.Titulo = Titulo;
        this.Descricao = Descricao;
        this.DataAgora = DataAgora;
        this.Concluida = Concluida;
    }
    
    //Getter e Setters
    /**
     * @return the Id
     */
    public Long getId() {
        return Id;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }
    
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the DataAgora
     */
    public LocalDateTime getDataAgora() {
        return DataAgora;
    }

    /**
     * @return the Concluida
     */
    public boolean isConcluida() {
        return Concluida;
    }

    /**
     * @param Concluida the Concluida to set
     */
    public void setConcluida(boolean Concluida) {
        this.Concluida = Concluida;
    }
    @Override
    public String toString(){
        return (Concluida ? "[X] " : "[ ] ") + Titulo; //box de confirmação do Con
    }    
}