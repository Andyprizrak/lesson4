package ru.geekbrains.home_task_Level1_4_7;

// import java.util.Arrays;

public class Main {

    private static void upSallary(Emploeer staff[], Emploeer emploeer){
        for (int i = 0; i < staff.length; i++){
            emploeer = staff[i];
            if (emploeer.age > 45) {emploeer.salary = emploeer.salary+5000;}
        }
    }

    public static void main(String[] args) {

        Emploeer emploeer1 = new Emploeer();

        System.out.println("Фамилия " + emploeer1.getFirstName() + " Должность " + emploeer1.getFunction());

        int tabNamber = 0;


         Emploeer [] staff  = new Emploeer[5];

         staff[0] = new Emploeer("Петров",35,35000,"manager", tabNamber);
         tabNamber ++;
         staff[1] = new Emploeer("Сидоров",45,25000,"offis manager",tabNamber);
         tabNamber ++;
         staff[2] = new Emploeer("Князев",50,32000,"people manager", tabNamber);
         tabNamber ++;
         staff[3] = new Emploeer("Белый",30,45000,"task manager", tabNamber);
         tabNamber ++;
         staff[4] = new Emploeer("Счастливый",51,50000,"happy manager",tabNamber);


         for (int i = 0; i < staff.length; i++) {
             emploeer1 = staff[i];
             if (emploeer1.age > 40) {
                 System.out.println("Фамилия " + emploeer1.firstName + " Должность " + emploeer1.function + " з/п " + emploeer1.salary);
             }
         }

         upSallary(staff,emploeer1);

        for (int i = 0; i < staff.length; i++) {
            emploeer1 = staff[i];
            if (emploeer1.age > 45) {
                System.out.println("Фамилия " + emploeer1.firstName + " Должность " + emploeer1.function + " з/п " + emploeer1.salary + " Tab Namber " + emploeer1.tabNamber);
            }
        }
        double averageSalary = 0;
        double averageAge = 0;
        for (int i =0; i<staff.length; i++) {
            emploeer1 = staff[i];
            averageSalary = averageSalary + emploeer1.salary;
            averageAge = averageAge + emploeer1.age;
        }
        averageSalary = averageSalary/staff.length;
        averageAge = averageAge/staff.length;

        System.out.println("Age :" + averageAge + " Salary :" + averageSalary);

    }


}
