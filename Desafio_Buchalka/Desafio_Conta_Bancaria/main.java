package Desafio_Conta_Bancaria;

public class main {
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria();
        conta.setNumeroDaConta("12345-6");
        conta.setNomeDoCliente("Victor");
        conta.setEmail("victor@email.com");
        conta.setTelefone("99999-9999");
        conta.setSaldo(100.0);

        conta.depositar(200.0);
        conta.sacar(150.0);

        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
