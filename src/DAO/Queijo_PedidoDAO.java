
package DAO;

import Classes.Queijo_Pedido;
import Conexao.Conexao;
import DAO.ClienteDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Queijo_PedidoDAO {
    //Nossa classe de DAO do cliente possui apenas um atributo do tipo Conexão
    Connection conexao;

    public Queijo_PedidoDAO() throws SQLException, ClassNotFoundException{
        //INICIAMOS NOSSA CONEXÃO POR MEIO DE UM CONSTRUTOR
        this.conexao = Conexao.getConexao();
    }
    
    public void inserir(Queijo_Pedido qp) throws SQLException{
        

        //Criando uma instrução preparada
        PreparedStatement instrucao;
        
        //Criando nosso pré código de inserção
        String codigo = "insert into Queijo_Pedido(fk_id_pedido, fk_id_queijo, quantidade) values(?,?,?);";
        
        try{
            //dizendo que nossa instrução preparada será feita por meio da conexão e pelo pré código da string código
            instrucao = this.conexao.prepareStatement(codigo);
            
            //INSERINDO OS VALORES EM CADA UMA DAS INTERROGAÇÕES
            instrucao.setInt(1, qp.getFk_id_pedido());
            instrucao.setInt(2, qp.getFk_id_queijo());
            instrucao.setInt(3, qp.getQuantidade());

            
            
            //EXECUTANDO A INSTRUÇÃO PREPARADA
            instrucao.execute();
            
            //FECHANDO A INSTRUÇÃO PREPARADA
            instrucao.close();
            
            //MENSAGEM DE QUE O CARRO FOI ADICIONADO COM SUCESSO
            System.out.println("Queijo pedido adicionado com sucesso");
        }catch(SQLException e){
            //MENSAGEM CASO OCORRA UM ERRO
            System.out.println("Erro ao tentar criar um Pedido e adiciona-lo: "+e.toString());
        }
    }
    
    public void update(Queijo_Pedido qp) throws SQLException{
        //Criando uma instrução preparada
        PreparedStatement instrucao;
        
        //Criando um pré condigo possuindo alguns valores como variáveis
        String codigo = "update queijo_pedido set fk_id_pedido=?, fk_id_queijo=?, quantidade=? where id_queijo_pedido=?;";
        
        try{
            //informando que nossa instrução preparada será feita por meio da conexão pelo pré código escrito
            instrucao = this.conexao.prepareStatement(codigo);
            
            //Informando qual o valor de cada uma das interrogações
            instrucao.setInt(1, qp.getFk_id_pedido());
            instrucao.setInt(2, qp.getFk_id_queijo());
            instrucao.setInt(3, qp.getQuantidade());
            
            instrucao.setInt(4, qp.getId_queijo_pedido());
            
            //Executando a instrução
            instrucao.execute();
            
            //Fechando a instrução
            instrucao.close();
            
            //Mensagem de sucesso
            System.out.println("Queijo pedido atualizado com sucesso");
        }catch(SQLException e){
            //Mensagem de erro
            System.out.println("Erro ao tentar atualizar Pedido: "+e.toString());
        }
    }
    
    public ArrayList<Queijo_Pedido> getAll(){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo_Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo_Pedido";

        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo_Pedido qp = new Queijo_Pedido();
                qp.setId_queijo_pedido(res.getInt("id_queijo_pedido"));
                qp.setFk_id_pedido(res.getInt("fk_id_pedido"));
                
                qp.setFk_id_queijo(res.getInt("fk_id_queijo"));
                
                qp.setQuantidade(res.getInt("quantidade"));

                
                ListaRetorno.add(qp);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Queijo_Pedido> getOne(int id_queijo_pedido) throws SQLException{
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo_Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo_Pedido where id_queijo_pedido='"+id_queijo_pedido+"';";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            ListaRetorno = new ArrayList<>();
            while(res.next()){
                Queijo_Pedido qp = new Queijo_Pedido();
                qp.setId_queijo_pedido(res.getInt("id_queijo_pedido"));
                qp.setFk_id_pedido(res.getInt("fk_id_pedido"));
                
                qp.setFk_id_queijo(res.getInt("fk_id_queijo"));
                
                qp.setQuantidade(res.getInt("quantidade"));

                
                ListaRetorno.add(qp);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        System.out.println("Queijo pedido buscado com sucesso");
        return ListaRetorno;
    }
        
    public ArrayList<Queijo_Pedido> getOneIDQueijo(int fk_id_queijo) throws SQLException{
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo_Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo_Pedido where fk_id_queijo='"+fk_id_queijo+"';";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            ListaRetorno = new ArrayList<>();
            while(res.next()){
                Queijo_Pedido qp = new Queijo_Pedido();
                qp.setId_queijo_pedido(res.getInt("id_queijo_pedido"));
                qp.setFk_id_pedido(res.getInt("fk_id_pedido"));
                
                qp.setFk_id_queijo(res.getInt("fk_id_queijo"));
                
                qp.setQuantidade(res.getInt("quantidade"));

                
                ListaRetorno.add(qp);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        System.out.println("Queijo pedido buscado com sucesso");
        return ListaRetorno;
    }
    
    public void delete(int id_queijo_pedido) throws SQLException{
        PreparedStatement instrucao;
        
        String codigo = "delete from Queijo_Pedido where id_queijo_pedido=?;";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            instrucao.setInt(1, id_queijo_pedido);
            
            instrucao.execute();
            instrucao.close();
            
            System.out.println("Queijo pedido deletado com sucesso");
        
        }catch(SQLException e){
            System.out.println("Erro ao tentar deletar: "+e.toString());
        }
    
    }
    
    public int quant_QP(){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo_Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo_Pedido";

        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo_Pedido qp = new Queijo_Pedido();
                qp.setId_queijo_pedido(res.getInt("id_queijo_pedido"));
                qp.setFk_id_pedido(res.getInt("fk_id_pedido"));
                
                qp.setFk_id_queijo(res.getInt("fk_id_queijo"));
                
                qp.setQuantidade(res.getInt("quantidade"));

                
                ListaRetorno.add(qp);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return (ListaRetorno.size());
    }
    
    public ArrayList<Queijo_Pedido> QueijosPedidosDeUmPedido(int fk_id_pedido) throws SQLException{
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo_Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo_Pedido where fk_id_pedido='"+fk_id_pedido+"';";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            ListaRetorno = new ArrayList<>();
            while(res.next()){
                Queijo_Pedido qp = new Queijo_Pedido();
                qp.setId_queijo_pedido(res.getInt("id_queijo_pedido"));
                qp.setFk_id_pedido(res.getInt("fk_id_pedido"));
                
                qp.setFk_id_queijo(res.getInt("fk_id_queijo"));
                
                qp.setQuantidade(res.getInt("quantidade"));

                
                ListaRetorno.add(qp);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        System.out.println("Queijo pedido buscado com sucesso");
        return ListaRetorno;
    }
    
    public int MaiorID(){
        PreparedStatement instrucao;
        ResultSet res;
        String codigo = "select MAX(id_queijo_pedido) from queijo_pedido";
        
        int maxID = 0;
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            
            while(res.next()){
                maxID = res.getInt("max");
            }
        }catch(SQLException e){
            System.out.println("erro: "+e.toString());
        }
       
        return maxID;
    }
    
    public ArrayList<Queijo_Pedido> getAllId(int ordenar){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo_Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo_Pedido";
        
        if(ordenar ==1)
            codigo = codigo+" order by id_queijo_pedido asc";
        if(ordenar ==-1)
            codigo = codigo+" order by id_queijo_pedido desc";
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo_Pedido qp = new Queijo_Pedido();
                qp.setId_queijo_pedido(res.getInt("id_queijo_pedido"));
                qp.setFk_id_pedido(res.getInt("fk_id_pedido"));
                
                qp.setFk_id_queijo(res.getInt("fk_id_queijo"));
                
                qp.setQuantidade(res.getInt("quantidade"));

                
                ListaRetorno.add(qp);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Queijo_Pedido> getAllIdPed(int ordenar){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo_Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo_Pedido";
        
        if(ordenar ==1)
            codigo = codigo+" order by fk_id_pedido asc";
        if(ordenar ==-1)
            codigo = codigo+" order by fk_id_pedido desc";
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo_Pedido qp = new Queijo_Pedido();
                qp.setId_queijo_pedido(res.getInt("id_queijo_pedido"));
                qp.setFk_id_pedido(res.getInt("fk_id_pedido"));
                
                qp.setFk_id_queijo(res.getInt("fk_id_queijo"));
                
                qp.setQuantidade(res.getInt("quantidade"));

                
                ListaRetorno.add(qp);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Queijo_Pedido> getAllIdQueijo(int ordenar){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo_Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo_Pedido";
        
        if(ordenar ==1)
            codigo = codigo+" order by fk_id_queijo asc";
        if(ordenar ==-1)
            codigo = codigo+" order by fk_id_queijo desc";
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo_Pedido qp = new Queijo_Pedido();
                qp.setId_queijo_pedido(res.getInt("id_queijo_pedido"));
                qp.setFk_id_pedido(res.getInt("fk_id_pedido"));
                
                qp.setFk_id_queijo(res.getInt("fk_id_queijo"));
                
                qp.setQuantidade(res.getInt("quantidade"));

                
                ListaRetorno.add(qp);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Queijo_Pedido> getAllQuant(int ordenar){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo_Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo_Pedido";
        
        if(ordenar ==1)
            codigo = codigo+" order by quantidade asc";
        if(ordenar ==-1)
            codigo = codigo+" order by quantidade desc";
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo_Pedido qp = new Queijo_Pedido();
                qp.setId_queijo_pedido(res.getInt("id_queijo_pedido"));
                qp.setFk_id_pedido(res.getInt("fk_id_pedido"));
                
                qp.setFk_id_queijo(res.getInt("fk_id_queijo"));
                
                qp.setQuantidade(res.getInt("quantidade"));

                
                ListaRetorno.add(qp);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
}
