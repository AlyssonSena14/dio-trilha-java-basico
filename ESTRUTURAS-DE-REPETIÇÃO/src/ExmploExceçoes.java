import java.text.NumberFormat;
import java.text.ParseException;

public  class ExmploExceçoes{
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
            
        } catch (ParseException e) {
            System.out.println("Apenas Digite Numeros !");
           
        }
        
        
    }

}