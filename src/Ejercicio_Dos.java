import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Ejercicio_Dos {
    public static void main(String[] args) {
        // En un vector de 15 posiciones
        // se almacenan las edades de 15 alumnos.
        // Se desea un programa que sea capaz de determinar
        // cuál es la mayor edad y cuál es la menor edad que se encuentra entre los estudiantes.

        List <Integer> edadesAlumnos = Arrays.asList(12,11,15,16,21,31,17,18,25,11,17,15,21,22,25);
        int alumnoMasViejito = Collections.max(edadesAlumnos);
        int alumnoMasNuevito = Collections.min(edadesAlumnos);
        JOptionPane.showMessageDialog(null, "Listado de Edades de Alumnos" + edadesAlumnos.toString() );
        JOptionPane.showMessageDialog(null, "Edad alumno mas Viejito: " + alumnoMasViejito + ", " + "Edad alumno mas Nuevito: " + alumnoMasNuevito   );


    }


}
