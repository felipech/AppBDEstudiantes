package AppEstudiantes;

import java.util.Scanner;

public class Estudiantes {
    private String primerNombre;
    private String apellido;
    private String estudianteIDCompleto;
    private String cursos = "";
    private int nivelEducacion;
    private int costoMatricula = 0;
    private static int costoCurso = 600;
    //id del estudiante
    private static int IDEstudiante = 100;



    public Estudiantes(){
        //Ingresar el nombre del estudiante
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el Nombre del Estudiante: ");
        this.primerNombre = scanner.nextLine();
        System.out.println("Ingresar el Apellido del Estudiante: ");
        this.apellido = scanner.nextLine();

        System.out.println("Ingresar el nivel de estudios del Estudiante: ");
        System.out.println("1 para Educacion Basica");
        System.out.println("2 para Educacion Media");
        System.out.println("3 para Educacion Universitaria");
        System.out.println("4 para Master o PHD");
        this.nivelEducacion = scanner.nextInt();
        asignarEstudianteId();

        System.out.println(primerNombre + " " + apellido + " " + estudianteIDCompleto);

    }

    //generar ID
    private void asignarEstudianteId(){
        //la id va ser el nivel de estudios mas el campo estatico id
        this.estudianteIDCompleto = nivelEducacion + ""  +IDEstudiante;
        IDEstudiante++;
    }
    //agregar a un curso
    public void asignarEstudiantes(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese el curso al que quiere entrar (Q para Salir)");
            String curso = scanner.nextLine();
            if (!curso.equals("Q")) {
                cursos = cursos + "\n" + curso;
                costoMatricula = costoMatricula + costoCurso;
            } else {
                break;
            }
        }while (true);

        System.out.println("Ingresado al curso: " + cursos);
        System.out.println("Costo Matricula: " + costoMatricula);

    }

    //ver el balance
    public void verBalance(){
        System.out.println("Tu balance es: " + costoMatricula);
    }
    //pagar
    public void pagarTodo(){
        System.out.println("Su balance por pagar es: ");
        verBalance();
        System.out.println("Cuanto desea pagar: ");
        Scanner scanner = new Scanner(System.in);
        int pago = scanner.nextInt();
        costoMatricula = costoMatricula - pago;

        System.out.println("Gracias por pagar: " + pago);
        verBalance();
    }

    //mostrar informacion

    public String mostrarInformacion(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nombre ");
        stringBuilder.append(primerNombre).append(" ").append(apellido);
        stringBuilder.append("\n");
        stringBuilder.append("ID: ").append(estudianteIDCompleto);
        stringBuilder.append("\n");
        stringBuilder.append("Nivel de Educacion ").append(nivelEducacion);
        stringBuilder.append("\n");
        stringBuilder.append("Sus cursos son:").append(cursos);
        return String.valueOf(stringBuilder);
    }

}
