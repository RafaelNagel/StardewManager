package domain.animal;

public class Ovelha  implements Animal {

    private int id;
    private String nome;
    private String raca;
    private int idade;

    public Ovelha(int id, String nome, String raca, int idade) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getRaca() {
        return raca;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public String getStatus() {
        return "Pronta para tosquia";
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Mééé!");
    }

    @Override
    public void coletarProduto() {
        System.out.println(nome + " forneceu lã.");
    }
}
