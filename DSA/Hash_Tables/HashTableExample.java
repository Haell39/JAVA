package DSA.Hash_Tables;

import java.util.HashMap;     // Importa a classe HashMap para criar tabelas hash
import java.util.Map;         // Importa a interface Map para trabalhar com mapas em geral

public class HashTableExample {
    public static void main(String[] args) {

        // Cria uma HashMap vazia, onde a chave (key) é uma String (nome)
        // e o valor (value) é um Inteiro (idade)
        Map<String, Integer> hashMap = new HashMap<>();

        // Adiciona elementos (pares chave-valor) à HashMap
        hashMap.put("Alice", 30);  // Insere "Alice" com a idade 30
        hashMap.put("Bob", 25);    // Insere "Bob" com a idade 25
        hashMap.put("Charlie", 35); // Insere "Charlie" com a idade 35

        // Acessa a idade de Alice usando sua chave ("Alice")
        System.out.println("Idade de Alice: " + hashMap.get("Alice")); 

        // Verifica se a chave "Bob" existe na HashMap
        System.out.println("Contém chave 'Bob'? " + hashMap.containsKey("Bob"));

        // Itera sobre todos os elementos (entradas) da HashMap
        System.out.println("Todos os elementos da HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            // Para cada entrada, obtém a chave (nome) e o valor (idade)
            System.out.println(entry.getKey() + ": " + entry.getValue()); 
        }
    }
}
