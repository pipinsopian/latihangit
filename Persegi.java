public class Persegi {

double panjang;
 double lebar;
 double luas;

void hitung() {
 luas = panjang * lebar;
System.out.println(“Luas Persegi = ” + luas + “cm3″);
 }
 }

class luas_persegi {

public static void main(String args[]) {
 Persegi a = new Persegi();
 Persegi b = new Persegi();

a.panjang = 20;
 a.lebar = 10;
System.out.println(“Persegi A :”);
System.out.println(“Panjang = ” + a.panjang + “cm”);
System.out.println(“Lebar = ” + a.lebar + “cm”);
a.hitung();

b.panjang = 30;
 b.lebar = 20;
System.out.println(“Persegi B :”);
System.out.println(“Panjang = ” + b.panjang + “cm”);
System.out.println(“Lebar = ” + b.lebar + “cm”);
b.hitung();
 }
 }
