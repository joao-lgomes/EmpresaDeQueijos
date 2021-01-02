
package Classes;

import java.time.LocalDateTime;

public class Pedido {
    //ATRIBUTOS DE PEDIDO
    private int id_pedido;
    private String fk_cpf; 
    private LocalDateTime data_pedido;
    private int prazoEntrega;
    
    //CONSTRUTOR PADRÃO
    public Pedido() {
        this.id_pedido = 0;
        this.fk_cpf = "";
        this.data_pedido = LocalDateTime.now();
        this.prazoEntrega = 0;
    }
    
    
    //CONSTRUTOR DE INICIALIZAÇÃO
    public Pedido(int id_pedido, String fk_cpf, LocalDateTime data_pedido, int prazoEntrega) {
        this.id_pedido = id_pedido;
        this.fk_cpf = fk_cpf;
        this.data_pedido = data_pedido;
        this.prazoEntrega = prazoEntrega;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getFk_cpf() {
        return fk_cpf;
    }

    public void setFk_cpf(String fk_cpf) {
        this.fk_cpf = fk_cpf;
    }

    public LocalDateTime getdata_pedido() {
        return data_pedido;
    }

    public void setdata_pedido(LocalDateTime data_pedido) {
        this.data_pedido = data_pedido;
    }

    public int getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(int prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    
    //TO STRING
    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", fk_cpf=" + fk_cpf + ", data_pedido=" + data_pedido + ", prazoEntrega=" + prazoEntrega + '}';
    }
    
    
    
}
