package com.aprendendo.json;

import java.util.Arrays;

import com.aprendendo.json.exceptions.NivelException;

public class Pokemon {
    private String nome;
    private int numeroPokedex;
    private String[] tipos = new String[2];
    private int nivel;
    private String[] golpes = new String[4];

    public Pokemon(String nome, int numeroPokedex, String[] tipos, int nivel, String[] golpes) throws NivelException {
        this.nome = nome;
        this.numeroPokedex = numeroPokedex;
        try {
            this.nivel = nivel;
            for(int i = 0; i < tipos.length; i++){
                this.tipos[i] = tipos[i];
            }
            for (int j = 0; j < golpes.length; j++) {
                this.golpes[j] = golpes[j];
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            if(this.tipos.length > tipos.length){
                System.out.printf("Erro, um pokémon não pode ter mais de 2 tipos, foram colocados %d tipos.\n", tipos.length);
            }
            if(this.golpes.length > golpes.length){
                System.out.printf("Erro, um pokémon pode ter apenas 4 golpes, foram colocados %d golpes\n", golpes.length);
            }
        } catch (NivelException ne){
            System.out.println("Erro, o nivel de um pokémon não pode ser menor que 1 nem maior que 100");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipo) {
        this.tipos = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String[] getGolpes() {
        return golpes;
    }

    public void setGolpes(String[] golpes) {
        this.golpes = golpes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pokemon [nome=" + nome);
        sb.append("numeroPokedex=" + numeroPokedex);
        sb.append("tipos [nome=" + Arrays.toString(tipos));
        sb.append("nivel [nome=" + nivel);
        sb.append("golpes [nome=" + Arrays.toString(golpes) + "]");
        return sb.toString();
    }
    
}
