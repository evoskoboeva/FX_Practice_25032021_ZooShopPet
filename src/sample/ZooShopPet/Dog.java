package sample.ZooShopPet;

//import com.companyCat.ZooShopPet;

import java.time.LocalDate;

public class Dog extends ZooShopPet {
    private int size;

    @Override
    public String toString() {
        return super.getName()+" " +size+" " +super.getDateBirthday()+" " +super.getPrice()+" "+super.getDatePurchase()+" "+super.getWww();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Dog(double price, LocalDate dateBirthday, String name, LocalDate datePurchase, String www, int size) {
        super(price, dateBirthday, name, datePurchase, www);
        this.size = size;
    }


}
