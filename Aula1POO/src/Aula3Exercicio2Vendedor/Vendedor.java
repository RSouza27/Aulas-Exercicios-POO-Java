package Aula3Exercicio2Vendedor;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;
    
    public Vendedor(int codigo, String nome, double percentualComissao){
        this.codigo             = codigo;
        this.nome               = nome;
        this.percentualComissao = percentualComissao;
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public double calcularPagamentoComissao(double valorVenda){
       return valorVenda * percentualComissao / 100;
    }
    
    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return (valorVenda - desconto) * percentualComissao / 100 ;
    }
    
    public String imprimir() {
        return "Código do Vendedor: " + getCodigo() +
               "\nNome: " + getNome() +
               "\n% de Comissão: " + getPercentualComissao();  
    }  
    
    public String imprimir(String str) {
        return imprimir() + "\n" + str;  
    }
    
    public String imprimir(double valorVenda, double desconto) {
        return "Código do Vendedor: " + getCodigo() +
               "\nNome: " + getNome() +
               "\nValor da Venda Com Desconto: " + valorVenda +
               "\nDesconto: " + desconto +
               "\n% de Comissão: " + getPercentualComissao() +
               "\nComissão a Receber: " + calcularPagamentoComissao(valorVenda, desconto); 
    }    
    
    public String imprimir(double valorVenda) {
        return "Código do Vendedor: " + getCodigo() +
               "\nNome: " + getNome() +
               "\nValor da Venda Sem Desconto: " + valorVenda +
               "\n% de Comissão: " + getPercentualComissao() +
               "\nComissão a Receber: " + calcularPagamentoComissao(valorVenda);
    }    
}
