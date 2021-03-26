package sample.ZooShopPet;

//import com.companyCat.ZooShopPet;

import java.time.LocalDate;

public class Cat extends ZooShopPet {

    String typeFur;


    @Override
    public String toString() {
        return         super.getName()+" " +typeFur+" " +super.getDateBirthday()+" " +super.getPrice()+" "+
                super.getDatePurchase()+" "+super.getWww();
    }

    public Cat(String name, LocalDate dateBirthday, double price, LocalDate datePurchase, String typeFur, String www) {
        super(price, dateBirthday, name, datePurchase,www);
        this.typeFur = typeFur;
    }

    @Override
    public void Age() {
        super.Age();
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public double getPrice() {
        super.getPrice();
        return 0;
    }

    @Override
    public void setPrice() {
        super.setPrice();
    }


    @Override
    public LocalDate getDatePurchase() {
        return super.getDatePurchase();
    }

    @Override
    public LocalDate setDatePurchase() {
        return super.setDatePurchase();
    }

    @Override
    public String getName() {

        return super.getName();
    }

    @Override
    public void setName() {
        super.setName();
    }

    @Override
    public LocalDate getDateBirthday() {
        return super.getDateBirthday();
    }

    @Override
    public LocalDate setDateBirthday() {
        return super.setDateBirthday();
    }

    public String getTypeFur() {
        return typeFur;
    }

    public void setTypeFur(String typeFur) {
        this.typeFur = typeFur;
    }
}
