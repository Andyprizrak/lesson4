package ru.geekbrains.home_task_Level1_4_7;

// import java.util.Arrays;

public class Main {

    private static void upSallary(Emploeer staff[]){
        for (int i = 0; i < staff.length; i++){
            if (staff[i].age > 45) {staff[i].salary = staff[i].salary+5000;}
        }
    }

    public static void main(String[] args) {

        Emploeer emploeer1 = new Emploeer();

        System.out.println("Фамилия " + emploeer1.getFirstName() + " Должность " + emploeer1.getFunction());

        int tabNamber = 1;


         Emploeer [] staff  = new Emploeer[5];

         staff[0] = new Emploeer("Петров",35,35000,"manager", tabNamber++);
         staff[1] = new Emploeer("Сидоров",45,25000,"offis manager",tabNamber++);
         staff[2] = new Emploeer("Князев",50,32000,"people manager", tabNamber++);
         staff[3] = new Emploeer("Белый",30,45000,"task manager", tabNamber++);
         staff[4] = new Emploeer("Счастливый",51,50000,"happy manager",tabNamber);


        for (int i = 0; i < staff.length; i++) {
            if (staff[i].age > 40) {
                System.out.println("Фамилия " + staff[i].firstName + " Должность " + staff[i].function + " з/п " + staff[i].salary);
            }
        }

         upSallary(staff);

        for (int i = 0; i < staff.length; i++) {
            if (staff[i].age > 45) {
                System.out.println("Фамилия " + staff[i].firstName + " Должность " + staff[i].function + " з/п " + staff[i].salary + " Personal Namber " + staff[i].getPersonalNamber());
            }
        }
        double averageSalary = 0;
        double averageAge = 0;
        for (int i =0; i<staff.length; i++) {
            averageSalary = averageSalary + staff[i].salary;
            averageAge = averageAge + staff[i].age;
        }
        averageSalary = averageSalary/staff.length;
        averageAge = averageAge/staff.length;

        System.out.println("Средний возраст : " + averageAge + " Средняя зарплата : " + averageSalary);

    }


}
