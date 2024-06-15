/*Write a program to create a class named shape. It should contain 2 methods, 
draw() and erase() that prints "Drawing Shape" and "Erasing Shape" respectively.

For this class, create three sub classes, Circle, Triangle and Square and each class 
should override the parent class functions - draw () and erase ().*/

class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }

    void erase(){
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }

    void erase(){
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }

    void erase(){
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }

    void erase(){
        System.out.println("Erasing Square");
    }
}

class Solution {
    public static void main(String[] args) {
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Square();

        c.draw(); c.erase();
        t.draw(); t.erase();
        s.draw(); s.erase();
    } 
}
