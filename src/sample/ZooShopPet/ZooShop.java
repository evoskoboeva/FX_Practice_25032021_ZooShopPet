package sample.ZooShopPet;

//import com.companyCat.ZooShopPet;

import java.util.ArrayList;

public class ZooShop {
    @Override
    public String toString() {
        return "[" +
                "animals=" + animals +
                ']';
    }

    public ZooShop() {
        this.animals = animals;
    }
    public void  addAnimal(ZooShopPet zooShopPet){
        animals.add(zooShopPet);

    }
    public void removeAnimal(ZooShopPet zooShopPet){animals.remove( index);}


    int index;
    ArrayList<ZooShopPet> animals =new ArrayList<>();

}
