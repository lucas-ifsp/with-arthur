package br.ifsp.ic.zoo;

public class Main {
    public static void main(String[] args) {

        abstract class Animal {
            String nome;

            public abstract void emitirSom();
        }

        class Leao extends Animal {
            public void correr() {
                System.out.println("O leão está correndo...");
            }

            public void emitirSom() {
                System.out.println("Rrrrwarrr!");
            }
        }

        class Lobo extends Animal {
            public void correr() {
                System.out.println("O lobo está correndo...");
            }

            public void emitirSom() {
                System.out.println("Auuuuuu Auuuuuu!");
            }
        }

        class Coruja extends Animal {
            public void voar() {
                System.out.println("A coruja está voando ...");
            }

            public void emitirSom() {
                System.out.println("Pruuu Pruuuu");
            }
        }


        class Zoologico{
            public final Animal[] array = new Animal[10];
        }

        final var zoological = new Zoologico();
        zoological.array[0] = new Coruja();
        zoological.array[1] = new Leao();
        zoological.array[2] = new Lobo();
        zoological.array[3] = new Lobo();
        zoological.array[4] = new Coruja();
        zoological.array[5] = new Leao();
        zoological.array[6] = new Lobo();
        zoological.array[7] = new Coruja();
        zoological.array[8] = new Leao();
        zoological.array[9] = new Coruja();

        for (Animal animal : zoological.array){
            animal.emitirSom();
            if (animal instanceof Leao) ((Leao) animal).correr();
            if (animal instanceof Lobo) ((Lobo) animal).correr();
        }


        }
    }

