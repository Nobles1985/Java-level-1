package java1.lesson5;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private String jobTitle;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employee(String surname, String name, String patronymic, String jobTitle, String email, int pNumber, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = pNumber;
        this.salary = salary;
        this.age = age;
    }
    public static void main(String[] args) {
        Employee[] arrayEmployee = new Employee[5];
        arrayEmployee[0] = new Employee("Смирнов", "Антон", "Игоревич", "инженер", "smirnov@mail.ru", 8965214, 70000, 32);
        arrayEmployee[1] = new Employee("Федоров", "Петр", "Андреевич", "технолог", "fedorov@mail.ru", 1264795, 80000, 40);
        arrayEmployee[2] = new Employee("Антонова", "Анна", "Петровна", "стажер", "antonova@mail.ru", 4568124, 48000, 24);
        arrayEmployee[3] = new Employee("Фролов", "Максим", "Борисович", "начальник участка", "frolov@mail.ru", 7845502, 120000, 51);
        arrayEmployee[4] = new Employee("Ночной", "Кирилл", "Евгеньевич", "охранник", "nochnoy@mail.ru", 6984520, 60000, 46);
        findEmploy(arrayEmployee);
    }
    public static void findEmploy(Employee[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i].age > 40){
                a[i].info();
                System.out.println("____________________________________________________");
            }
        }
    }
    public void info(){
        System.out.println("Фамилия: " + surname + "\nИмя: " + name + "\nОтчество: " + patronymic + "\nДолжность: " + jobTitle + "\nemail: " + email + " номер телефона: " + phoneNumber + "\nЗарплата: " + salary + "\nВозраст: " + age);
    }
}
