package abstractandinheritance.exampletwo;

import java.util.ArrayList;

public class AnimalApplication {

    public static void main(String[] args) {
       // Animal animal  = new Animal("Wolf", "big",100) ;  We cannot create an instance of Animal as it is abstrac
        Dog dog  = new Dog("Wolf", "big",100);
      //  dog.makeNoise();

      //  doAnimalStuff(dog);

        ArrayList<Animal> animals =  new ArrayList<>();
        animals.add(new Dog("German Shepherd", "big",150));
        animals.add(new Fish("Goldfish", "small",2));
        animals.add(new Dog("Pug", "small",150));
        animals.add(new Fish("Goldfish", "small",2));

        for(Animal animal:animals){
            doAnimalStuff(animal);
        }


    }
// We cannot create an instance of Animal, but we can use its method
    private static void doAnimalStuff(Animal animal){
        animal.move("slow");
        animal.makeNoise();
    }
}
