package classes;

public class Main {

	public static void main(String[] args) {

		// İlk customerManageri biz diğer classtan çağırdık.İkinci olan customerManager
		// ise burda class ı temsil olarak verdiğimiz isimdir.
		// reference type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		// int [] sayilar1 = {1,2,3}; -----> Aşağıdaki kodu bu şekilde yazarsak yine
		// çalışır.
		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		// Diziler referans tiptir. Bu yüzden sayilar2 = sayilar1 olarak yazdığımız için
		// direk olarak sayılar2 sayılar1'in referans sayılarını baz alır. Kendi sayıları işlevsiz kalır.

	}

}