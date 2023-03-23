package Model.Entity;

import java.time.LocalDateTime;

public class Mensagem {
  private int id;
  private Usuario enviado_por;
  private Usuario enviado_para;
  private LocalDateTime data_hora;
  private String texto;
  private String imagem;

  public Mensagem(int id, Usuario enviado_por, Usuario enviado_para, LocalDateTime data_hora, String texto, String imagem) {
    this.id = id;
    this.enviado_por = enviado_por;
    this.enviado_para = enviado_para;
    this.data_hora = data_hora;
    this.texto = texto;
    this.imagem = imagem;
  }

  //getters

  public int getId() {
    return id;
  }

  public Usuario getEnviadoPor() {
    return enviado_por;
  }

  public Usuario getEnviadoPara() {
    return enviado_para;
  }

  public LocalDateTime getDataHora() {
    return data_hora;
  }

  public String getTexto() {
    return texto;
  }

  public String getImagem() {
    return imagem;
  }

  //setters

  public void setId() {
    this.id = id;
  }

  public void setEnviadoPor() {
    this.enviado_por = enviado_por;
  }

  public void setEnviadoPara() {
    this.enviado_para = enviado_para;
  }

  public void setDataHora() {
    this.data_hora = data_hora;
  }

  public void setTexto() {
    this.texto = texto;
  }

  public void setImagem() {
    this.imagem = imagem;
  }
}