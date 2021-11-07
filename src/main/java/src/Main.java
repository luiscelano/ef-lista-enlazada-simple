package src;

import javax.swing.JOptionPane;

/**
 *
 * @author luiscelano
 */
public class Main {
       public static void main(String[] args){
          int opt = 0;
          List nodes = new List();
          do{
             try{
                 opt = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "1. Agregar elemento al inicio de la lista.\n"
                    +"2. Mostrar los datos de la lista. \n"
                    +"3. Salir.", "Menú principal", 3));
             
             switch(opt) {
                 case 1: 
                     int value = Integer.parseInt(JOptionPane.showInputDialog(null,
                      "Ingresa un valor", "Ingresar nodo", 3));
                     nodes.addFromStart(value);
                     break;
                 case 2: 
                     nodes.showList();
                     break;
                 case 3: 
                     break;
                 default:
                     throw new Exception("Has Seleccionado una opción incorrecta!");
             }
             }catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
             }
          }while(opt != 3);
       }
}
