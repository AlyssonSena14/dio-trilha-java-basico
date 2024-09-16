public class FormatadordeCepExmeplo {
    
    public static void main(String[] args) {
        try { 
            String cepFormatado = formatarCep("23765065");
            System.out.println(cepFormatado);
            
        } catch (cepInvalidoException e) {
            System.out.println("O Cep não Corresponde com as Regras de Negocio Ex: 23.765-064");
        }
       

        
    }

    static String formatarCep (String cep) throws  cepInvalidoException {

    
        if (cep.length() != 8)
            throw new cepInvalidoException();  

        return "23.765-064";
    }

               
}

    

    
