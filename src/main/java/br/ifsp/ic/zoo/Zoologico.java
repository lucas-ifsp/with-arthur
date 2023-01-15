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

        //It is correct. You nailed the concept of type checking and polymorphism.
        //I refactored just to show you another way to do it using pattern matching for instanceof (Java 17 feature)
        //https://docs.oracle.com/en/java/javase/17/language/pattern-matching-instanceof-operator.html
        for (Animal animal : jaulas){
            animal.emitirSom();
            if (animal instanceof Leao leao) leao.correr();
            if (animal instanceof Lobo lobo) lobo.correr();
        }
    }
}

