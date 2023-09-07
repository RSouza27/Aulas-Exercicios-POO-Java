
package exercicio01;

import javax.swing.JOptionPane;

public class MainExercicio01 {

    public static void main(String[] args) {
        String nome, cpf;
        int idade,escolha;
        char sexo;
        Pessoa usuario = new Pessoa ();
        
        do {
        String[] options = {"Criar usuário", "Exibir usuário cadastrado", "Sair"};

        escolha = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo:",
                "Escolha uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        
            switch (escolha) {
                case 0:
                    nome = JOptionPane.showInputDialog("Digite o nome: ");
                    cpf = JOptionPane.showInputDialog("Digite o CPF: ");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
                    sexo = JOptionPane.showInputDialog("Digite o Sexo (Masculino, Feminino, Outros): ").charAt(0);
                    
                    usuario.setNome(nome);
                    usuario.setCPF(cpf);
                    usuario.setIdade(idade); 
                    usuario.setSexo(sexo);
                    
                    break;
                    
                case 1:
                    if (usuario == null) {
                        JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado.");
                    }                        
                    
                    JOptionPane.showMessageDialog(null, usuario.imprimir());
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                   
            }
            
        } while (escolha != 2);
    } 
}

