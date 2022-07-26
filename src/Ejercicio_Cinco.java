import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ejercicio_Cinco {
    public static void main (String[] args) {

/*
 Se necesita un vector que permita cargar
  por teclado el nombre de 10 animales.
   A partir de esta carga, se desea otro vector que copie los mismos nombres
   pero en el orden inverso, es decir, si los nombres son:
    perro, gato, lagartija, el nuevo vector debe contener:
     lagartija, gato, perro. Una vez realizado el cambio,
      mostrar por pantalla ambos vectores para compararlos.
 */
        List <String> positions = new ArrayList();
        positions.add("Primero");
        positions.add("Segundo");
        positions.add("Tercero");
        positions.add("Cuarto");
        positions.add("Quinto");
        positions.add("Sexto");
        positions.add("Septimo");
        positions.add("Octavo");
        positions.add("Noveno");
        positions.add("Ultimo");


        ArrayList<List> tenAnimals = new ArrayList();
        ArrayList<List> tenAnimalsInverse = new ArrayList();
        int counter = 0;
        do {
                String animalObtained =JOptionPane.showInputDialog(null, "Se necesitan 10 animales, ingrese el " + positions.get(counter));
                tenAnimals.add(Collections.singletonList(animalObtained));
                counter +=1;
        }while (counter < 3);

        for (int i = tenAnimals.size()-1; i > -1 ; i--) {
            tenAnimalsInverse.add(tenAnimals.get(i));
        }

        JOptionPane.showMessageDialog(null, "Lista Ingresada " + tenAnimals.toString());
        JOptionPane.showMessageDialog(null, "Lista Inversa " + tenAnimalsInverse.toString());
    }
}
