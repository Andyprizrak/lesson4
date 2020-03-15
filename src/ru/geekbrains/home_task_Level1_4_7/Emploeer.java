package ru.geekbrains.home_task_Level1_4_7;

public class Emploeer {
                String firstName;
                int age;
                double salary;
                String function;
                int tabNamber;
        private int personalNamber;

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
        persinalInn();
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
    public int getPersonalNamber () {
        return personalNamber;
    }
    private void persinalInn() {
        personalNamber = 5503000 + tabNamber;
      //  return tabNamber;

    }

}
