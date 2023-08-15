package banco;

public class conta {

    private int numero;
    private double saldo;
    private pessoa titular;

    public conta(int numero, double saldo, pessoa titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Saldo após depois: R$%.2f", this.saldo);
        }else{
            System.out.println("O valor é invalido");
        }
    }
}