import java.util.*;

public class kurang
 {
 public static void main(String[] args)
 {
 Scanner input = new Scanner(System.in);

int bil1, bil2, hasil;

System.out.println("Program Pengurangan Java\n\n");
System.out.print("Masukkan Angka 1: ");
bil1 = input.nextInt();
System.out.print("Masukkan Angka 2: ");
bil2 = input.nextInt();

System.out.println("\n");
hasil = bil1 - bil2;
System.out.println("Hasil pengurangan "+bil1 " dan "+bil2 " = "+hasil);
 }
 }
