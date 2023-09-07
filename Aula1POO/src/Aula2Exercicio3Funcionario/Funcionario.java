package Aula2Exercicio3Funcionario;

public class Funcionario {

    private String nome;
    private int cracha;
    private int tipoVinculo;
    private double valorHora;
    private double qntdHora;
    private double salario;
    private double valorDesconto;

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public int getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(int tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQntdHora() {
        return qntdHora;
    }

    public void setQntdHora(double qntdHora) {
        this.qntdHora = qntdHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public double calcularSalario() {
        if(tipoVinculo == 1){
            return valorHora * qntdHora;
        }else 
            return salario;
    }        
    
    public double valorReceber(){
        if (tipoVinculo == 1){
            return (valorHora * qntdHora) - valorDesconto; 
        }
        return salario - valorDesconto;  
    }
    
    public String exibirVinculo() {
        if (tipoVinculo == 1) {
            return "Horista";
        } else {
            return "Normal";
        }
    }
    
    public String imprimirFuncionario() {
        String str = "Nome: "  + getNome() +
                     "\nNumero do Cracha: "  + getCracha() +
                     "\nTipo de Vinculo: " + exibirVinculo() +
                     "\nSalário: "  + calcularSalario() +
                     "\nDesconto do Salário: "  + getValorDesconto() + 
                     "\nValor a Receber: "  + valorReceber();
        
        return str;
    } 
}
