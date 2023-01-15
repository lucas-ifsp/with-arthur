package br.ifsp.ic.petshop;

import java.util.HashMap;
import java.util.Map;

public class Petshop {

    private final Map<String, Pessoa> clientes = new HashMap<>();

    public Petshop() {
    }

    public void addCliente(Pessoa cliente){
        clientes.putIfAbsent(cliente.getCpf(), cliente);
    }

    public void addCachorro(String cpf, Cachorro cachorro){
        if (clientes.get(cpf) == null)
            throw new IllegalArgumentException("Cpf passado não possuí cliente cadastrado no sistema");
        final Pessoa pessoa = clientes.get(cpf); // More readable. Avoid chaining.
        pessoa.addCachorro(cachorro);
    }

    public void listarClientes(){
        for (String cpf : clientes.keySet()){
            System.out.println(clientes.get(cpf)); //toString is called implicitly
        }
    }

    public void listarCachorros(String cpf){
        if (clientes.get(cpf) == null)
            throw new IllegalArgumentException("Cpf passado não possui cliente cadastrado no sistema");
        for (Cachorro cachorro : clientes.get(cpf).getCachorros()){
            System.out.println(cachorro);
        }
    }

    public void removeCliente(String cpf){
        if (clientes.get(cpf) == null)
            throw new IllegalArgumentException("Cpf passado não possuí cliente cadastrado no sistema");
        clientes.remove(cpf);
    }

    public void removerCachorro(String cpf, String nomeCachorro){
        if (clientes.get(cpf) == null)
            throw new IllegalArgumentException("Cpf passado não possuí cliente cadastrado no sistema");
        Pessoa pessoa = clientes.get(cpf);
        if (!pessoa.getCachorros().contains(nomeCachorro))
            throw new IllegalArgumentException("Nome do Cachorro passado não está em posse do cliente.");
        pessoa.removerCachorro(nomeCachorro);
    }

    public void listarTodosVacinados(){
        for(String cpf : clientes.keySet()){
            for (Cachorro c : clientes.get(cpf).getCachorros()){
                if (c.isVacinado()){
                    System.out.println(c + " \n");
                }
            }
        }
    }

    public void listarVacinadosPorCliente(String cpf){
        if (clientes.get(cpf) == null)
            throw new IllegalArgumentException("Cpf passado não possuí cliente cadastrado no sistema");
        for (Cachorro c : clientes.get(cpf).getCachorros()){
            if (c.isVacinado()){
                System.out.println(c + " \n");
            }
        }
    }
}
