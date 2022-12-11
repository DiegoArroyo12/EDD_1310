package collectionsjava;
import java.util.TreeMap;
/**
 *
 * @author diego
 */
public class ADTTreeMap {
    public static void main(String[] args){
        System.out.println("TreeMap:\n");
        TreeMap<Integer, String> tree = new TreeMap();
        System.out.println("Método put:");
        // Agrega los valores al TreeMap y los ordena de menor a mayor
        tree.put(2, "Juan");
        tree.put(4, "Ana");
        tree.put(1, "Pepe");
        tree.put(3, "Camila");
        tree.put(5, "Joyce");
        System.out.println(tree);
        
        System.out.println("\nMétodo get: \n"+tree.get(3));
        // Regresa el valor que está asociado a esa llave
        
        System.out.println("\nMétodo remove: ");
        // Quita el valor asociado a la llave
        tree.remove(4);
        System.out.println(tree);
        
        System.out.println("\nMétodo replace: ");
        // Reemplaza el valor asociado a la llave por el nuevo valor
        tree.replace(2, "David");
        System.out.println(tree);
        
        System.out.println("\nMétodo containsKey: ");
        // Regresa un valor booleano si es que encuentra la llave
        if(tree.containsKey(1)){
            System.out.println("Contiene un índice de 1 y su valor es: ");
            System.out.println(tree.get(1));
        }
        
        System.out.println("\nMétodo containsValue: ");
        // Regresa un valor booleano si es que encuentra el valor
        if (tree.containsValue("Camila")) {
            System.out.println("Contiene un valor: 'Camila'");
        }
        
        System.out.println("\nMétodo keySet: ");
        // Regresa un set de las llaves contenidas en el HashMap
        for (Integer indice : tree.keySet()) {
            System.out.println(tree.get(indice));
        }
        
        System.out.println("\nMétodo firsKey: \n"+tree.firstKey());
        // Devuelve la primera llave
        
        System.out.println("\nMétodo lastKey: \n"+tree.lastKey());
        
        System.out.println("\nMétodo higherKey: \n"+tree.higherKey(2));
        // Devuelve la siguiente llave de la ingresada o null si no hay otra 
        
        System.out.println("\nMétodo lowerKey: \n"+tree.lowerKey(3));
        // Devuelve la llave anterior de la ingresa o null si no hay
        
        System.out.println("\nMétodo size: ");
        // Regresa el tamaño de el HashMap
        System.out.println(tree.size());
        
        System.out.println("\nMétodo clone: ");
        // Clona el HashMap como un Objeto
        Object hash2 = tree.clone();
        System.out.println(hash2);
        
        System.out.println("\nMétodo clear: ");
        // Elimina todo el contenido del HashMap
        tree.clear();
        System.out.println(tree);
        
        System.out.println("\nMétodo isEmpty: ");
        // Regresa un booleano para saber si el HashMap está vacío o no
        System.out.println(tree.isEmpty());
    }
}