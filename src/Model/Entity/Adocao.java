package Model.Entity;

import java.time.LocalDateTime;

public class Adocao {
  private int id;
  private Pets pets;
  private Usuario usuario;
  private LocalDateTime data_hora;

  public Adocao(int id, Pets pets, Usuario usuario) {
    this.id = id;
    this.pets = pets;
    this.usuario = usuario;
    this.data_hora = data_hora;
  }

  //getters

  public int getId() {
    return id;
  }

  public Pets getPets() {
    return pets;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public LocalDateTime getDataHora() {
    return data_hora;
  }

  //setters

  public void setId() {
    this.id = id;
  }

  public void setPets() {
    this.pets = pets;
  }

  public void setIdUsuario() {
    this.usuario = usuario;
  }

  public void setDataHora() {
    this.data_hora = data_hora;
  }
}
