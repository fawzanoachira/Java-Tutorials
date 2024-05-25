package dao;

import java.sql.SQLException;

import person.Person;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        PersonDao personDao = new PersonDao();
        Person person1 = new Person(1, "Fawzan", 24);
        Person person2 = new Person(2, "Fawz", 23);
        
        personDao.insert(person2);
        personDao.delete(person2);
        personDao.update(person1);
        personDao.select();
    }
}
