package exercicio02;

import javax.swing.JOptionPane;

public class MainExercicio02 {

    public static void main(String[] args) {
        String nome, ra;
        int escolha;
        double ac1, ac2, ag, af;
        Aluno aluno = new Aluno();
        
        do {
        String[] options = {"Cadastrar aluno", "Exibir aluno cadastrado", "Sair"};

        escolha = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo:",
                "Escolha uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        
            switch (escolha) {
                case 0:
                    nome = JOptionPane.showInputDialog("Digite o nome: ");
                    ra = JOptionPane.showInputDialog("Digite o RA: ");
                    ac1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da AC1: "));
                    ac2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da AC2: "));
                    ag = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da AG: "));
                    af = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da AF: "));
                    
                    
                    aluno.setNome(nome);
                    aluno.setRa(ra);
                    aluno.setAc1(ac1); 
                    aluno.setAc2(ac2);
                    aluno.setAg(ag);
                    aluno.setAf(af);
                                        
                    break;
                    
                case 1:
                    if (aluno == null) {
                        JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
                    }                        
                    
                    JOptionPane.showMessageDialog(null, aluno.imprimir());
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                   
            }
            
        } while (escolha != 2);
    }     
    
    
}
