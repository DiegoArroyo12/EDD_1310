package collectionsjava;
import java.util.LinkedHashMap;
/**
 *
 * @author diego
 */
public class ADTLinkedHashMap {
    public static void main(String[] args){
        System.out.println("LinkedHashMap: \n");
        LinkedHashMap<Integer, String> linkedhash = new LinkedHashMap();
        System.out.println("Método put:");
        // Agrega los valores al TreeMap y los ordena de menor a mayor
        linkedhash.put(2, "Juan");
        linkedhash.put(4, "Ana");
        linkedhash.put(1, "Pepe");
        linkedhash.put(3, "Camila");
        linkedhash.put(5, "Joyce");
        System.out.println(linkedhash);
        
        System.out.println("\nMétodo get: \n"+linkedhash.get(3));
        // Regresa el valor que está asociado a esa llave
        
        System.out.println("\nMétodo remove: ");
        // Quita el valor asociado a la llave
        linkedhash.remove(4);
        System.out.println(linkedhash);
        
        System.out.println("\nMétodo replace: ");
        // Reemplaza el valor asociado a la llave por el nuevo valor
        linkedhash.replace(2, "David");
        System.out.println(linkedhash);
        
        System.out.println("\nMétodo containsKey: ");
        // Regresa un valor booleano si es que encuentra la llave
        if(linkedhash.containsKey(1)){
            System.out.println("Contiene un índice de 1 y su valor es: ");
            System.out.println(linkedhash.get(1));
        }
        
        System.out.println("\nMétodo containsValue: ");
        // Regresa un valor booleano si es que encuentra el valor
        if (linkedhash.containsValue("Camila")) {
            System.out.println("Contiene un valor: 'Camila'");
        }
        
        System.out.println("\nMétodo keySet: ");
        // Regresa un set de las llaves contenidas en el HashMap
        for (Integer indice : linkedhash.keySet()) {
            System.out.println(linkedhash.get(indice));
        }
        
        System.out.println("\nMétodo size: ");
        // Regresa el tamaño de el HashMap
        System.out.println(linkedhash.size());
        
        System.out.println("\nMétodo clone: ");
        // Clona el HashMap como un Objeto
        Object hash2 = linkedhash.clone();
        System.out.println(hash2);
        
        System.out.println("\nMétodo clear: ");
        // Elimina todo el contenido del HashMap
        linkedhash.clear();
        System.out.println(linkedhash);
        
        System.out.println("\nMétodo isEmpty: ");
        // Regresa un booleano para saber si el HashMap está vacío o no
        System.out.println(linkedhash.isEmpty());
    }
}