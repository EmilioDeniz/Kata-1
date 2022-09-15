package kata1;

import java.time.LocalDate;
import java.time.Period;



public class Person {
    private final String name;
    private final LocalDate birthdate;
    private final long MILISECONDS_PER_YEAR = (long) (365.25*24*60*60*1000);

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        LocalDate today = LocalDate.now();
  
        return (int) Period.between(birthdate, today).getYears();
    }
    
}
