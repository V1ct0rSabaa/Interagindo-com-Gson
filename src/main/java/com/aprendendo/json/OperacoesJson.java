package com.aprendendo.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public abstract class OperacoesJson {
    private static Gson gson = new Gson(); 
    // documentação - https://github.com/google/gson/blob/main/UserGuide.md

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

    private void deserializarJsonParaWrapper(){
        Short s = gson.fromJson("151", Short.class);
        Integer i = gson.fromJson("10000", Integer.class);
        Long l = gson.fromJson("123456789", Long.class);
        Double d = gson.fromJson("553.2", Double.class);
        Boolean bool = gson.fromJson("false", Boolean.class);
        String str = gson.fromJson("\"abc\"", String.class);
        StringBuilder sb = new StringBuilder();

        sb.append("Short: " + s.toString());
        sb.append("\nInteger: " + i.toString());
        sb.append("\nLong: " + l.toString());
        sb.append("\nDouble: " + d.toString());
        sb.append("\nBoolean: " + bool.toString());
        sb.append("\nString: " + str);
        System.out.println(sb.toString());
    }
}
