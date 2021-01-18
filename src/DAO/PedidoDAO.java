
package DAO;

import Classes.Pedido;
import Conexao.Conexao;
import DAO.ClienteDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;


public class PedidoDAO {
    //Nossa classe de DAO do cliente possui apenas um atributo do tipo Conexão
    Connection conexao;

    public PedidoDAO() throws SQLException, ClassNotFoundException{
        //INICIAMOS NOSSA CONEXÃO POR MEIO DE UM CONSTRUTOR
        this.conexao = Conexao.getConexao();
    }
    
    
    public void inserir(Pedido pedido) throws SQLException{
        

        //Criando uma instrução preparada
        PreparedStatement instrucao;
        
        //Criando nosso pré código de inserção
        String codigo = "insert into Pedido(fk_cpf, data_pedido, prazoEntrega) values(?,?,?);";
        
        try{
            //dizendo que nossa instrução preparada será feita por meio da conexão e pelo pré código da string código
            instrucao = this.conexao.prepareStatement(codigo);
            
            //INSERINDO OS VALORES EM CADA UMA DAS INTERROGAÇÕES
            instrucao.setString(1, pedido.getFk_cpf());
            Timestamp timestamp = Timestamp.valueOf(pedido.getdata_pedido());
            instrucao.setTimestamp(2, timestamp);
            instrucao.setInt(3, pedido.getPrazoEntrega());

            
            
            //EXECUTANDO A INSTRUÇÃO PREPARADA
            instrucao.execute();
            
            //FECHANDO A INSTRUÇÃO PREPARADA
            instrucao.close();
            
            //MENSAGEM DE QUE O CARRO FOI ADICIONADO COM SUCESSO
            System.out.println("Pedido adicionado com sucesso");
        }catch(SQLException e){
            //MENSAGEM CASO OCORRA UM ERRO
            System.out.println("Erro ao tentar criar um Pedido e adiciona-lo: "+e.toString());
        }
    }
    
    public void update(Pedido pedido) throws SQLException{
        //Criando uma instrução preparada
        PreparedStatement instrucao;
        
        //Criando um pré condigo possuindo alguns valores como variáveis
        String codigo = "update Pedido set fk_cpf=?, data_pedido=?, prazoEntrega=? where id_pedido=?;";
        
        try{
            //informando que nossa instrução preparada será feita por meio da conexão pelo pré código escrito
            instrucao = this.conexao.prepareStatement(codigo);
            
            //Informando qual o valor de cada uma das interrogações
            instrucao.setString(1, pedido.getFk_cpf());
            Timestamp timestamp = Timestamp.valueOf(pedido.getdata_pedido());
            instrucao.setTimestamp(2, timestamp);
            instrucao.setInt(3, pedido.getPrazoEntrega());
            
            instrucao.setInt(4, pedido.getId_pedido());
            
            //Executando a instrução
            instrucao.execute();
            
            //Fechando a instrução
            instrucao.close();
            
            //Mensagem de sucesso
            System.out.println("Pedido atualizado com sucesso");
        }catch(SQLException e){
            //Mensagem de erro
            System.out.println("Erro ao tentar atualizar Pedido: "+e.toString());
        }
    }
    
    public ArrayList<Pedido> getAll(){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Pedido";

        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(res.getInt("id_pedido"));
                pedido.setFk_cpf(res.getString("fk_cpf"));
                
                Timestamp tempo = res.getTimestamp("data_pedido");
                pedido.setdata_pedido(tempo.toLocalDateTime());
                
                pedido.setPrazoEntrega(res.getInt("prazoEntrega"));

                
                ListaRetorno.add(pedido);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Pedido> getOne(int id_pedido) throws SQLException{
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Pedido where id_pedido='"+id_pedido+"';";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            ListaRetorno = new ArrayList<>();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(res.getInt("id_pedido"));
                pedido.setFk_cpf(res.getString("fk_cpf"));
                
                Timestamp tempo = res.getTimestamp("data_pedido");
                pedido.setdata_pedido(tempo.toLocalDateTime());
                
                pedido.setPrazoEntrega(res.getInt("prazoEntrega"));

                
                ListaRetorno.add(pedido);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        System.out.println("Pedido buscado com sucesso");
        return ListaRetorno;
    }
    
    public ArrayList<Pedido> getOneCpf(String fk_cpf) throws SQLException{
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Pedido where fk_cpf='"+fk_cpf+"';";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            ListaRetorno = new ArrayList<>();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(res.getInt("id_pedido"));
                pedido.setFk_cpf(res.getString("fk_cpf"));
                
                Timestamp tempo = res.getTimestamp("data_pedido");
                pedido.setdata_pedido(tempo.toLocalDateTime());
                
                pedido.setPrazoEntrega(res.getInt("prazoEntrega"));

                
                ListaRetorno.add(pedido);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        System.out.println("Pedido buscado com sucesso");
        return ListaRetorno;
    }
    
    public ArrayList<Pedido> getOnePrazo(int prazoEntrega) throws SQLException{
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Pedido where prazoEntrega='"+prazoEntrega+"';";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            ListaRetorno = new ArrayList<>();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(res.getInt("id_pedido"));
                pedido.setFk_cpf(res.getString("fk_cpf"));
                
                Timestamp tempo = res.getTimestamp("data_pedido");
                pedido.setdata_pedido(tempo.toLocalDateTime());
                
                pedido.setPrazoEntrega(res.getInt("prazoEntrega"));

                
                ListaRetorno.add(pedido);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        System.out.println("Pedido buscado com sucesso");
        return ListaRetorno;
    }
    
    public void delete(int id_pedido) throws SQLException{
        PreparedStatement instrucao;
        
        String codigo = "delete from Pedido where id_pedido=?;";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            instrucao.setInt(1, id_pedido);
            
            instrucao.execute();
            instrucao.close();
            
            System.out.println("Pedido deletado com sucesso");
        
        }catch(SQLException e){
            System.out.println("Erro ao tentar deletar: "+e.toString());
        }
    
    }
    
