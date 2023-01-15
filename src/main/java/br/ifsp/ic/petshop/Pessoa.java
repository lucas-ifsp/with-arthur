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
        return cachorros;
    }

    public void addCachorro(Cachorro cachorro){
        this.cachorros.add(cachorro);
    }

    public void removerCachorro(String nome){
        for (int i = 0; i < cachorros.size(); i++) {
            if (cachorros.get(i).getNome().equals(nome)){
                cachorros.remove(i);
                return;
            }
        }
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
