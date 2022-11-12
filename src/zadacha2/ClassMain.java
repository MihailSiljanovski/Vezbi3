package zadacha2;

public class ClassMain {
	public static void main(String[] args) {
		Fakultet f1 = new Fakultet();
		f1.nazivNaFakultet = "FIKT";
		f1.brojNaSmerovi = 3;
		f1.brojNaStudenti = 200;
		f1.dekan = "Leo Leontin";
		f1.sediste = "Bitola";
		f1.prvMetod();
		System.out.println("Namalen broj na studenti:" + f1.vtorMetod(10));
		f1.tretMetod();
		
		Fakultet f2 = new Fakultet();
		f2.nazivNaFakultet = "TFB";
		f2.brojNaSmerovi = 6;
		f2.brojNaStudenti = 300;
		f2.dekan = "Jana Janeska";
		f2.sediste = "Bitola";
		f2.prvMetod();
		System.out.println("Namalen broj na studenti:" + f1.vtorMetod(45));
		f2.tretMetod();
	}
}
