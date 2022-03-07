package main;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
//        System.out.println("Good morning, ");
        System.out.println("Good morning, " + this.name);
    }


    public static void main(String[] args) {
        Person scott = new Person("Scott");
        scott.sayHello();


        scott.setName("Andrew");
        scott.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        // .equals is comparing the primitive strings "John" which are equal
//        System.out.println(person1.getName().equals(person2.getName()));
//        // == is comparing the two objects which are not equal (like two separate people named John)
//        System.out.println(person1 == person2);

//        // this is true because line 43 creates an object
//        Person person1 = new Person("John");
//        // line 45 creates a new object person2 from the person1 object
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        // person2 is created from person1
        Person person1 = new Person("John");
        Person person2 = person1;
        // therefore, their names are both John
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        // however, setting the name of the second object will transmute the first object it was created from
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());


    }
}
