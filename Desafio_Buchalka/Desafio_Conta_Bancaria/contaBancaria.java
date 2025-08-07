package Desafio_Conta_Bancaria;

public class contaBancaria {

    private String numeroDaConta;
    private double saldo;
    private String nomeDoCliente;
    private String email;
    private String telefone;

    public String getNumeroDaConta() {
        return numeroDaConta;
    }
    public Double getSaldo() {
        return saldo;
    }
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Verifique o saldo ou o valor.");
        }
    }

}
