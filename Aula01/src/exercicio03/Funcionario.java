
package exercicio03;

public class Funcionario {
    private String nome;
    private int cracha;
    private int tipoVinculo;
    private double valorHora;
    private double qtdeHora;
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

    public double getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(double qtdeHora) {
        this.qtdeHora = qtdeHora;
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
    
    public double calculaSalario () {
        if (tipoVinculo == 1) {
            double salarioHora = valorHora * qtdeHora;
            return salarioHora;
        } else {
            return salario;
        }
    }
    
    public double calculaValorReceber () {
        if (tipoVinculo == 1) {
            double descontadoHora = (valorHora * qtdeHora) - valorDesconto;
            return descontadoHora;
        } else {
            double descontado = salario - valorDesconto;
            return descontado;
        }
    }
    
    public String exibirVinculo() {
        if (tipoVinculo == 1) {
            return "Horista";
        } else {
            return "Normal";
        }
    }
    
    public String imprimir () {
        String str = "Nome: " + getNome() +
                     "\nCrachá: " + getCracha() +
                     "\nVínculo: " + exibirVinculo() +
                     "\nSalário: " + calculaSalario() +
                     "\nDesconto: " + getValorDesconto() +
                     "\nValor a receber: " + calculaValorReceber();
        return str;
    }
}

