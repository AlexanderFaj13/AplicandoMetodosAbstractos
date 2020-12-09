
package zapateria;


public abstract class Calzado {
    
private double talla;
private String color;
private String marca;
private String materailManufactura;

    public Calzado(double talla, String color, String marca, String materailManufactura) {
        this.talla = talla;
        this.color = color;
        this.marca = marca;
        this.materailManufactura = materailManufactura;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterailManufactura() {
        return materailManufactura;
    }

    public void setMaterailManufactura(String materailManufactura) {
        this.materailManufactura = materailManufactura;
    }
   
    
public abstract double valorTotal(); 
    

public void datosCalzado(){
    System.out.println("Talla: "+talla);
    System.out.println("Color: "+color);
    System.out.println("Marca: "+marca);
    System.out.println("Material: "+materailManufactura);
}

}
