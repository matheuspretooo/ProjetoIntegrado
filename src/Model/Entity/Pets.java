package Model.Entity;

import java.time.LocalDateTime;

public class Pets {
  private int id;
  private Usuario usuario;
  private String nome_Raca;
  private String descricao;
  private LocalDateTime data_hora;
  private String imagem_p;
  private String imagem_m;
  private String imagem_g;

  public Pets(int id, Usuario usuario, String nome_Raca, String descricao, LocalDateTime data_hora, String imagem_p, String imagem_m, String imagem_g) {
    this.id = id;
    this.usuario = usuario;
    this.nome_Raca = nome_Raca;
    this.descricao = descricao;
    this.data_hora = data_hora;
    this.imagem_p = imagem_p;
    this.imagem_m = imagem_m;
    this.imagem_g = imagem_g;
  }

  //getters

  public int getId() {
    return id;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public String getNomeRaca() {
    return nome_Raca;
  }

  public String getDescricao() {
    return descricao;
  }

  public LocalDateTime getDataHora() {
    return data_hora;
  }

  public String getImagemP() {
    return imagem_p;
  }

  public String getImagemM() {
    return imagem_m;
  }

  public String getImagemG() {
    return imagem_g;
  }

  //setters

  public void setId() {
    this.id = id;
  }

  public void setIdUsuario() {
    this.usuario = usuario;
  }

  public void setNomeRaca() {
    this.nome_Raca = nome_Raca;
  }

  public void setDescricao() {
    this.descricao = descricao;
  }

  public void setDataHora() {
    this.data_hora = data_hora;
  }

  public void setImagemP() {
    this.imagem_p = imagem_p;
  }
  
  public void setImagemM() {
    this.imagem_m = imagem_m;
  }

  public void setImagemG() {
    this.imagem_g = imagem_g;
  }
}