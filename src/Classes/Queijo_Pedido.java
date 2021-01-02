
package Classes;


public class Queijo_Pedido {
    //ATRIBUTOS DO QUEIJO PEDIDO
    private int id_queijo_pedido;
    private int fk_id_pedido;
    private int fk_id_queijo;
    private int quantidade;

    
    //CONSTRUTOR PADRÃO
    public Queijo_Pedido() {
        this.id_queijo_pedido = 0;
        this.fk_id_pedido = 0;
        this.fk_id_queijo = 0;
        this.quantidade = 0;
    }
    
    //CONSTRUTOR DE INICIALIZAÇÃO
    public Queijo_Pedido(int id_queijo_pedido, int fk_id_pedido, int fk_id_queijo, int quantidade) {
        this.id_queijo_pedido = id_queijo_pedido;
        this.fk_id_pedido = fk_id_pedido;
        this.fk_id_queijo = fk_id_queijo;
        this.quantidade = quantidade;
    }

    
    //GETTERS E SETTERS
    public int getId_queijo_pedido() {
        return id_queijo_pedido;
    }

    public void setId_queijo_pedido(int id_queijo_pedido) {
        this.id_queijo_pedido = id_queijo_pedido;
    }

    public int getFk_id_pedido() {
        return fk_id_pedido;
    }

    public void setFk_id_pedido(int fk_id_pedido) {
        this.fk_id_pedido = fk_id_pedido;
    }

    public int getFk_id_queijo() {
        return fk_id_queijo;
    }

    public void setFk_id_queijo(int fk_id_queijo) {
        this.fk_id_queijo = fk_id_queijo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    //TO STRING
    @Override
    public String toString() {
        return "Queijo_Pedido{" + "id_queijo_pedido=" + id_queijo_pedido + ", fk_id_pedido=" + fk_id_pedido + ", fk_id_queijo=" + fk_id_queijo + ", quantidade=" + quantidade + '}';
    }
    
    
}
