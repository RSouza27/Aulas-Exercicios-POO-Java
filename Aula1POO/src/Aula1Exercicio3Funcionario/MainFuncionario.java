package Aula1Exercicio3Funcionario;

import javax.swing.JOptionPane;

public class MainFuncionario {

    public static void main(String[] args) {
        String nome, opt = "";
        int cracha, tipoVinculo;
        double valorHora = 0;
        double qntdHora = 0;
        double salario = 0;
        double valorDesconto = 0;
        
        String[] opcoes = {"Horista", "Normal"};
        
        Funcionario funcionario = new Funcionario();
        
        do {
            opt = JOptionPane.showInputDialog("1 - Cadastrar Funcionario \n2 - Mostrar Folha de Pagamento "
                    + "                       \n3 - Alterar remuneração \n4 - Sair");
            
            if(opt == null){
                System.exit(0);
            }
            
            switch(opt) {
                case "1":
                    //Cadastrar
                    nome = JOptionPane.showInputDialog("Digite seu Nome: ");
                    cracha = Integer.parseInt(JOptionPane.showInputDialog("Digite numero do seu Cracha: ")); 
                    tipoVinculo = JOptionPane.showOptionDialog(null, "Qual o tipo de vínculo?",
                        "Escolha uma opção",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                    if(tipoVinculo == 0){
                        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor por Hora Trabalhada: "));
                        qntdHora  = Double.parseDouble(JOptionPane.showInputDialog("Digite a Quantidade de Horas Trabalhadas:" ));
                    }else {
                        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Salário: "));
                    }     
                    valorDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o Desconto de Salário: "));
                         
                    funcionario = new Funcionario();
                    funcionario.setNome(nome);
                    funcionario.setCracha(cracha);
                    funcionario.setTipoVinculo(tipoVinculo);
                    funcionario.setValorHora(valorHora);
                    funcionario.setQntdHora(qntdHora);
                    funcionario.setSalario(salario);
                    funcionario.setValorDesconto(valorDesconto);
                    break;
                    
                case "2":
                    //Visualizar
                    if(funcionario == null){
                        JOptionPane.showMessageDialog(null, "Nenhum Funcionário Cadastrado!");
                        break;
                    }
                    
                    JOptionPane.showMessageDialog(null, funcionario.imprimirFuncionario());
                    break;
                    
                case "3":    
                    if (funcionario.getTipoVinculo() == 0) {
                        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor da hora: "));
                        qntdHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo total de horas: "));    
                    } else {
                        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo salário: "));
                    }
                    
                    funcionario.setValorHora(valorHora);
                    funcionario.setQntdHora(qntdHora);
                    funcionario.setSalario(salario);
                    break;
                    
                case "4":
                    //Sair
                    break; 
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
            }           
        }while(!opt.equals("4"));
    }         
}
