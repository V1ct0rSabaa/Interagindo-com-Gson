package com.aprendendo.json;

import com.aprendendo.json.factory_methods.FactoryPokemon;

public class App 
{
    public static void main( String[] args )
    {
        String[] tipos = {"steel", "rock"};
        String[] golpes = {"Rock Tomb", "Iron Tail", "Earthquake", "Protect"};
        FactoryPokemon factoryPokemon = new FactoryPokemon();
        Pokemon p1 = factoryPokemon.getPokemonSemInput("Aggron", 306, tipos, 42, golpes);
        String serializado = OperacoesJson.serializarObjeto(p1);
        System.out.println(serializado);

    }

    private static void criarObjectoComFormulario(){
        FactoryPokemon factoryPokemon = new FactoryPokemon();
        Pokemon p2 = factoryPokemon.getPokemonComInput();
        System.out.println(OperacoesJson.serializarObjeto(p2));
    }
}
