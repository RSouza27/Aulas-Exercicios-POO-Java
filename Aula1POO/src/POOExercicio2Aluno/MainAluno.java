package POOExercicio2Aluno;

import POOExercicio2Aluno.Aluno;
import javax.swing.JOptionPane;

public class MainAluno {

    public static void main(String[] args) {
        String nome, opt = "";
        int ra;
        double ac1, ac2, ag, af;
        Aluno aluno = new Aluno();
        
        do {
            opt = JOptionPane.showInputDialog("1 - Cadastrar Aluno \n2- Visualizar Aluno \n3- Sair");
            
            if(opt == null){
                System.exit(0);
            }
            
            switch(opt) {
                case "1":
                    //Cadastrar
                    nome = JOptionPane.showInputDialog("Digite seu Nome: ");
                    ra  = Integer.parseInt(JOptionPane.showInputDialog("Digite seu RA: ")); 
                    ac1 = Double.parseDouble(JOptionPane.showInputDialog("Nota AC1: "));
                    ac2 = Double.parseDouble(JOptionPane.showInputDialog("Nota AC2: "));
                    ag  = Double.parseDouble(JOptionPane.showInputDialog("Nota AG:" ));
                    af  = Double.parseDouble(JOptionPane.showInputDialog("Nota AF: "));
                         
                    aluno = new Aluno();
                    aluno.setNome(nome);
                    aluno.setRa(ra);
                    aluno.setAc1(ac1);
                    aluno.setAc2(ac2);
                    aluno.setAg(ag);
                    aluno.setAf(af);
                    break;
                case "2":
                    //Visualizar
                    if(aluno == null){
                        JOptionPane.showMessageDialog(null, "Nenhum Aluno Cadastrado!");
                        break;
                    }
                    
                    JOptionPane.showMessageDialog(null, aluno.imprimirAluno());
                    break;
                case "3":
                    //Sair
                    break; 
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
            }           
        }while(!opt.equals("3"));
    }     
}
