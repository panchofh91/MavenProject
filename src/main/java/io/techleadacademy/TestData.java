package io.techleadacademy;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class TestData {
    /*
   1.Create a method which will return a Random firstNames - getRandomFirstName
   2.Create a method which will return a Random lastNames - getRandomLastName
   3.Create a method which will return a Random phoneNumbers - getRandomPhoneNum
   4.Create a method which will return a Random address - getRandomAddress

     */
    public static Faker faker = new Faker();
    public static void main(String[] args) {


    }

    public String getRandomFirstName() {
        return faker.name().firstName();
    }
    public String getRandomLastName() {
        return faker.name().lastName();
    }
    public String getRandomPhoneNum() {
        String pNumber = faker.phoneNumber().cellPhone();
        while(!pNumber.equals("1-")) {
            return pNumber;
        }
        return pNumber.substring(1);
    }
    public String getRandomAddress() {
        return faker.address().fullAddress();
    }


}
