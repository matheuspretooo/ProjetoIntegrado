package Model.Entity;

public class Especie {
    private int id;
    private String nome;
  
    public Especie(int id, String nome) {
      this.id = id;
      this.nome = nome;
    }
  
    //getters
  
    public int getId() {
      return id;
    }
  
    public String getNome() {
      return nome;
    }
  
    //setters
  
    public void setId() {
      this.id = id;
    }
  
    public void setNome() {
      this.nome = nome;
    }
  }