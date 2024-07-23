/**
 * AUTHOR @nelsonnolasco
 */

public class Conta {
    public static void main(String[] args) {
    Double conta;
    //instanciação da classe
    Conta conta = new Conta();

    //valor de saldo
    conta.setSaldo(633.50);

    //valor de depósito
    conta.depositar(555.10);

    //valor resgatado
    conta.verificaSaldo();

    }
}
