package AppEstudiantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEstudiantesApp {

    public static void main(String [] args){
        /*Estudiantes estudiantes = new Estudiantes();
        estudiantes.asignarEstudiantes();
        estudiantes.pagarTodo();
        */
        Scanner scanner = new Scanner(System.in);
        List<Estudiantes>list = new ArrayList<>();
        //preguntamos cuantos estudiantes se desea agregar
        System.out.println("Cuantos estudiantes desea agregar: ");
        int cantidadEstudiantes = scanner.nextInt();

        for (int i = 0; i < cantidadEstudiantes; i++){
            list.add(new Estudiantes());
            list.get(i).asignarEstudiantes();
            list.get(i).pagarTodo();
            //System.out.println(estudiantes.mostrarInformacion());

        }
        //mostrar info
        System.out.println(list.get(1).mostrarInformacion());
    }

}
