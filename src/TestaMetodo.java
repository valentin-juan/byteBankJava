public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);
        System.out.println("Saldo da conta depois do deposito: " + conta.saldo);

        boolean conseguiuRetirar = conta.saca(20);
        System.out.println("Saldo atualizado:" + conta.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaMarcela = new Conta();
        contaMarcela.deposita(1000);

        if(contaMarcela.transfere(300, conta)){
            System.out.println("Transferencia feita com sucesso!");
        } else {
            System.out.println("Saldo insuficiente...");
        }
        System.out.println("Conta da Marcela: " + contaMarcela.saldo);
        System.out.println("Saldo atualizado depois da transfencia: " + conta.saldo);
    }
}
