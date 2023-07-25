public class TestaBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Juan Valentin";
        cliente.cpf = "000.000.000-00";
        cliente.profissao = "Desenvolvedor";

        Conta contaCliente = new Conta();
        contaCliente.deposita(100);
        contaCliente.titular = cliente;
        System.out.println(contaCliente.titular.nome);
    }
}
