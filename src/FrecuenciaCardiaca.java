public class FrecuenciaCardiaca {
    private String nombre;
    private String apellido;
    private int edad;
    private int mes;
    private int dia;
    private int anio;

// codigo hecho por Marcos Reyes

    public FrecuenciaCardiaca(String nombre, String apellido, int edad, int mes, int dia, int anio){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.mes=mes;
        this.dia=edad;
        this.anio=anio;

    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setEdad(int edad){
        if (edad<0){
            this.edad=0;
        }else{
            this.edad=edad;
        }
    }
    public int getEdad (){
        return edad;
    }

    public void setMes(int mes) {
        this.mes=mes;
    }
    public int getMes() {
        return mes;
    }

    public void setDia(int dia) {
        this.dia=dia;
    }
    public int getDia() {
        return dia;
    }

    public void setanio(int anio) {
        this.anio=anio;
    }

    public int getAnio() {
        return anio;
    }
    public int obtenerEdad() {
        int anioActual = 2026; // Año actual
        return anioActual - anio;
    }
    public int obtenerFrecuenciaCardiacaMax() {
        return 220 - obtenerEdad();
    }
    public String obtenerFrecuenciaCardiacaEsperada() {
        int max = obtenerFrecuenciaCardiacaMax();
        double minEsperada = max * 0.50;
        double maxEsperada = max * 0.85;

        return String.format("%.0f - %.0f bpm", minEsperada, maxEsperada);
    }
}

