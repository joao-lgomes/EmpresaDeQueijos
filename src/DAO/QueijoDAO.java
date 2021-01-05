
package DAO;

import Classes.Queijo;
import Conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class QueijoDAO {
    //Nossa classe de DAO do cliente possui apenas um atributo do tipo Conexão
    Connection conexao;

    public QueijoDAO() throws SQLException, ClassNotFoundException{
        //INICIAMOS NOSSA CONEXÃO POR MEIO DE UM CONSTRUTOR
        this.conexao = Conexao.getConexao();
    }
    
    public void inserir(Queijo queijo) throws SQLException{
        //Criando uma instrução preparada
        PreparedStatement instrucao;
        
        //Criando nosso pré código de inserção
        String codigo = "insert into Queijo(peso, valorKG, tipo, tempIdeal) values(?,?,?,?);";
        
        try{
            //dizendo que nossa instrução preparada será feita por meio da conexão e pelo pré código da string código
            instrucao = this.conexao.prepareStatement(codigo);
            
            //INSERINDO OS VALORES EM CADA UMA DAS INTERROGAÇÕES
            instrucao.setFloat(1, queijo.getPeso());
            instrucao.setFloat(2, queijo.getValorKG());
            instrucao.setString(3, queijo.getTipo());
            instrucao.setFloat(4, queijo.getTempIdeal());

            
            
            //EXECUTANDO A INSTRUÇÃO PREPARADA
            instrucao.execute();
            
            //FECHANDO A INSTRUÇÃO PREPARADA
            instrucao.close();
            
            //MENSAGEM DE QUE O CARRO FOI ADICIONADO COM SUCESSO
            System.out.println("Queijo adicionado com sucesso");
        }catch(SQLException e){
            //MENSAGEM CASO OCORRA UM ERRO
            System.out.println("Erro ao tentar criar um queijo e adiciona-lo: "+e.toString());
        }
    }
    
    public void update(Queijo queijo) throws SQLException{
        //Criando uma instrução preparada
        PreparedStatement instrucao;
        
        //Criando um pré condigo possuindo alguns valores como variáveis
        String codigo = "update Queijo set peso=?, valorKG=?, tipo=?, tempIdeal=? where id_queijo=?";
        
        try{
            //informando que nossa instrução preparada será feita por meio da conexão pelo pré código escrito
            instrucao = this.conexao.prepareStatement(codigo);
            
            //Informando qual o valor de cada uma das interrogações
            instrucao.setFloat(1, queijo.getPeso());
            instrucao.setFloat(2, queijo.getValorKG());
            instrucao.setString(3, queijo.getTipo());
            instrucao.setFloat(4, queijo.getTempIdeal());
            
            instrucao.setInt(5, queijo.getId_queijo());
            
            //Executando a instrução
            instrucao.execute();
            
            //Fechando a instrução
            instrucao.close();
            
            //Mensagem de sucesso
            System.out.println("Queijo atualizado com sucesso");
        }catch(SQLException e){
            //Mensagem de erro
            System.out.println("Erro ao tentar atualizar queijo: "+e.toString());
        }
    }
    
    public ArrayList<Queijo> getAll(){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo";

        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo queijo = new Queijo();
                queijo.setId_queijo(res.getInt("id_queijo"));
                queijo.setPeso(res.getFloat("peso"));
                queijo.setValorKG(res.getFloat("valorKG"));
                queijo.setTipo(res.getString("tipo"));
                queijo.setTempIdeal(res.getFloat("tempIdeal"));
                
                ListaRetorno.add(queijo);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Queijo> getOneID(int id_queijo) throws SQLException{
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo where id_queijo="+id_queijo+";";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            ListaRetorno = new ArrayList<>();
            while(res.next()){
                Queijo queijo = new Queijo();
                queijo.setId_queijo(res.getInt("id_queijo"));
                queijo.setPeso(res.getFloat("peso"));
                queijo.setValorKG(res.getFloat("valorKG"));
                queijo.setTipo(res.getString("tipo"));
                queijo.setTempIdeal(res.getFloat("tempIdeal"));
                
                ListaRetorno.add(queijo);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        System.out.println("Queijo buscado com sucesso");
        return ListaRetorno;
    }
    
    public ArrayList<Queijo> getOneTipo(String tipo) throws SQLException{
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo where tipo='"+tipo+"';";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            ListaRetorno = new ArrayList<>();
            while(res.next()){
                Queijo queijo = new Queijo();
                queijo.setId_queijo(res.getInt("id_queijo"));
                queijo.setPeso(res.getFloat("peso"));
                queijo.setValorKG(res.getFloat("valorKG"));
                queijo.setTipo(res.getString("tipo"));
                queijo.setTempIdeal(res.getFloat("tempIdeal"));
                
                ListaRetorno.add(queijo);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        System.out.println("Queijo buscado com sucesso");
        return ListaRetorno;
    }
    
    public void delete(int id_queijo) throws SQLException{
        PreparedStatement instrucao;
        
        String codigo = "delete from Queijo where id_queijo=?;";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            instrucao.setInt(1, id_queijo);
            
            instrucao.execute();
            instrucao.close();
            
            System.out.println("Queijo deletado com sucesso");
        
        }catch(SQLException e){
            System.out.println("Erro ao tentar deletar: "+e.toString());
        }
    
    }
    
    public ArrayList<Queijo> maiorPreco(){
        ArrayList <Queijo> ListaRetorno = null;
        PreparedStatement instrucao;
        ResultSet res;
        
        String codigo = "SELECT * FROM Queijo WHERE valorKG in (select MAX(valorKG) FROM Queijo)";
        
        try{
            ListaRetorno = new ArrayList();
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            
            while(res.next()){
                Queijo queijo = new Queijo(res.getInt("id_queijo"), res.getFloat("peso"), res.getFloat("valorKG"), res.getString("tipo"), res.getFloat("tempIdeal"));
                ListaRetorno.add(queijo);
            }
            
            
        }catch(SQLException e){
            System.out.println("error: "+e.toString());
        }
        
        return ListaRetorno;
    }
    
    public ArrayList<Queijo> menorTemp(){
        ArrayList <Queijo> ListaRetorno = null;
        PreparedStatement instrucao;
        ResultSet res;
        
        String codigo = "SELECT * FROM Queijo WHERE tempIdeal in (select MIN(tempIdeal) FROM Queijo)";
        
        try{
            ListaRetorno = new ArrayList();
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            
            while(res.next()){
                Queijo queijo = new Queijo(res.getInt("id_queijo"), res.getFloat("peso"), res.getFloat("valorKG"), res.getString("tipo"), res.getFloat("tempIdeal"));
                ListaRetorno.add(queijo);
            }
            
            
        }catch(SQLException e){
            System.out.println("error: "+e.toString());
        }
        
        return ListaRetorno;
    }
    
    public int quantQueijos(){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo";

        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo queijo = new Queijo();
                queijo.setId_queijo(res.getInt("id_queijo"));
                queijo.setPeso(res.getFloat("peso"));
                queijo.setValorKG(res.getFloat("valorKG"));
                queijo.setTipo(res.getString("tipo"));
                queijo.setTempIdeal(res.getFloat("tempIdeal"));
                
                ListaRetorno.add(queijo);
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
        String codigo = "select MAX(id_queijo) from Queijo";
        
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
    
    public ArrayList<Queijo> OrdenarID(int ord){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo";

        if(ord==1)
            codigo = codigo+" order by id_queijo asc";
        if(ord==-1)
            codigo = codigo+" order by id_queijo desc";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo queijo = new Queijo();
                queijo.setId_queijo(res.getInt("id_queijo"));
                queijo.setPeso(res.getFloat("peso"));
                queijo.setValorKG(res.getFloat("valorKG"));
                queijo.setTipo(res.getString("tipo"));
                queijo.setTempIdeal(res.getFloat("tempIdeal"));
                
                ListaRetorno.add(queijo);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Queijo> OrdenarPeso(int ord){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo";

        if(ord==1)
            codigo = codigo+" order by peso asc";
        if(ord==-1)
            codigo = codigo+" order by peso desc";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo queijo = new Queijo();
                queijo.setId_queijo(res.getInt("id_queijo"));
                queijo.setPeso(res.getFloat("peso"));
                queijo.setValorKG(res.getFloat("valorKG"));
                queijo.setTipo(res.getString("tipo"));
                queijo.setTempIdeal(res.getFloat("tempIdeal"));
                
                ListaRetorno.add(queijo);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Queijo> OrdenarValor(int ord){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo";

        if(ord==1)
            codigo = codigo+" order by valorKG asc";
        if(ord==-1)
            codigo = codigo+" order by valorKG desc";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo queijo = new Queijo();
                queijo.setId_queijo(res.getInt("id_queijo"));
                queijo.setPeso(res.getFloat("peso"));
                queijo.setValorKG(res.getFloat("valorKG"));
                queijo.setTipo(res.getString("tipo"));
                queijo.setTempIdeal(res.getFloat("tempIdeal"));
                
                ListaRetorno.add(queijo);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
    public ArrayList<Queijo> OrdenarTemperatura(int ord){
        PreparedStatement instrucao;
        ResultSet res;
        ArrayList <Queijo> ListaRetorno = new ArrayList();
        
        String codigo = "select * from Queijo";

        if(ord==1)
            codigo = codigo+" order by tempIdeal asc";
        if(ord==-1)
            codigo = codigo+" order by tempIdeal desc";
        
        try{
            instrucao = this.conexao.prepareStatement(codigo);
            res = instrucao.executeQuery();
            while(res.next()){
                Queijo queijo = new Queijo();
                queijo.setId_queijo(res.getInt("id_queijo"));
                queijo.setPeso(res.getFloat("peso"));
                queijo.setValorKG(res.getFloat("valorKG"));
                queijo.setTipo(res.getString("tipo"));
                queijo.setTempIdeal(res.getFloat("tempIdeal"));
                
                ListaRetorno.add(queijo);
            }
            
            res.close();
            instrucao.close();
        }catch(SQLException e){
            System.out.println("Erro ao tentar recuperar a lista "+e.toString());
        }
        return ListaRetorno;
    }
    
}
