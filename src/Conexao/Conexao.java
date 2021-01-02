
package Conexao;

import Principal.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//CLASSE QUE REALIZA A CONEXÃO INCIIAL COM O BANCO
public class Conexao {

    //NÃO POSSUI ATRIBUTOS, APENAS UM MÉTODDO QUE REALIZA A CONEXÃO
    
    //O MÉTODO GETCONEXÃO() REALIZA A CONEXÃO COM O BANCO
    public static Connection getConexao() throws SQLException{
        
        //CRIA  UM OBJETO DO TIPO CONNECTION CHAMADO CONNECTION E O INCIIALIZA COMO NULL
        Connection connection=null;
        
        
        //TENTAR:
        try {
            //INSTRUÇÃO FEITA PARA GARANTIR QUE A CLASSE DO DRIVER SEJA CARREGADA 
            //RETORNA A CLASSE OBJETO ASSOCIADA COM A STRING DIGITADA
            Class.forName("org.postgresql.Driver");
            
            //PRINTA QUE A CONEXÃO FOI FEITA COM SUCESSO
            System.out.println("Connected to PostgreSQL database");
            
            //UTILIZA NOSSO OBJETO DO TIPO CONNECTION PARA FAZER A CONEXÃO COM NOSSO BANCO, INFORMANDO O ENDEREÇO, USUÁRIO E SENHA DO BANCO
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TrabalhoFinal", "postgres", "joaoherbalspy744");
        } catch (SQLException e) {
            //CAPTURA O ERRO DE CONEXÃO AO BANCO
            System.out.println("Connection failure.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //RETORNA NOSSA CONEXÃO PARA A FUNÇÃO QUE O CHAMOU
        return (connection);
    }
}
