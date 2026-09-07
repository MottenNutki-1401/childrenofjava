package datastructures;

import java.util.HashMap;
public class dictionaryhashmap {
    public static void main(String[] args){
        HashMap <String, String> dictionary = new HashMap<>();
        dictionary.put ("Frienzoned", "Gusto mo sya pero hindi ka nya gusto");
        dictionary.put("Situationship", "Para kayong mag jowa pero wala pa kayong label");
        dictionary.put("Crush", "Yung taong gusto mo pero di mo masabi");
        dictionary.put("MU", "Kaibigan na parang mag jowa");

        String key ="Frienzoned";
        System.out.println (key + ":" + dictionary.get(key));
    }   
}
