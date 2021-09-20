public class Person {
    String FirstLastName;
    String position;
    String email;
    String telephone;
    int salary;
    int age;



    Person(String FirstLastName, String position, String email, String telephone, int salary, int age) {
        this.FirstLastName = FirstLastName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    void info() {
        System.out.println("ФИО сотрудника: " + FirstLastName);
        System.out.println("Должность: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + telephone);
        System.out.println("Заработная плата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("----------------------------------------------------------------");
    }

}
