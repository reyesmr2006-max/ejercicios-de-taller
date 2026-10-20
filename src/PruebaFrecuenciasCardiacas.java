import java.util.Scanner;
public class PruebaFrecuenciasCardiacas {
public static void main(String[]args){
    Scanner entrada=new Scanner(System.in);
    System.out.println(" Prueba de Frecuencias Crdiacas");
    System.out.print("ingrese el nombre del paciente");
    String nombre= entrada.nextLine();
    System.out.print("ingrese el apellido del paciente");
    String apellido= entrada.nextLine();
    System.out.print("ingrese la edad del paciente");
    int edad=entrada.nextInt();
    System.out.print("ingrese el dia de nacimiento");
    int dia=entrada.nextInt();
    System.out.print("ingrese el mes de nacimeinto");
    int mes= entrada.nextInt();
    System.out.print("ingrese el anio de nacimiento");
    int anio=entrada.nextInt();

    FrecuenciaCardiaca persona= new FrecuenciaCardiaca(nombre,apellido,edad,dia,mes,anio);
    System.out.print("nombre completo:"+ persona.getNombre()+" "+ persona.getApellido() );
    System.out.print("fecha de nacimiento:"+persona.getDia()+"/"+ persona.getMes()+"/"+persona.getAnio());
    System.out.print("edad:"+ persona.getEdad()+"anios");
    System.out.print("frecuencia cardiaca maxima sugerida:"+persona.obtenerFrecuenciaCardiacaMax()+"bpm");
    System.out.print("frecuencia cardiaca esperada:"+persona.obtenerFrecuenciaCardiacaEsperada());

    entrada.close();

    }

}

