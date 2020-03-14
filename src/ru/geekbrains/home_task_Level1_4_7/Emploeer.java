package ru.geekbrains.home_task_Level1_4_7;

public class Emploeer {
        String firstName;
        int age;
        double salary;
        String function;
        int tabNamber;

    Emploeer () {
        this.firstName = "Иванов";
        this.age = 35;
        this.salary = 100000.00;
        this.function = "Директор";
    }
    Emploeer (String firstName, int age, double salary, String function, int tabNamber) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
        this.function = function;
        this.tabNamber = tabNamber;
    }

    public String getFirstName (){
        return firstName;
    }
    public int getAge () {
        return this.age;
    }
    public double getSalary () {
        return this.salary;
    }
    public String getFunction () {
        return this.function;
    }
    public int getTablNomber () {
        return tabNamber;
    }
 /*   private int countTabNamber() {
        tabNamber = tabNamber + 1;
        return tabNamber;

    }
*/
}
