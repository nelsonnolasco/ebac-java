public class Cliente {

   private int codigo;

   private String nome;

   private String endereco;

   public int getCodigo() {
      return codigo;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   public java.lang.String getNome() {
      return nome;
   }

   public void setNome(java.lang.String nome) {
      this.nome = nome;
   }

   public java.lang.String getEndereco() {
      return endereco;
   }

   public void setEndereco(java.lang.String endereco) {
      this.endereco = endereco;
   }
   public void cadstrarEndereco(String endereco) {

   }

   public void cadastraEndereco(String endereco) {
      setEndereco(endereco);
   }

   public void imprimirEndereco () {
      System.out.println(this.endereco);
   }

   public String retornarNomeCliente() {
       return "Endereco do Nelson Nolasco";
   }
   public int getValorTotal() {
      return 20;
   }

}
