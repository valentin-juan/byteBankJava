public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);
        System.out.println("Saldo da conta depois do deposito: " + conta.saldo);

        boolean conseguiuRetirar = conta.saca(20);
        System.out.println("Saldo atualizado:" + conta.saldo);
        System.out.println(conseguiuRetirar);
    }
}
