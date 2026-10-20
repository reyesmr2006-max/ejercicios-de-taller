public class Factura {
private String pieza;
private String numPieza;
private int cantidad;
private double precio;

public Factura(String pieza, String NumPieza, int cantidad,double precio){
    this.pieza=pieza;
    this.numPieza=NumPieza;

    if (cantidad>0){
        this.cantidad=cantidad;
    }else{
        this.cantidad=0;
    }
    if(precio>0.0){
        this.precio=precio;
    }else{
        this.precio=0.0;
    }
}
public void EstablecerCantidad(int cantidad){
    if (cantidad>0){
        this.cantidad=cantidad;
    }else{
        this.cantidad=0;
    }
}
public int obtenerCantidad(){
    return cantidad;
}

public void establecerSeriedePieza(String pieza){
    this.pieza=pieza;
}
public String obtenerSeriedePieza(){
    return pieza;
}

public void establecerNumPiezas(String NumPieza){
    this.numPieza=NumPieza;
}
public String obtenerNumPiezas(){
    return numPieza;
    }

    public void establecerPrecio(double precio) {
        if(precio>0){
            this.precio=precio;
        }else{
            this.precio=0.0;
        }
    }
    public double obtenerPrecio(){
    return precio;
    }

    public double TotalFactura(){
    return cantidad* precio;
}



}

