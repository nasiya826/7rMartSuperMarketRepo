package utilities;

import com.github.javafaker.Faker;

public class FakerUtility {

    Faker fakerobj = new Faker();

    public String getUserName() {
        return fakerobj.name().firstName();
    }

    public String getPassword() {
        return fakerobj.internet().password();
    }

    public String getAddress() {
        return fakerobj.address().cityName();
    }

    public String getUsername() {
        return fakerobj.name().username();
    }
}
