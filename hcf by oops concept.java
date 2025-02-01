package fractionbyoops.java;
public class Main {
    public static class Fraction{  // class
        int nume;
        int deno;
        public Fraction(int n,int d){  // constructor
            nume=n;
            deno=d;
        }
        public static int hcf(int n,int d){
            int min= Math.min(n,d);
            if(min==0) {
                System.out.println("invalid numerator or denominator");
            }
           for(int i=min;i>=1;i--){
               if(n%i==0 && d%i==0){
                   return i;
               }
           }   // for loop closed
            return 1;
        }      // hcf method closed
        public  void simplify(Fraction f1) {
            int hcf = Fraction.hcf(f1.nume,f1.deno);
            System.out.println("HCF: "+hcf);
            f1. nume=f1.nume/hcf;
            f1.deno=f1.deno/hcf;
            System.out.println("simplified fraction: "+f1.nume+"/"+f1.deno);
        }     // simplify method closed
    }        // Fraction class closed
    public static void main(String[] args) {
        Fraction f1=new Fraction(35,7);
        Fraction f2=new Fraction(28,6);
        System.out.println("first fraction: "+f1.nume+"/"+f1.deno);
        System.out.println("second fraction: "+f2.nume+"/"+f2.deno);
        f1.simplify(f1);


    }
}
