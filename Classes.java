// class - while creating method in a seprate class if the method should access only by the class then no need of using any static keyword.
// if static is used then no need to create object in main follow the below examples


// Example 1: using static

class Addition{
    static int add(int x, int y) {
        return x + y;
    }
}

// Example 2: using constructor - only non static methods can access the class variables

class Add{
    String x, y;

    Add(String name1, String name2) {
        this.x = name1;
        this.y = name2;
    }

    String add() {
        return x + " " + y;
    }
}

class Concate {
    String name1, name2;

    Concate(String x, String y) {
        name1 = x;
        name2 = y;
    }

    void printName(String names1, String names2) {
        System.out.println("My name is: " + names1 + " " + names2);
    }

    public void print() {
        System.out.println("name1: " + name1 + ", " + "name2: " + name2);
    }

    
}



public class Classes {
    public static void main(String[] args) {
        System.out.println(Addition.add(5, 5));

        Add myAdd = new Add("seshu", "yaswanth");
        System.out.println(myAdd.add());

        Concate myConcat = new Concate("Seshu", "Yaswanth");
        myConcat.print();

        myConcat.printName("Seshu", "yaswanth");
    }
}
