public class PrimeiraClasse {

    public static void main(String args[]) {
        System.out.println("Olá Nelson Nolasco");
        Cliente cliente = new Cliente();
        cliente.cadastraEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        //cliente.imprimirEndereco();
        String end = cliente.retornarNomeCliente();
        System.out.println(cliente.retornarNomeCliente());
        System.out.println(cliente.getValorTotal ());
    }


}
