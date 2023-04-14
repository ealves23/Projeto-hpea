public class Main {
   
       public static void main(String[] args) {
        
        Estoques produtoa=new Estoques("Macarrão",12,40);
        produtoa.Estoque();

        Cliente clientea=new Cliente("José","Rua das Orquideas","Cartao","j.almeida@gemail.com");
        clientea.Promocao();
        clientea.tipodePagamento();
        System.out.println(clientea.toString());

    }
}
