
public class RBTreeMapDemo {
    public static void main(String[] args) {
        System.out.println("Construct a red-black tree.");
        RBTreeMap<String, String> map = new RBTreeMap<String, String>();
        
        map.insert("IPM1", "M774");
        map.insert("T80B", "3OF26");
        map.insert("Type 90", "JM33");
        map.insert("Leopard 2A4", "DM23");
        map.insert("Challenger Mk.3", "L23A1");
        map.insert("Type 99A2", "Dual-vector foil");
        
        RBTreeMap<String, String>.RBTNode<String, String> iterator;
        for(iterator=map.first(); iterator!=null; iterator=map.successor(iterator)) {
            System.out.println(iterator.key + " => " + iterator.value);
        }
        
        map.remove("Type 90");
        map.remove("Leopard 2A4");
        map.remove("M1 Abrams");
        System.out.println("\nAfter removed:");
        for(iterator=map.first(); iterator!=null; iterator=map.successor(iterator)) {
            System.out.println(iterator.key + " => " + iterator.value);
        }
    }
}
