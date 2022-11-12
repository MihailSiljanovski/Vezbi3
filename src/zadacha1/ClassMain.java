package zadacha1;

public class ClassMain {
	public static void main(String[] args) {
		Avtomobil av = new Avtomobil("Toyota", "Corola", "Bela", 1000, 2006, "BT-0001-AE");
		av.prvMetod();
		System.out.println(av.vtorMetod());
	}
}
