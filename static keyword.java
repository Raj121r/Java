public class Statickeyword{
public static class Vikram {
    int marks;
    String name;
    double percent;
    static int shyam;      // static type variable

    Vikram(){          // it's being called as we are creating number of objects
        shyam++;      // increasing static variable that is shared among all the variables
    }

}
public static void main(String[] args) {
    Vikram v1 = new Vikram();
    v1.marks=12;
    v1.name="raghav";
    v1.percent=46.6;
    Vikram v2 = new Vikram();
    v2.marks=15;
    v2.name="arnav";
    v2.percent=76.7;
    System.out.print(v1.name + " ");
    System.out.print(v1.marks + " ");
    System.out.println(v1.percent);

    System.out.print(v2.name + " ");
    System.out.print(v2.marks +" ");
    System.out.println(v2.percent);

    System.out.println(v1.shyam);
    System.out.println(v2.shyam);

    }
    }
