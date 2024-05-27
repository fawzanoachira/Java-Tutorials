package dao;

import java.sql.SQLException;

import person.Person;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Persondao persondao = new Persondao();
        Person person = new Person(2, "fawza", 26);

        persondao.insert(person);
    }
}
