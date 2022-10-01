package methodOverloading;

public class DortIslem {
	
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
		
	}
	// "public int topla" kısmında topla2 yapmadık fakat program yine çalışır. 
	// Çünkü yukarıdaki "topla" ile aşağıdaki "topla"nın imza parametreleri farklı olur. Bu duruma Overloading denir.
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
		
	}

}
