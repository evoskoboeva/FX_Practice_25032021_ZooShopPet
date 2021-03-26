package sample.ZooShopPet;

import java.time.LocalDate;

public class MainZoo {

    public static void main(String[] args) {

        Cat cat = new Cat("Kot", LocalDate.of(2011,02,15),100,
        LocalDate.of(2021, 03, 12), "long","www");
        System.out.println(cat);
        Dog dog = new Dog(200,LocalDate.of(2015, 05, 05), "Pes",
                LocalDate.of(2021, 03, 13),"www2",70);
        System.out.println(dog);

        /*ArrayList<ZooShopPet> animals =new ArrayList<>();
         animals.add(cat);
         animals.add(dog);
        */
        ZooShop zooShop = new ZooShop();
        zooShop.addAnimal(cat);
        zooShop.addAnimal(dog);

        System.out.println(zooShop);





    }

}
