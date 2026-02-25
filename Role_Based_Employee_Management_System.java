class Employee {
    String name;
    int id;
    String role;

    Employee(String name, int id, String role){
        this.name = name;
        this.id = id;
        this.role = role;
    }

    void work(){
        System.out.println(name + " is working as " + role);
    }
}

class CourseEmployee extends Employee {
    CourseEmployee(String name, int id){
        super(name, id, "Course Employee");
    }

    void work(){
        System.out.println(name + " is managing courses.");
    }
}

class AccountEmployee extends Employee {
    AccountEmployee(String name, int id){
        super(name, id, "Account Employee");
    }

    void work(){
        System.out.println(name + " is managing accounts.");
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new CourseEmployee("Ravi", 101);
        Employee e2 = new AccountEmployee("Meena", 102);

        e1.work();
        e2.work();
    }
}
