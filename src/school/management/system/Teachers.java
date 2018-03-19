package school.management.system;

/**
 * Created by Hung Huynh on 3/18/2018
 * This class is responsible for keeping track of teachers
 * id, name, and salary.
 */
public class Teachers {

    private int id;
    private String name;
    private int salary;

    /**
     * Creates a new Teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teachers(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return the id of the teacher.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the teacher.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the salary of the teacher.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * set the updated salary
     * @param salary salary of teacher
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

}




