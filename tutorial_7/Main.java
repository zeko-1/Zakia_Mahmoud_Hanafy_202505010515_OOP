public class Main {
    public static void main(String[]args){
        Appliances Microwave= new Television("LG");
        Microwave.displayBrand();

        Microwave.turnOn();
        Microwave.operate();
        Microwave.turnOff();

        System.out.println();

        Appliances Television = new Television("Sony");
        Television.displayBrand();

        Television.turnOn();
        Television.operate();
        Television.turnOff();

    }
}
