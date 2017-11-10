
package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long MILISEGUNDOS_POR_AÑO = (long) (1000*60*60*24*365.25);

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    private long milisegundoToYear(long milles){
        return milles / MILISEGUNDOS_POR_AÑO;
    }
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int)  (milisegundoToYear(today.getTimeInMillis() - birthdate.getTimeInMillis()));
    }
}
