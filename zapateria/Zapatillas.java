
package zapateria;


public class Zapatillas extends Calzado {
    private String tipo;  
    private String estilo;

    public Zapatillas(String tipo, String estilo, double talla, String color, String marca, String materailManufactura) {
        super(talla, color, marca, materailManufactura);
        this.tipo = tipo;
        this.estilo = estilo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

 //Este es el metodo abstracto ya que no se puede implementar en la clase padre
    @Override
    public double valorTotal() {
        double precio;
        
        if(getColor() == "Negro"){
            precio = 150;
        }else if(getMarca() == "Blanco"){
            precio = 200;
        }else{
            precio= 50;
        }
      
        return precio;
    }

    @Override
    public void datosCalzado() {
        System.out.println("/t"+tipo);
        super.datosCalzado(); //estos son los datos de la clase padre incluyendo los datos propios de la clase
        System.out.println("Precio: " + valorTotal());
    }
   
    }

  
    
    
    
    
  

    

