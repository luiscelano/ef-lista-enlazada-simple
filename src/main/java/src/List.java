package src;

/**
 *
 * @author luiscelano
 */
public class List {
    protected Node start, end;
    
    public List() {
        start = null;
        end = null;
    }
    
    //Método que agrega el nodo al inicio de la lista
    public void addFromStart(int n){
          start = new Node(n, start);
          if(end == null) {
              end = start;
          }
    }
    
    //Método para mostrar los datos
    public void showList() {
        Node flag = start;
        System.out.println();
        do {
            System.out.print("["+flag.value+"]--->");
            flag = flag.next;
        }while(flag != null);
    }
}
