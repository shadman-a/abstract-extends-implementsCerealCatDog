import catsanddogs.Brutus;
import catsanddogs.Rufus;
import cereals.AbstractCereal;
import cereals.CocoPuffsCereal;
import cereals.SoggyFruitLoopsCereal;
import videogames.HalfLife;
import videogames.SuperMario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HalfLife halfLife = new HalfLife();
        halfLife.showNumberOfWeapons();
        SuperMario superMario = new SuperMario();
    }

    public static void catsAndDogs() {

        Rufus rufus = new Rufus();
        System.out.println("alive: " + rufus.isAlive());
        System.out.println("name: " + rufus.myName());
        rufus.bark();

        Brutus brutus = new Brutus();
        // System.out.println("alive: " + brutus.getAnimal().isAlive());
        System.out.println("name: " + brutus.myName());
        // brutus.getCat().meow();

    }

    public static void abstractClassExample() {
        List<AbstractCereal> cereals = new ArrayList<>();
        cereals.add(new SoggyFruitLoopsCereal());
        cereals.add(new CocoPuffsCereal());
        for (AbstractCereal cereal : cereals) {
            cereal.willIEatIt();
        }
    }
}
