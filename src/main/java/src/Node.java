package src;

/**
 *
 * @author luiscelano
 */
public class Node {
    public int value;
    public Node next;
    
    
    //Constructor para insertar al final
    public Node(int n) {
        this.value = n;
    }
    
    //Constructor para instertar al inicio
    public Node(int n, Node d){
        this.value = n;
        this.next = d; 
    }
}
