import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio_Tres {
    public static void main(String [] args ){
        //    Se tienen tres vectores. En el primero de ellos se guarda un número de dni,
       // en el segundo un nombre y en el tercero un apellido. Se desea un programa que
       // sea capaz de recorrer los tres vectores AL MISMO TIEMPO y mostrar cada uno de
       // estos datos por pantalla. Pista: tener en cuenta que el índice de cada vector
       // es correspondiente al índice de los demás, es decir, los datos contenidos en
       // el índice cero del vector de dni, se corresponde con el índice cero del vector de nombres y el de apellidos.

        List<Integer> numeroDNI = Arrays.asList(36568871, 48774861, 15659897);
        List<String> nombre = Arrays.asList("Sopapita", "Raulito", "Fernandito");
        List<String> apellido = Arrays.asList( "Arrameido", "Botonsio", "Otorron");

        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Sujeto " + i + " DNI: " + numeroDNI.get(i) + " Nombre: " + nombre.get(i) + " Apellido: " + apellido.get(i) );
        }




    }
}
