
public class Empleado {

    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salarioMensual = salarioMensual;
    }




    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public void establecerApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double obtenerSalarioMensual() {
        return salarioMensual;
    }

    public void establecerSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }
}

