/*Create a base class Fruit with name, taste and size as its attributes.
Create a method called eat() which describes the name of the fruit and its taste.
Inherit the same in 2 other classes Apple and Orange and override the eat () method to represent each fruit taste. */

class Fruit{
    String name;
    String taste;
    int size;

    Fruit(){
        name ="";
        taste="";
        size=0;
    }

    void eat(){
        System.out.println(name + ":" + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        name = "Apple";
        size = 1;
    }
    void eat() {
        System.out.println(name + " : " + "Sweetie");
    }
}

class Orange extends Fruit {
    Orange() {
        name = "Orange";
        size = 2;
    }
    void eat() {
        System.out.println(name + " : " + "Sweet & Sour");
    }
}   

class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.eat();
        Orange orange = new Orange();
        orange.eat();
    }
}
