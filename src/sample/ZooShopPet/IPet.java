package sample.ZooShopPet;

import java.time.LocalDate;

public interface IPet {

    String getName();
    void setName();

    LocalDate getDateBirthday();
    LocalDate setDateBirthday();
}
