package domain.animal;

public interface Animal {
    int getId();
    String getNome();
    String getRaca();
    int getIdade();
    String getStatus();
    void emitirSom();
    void coletarProduto();
}
