package collectionsjava;
import java.util.HashMap;
/**
 *
 * @author diego
 */
public class ADTHashMap {
    public static void main(String[] args) {
        System.out.println("HashMap:\n");
        HashMap<Integer, String> hash = new HashMap();
        System.out.println("Método put:");
        // Agrega los valores al HashMap
        hash.put(1000, "Juan");
        hash.put(3000, "Ana");
        hash.put(1500, "Pepe");
        hash.put(2600, "Camila");
        System.out.println(hash);
        
        System.out.println("\nMétodo get: \n"+hash.get(1000));
        // Regresa el valor que está asociado a esa llave
        
        System.out.println("\nMétodo remove: ");
        // Quita el valor asociado a la llave 
        hash.remove(3000);
        System.out.println(hash);
        
        System.out.println("\nMétodo replace: ");
        // Reemplaza el valor asociado a la llave por el nuevo valor 
        hash.replace(1000, "Alberto");
        System.out.println(hash);
        
        System.out.println("\nMétodo containsKey: ");
        // Regresa un valor booleano si es que encuentra la llave 
        if (hash.containsKey(1500)) {
            System.out.print("Contiene un índice de 1500 y su valor es: ");
            System.out.println(hash.get(1500));
        }
        
        System.out.println("\nMétodo containsValue: ");
        // Regresa un valor booleano si es que encuentra el valor
        if (hash.containsValue("Camila")) {
            System.out.println("Contiene un valor: 'Camila'");
        }
        
        System.out.println("\nMétodo keySet: ");
        // Regresa un set de las llaves contenidas en el HashMap
        for (Integer indice : hash.keySet()) {
            System.out.println(hash.get(indice));
        }
        
        System.out.println("\nMétodo size: ");
        // Regresa el tamaño de el HashMap
        System.out.println(hash.size());
        
        System.out.println("\nMétodo clone: ");
        // Clona el HashMap como un Objeto
        Object hash2 = hash.clone();
        System.out.println(hash2);
        
        System.out.println("\nMétodo clear: ");
        // Elimina todo el contenido del HashMap
        hash.clear();
        System.out.println(hash);
        
        System.out.println("\nMétodo isEmpty: ");
        // Regresa un booleano para saber si el HashMap está vacío o no
        System.out.println(hash.isEmpty());
    }
}