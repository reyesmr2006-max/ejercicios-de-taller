public class PruebaEmpleado extends Empleado {
    public static void main(String[] args){

        Empleado empleado1=new Empleado("Joan","Gallardo",450);
        Empleado empleado2=new Empleado("Marcos","Reyes", 300);

        System.out.println("Datos empleado 1");
        System.out.println("Nombre: "+empleado1.obtenerPrimerNombre()+" Apellido: "+empleado1.obtenerApellidoPaterno()+" Salario: "+empleado1.obtenerSalarioMensual());

        System.out.println("Datos empleado 2");
        System.out.println("Nombre: "+empleado2.obtenerPrimerNombre()+" Apellido: "+empleado2.obtenerApellidoPaterno()+" Salario: "+empleado2.obtenerSalarioMensual());

        System.out.println();

        System.out.println("Empleado: " + empleado2.obtenerPrimerNombre() + " " + empleado2.obtenerApellidoPaterno());
        System.out.println("Salario anual: $" + empleado2.obtenerSalarioMensual() * 12);

        System.out.println("SALARIOS MENSUAL CON AUMENTO MENSUAL DEL 10 %");
        empleado1.establecerSalarioMensual(empleado1.obtenerSalarioMensual() * 1.10);
        empleado2.establecerSalarioMensual(empleado2.obtenerSalarioMensual() * 1.10);

        System.out.println();

        System.out.println("SALARIOS ANUALES CON AUMENTO DEL 10 %");

        System.out.println("Empleado 1");
        System.out.println("Empleado: " + empleado1.obtenerPrimerNombre() + " " + empleado1.obtenerApellidoPaterno());
        System.out.println("Salario anual: $" + empleado1.obtenerSalarioMensual() * 12);

        System.out.println("Empleado 2");
        System.out.println("Empleado: " + empleado2.obtenerPrimerNombre() + " " + empleado2.obtenerApellidoPaterno());
        System.out.println("Salario anual: $" + empleado2.obtenerSalarioMensual() * 12);
    }



    public PruebaEmpleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        super(primerNombre, apellidoPaterno, salarioMensual);
    }

    @Override
    public String obtenerPrimerNombre() {
        return super.obtenerPrimerNombre();
    }

    @Override
    public void establecerPrimerNombre(String primerNombre) {
        super.establecerPrimerNombre(primerNombre);
    }

    @Override
    public String obtenerApellidoPaterno() {
        return super.obtenerApellidoPaterno();
    }

    @Override
    public void establecerApellidoPaterno(String apellidoPaterno) {
        super.establecerApellidoPaterno(apellidoPaterno);
    }

    @Override
    public double obtenerSalarioMensual() {
        return super.obtenerSalarioMensual();
    }

    @Override
    public void establecerSalarioMensual(double salarioMensual) {
        super.establecerSalarioMensual(salarioMensual);
    }
}
