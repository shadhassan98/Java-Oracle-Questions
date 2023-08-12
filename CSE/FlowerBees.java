package CSE;
public class FlowerBees {
    
    public static void main(String[] args) {
        int flower,bees;
        for(flower = 1;flower<=1000;flower+=2) {
            bees = flower + 1;
            if((bees/2) == flower - 1) {
                System.out.println(flower);
                return;
            }
        }
        
    }
}
