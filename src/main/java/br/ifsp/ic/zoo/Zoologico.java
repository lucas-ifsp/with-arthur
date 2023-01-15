package br.ifsp.ic.zoo;

public class Zoologico {

    public static void main(String[] args) {
        Animal[] jaulas = new Animal[10];
        jaulas[0] = new Coruja();
        jaulas[1] = new Leao();
        jaulas[2] = new Lobo();
        jaulas[3] = new Lobo();
        jaulas[4] = new Coruja();
        jaulas[5] = new Leao();
        jaulas[6] = new Lobo();
        jaulas[7] = new Coruja();
        jaulas[8] = new Leao();
        jaulas[9] = new Coruja();

        for (Animal animal : jaulas){
            animal.emitirSom();
            if (animal instanceof Leao) ((Leao) animal).correr();
            if (animal instanceof Lobo) ((Lobo) animal).correr();
        }


        }
    }

