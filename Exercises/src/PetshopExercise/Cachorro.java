package PetshopExercise;

public class Cachorro {

    private String nome;
    private String raca;
    private boolean vacinado;

    public Cachorro(String nome, String raca, boolean vacinado) {
        this.nome = nome;
        this.raca = raca;
        this.vacinado = vacinado;
    }

    public Cachorro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", vacinado=" + vacinado +
                '}';
    }
}
