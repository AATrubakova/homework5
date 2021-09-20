public class Main {
    public static void main(String[] args) {

        int count = 0;

        Person[] persArray = new Person[6];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Ivanova Anna", "Bookkeeper", "ivanna@gmail.com", "89200004455", 60000, 45);
        persArray[2] = new Person("Petrov Ilya", "Programmer", "petilya@gmail.com", "89600024292", 100000, 42);
        persArray[3] = new Person("Sidorova Olga", "QAEngineer", "sidorovaolga@gmail.com", "89059673421", 70000, 40);
        persArray[4] = new Person("Nazina Olga", "Tester", "olganazina@gmail.com", "89002500205", 45000, 47);
        persArray[5] = new Person("Melnikov Petr", "Backend Programmer", "melpetr@gmail.com", "89270076644", 80000, 27);

        // Весь список сотрудников
        System.out.println("Весь список сотрудников:");
        for (Person elem: persArray) {
            elem.info();
        }
        System.out.println("\nЗадание 5. Вывести количество сотрудников старше 40 лет");

        for (Person elem: persArray) {
            if(elem.age > 40) {
                count++;
                System.out.println(elem.FirstLastName + ": " + elem.age + " лет");
            }
        }
        System.out.println("Количество сотрудников старше 40 лет: " + count);

    }
}
