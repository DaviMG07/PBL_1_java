import java.util.Calendar;
import java.util.Date;
import java.util.List;
import vendaingressos.Ingresso;

public class Evento {
  private Date data;
  private String nome;
  private String descricao;
  private Double preco;
  private List<Ingresso> ingressos;

  Evento(String nome, String descricao, Date data) {
    this.nome = nome;
    this.descricao = descricao;
    this.data = data;
  }
  public void adicionarAssento(String assento) {
    this.ingressos.add(Ingresso(this, this.preco, assento));
  }
  public void removerAssento(String assento) {

  }
  public String getNome() {
    return this.nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public List<Ingresso> getAssentosDisponiveis() {
    return this.ingressos;
  }
  public boolean isAtivo() {
    return (this.data.after(new Date()));
  }
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public Double getPreco() {
    return preco;
  }
  public void setPreco(Double preco) {
    this.preco = preco;
  }
  public List<Igressos> getIngressos() {
    return ingressos;
  }
  public void setIngressos(List<Igressos> ingressos) {
    this.ingressos = ingressos;
  }
}
