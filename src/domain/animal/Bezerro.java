package domain.animal;

public class Bezerro extends VacaMae {

    public Bezerro(int id, String nome, String raca, int idade) {
        super(id, nome, raca, idade);
    }

    @Override
    public String getStatus() {
        return "Filhote";
    }

    @Override
    public void coletarProduto() {
        System.out.println(getNome() + " ainda não produz leite.");
    }
}
