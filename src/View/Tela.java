package View;

import Model.*;
import Model.DAO.*;
import Model.Entity.Usuario;
import Controller.*;

import javax.swing.JOptionPane;

public class Tela {

    public int indice = 0;

    public Tela() {
    }

    public void telaInicial() {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog(" Bem Vindo ao site Adoção Fenix\n" +
        "1 - Criar Conta" +
        "2 - Login" +
        "3 - Ver Anuncios" +
        "4 - Sair"));
        switch (operacao) {
            case 1: System.exit(0);
            break;
            case 2: login();
            break;
            case 3: System.exit(0);
            break;
            case 4: System.exit(0);
            default: JOptionPane.showMessageDialog(null, "Operação Inválida!");
        }
    }

    /*public void criarConta() {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Usuario;");
        while(rs.next()) {
            rs.getInt("Id");
        }
        int id = 
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String email = JOptionPane.showInputDialog("Digite seu email:");
        String cpf = JOptionPane.showInputDialog("Digite sua cpf");
        String senha = JOptionPane.showInputDialog("Digite seu senha");
        insertUsuario(id, nome, email, cpf, 120, false, senha, null, false);
    }*/

    public void login() {
        /*String email = JOptionPane.showInputDialog("email:");
        String senha = JOptionPane.showInputDialog("senha");
        for(int i = 0; i < usuarioList.getNumeroUsuario(); i++) {
            Usuario usuario = usuarioList.getUsuario(i);
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                JOptionPane.showMessageDialog(null, "Login bem sucedido");
            }
        }*/
    }

}