import java.util.List;

public class Usuario {
  private String nome;
  private String username;
  private String email;
  private String cpf;
  private List<Ingresso> ingressos;
  private int hashedPassword;
  private boolean permission;

  Usuario(String username, String password, String nome, String cpf, String email, boolean permission) {
    this.username = username;
    setSenha(password);
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.permission = permission;
  }
  public boolean checkPassword(String password) {
    return password.hashCode() == this.hashedPassword;
  }
  public boolean login(String username, String password) {
    return (this.username.equals(username) && checkPassword(password));
  }
  public boolean isAtivo() {
    return this.permission;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public List<Ingresso> getIngressos() {
    return ingressos;
  }
  public void setIngressos(List<Ingresso> ingressos) {
    this.ingressos = ingressos;
  }
  public int getHashedPassword() {
    return hashedPassword;
  }
  public void setSenha(String password) {
    this.hashedPassword = password.hashCode();
  }
  public boolean isPermission() {
    return permission;
  }
  public void setPermission(boolean permission) {
    this.permission = permission;
  }
}
