package sample.ZooShopPet;

import java.time.LocalDate;
import java.time.Period;

public abstract class ZooShopPet implements IPet,IItem{
    private double price;
    private LocalDate DateBirthday;
    private String name;
    private LocalDate DatePurchase;
    private String www;

    public ZooShopPet(double price, LocalDate dateBirthday, String name, LocalDate datePurchase, String www) {
        this.price = price;
        DateBirthday = dateBirthday;
        this.name = name;
        DatePurchase = datePurchase;
        this.www = www;
    }

    @Override
    public String toString() {
        return "ZooShopPet{" +
                "price=" + price +
                ", DateBirthday=" + DateBirthday +
                ", name='" + name + '\'' +
                ", DatePurchase=" + DatePurchase +
                ", www='" + www + '\'' +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }

   /*// public void setDateBirthday(LocalDate dateBirthday) {
        DateBirthday = dateBirthday;
    }*/

    public void setName(String name) {
        this.name = name;
    }

/*
    public void setDatePurchase(LocalDate datePurchase) {
        DatePurchase = datePurchase;
    }
*/

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public void Age(){
        Period Age = Period.between(LocalDate.now(),this.getDateBirthday());

    }

    public ZooShopPet() {
        super();
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
        return price;

    }

    @Override
    public void setPrice() {

    }

    @Override
    public LocalDate getDatePurchase() {
        return DatePurchase;
    }

    @Override
    public LocalDate setDatePurchase() {
        return setDateBirthday();
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName() {

    }

    @Override
    public LocalDate getDateBirthday() {
        return DateBirthday;
    }

    @Override
    public LocalDate setDateBirthday() {
        return setDateBirthday();
    }
}
