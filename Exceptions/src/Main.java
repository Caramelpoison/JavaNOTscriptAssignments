
public class Main {
    public static void main(String[] args) {

//       Person Barney = new Person("Barney",50);
////     Person Alex = new Person("Alexadmalngr bamkfrjlngamfekgnaofm;eakngga;segmlkangamglksdnglaomksngjansekngklsd", 25);
//       Person Coco = new Person("Coco",150);
//


//       int answer1 = Calculator.factorial(5);
//       int answer2 = Calculator.factorial(-5);
//       System.out.println(answer1);

//        StandardSensor ten = new StandardSensor(10);
//        StandardSensor minusFive = new StandardSensor(-5);
//
//        System.out.println(ten.read());
//        System.out.println(minusFive.read());
//
//        System.out.println(ten.isOn());
//        ten.setOff();
//        System.out.println(ten.isOn());

//        TemperatureSensor TemperatureSensor = new TemperatureSensor();
//        TemperatureSensor.setOn();
//        int coco = TemperatureSensor.read();
//
//        System.out.println(coco);

        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        helsinkiVantaaAirport.setOn();
        kaisaniemi.setOn();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());
    }
}