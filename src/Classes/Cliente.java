package Classes;

import java.util.Objects;

public class Cliente {
    //ATRIBUTOS DE CLIENTE
    private String cpf;
    private String nome;
    private String telefone_residencial;
    private String telefone_celular;
    private String bairro;
    private String ru; 
    private int numeroCasa;
    private String instagram;        
    private String facebook;        
    private String NumCartao;        
    
    //CONSTRUTOR PADRÃO
    public Cliente() {
        this.cpf = "";
        this.nome = "";
        this.telefone_residencial = "";
        this.telefone_celular = "";
        this.bairro = "";
        this.rua = "";
        this.numeroCasa = 0;
        this.instagram = "";
        this.facebook = "";
        this.NumCartao = "";
    }
    
    //CONSTRUTOR DE INICIALIZAÇÃO
    public Cliente(String cpf, String nome, String telefone_residencial, String telefone_celular, String bairro, String rua, int numeroCasa, String instagram, String facebook, String NumCartao) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone_residencial = telefone_residencial;
        this.telefone_celular = telefone_celular;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.instagram = instagram;
        this.facebook = facebook;
        this.NumCartao = NumCartao;
    }

    
    //GETTERS E SETTERS
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone_residencial() {
        return telefone_residencial;
    }

    public void setTelefone_residencial(String telefone_residencial) {
        this.telefone_residencial = telefone_residencial;
    }

    public String getTelefone_celular() {
        return telefone_celular;
    }

    public void setTelefone_celular(String telefone_celular) {
        this.telefone_celular = telefone_celular;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getNumCartao() {
        return NumCartao;
    }

    public void setNumCartao(String NumCartao) {
        this.NumCartao = NumCartao;
    }

    
    //TO STRING
    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", telefone_residencial=" + telefone_residencial + ", telefone_celular=" + telefone_celular + ", bairro=" + bairro + ", rua=" + rua + ", numeroCasa=" + numeroCasa + ", instagram=" + instagram + ", facebook=" + facebook + ", NumCartao=" + NumCartao + '}';
    }

    
    
}
