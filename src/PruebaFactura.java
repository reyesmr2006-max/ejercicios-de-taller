import java.util.Scanner;
public class PruebaFactura {
    public static void main(String[]args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Bienvenido al Sistema de Facturacion");
        System.out.println("Cogido realizado por Marcos Reyes");
        System.out.print("Ingrese el numero de la Pieza:");
        String numPieza= entrada.nextLine();

        System.out.print("ingrese la descripcion de la pieza:");
        String pieza= entrada.nextLine();

        System.out.print("ingrese la cantidad que desea comprar");
        int cantidad= entrada.nextInt();

        System.out.print("ingrese el precio del articulo");
        double precio= entrada.nextDouble();

        Factura miFactura= new Factura(numPieza,pieza,cantidad,precio);

        System.out.println("Resumen de la Factura:");
        System.out.println("Pieza:"+ miFactura.obtenerNumPiezas()+"-"+ miFactura.obtenerSeriedePieza());
        System.out.println("cantidad"+ miFactura.obtenerCantidad());
        System.out.println("precio unitario: $"+ miFactura.obtenerPrecio());

        System.out.println("el monto total de la factura es: $"+ miFactura.TotalFactura());

        entrada.close();

    }

}
