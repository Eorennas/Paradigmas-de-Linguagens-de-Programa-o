public class ContaBancaria {
    private String titular;
    private double saldo;  

 
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("O valor de depósito deve ser positivo.");
        }
    }


    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.printf("Saque de R$%.2f realizado com sucesso!\n", valor);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("O valor de saque deve ser positivo.");
        }
    }


    public String consultarSaldo() {
        return String.format("Saldo atual: R$%.2f", saldo);
    }

   
    public double getSaldo() {
        return saldo;
    }

    
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000);

   
        System.out.println(conta.consultarSaldo());
        conta.depositar(500);
        System.out.println(conta.consultarSaldo());
        conta.sacar(300);
        System.out.println(conta.consultarSaldo());
        conta.sacar(1500);  
    }
}
