package br.ifsp.ic.autentication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private static Integer ID_AI = 0;
    private Integer id;
    private String name;
    private String sex;
    private Date birthDate;

    public Person(String name, String sex, Date birthDate) throws ParseException {
        ID_AI++;
        this.id = ID_AI;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public Person() {
        ID_AI++;
        this.id = ID_AI;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDate=" + new SimpleDateFormat("dd/MM/yyyy").format(birthDate) +
                '}';
    }


}