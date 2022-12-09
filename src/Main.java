import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {



        Map<Car,CarData> car =new HashMap<>();


        car.put(new Car(1,"KG1ABC123"),new CarData(LocalDate.ofYearDay(2022,2),"BMV", BigDecimal.valueOf(500000),"BLACK"));
        car.put(new Car(2,"KG1ABC234"),new CarData(LocalDate.ofYearDay(2021,2),"AUDI", BigDecimal.valueOf(650000),"BLUE"));
        car.put(new Car(3,"KG1ABC345"),new CarData(LocalDate.ofYearDay(2020,2),"KIA", BigDecimal.valueOf(460000),"YELLOW"));
        car.put(new Car(4,"KG1ABC456"),new CarData(LocalDate.ofYearDay(2018,2),"TOYOTA", BigDecimal.valueOf(340000),"RED"));
        car.put(new Car(5,"KG1ABC567"),new CarData(LocalDate.ofYearDay(2015,2),"LEXUS", BigDecimal.valueOf(680000),"WHITE"));

        for (Map.Entry m:car.entrySet()) {
            System.out.println(m);

        }
    }
}