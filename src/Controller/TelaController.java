package Controller;

import javax.swing.JOptionPane;

import Model.*;
import Model.DAO.*;
import View.Tela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TelaController {
    public static void main(String args[]) throws SQLException {
        /*UsuarioDAO objUsuarioList = new UsuarioDAO();

        Tela tela = new Tela();

        tela.telaInicial(objUsuarioList);*/

        String url = "jdbc:mysql://localhost/estudante?user=root&password=password";
        Connection conn = DriverManager.getConnection(url);
 
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Usuario;");
        while(rs.next()) {
            System.out.println(rs.getInt("Id"));
            System.out.println(rs.getString("Nome"));
            System.out.println("---------------------");
        }
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o id, nome, email, CPF, taxa, pago, senha, codigo_verificacao, verificado");
        int id = scan.nextInt();
        String nome = scan.nextLine();
        String email = scan.nextLine();
        String CPF = scan.nextLine();
        String senha = scan.nextLine();
        insertUsuario(id, nome, email, CPF, 120, false, senha, null, false);
        

    }

    /*public void criarConta() {
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id: "));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String email = JOptionPane.showInputDialog("Digite seu email:");
        String cpf = JOptionPane.showInputDialog("Digite sua cpf");
        String senha = JOptionPane.showInputDialog("Digite seu senha");
        insertUsuario(id, nome, email, cpf, 120, false, senha, null, false);
    }*/
   
   
    public static void insertUsuario(int id, String nome, String email, String CPF, float taxa, boolean pago, String senha, String codigo_verificacao, boolean verificado) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante";
        Connection conn = DriverManager.getConnection(url);
 
        String sqlInsert = "INSERT INTO Usuario VALUES(?,?,?)";
       
        PreparedStatement pstm = conn.prepareStatement(sqlInsert);
        pstm.setInt(1, id);
        pstm.setString(2, nome);
        pstm.setString(3, email);
        pstm.setString(4, CPF);
        pstm.setFloat(5, taxa);
        pstm.setBoolean(6, pago);
        pstm.setString(7, senha);
        pstm.setString(8, codigo_verificacao);
        pstm.setBoolean(9, verificado);
       
        pstm.executeUpdate();
    }
}