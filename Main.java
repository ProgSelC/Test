package selcpkg;

public class Main {
	public static void main(String[] args) {
		Cat aBarsic = new Cat("Barsic", 1, 2, "male");
		Cat aMurka = new Cat("Murka", 2, 3, "female");
		aBarsic.voice();
		aBarsic.compareCats(aMurka);
		Cat alittleCat = aBarsic.newCat(aMurka);
		if(alittleCat!=null){
			alittleCat.voice();
		}
	}
}
