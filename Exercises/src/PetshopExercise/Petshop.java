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
        this.clientes.putIfAbsent(cliente.getCpf(), cliente);
    }

    public void addCachorro(String cpf, Cachorro cachorro){
        if (this.clientes.get(cpf) == null)
            throw new IllegalArgumentException("Cliente não existe");
        this.clientes.get(cpf).addCachorro(cachorro);
    }

    public void listarClientes(){
        for (String cpf : this.clientes.keySet()){
            System.out.println(this.clientes.get(cpf).toString() + " \t");
        }
    }

    public void listarCachorros(String cpf){
        if (this.clientes.get(cpf) == null) throw new RuntimeException("Cliente não Existe");
        for (Cachorro cachorro : clientes.get(cpf).getCachorros()){
            System.out.println(cachorro.toString() + " \t");
        }
    }

    public void removeCliente(String cpf){
        if (this.clientes.get(cpf) == null) throw new RuntimeException("Cliente não Existe");
        this.clientes.remove(cpf);
    }

    public void removerCachorro(String cpf, String nomeCachorro){
        if (this.clientes.get(cpf) == null) throw new RuntimeException("Cliente não Existe");
        Pessoa pessoa = this.clientes.get(cpf);
        if (!pessoa.getCachorros().contains(nomeCachorro));
        pessoa.removerCachorro(nomeCachorro);
    }

    public void listarTodosVacinados(){
        for(String cpf : this.clientes.keySet()){
            for (Cachorro c : this.clientes.get(cpf).getCachorros()){
                if (c.isVacinado()){
                    System.out.println(c + " \n");
                }
            }
        }
    }

    public void listarVacinadosPorCliente(String cpf){
        for (Cachorro c : this.clientes.get(cpf).getCachorros()){
            if (c.isVacinado()){
                System.out.println(c + " \n");
            }
        }
    }
}
