package io.techleadacademy;

public class MavenPractice {
    public static void main(String[] args) throws InterruptedException {
        TestData test = new TestData();
        System.out.println(test.getRandomFirstName());
        System.out.println(test.getRandomLastName());
        System.out.println(test.getRandomPhoneNum());
        System.out.println(test.getRandomAddress());

    }
}
