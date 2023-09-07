package exercicio03;

import javax.swing.JOptionPane;

public class MainExercicio03 {

    public static void main(String[] args) {
        String nomeFuncionario;
        int escolha, crachaFuncionario, vinculo;
        double horas = 0;
        double custoHora= 0; 
        double salarioFuncionario = 0;
        double desconto = 0;
        
        String[] menu = {"Criar funcionário", "Mostrar folha de pagamento", "Alterar remuneração", "Sair"};
        String[] opcoes = {"Horista", "Normal"};
        
        Funcionario funcionario = new Funcionario();
        
         do {    
            escolha = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo:",
                "Escolha uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
        
        
            switch (escolha) {
                case 0:
                    nomeFuncionario = JOptionPane.showInputDialog("Digite o nome: ");
                    
                    crachaFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Digite o crachá: "));           

                    vinculo = JOptionPane.showOptionDialog(null, "Qual o tipo de vínculo?",
                        "Escolha uma opção",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                    
                    if (vinculo == 0) {
                        custoHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora: "));
                        horas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de horas: "));    
                    } else {
                        salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário: "));
                    }    
                    
                    desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto: "));
                    
                    funcionario.setNome(nomeFuncionario);
                    funcionario.setCracha(crachaFuncionario);
                    funcionario.setTipoVinculo(vinculo); 
                    funcionario.setValorHora(custoHora);
                    funcionario.setQtdeHora(horas);
                    funcionario.setSalario(salarioFuncionario);
                    funcionario.setValorDesconto(desconto);
                    
                    
                    break;
                    
                case 1:
                    if (funcionario == null) {
                        JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado.");
                    } else                      
                    
                    JOptionPane.showMessageDialog(null, funcionario.imprimir());
                    break;
                    
                case 2:
                    
                    
                    if (funcionario.getTipoVinculo() == 0) {
                        custoHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo valor da hora: "));
                        horas = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo total de horas: "));    
                    } else {
                        salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo salário: "));
                    }
                    
                    funcionario.setValorHora(custoHora);
                    funcionario.setQtdeHora(horas);
                    funcionario.setSalario(salarioFuncionario);
                    
                    break;
                
                case 3:
                   JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
            }
            
        } while (escolha != 3);
    } 
}
    

