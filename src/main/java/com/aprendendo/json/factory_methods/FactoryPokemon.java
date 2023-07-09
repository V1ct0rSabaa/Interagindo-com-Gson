package com.aprendendo.json.factory_methods;

import java.util.Scanner;

import com.aprendendo.json.Pokemon;
import com.google.gson.Gson;

public class FactoryPokemon {
    private Gson gson = new Gson();
    // precisa ajeitar o scanner para pegar input separado por espaço
    public Pokemon getPokemonComInput(){
        Scanner pegarInput = new Scanner(System.in);
        
        System.out.print("Digite o nome do pokémon: ");
        String nome = pegarInput.nextLine();
        System.out.println("digite o número do pokémon na pokedex nacional: ");
        int numeroPokedex = pegarInput.nextInt();
        System.out.println("digite o nível do pokemon: ");
        int nivel = pegarInput.nextInt();
        //String[] tipos = new String[2];
        //String[] golpes = new String[4];
        System.out.println("Esse pókemon tem 1 ou 2 tipos? ");
        int quantidadeTipos = pegarInput.nextInt();
        String[] tipos = new String[quantidadeTipos];
        for (int i = 0; i < quantidadeTipos; i++) {
            System.out.printf("Digite o nome do %d tipo: ", i + 1);
            tipos[i] = pegarInput.next();
        }
        System.out.println("Esse pókemon conhece 1, 2, 3 ou 4 golpes? ");
        int quantidadeGolpes = pegarInput.nextInt();
        String[] golpes = new String[quantidadeGolpes];
        for (int i = 0; i < quantidadeGolpes; i++) {
            System.out.printf("Digite o nome do %d golpe:\n", i + 1);
            golpes[i] = pegarInput.next();
        }
        pegarInput.close();
        return new Pokemon(nome, numeroPokedex, tipos, nivel, golpes);
    }

    public Pokemon getPokemonSemInput(String nome, int numeroPokedex, String[] tipos, int nivel, String[] golpes){
        return new Pokemon(nome, numeroPokedex, tipos, nivel, golpes);
    }

    public Pokemon desserializarJsonString(String serializado){
        return gson.fromJson(serializado, Pokemon.class);
    }
}
