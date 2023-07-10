package src.equals;

import java.util.List;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Xiao", "Ming", 18),
                new Person("Xiao", "Hong", 25),
                new Person("Bob", "Smith", 20)
        );
        boolean exist = list.contains(new Person("Bob", "Smith", 20));
        System.out.println(exist ? "测试成功!" : "测试失败!");
    }
}

class Person {
    String firstName;
    String lastName;
    int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public boolean equals(Object o){
        // 判断是否自身
        if(this == o){
            return true;
        }

        // 判断各个属性
        if(o instanceof Person p){
            return Objects.equals(p.firstName,this.firstName) && Objects.equals(p.lastName,this.lastName) && this.age == p.age;
        }

        return false;
    }
}