public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDaRaiza = new Conta();
        contaDaRaiza.saldo =100;
        contaDaRaiza.deposita(50);
        System.out.println(contaDaRaiza.saldo);
        boolean conseguiuRetirar = contaDaRaiza.saca(20);
        System.out.println(contaDaRaiza.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDoGuilherme = new Conta();
        contaDoGuilherme.deposita(1000);
        boolean sucessoTransferencia = contaDoGuilherme.transfere(300,contaDaRaiza);
        if(sucessoTransferencia) {
            System.out.println("Transferência feita com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaDoGuilherme.saldo);
        System.out.println(contaDaRaiza.saldo);

    }
}
