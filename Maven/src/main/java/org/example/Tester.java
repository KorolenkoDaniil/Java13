package org.example;

public class Tester {

    private String name;
    private String surname;
    private int years;
    private int level;
    private double salary;

    public Tester (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Tester (String name, String surname, int years){
        this(name, surname);
        this.years = years;
    }
    public Tester (String name, String surname, int years, int level, double salary){
        this(name, surname,years);
        this.level = level;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return name + " " + surname + " " + years + " " + salary + " " + level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tester) {
            Tester tester = (Tester) obj;
            if (equals(this.name == tester.name)) return true;
            else return  false;
        }
        else return false;
    }

    @Override
    public int hashCode() {
        return (int)salary % 3 * 8 / 10;
    }

    public static void print (String name){
        System.out.println("Hello " + name);
    }

}
