package inheritanceDemo;

public class Main {

	// "Inheritance", "if" fonksiyonunun çok fazla kullanımının önüne geçmektedir.
	// Aksi takdirde "if" fonksiyonunu fazlaca kullansaydık, kodlama daha karışık bir
	// duruma gelecekti. "Inheritance" class'ların birbirleri ile daha pratik halde
	// ilişkili ve bağlantılı olmasını sağlamaktadır.

	public static void main(String[] args) {

		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());

	}

}
