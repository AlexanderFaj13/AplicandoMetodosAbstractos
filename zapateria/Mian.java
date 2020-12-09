
package zapateria;


public class Mian {
    public static void main(String[] args) {
     Tennis tenis = new Tennis(19.2, "Rojo", "Adidad", "Serifa");
        System.out.println("Tenis\n");
     tenis.datosCalzado();
        System.out.println("Precio general: "+tenis.valorTotal());
     
        System.out.println("");   
        
        Chinela chinela = new Chinela("Punteado", 13, "negro", "Laocste", "Cocodrilo");
        
        chinela.setTipo("Chinela\n");
        
        chinela.datosCalzado();
        System.out.println("Precio general: "+chinela.valorTotal());
        System.out.println("");
        
        
        Zapatillas zapatilla = new Zapatillas("Zapatilla","redondas" , 14,"Negro", "Channel", "Cuero");
        zapatilla.datosCalzado();
        System.out.println("Precio general: "+zapatilla.valorTotal());
    }
}
