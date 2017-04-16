/**
 * Created by Erik on 3/31/2017.
 */
public final class SingletonPerson {
    //normal instantiation
    private static SingletonPerson instance = new SingletonPerson();
    public static SingletonPerson getInstance() {return instance;}
    private int age;
    private String name;

    private SingletonPerson(){}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "you're " + this.name + " and you're " + this.age;
    }
}
