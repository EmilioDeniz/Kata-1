package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002,12,25);
        Person person = new Person("Zacarías", date);
        System.out.println(person.getName()+" tiene "+person.getAge()+" años ");
    }
}
