package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Zacarías", new Date(102, 10, 24));
        System.out.println(person.getName()+" tiene "+person.getAge()+" años ");
    }
}
