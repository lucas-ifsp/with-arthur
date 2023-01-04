package PetshopExercise;

import java.util.HashMap;
import java.util.Map;

public class Petshop {

    private Map<String, Pessoa> clientes = new HashMap<>();

    public Petshop() {
    }

    public Map<String, Pessoa> getClientes() {
        return clientes;
    }

    public void setClientes(Map<String, Pessoa> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Pessoa cliente){
        this.clientes.put(cliente.getCpf(), cliente);
    }

    public void addCachorro(String cpf, Cachorro cachorro){
        this.clientes.get(cpf).addCachorro(cachorro);
    }

    public void listarClientes(){
        for (String cpf : this.clientes.keySet()){
            System.out.println(this.clientes.get(cpf).toString() + " \t");
        }
    }

    public void listarCachorros(String cpf){
        for (Cachorro cachorro : clientes.get(cpf).getCachorros()){
            System.out.println(cachorro.toString() + " \t");
        }
    }

    public void removeCliente(String cpf){
        this.clientes.remove(cpf);
    }

    public void removerCachorro(String cpf, String nomeCachorro){
        Pessoa pessoa = this.clientes.get(cpf);
        pessoa.removerCachorro(nomeCachorro);
    }

    public void listarTodosVacinados(){
        for(String cpf : this.clientes.keySet()){
            for (Cachorro c : this.clientes.get(cpf).getCachorros()){
                if (c.isVacinado()){
                    System.out.println(c + " \t");
                }
            }
        }
    }

    public void listarVacinadosPorCliente(String cpf){
        for (Cachorro c : this.clientes.get(cpf).getCachorros()){
            if (c.isVacinado()){
                System.out.println(c + " \t");
            }
        }
    }
}
