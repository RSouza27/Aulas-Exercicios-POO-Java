package POOExercicio1Pessoa;

import javax.swing.JOptionPane;

public class Aula1POO {
    
    public static void main(String[] args) {
        String nome, cpf, opt = "";
        char sexo = 'S';  
        int idade;
        Pessoa pessoa = null;
        
        do {
            opt = JOptionPane.showInputDialog("1 - Cadastrar Pessoa \n2- Visualizar Pessoa \n3- Sair");
            
            if(opt == null){
                System.exit(0);
            }
            
            switch(opt) {
                case "1":
                    //Cadastrar
                    nome  = JOptionPane.showInputDialog("Digite seu Nome: ");
                    cpf   = JOptionPane.showInputDialog("Digite seu CPF: "); 
                    sexo  = JOptionPane.showInputDialog("Digite seu Sexo: ").charAt(0);
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade: "));
                    
                    pessoa = new Pessoa();
                    pessoa.setNome(nome);
                    pessoa.setCpf(cpf);
                    pessoa.setSexo(sexo);
                    pessoa.setIdade(idade);
                    break;
                case "2":
                    //Visualizar
                    if(pessoa == null){
                        JOptionPane.showMessageDialog(null, "Nenhuma Pessoa Cadastrada!");
                        break;
                    }  
                    JOptionPane.showMessageDialog(null, pessoa.imprimirPessoa());
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
