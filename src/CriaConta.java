public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("Saldo da primeira conta: R$ " + primeiraConta.saldo);
        System.out.println("Saldo da ssegunda conta: R$ " + segundaConta.saldo);

        System.out.println("Agência da primeira conta: " + primeiraConta.agencia);
        System.out.println("Número da primeira conta: " + primeiraConta.numero);

        System.out.println("Agência da segunda conta: " + segundaConta.agencia);
        System.out.println("Número da segunda conta: " + segundaConta.numero);


        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta está na agencia: " + segundaConta.agencia);

        if (primeiraConta == segundaConta) {
            System.out.println("Mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }
    }
}
