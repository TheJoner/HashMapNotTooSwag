package HashMapGenericaInJava;
//dichiarazione classe esempio
import java.util.HashMap;

public class HashMapGenericaJava {

    public static void main(String[] args) {
        // Esempio di utilizzo dei metodi della classe HashMapGenericaJava
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        System.out.println("HashMap: " + hashMap);
    
        // Utilizzo del metodo get
        Integer value = hashMap.get("B");
        System.out.println("Valore della chiave 'B': " + value);
    
        // Utilizzo del metodo putIfAbsent
        hashMap.putIfAbsent("D", 4);
        System.out.println("HashMap dopo putIfAbsent: " + hashMap);
    
        // Utilizzo del metodo remove
        hashMap.remove("A");
        System.out.println("HashMap dopo remove: " + hashMap);
    
        // Utilizzo del metodo replace
        hashMap.replace("B", 10);
        System.out.println("HashMap dopo replace: " + hashMap);
    
        // Utilizzo del metodo clear
        hashMap.clear();
        System.out.println("HashMap dopo clear: " + hashMap);
        
    }
    
    /**
     * Metodo per ottenere la dimensione della mappa.
     * Restituisce il numero di elementi presenti nella mappa.
     */
    public static void size() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        System.out.println("Dimensione della HashMap: " + hashMap.size());
    }
    
    /**
     * Metodo per verificare se la mappa è vuota.
     * Restituisce true se la mappa è vuota, altrimenti false.
     */
    public static void isEmpty() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        System.out.println("La HashMap è vuota? " + hashMap.isEmpty());
    }
    
    /**
     * Metodo per aggiungere un elemento alla mappa.
     * Aggiunge un nuovo elemento con la chiave e il valore specificati alla mappa.
     */
    public static void put() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        System.out.println("HashMap dopo put: " + hashMap);
    }
    
    /**
     * Metodo per ottenere un elemento dalla mappa.
     * Restituisce il valore associato alla chiave specificata.
     */
    public static void get() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        Integer value = hashMap.get("A");
        System.out.println("Valore della chiave 'A': " + value);
    }
    
    /**
     * Metodo per rimuovere un elemento dalla mappa.
     * Rimuove l'elemento con la chiave specificata dalla mappa.
     */
    public static void remove() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.remove("A");
        System.out.println("HashMap dopo remove: " + hashMap);
    }
    
    /**
     * Metodo per sostituire un elemento della mappa.
     * Sostituisce il valore associato alla chiave specificata con un nuovo valore.
     */
    public static void replace() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.replace("A", 2);
        System.out.println("HashMap dopo replace: " + hashMap);
    }
    
    /**
     * Metodo per cancellare tutti gli elementi dalla mappa.
     * Rimuove tutti gli elementi presenti nella mappa.
     */
    public static void clear() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        System.out.println("HashMap prima di clear: " + hashMap);
        hashMap.clear();
        System.out.println("HashMap dopo clear: " + hashMap);
    }

    /**
     * Metodo per verificare se la mappa contiene una chiave specificata.
     * Restituisce true se la chiave specificata è presente nella mappa, altrimenti false.
     */
    public static void containsKey() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        boolean contieneChiave = hashMap.containsKey("A");
        System.out.println("La HashMap contiene la chiave 'A'? " + contieneChiave);
    }

    /**
     * Metodo per verificare se la mappa contiene un valore specificato.
     * Restituisce true se il valore specificato è presente nella mappa, altrimenti false.
     */
    public static void containsValue() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        boolean contieneValore = hashMap.containsValue(1);
        System.out.println("La HashMap contiene il valore 1? " + contieneValore);
    }

    /**
     * Metodo per ottenere una copia della mappa.
     * Restituisce una copia della mappa.
     */
    /*
    public static void clone() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        HashMap<String, Integer> hashMapCopy = (HashMap<String, Integer>) hashMap.clone();
        System.out.println("HashMap: " + hashMap);
        System.out.println("Copia della HashMap: " + hashMapCopy);
    }
    */
    public static void cloneHashMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        HashMap<String, Integer> hashMapCopy = (HashMap<String, Integer>) hashMap.clone();
        System.out.println("HashMap: " + hashMap);
        System.out.println("Copia della HashMap: " + hashMapCopy);
    }

    /**
     * Metodo per ottenere un set di chiavi della mappa.
     * Restituisce un set di chiavi presenti nella mappa.
     */
    public static void keySet() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        System.out.println("Chiavi nella HashMap: " + hashMap.keySet());
    }

    /**
     * Metodo per ottenere una collection di valori della mappa.
     * Restituisce una collection di valori presenti nella mappa.
     */
    public static void values() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        System.out.println("Valori nella HashMap: " + hashMap.values());
    }

}
