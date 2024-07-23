public class HellowWord1 {
    
    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase( "DEV")) {
            System.out.print("Executando em DEV");
        } else if (ambiente.equalsIgnoreCase( "Teste"))
            System.out.print("Executando em teste");
            else {
                System.out.print(ambiente);
            }
    }
}