    public ArrayList<Pedido> PedidoMaisAntigo(String fk_cpf) throws SQLException{
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from pedido where data_pedido IN (select min(data_pedido) from pedido where fk_cpf='"+fk_cpf+"') and fk_cpf='"+fk_cpf+"';";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            ListaRetorno = new ArrayList<>();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(res.getInt("id_pedido"));
                pedido.setFk_cpf(res.getString("fk_cpf"));
                
                Timestamp tempo = res.getTimestamp("data_pedido");
                pedido.setdata_pedido(tempo.toLocalDateTime());
                
                pedido.setPrazoEntrega(res.getInt("prazoEntrega"));

                
                ListaRetorno.add(pedido);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        System.out.println("Pedido buscado com sucesso");
        return ListaRetorno;
    }
    
    
    public ArrayList<Pedido> PedidoMaisAntigoNome(String nome) throws SQLException{
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from pedido where data_pedido IN (select min(data_pedido) from pedido where fk_cpf IN (select cpf from cliente where nome='"+nome+"')) and fk_cpf IN (select cpf from cliente where nome='"+nome+"');";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            ListaRetorno = new ArrayList<>();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(res.getInt("id_pedido"));
                pedido.setFk_cpf(res.getString("fk_cpf"));
                
                Timestamp tempo = res.getTimestamp("data_pedido");
                pedido.setdata_pedido(tempo.toLocalDateTime());
                
                pedido.setPrazoEntrega(res.getInt("prazoEntrega"));

                
                ListaRetorno.add(pedido);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        System.out.println("Pedido buscado com sucesso");
        return ListaRetorno;
    }
    
    public int quantPedidos(){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Pedido";

        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(res.getInt("id_pedido"));
                pedido.setFk_cpf(res.getString("fk_cpf"));
                
                Timestamp tempo = res.getTimestamp("data_pedido");
                pedido.setdata_pedido(tempo.toLocalDateTime());
                
                pedido.setPrazoEntrega(res.getInt("prazoEntrega"));

                
                ListaRetorno.add(pedido);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return (ListaRetorno.size());
    }
    
    public int MaiorID(){
        PreparedStatement instrucao;
        ResultSet res;
        String codigo = "select MAX(id_pedido) from Pedido";
        
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
    
    public ArrayList<Pedido> getAllId(int ordenar){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Pedido";

        if(ordenar==1)
            codigo=codigo+" order by id_pedido asc";
        if(ordenar==-1)
            codigo=codigo+" order by id_pedido desc";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(res.getInt("id_pedido"));
                pedido.setFk_cpf(res.getString("fk_cpf"));
                
                Timestamp tempo = res.getTimestamp("data_pedido");
                pedido.setdata_pedido(tempo.toLocalDateTime());
                
                pedido.setPrazoEntrega(res.getInt("prazoEntrega"));

                
                ListaRetorno.add(pedido);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Pedido> getAllCpf(int ordenar){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Pedido";

        if(ordenar==1)
            codigo=codigo+" order by fk_cpf asc";
        if(ordenar==-1)
            codigo=codigo+" order by fk_cpf desc";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(res.getInt("id_pedido"));
                pedido.setFk_cpf(res.getString("fk_cpf"));
                
                Timestamp tempo = res.getTimestamp("data_pedido");
                pedido.setdata_pedido(tempo.toLocalDateTime());
                
                pedido.setPrazoEntrega(res.getInt("prazoEntrega"));

                
                ListaRetorno.add(pedido);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Pedido> getAllData(int ordenar){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Pedido";

        if(ordenar==1)
            codigo=codigo+" order by data_pedido asc";
        if(ordenar==-1)
            codigo=codigo+" order by data_pedido desc";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(res.getInt("id_pedido"));
                pedido.setFk_cpf(res.getString("fk_cpf"));
                
                Timestamp tempo = res.getTimestamp("data_pedido");
                pedido.setdata_pedido(tempo.toLocalDateTime());
                
                pedido.setPrazoEntrega(res.getInt("prazoEntrega"));

                
                ListaRetorno.add(pedido);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Pedido> getAllPrazo(int ordenar){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Pedido> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Pedido";

        if(ordenar==1)
            codigo=codigo+" order by prazoEntrega asc";
        if(ordenar==-1)
            codigo=codigo+" order by prazoEntrega desc";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Pedido pedido = new Pedido();
                pedido.setId_pedido(res.getInt("id_pedido"));
                pedido.setFk_cpf(res.getString("fk_cpf"));
                
                Timestamp tempo = res.getTimestamp("data_pedido");
                pedido.setdata_pedido(tempo.toLocalDateTime());
                
                pedido.setPrazoEntrega(res.getInt("prazoEntrega"));

                
                ListaRetorno.add(pedido);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
}
