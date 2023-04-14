public class Estoques extends Supermercado{
    private String produto;
    private int valorProduto;
    private int qtdEstoque;



    
    public Estoques(String produto, int valorProduto, int qtdEstoque) {
        this.produto = produto;
        this.valorProduto = valorProduto;
        this.qtdEstoque = qtdEstoque;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(int valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public int Promocao() {
        return 0;
    }

    @Override
    public int tipodePagamento() {
        return 0;
    }

    @Override
    public void Estoque() {
        if(getQtdEstoque()==0){
            System.out.println("Erro na quantidade de estoque!!");
        }else{
            System.out.println(getQtdEstoque());
        }

    }
    
}
