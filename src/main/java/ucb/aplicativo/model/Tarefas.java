/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.aplicativo.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author maria.oliveira2024
 */
public class Tarefas {
    
    private Long id;
    private String titulo;
    private String descricao;
    private boolean completa;
    private LocalDateTime dataAgora;
    private boolean completo;
    
    
    /*
    Construtor padrão
    */
    public Tarefas () {
        this.dataAgora =  LocalDateTime.now();
        this.completa = false;
    }
    
    /*
    Construtor com título
    */
    public Tarefas(String titulo) {
        this();
        this.titulo = titulo;
    }
    /*
    Construtor com titulo e descrição
    */
    public Tarefas(String titulo, String descricao) {
        this(titulo);
        this.descricao = descricao;
    }
    /*
    Construtor completo
    */
    public Tarefas(Long id, String titulo, String descricao, boolean completa){
        this(titulo, descricao);
        this.id = id;
        this.completa = completa;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the completa
     */
    public boolean isCompleta() {
        return completa;
    }

    /**
     * @param completa the completa to set
     */
    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    /**
     * @return the dataAgora
     */
    public LocalDateTime getDataAgora() {
        return dataAgora;
    }

    /**
     * @param dataAgora the dataAgora to set
     */
    public void setDataAgora(LocalDateTime dataAgora) {
        this.dataAgora = dataAgora;
    }

    /**
     * @return the completo
     */
    public boolean isCompleto() {
        return completo;
    }

    /**
     * @param completo the completo to set
     */
    public void setCompleto(boolean completo) {
        this.completo = completo;
    }
}

