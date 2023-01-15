package br.ifsp.ic.petshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pessoa {

    private String nome;
    private String cpf;
    private final List<Cachorro> cachorros = new ArrayList<>();

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Cachorro> getCachorros() {
        return new ArrayList<>(cachorros);
    }

    public boolean hasCachorro(String nome){
        for (Cachorro cachorro : cachorros) {
            if(cachorro.getNome().equals(nome)) return true;
        }
        return false;
    }

    public void addCachorro(Cachorro cachorro){
        this.cachorros.add(cachorro);
    }

    public void removerCachorro(String nome){
        //the same, but using lambda function.
        //cachorros.removeIf(cachorro -> cachorro.getNome().equals(nome));
        for (int i = 0; i < cachorros.size(); i++) {
            if (cachorros.get(i).getNome().equals(nome)){
                cachorros.remove(i);
                return;
            }
        }
    }

    public List<Cachorro> getVacinados(){
        List<Cachorro> vacinados = new ArrayList<>();
        for (Cachorro cachorro : cachorros) {
            if(cachorro.isVacinado()) vacinados.add(cachorro);
        }
        return vacinados;
        //or simpler: return cachorros.stream().filter(cachorro -> cachorro.isVacinado()).toList();
        //or even more simple: return cachorros.stream().filter(Cachorro::isVacinado).toList();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return cpf.equals(pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
