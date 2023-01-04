package Zoo;

import java.lang.reflect.Array;

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
            public Animal[] array = new Animal[10];
        }

        Zoologico zoologico = new Zoologico();
        zoologico.array[0] = new Coruja();
        zoologico.array[1] = new Leao();
        zoologico.array[2] = new Lobo();
        zoologico.array[3] = new Lobo();
        zoologico.array[4] = new Coruja();
        zoologico.array[5] = new Leao();
        zoologico.array[6] = new Lobo();
        zoologico.array[7] = new Coruja();
        zoologico.array[8] = new Leao();
        zoologico.array[9] = new Coruja();

        for (Animal animal : zoologico.array){
            animal.emitirSom();
            if (animal instanceof Leao){
                ((Leao) animal).correr();
            }
            if (animal instanceof Lobo){
                ((Lobo) animal).correr();
            }
        }


        }
    }

