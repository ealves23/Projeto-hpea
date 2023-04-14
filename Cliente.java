import java.util.Scanner;

public class Cliente extends Supermercado {
    String nome;
    String endereco;
    String formaPagamento;
    String email;
    int compras;
    
    public Cliente(String nome, String endereco, String formaPagamento, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.formaPagamento = formaPagamento;
        this.email = email;
    }
    Scanner leitor=new Scanner(System.in);
    
    public int getCompras() {
        return compras;
    }
    public void setCompras(int compras) {
        this.compras = compras;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Cliente nome:" + nome + ", endereco:" + endereco + ", email:" + email + "";
    }
    @Override
    public void Promocao() {
        System.out.println("Quantas compras o cliente fez?");
        int compra;
        try{compra=leitor.nextInt();

            if(compra==5){
                System.out.println("Parabéns você ganhou um cumpom de desconto!!");

            }else{
                System.out.println("Cliente ainda não alcançou as vendas!!");
            }
        }catch(Exception e){
            System.out.println("Digite novamente!!");
        }
    }
    @Override
   
        public void tipodePagamento() {
        System.out.println("Digite 1 para a vista ou 2 a prazo:");
        try{
        int number=leitor.nextInt();
        if(number==1){
            System.out.println("Pagamento a vista");
        }else if(number==2){
            System.out.println("Pagamento a prazo ");
        }else{
            System.out.println("Erro!!");
        }
            
        }catch (Exception e) {
            System.out.println("Insira o dado novamente! ");    
            }

    }

    @Override
    public void Estoque() {
       
    }
    



}
