public class Ingresso {
  private Double preco;
  private String assento;
  private Evento evento;
  private Boolean status;
  
  Ingresso(Evento evento, Double preco, String assento) {
    this.evento = evento;
    this.assento = assento;
  }
  @Override
  public int hashCode() {
    return (this.preco.toString() + assento + this.status.toString() + this.evento.getNome() + this.evento.getData().toString()).hashCode();
  }
  public Boolean isAtivo() {
    return this.status;
  }
  public void cancelar() {
    this.status = false;
  }
  public void reativar() {
    this.status = true;
  }
  public Evento getEvento() {
    return this.evento;
  }
  public Double getPreco() {
    return this.preco;
  }
  public String getAssento() {
    return this.assento;
  }
  public void setPreco(Double preco) {
    this.preco = preco;
  }
  public void setAssento(String assento) {
    this.assento = assento;
  }
  public void setEvento(Evento evento) {
    this.evento = evento;
  }
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }
}
