package br.ifsp.ic.petshop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Petshop {

    private final Map<String, Pessoa> clientes = new HashMap<>();

    public Petshop() {
    }

    public void addCliente(Pessoa cliente){
        clientes.putIfAbsent(cliente.getCpf(), cliente);
    }

    public void addCachorro(String cpf, Cachorro cachorro){
        if (!clientes.containsKey(cpf))
            throw new IllegalArgumentException("Cpf passado não possuí cliente cadastrado no sistema");
        final Pessoa pessoa = clientes.get(cpf); // More readable. Avoid chaining.
        pessoa.addCachorro(cachorro);
    }

    public void listarClientes(){
        for (Pessoa pessoa : clientes.values()) {
            System.out.println(pessoa);
        }
        //or simpler: clientes.values().forEach(System.out::println);
    }

    public void listarCachorros(String cpf){
        if (!clientes.containsKey(cpf))
            throw new IllegalArgumentException("Cpf passado não possui cliente cadastrado no sistema");
        final Pessoa pessoa = clientes.get(cpf);
        for (Cachorro cachorro : pessoa.getCachorros()) {
            System.out.println(cachorro);
        }
    }

    public void removeCliente(String cpf){
        if (!clientes.containsKey(cpf))
            throw new IllegalArgumentException("Cpf passado não possuí cliente cadastrado no sistema");
        clientes.remove(cpf);
    }

    public void removerCachorro(String cpf, String nomeCachorro){
        if (!clientes.containsKey(cpf))
            throw new IllegalArgumentException("Cpf passado não possuí cliente cadastrado no sistema");
        Pessoa pessoa = clientes.get(cpf);
        if (!pessoa.hasCachorro(nomeCachorro))
            throw new IllegalArgumentException("Nome do Cachorro passado não está em posse do cliente.");
        pessoa.removerCachorro(nomeCachorro);
    }

    public void listarTodosVacinados(){
        for(Pessoa pessoa : clientes.values()){
            final List<Cachorro> vacinados = pessoa.getVacinados();
            for (Cachorro vacinado : vacinados) {
                System.out.println(vacinado);
            }
        }
    }

    public void listarVacinadosPorCliente(String cpf){
        if (!clientes.containsKey(cpf))
            System.out.println("Não há cachorros a se exibir."); //Exceptions are for exceptional cases. ;)
        final Pessoa pessoa = clientes.get(cpf);
        for (Cachorro vacinado : pessoa.getVacinados()) {
            System.out.println(vacinado);
        }
    }
}
