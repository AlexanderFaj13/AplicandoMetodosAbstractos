/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateria;

public  class Tennis extends Calzado{
    
    
    
    public Tennis(double talla, String color, String marca, String materailManufactura) {
        super(talla, color, marca, materailManufactura);
    }

    @Override
    public void setMaterailManufactura(String materailManufactura) {
        super.setMaterailManufactura(materailManufactura); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMaterailManufactura() {
        return super.getMaterailManufactura(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMarca() {
        return super.getMarca(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setColor(String color) {
        super.setColor(color); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColor() {
        return super.getColor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTalla(double talla) {
        super.setTalla(talla); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTalla() {
        return super.getTalla(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double valorTotal() {
       double precio;
        
        if(getMarca() == "Adidas"){
            precio = 100;
        }else if(getMarca() == "Nike"){
            precio = 200;
        }else{
            precio= 50;
        }
      
        return precio;
    }

    @Override
    public void datosCalzado() {
        super.datosCalzado(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Precio: " + valorTotal());
    }
    
    
}
