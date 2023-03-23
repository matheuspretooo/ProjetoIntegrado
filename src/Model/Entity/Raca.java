package Model.Entity;

import java.util.List;
import java.util.ArrayList;

public class Raca {
  private int id;
  private Especie especie;
  private String nome;
  private List<Especie> especies;

  public Raca(int id, Especie especie, String nome) {
    this.id = id;
    this.especie = especie;
    this.nome = nome;
    this.especies = new ArrayList<>();
  }

  public void adicionarEspecie(Especie especie) {
    especies.add(especie);
  }

  //getters

  public int getId() {
    return id;
  }

  public Especie especie() {
    return especie;
  }

  public String getNome() {
    return nome;
  }

  //setters

  public void setId() {
    this.id = id;
  }

  public void setIdEspecie() {
    this.especie = especie;
  }

  public void setNome() {
    this.nome = nome;
  }
}