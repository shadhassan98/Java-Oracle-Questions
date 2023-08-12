package CSE;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Country {

    public enum Continent {
        ASIA,
        EUROPE,
        AMERICA,
        AFRICA
    }
    String name;
    Continent region;
    public Country (String na,Continent reg) {
        name = na;
        region = reg;
    }
    public String getName() {
        return name;
    }
    public Continent getRegion() {
        return region;
    }
    
    public static void main(String[] args) {
        List<Country> couList = Arrays.asList(
            new Country("Italy", Continent.EUROPE),
            new Country("Germany", Continent.EUROPE),
            new Country("Brazil", Continent.AMERICA),
            new Country("Japan", Continent.ASIA)
            );
        Map<Country.Continent,List<String>> regionNames = couList.stream()
                                                                 .collect(Collectors.groupingBy(Country::getRegion,Collectors.mapping(Country::getName,Collectors.toList())));
        System.out.println(regionNames);
    }
}
