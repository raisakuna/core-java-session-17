package abstractandinheritance.exampletwo;

public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(type + " lazily swimming");
        } else {
            System.out.println(type +  "splish splash");
        }

    }

    @Override
    public void makeNoise() {
        if(type == "Goldfish"){
            System.out.println("swish");
        }
        else {
            System.out.println("splash!");
        }
    }
}
