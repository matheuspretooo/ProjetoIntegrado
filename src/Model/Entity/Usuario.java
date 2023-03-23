package Model.Entity;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private float taxa;
    private boolean pago;
    private String senha;
    private String codigo_verificacao;
    private boolean verificado;
  
    public Usuario(int id, String nome, String email, String cpf, float taxa, boolean pago, String senha, String codigo_verificacao, boolean verificado) {
      this.id = id;
      this.nome = nome;
      this.email = email;
      this.cpf = cpf;
      this.taxa = taxa;
      this.pago = pago;
      this.senha = senha;
      this.codigo_verificacao = codigo_verificacao;
      this.verificado = verificado;
    }
    
    //getters
    public int getId() {
      return id;
    }
    
    public String getNome() {
      return nome;
    }
  
    public String getEmail() {
      return email;
    }
  
    public String getCpf() {
      return cpf;
    }
  
    public float getTaxa() {
      return taxa;
    }
  
    public boolean getPago() {
      return pago;
    }
  
    public String getSenha() {
      return senha;
    }
  
    public String getCodigoVerificacao() {
      return codigo_verificacao;
    }
  
    public boolean getVerificado() {
      return verificado;
    }
  
    //setters
  
    public void setId() {
      this.id = id;
    }
  
    public void setNome() {
      this.nome = nome;
    }
  
    public void setEmail() {
      this.email = email;
    }
  
    public void setCpf() {
      this.cpf = cpf;
    }
  
    public void setTaxa() {
      this.taxa = taxa;
    }
  
    public void setPago() {
      this.pago = pago;
    }
  
    public void setSenha() {
      this.senha = senha;
    }
  
    public void setCodigoVerificacao() {
      this.codigo_verificacao = codigo_verificacao;
    }
  
    public void setVerificado() {
      this.verificado = verificado;
    }
  }