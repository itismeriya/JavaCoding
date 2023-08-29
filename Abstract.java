package inheritance;
abstract class HillStations{
	abstract void location();
	abstract void famousFor();
}
class Manali extends HillStations{
	@Override
	void location() {
		System.out.println( "Himachal Pradesh");
	}
	void famousFor() {
		System.out.println( "Adventure Sports");
	}
}
class Mussorie extends HillStations{
	@Override
	void location() {
		System.out.println( "Uttarakhand");
	}
	void famousFor() {
		System.out.println( "Scenic Beauty");
	}
}
class Gulmarg extends HillStations{
	@Override
	void location() {
		System.out.println( "Kashmir");
	}
	void famousFor() {
		System.out.println( "snow capped mountains");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HillStations m;
		m= new Manali();
		//m.location();
		//m.famousFor();
		m= new Mussorie();
		//m.location();
		//m.famousFor();
		m=new Gulmarg();
		m.location();
		m.famousFor();
	}

}
