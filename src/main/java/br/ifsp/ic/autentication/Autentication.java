package br.ifsp.ic.autentication;

public class Autentication {

    private String user;
    private String password;
    private Person person;

    public Autentication(String user, String password, Person person) {
        this.user = user;
        this.password = password;
        this.person = person;
    }

    public Autentication() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Autentication{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", person=" + person.toString() +
                '}';
    }
}

