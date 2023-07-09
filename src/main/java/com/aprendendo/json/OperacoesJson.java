package com.aprendendo.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class OperacoesJson {
    private static Gson gson = new Gson(); 
    public static String serializarObjeto(Pokemon pokemon){
        return gson.toJson(pokemon);
    }

    public static void criarJsonComObjeto(Pokemon pokemon, String nome){
        if(!nome.endsWith(".json")){ nome += ".json"; }
        if(new File(nome).exists()){
            System.out.println("ERRO, um arquivo com esse nome já existe");
        }
        else{
            try {
                FileWriter fw = new FileWriter(nome);
                gson.toJson(pokemon, fw);
                fw.close();
            } catch (IOException ioe) {
                System.out.println("ERRO, não foi possivel criar o arquivo json");
            }
        }
    }
}
