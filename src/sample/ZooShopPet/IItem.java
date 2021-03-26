package sample.ZooShopPet;

import java.time.LocalDate;

public interface IItem {

    double getPrice();
    void setPrice();

    LocalDate getDatePurchase();
    LocalDate setDatePurchase();


}
