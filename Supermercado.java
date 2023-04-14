public abstract class Supermercado{
      private String id_cliente;
      
      public abstract void Promocao();
      public abstract void tipodePagamento();
      public abstract void Estoque();

  

    
    public String getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
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
   




    }
