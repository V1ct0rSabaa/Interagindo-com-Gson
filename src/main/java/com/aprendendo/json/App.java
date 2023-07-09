package com.aprendendo.json;

import com.aprendendo.json.factory_methods.FactoryPokemon;

public class App 
{
    public static void main( String[] args )
    {
        String[] tipos = {"steel", "rock"};
        String[] golpes = {"Rock Tomb", "Iron Tail", "Earthquake", "Protect"};
        Pokemon p1 = new Pokemon("Aggron", 306, tipos, 42, golpes);
        String serializado = OperacoesJson.serializarObjeto(p1);
        FactoryPokemon fp = new FactoryPokemon();
        System.out.println(serializado);
        Pokemon p2 = fp.getPokemon();
        System.out.println(OperacoesJson.serializarObjeto(p2));
    }
}
