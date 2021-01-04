/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import Interfaces.Menu;

public class Principal {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
        
        /*try {
            Connection con = Conexao.getConexao();
        } catch (SQLException e1) {
            System.out.print("\n Erro SQLException: "+e1.toString());
        }*/
    }
    
}
