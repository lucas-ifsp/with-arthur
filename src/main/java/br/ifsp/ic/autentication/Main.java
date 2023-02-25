package br.ifsp.ic.autentication;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        final ArrayList<Person> persons = new ArrayList<>();
        final ArrayList<Autentication> autentications = new ArrayList<>();
        final var scanner = new Scanner(System.in);
        final var formatter = new SimpleDateFormat("dd/MM/yyyy");
        int opc;

        do {
            System.out.println("1. Add Person");
            System.out.println("2. Add Autentication");
            System.out.println("3. Show Persons");
            System.out.println("4. Show Autentications");
            System.out.println("5. Remove Person");
            System.out.println("6. Remove Autentication");
            System.out.println("0. Exit");
            opc = Integer.parseInt(scanner.nextLine());

            String name ;
            String sex;
            Date birthDate;
            String password;
            String user;
            Optional<Person> findPerson;
            Optional<Autentication> findAutentication;

            switch (opc) {
                case 0:
                    break;

                case 1:
                    System.out.println("Name: ");
                    name = scanner.nextLine();
                    System.out.println("Sex: ");
                    sex = scanner.nextLine();
                    System.out.println("Birth Date: ");
                    birthDate = formatter.parse(scanner.nextLine());
                    persons.add(new Person(name, sex, birthDate));
                    break;

                case 2:

                    if (persons.isEmpty()) {
                        System.out.println("You need to add a person first");
                        break;
                    }

                    System.out.println("What person do you want to add an autentication?");
                    persons.forEach(System.out::println);
                    System.out.println("ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    findPerson = persons.stream().filter(person -> person.getId() == id).findAny();

                    if (findPerson.isEmpty()) {
                        System.out.println("Person doesn't exist");
                        break;
                    }

                    if (autentications.stream().anyMatch(autenticationcheck -> autenticationcheck.getPerson().getId() == id)) {
                        System.out.println("Person already has an autentication");
                        break;
                    }

                    System.out.println("User: ");
                    user = scanner.nextLine();
                    System.out.println("Password: ");
                    password = scanner.nextLine();
                    autentications.add(new Autentication(user, password, findPerson.get()));
                    break;

                case 3:

                    persons.forEach(System.out::println);
                    break;

                case 4:

                    autentications.forEach(System.out::println);
                    break;

                case 5:

                    if (persons.isEmpty()) {
                        System.out.println("You need to add a person first");
                        break;
                    }

                    System.out.println("What person do you want to remove?");
                    persons.forEach(System.out::println);
                    System.out.println("ID: ");
                    id = Integer.parseInt(scanner.nextLine());
                    findPerson = persons.stream().filter(person -> person.getId() == id).findAny();

                    if (findPerson.isEmpty()) {
                        System.out.println("Person doesn't exist");
                        break;
                    }

                    if (autentications.stream().anyMatch(autentication -> autentication.getPerson().getId() == id)) {
                        System.out.println("Person have an autentication");
                        break;
                    }

                    persons.remove(findPerson.get());
                    break;
                case 6:
                    if (autentications.isEmpty()) {
                        System.out.println("You need to add a autentication first");
                        break;
                    }

                    System.out.println("What User autentication do you want to remove?");
                    autentications.forEach(autentication -> System.out.println("\nUser ID: " + autentication.getPerson().getId() + "\nUser: " + autentication.getUser() + "\nPerson Name: " + autentication.getPerson().getName()));
                    System.out.println("\n User id you want remove: ");
                    int personId = Integer.parseInt(scanner.nextLine());

                    if (persons.stream().noneMatch(person -> person.getId() == personId)) {
                        System.out.println("Person doesn't exist");
                        break;
                    }

                    findAutentication = autentications.stream().filter(autentication -> autentication.getPerson().getId() == personId).findAny();
                    if (findAutentication.isEmpty()) {
                        System.out.println("Autentication doesn't exist");
                        break;
                    }

                    autentications.remove(findAutentication.get());
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        } while (opc != 0);
    }
}