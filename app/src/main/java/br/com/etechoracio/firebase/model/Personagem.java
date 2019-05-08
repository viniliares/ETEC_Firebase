package br.com.etechoracio.firebase.model;

import br.com.etechoracio.firebase.enums.EspecieEnum;
import br.com.etechoracio.firebase.enums.SexoEnum;
import br.com.etechoracio.firebase.enums.StatusEnum;

public class Personagem {

    private String id;
    private String nome;
    private String apelido;
    private EspecieEnum especie;
    private SexoEnum sexo;
    private StatusEnum status;

    public Personagem() {}

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public EspecieEnum getEspecie() {
        return especie;
    }

    public void setEspecie(EspecieEnum especie) {
        this.especie = especie;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
