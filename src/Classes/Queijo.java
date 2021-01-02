
package Classes;


public class Queijo {
    // ATRIBUTOS DE QUEIJO
    private int id_queijo;
    private float peso;
    private float valorKG;
    private String tipo;
    private float tempIdeal;
    
    //CONSTRUTOR PADRÃO
    public Queijo() {
        this.id_queijo = 0;
        this.peso = 0;
        this.valorKG = 0;
        this.tipo = "";
        this.tempIdeal = 0;
    }
    
    //CONSTRUTOR DE INICIALIZAÇÃO
    public Queijo(int id_queijo, float peso, float valorKG, String tipo, float tempIdeal) {
        this.id_queijo = id_queijo;
        this.peso = peso;
        this.valorKG = valorKG;
        this.tipo = tipo;
        this.tempIdeal = tempIdeal;
    }

    
    //GETTERS E SETTERS
    public int getId_queijo() {
        return id_queijo;
    }

    public void setId_queijo(int id_queijo) {
        this.id_queijo = id_queijo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getValorKG() {
        return valorKG;
    }

    public void setValorKG(float valorKG) {
        this.valorKG = valorKG;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getTempIdeal() {
        return tempIdeal;
    }

    public void setTempIdeal(float tempIdeal) {
        this.tempIdeal = tempIdeal;
    }
    
    
    //TO STRING
    @Override
    public String toString() {
        return "Queijo{" + "id_queijo=" + id_queijo + ", peso=" + peso + ", valorKG=" + valorKG + ", tipo=" + tipo + ", tempIdeal=" + tempIdeal + '}';
    }
    
    
    
}
