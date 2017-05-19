public class panggil{
	public static void main(String []args){
	TurunanSepeda a = new TurunanSepeda();
	System.out.println("INI UNTUK ABSTARCTION");
	System.out.println("=======================");
	a.printModel();
	a.printMerk();
	
	Sepeda1 pgl = new Sepeda1();
    pgl.setGigi(1);
    pgl.setMerk("BMX");     
	System.out.println();
	System.out.println("INI UNTUK ENCAPSULATION");
	System.out.println("=======================");
    System.out.println("Gigi Sepeda  = "+pgl.getGigi());
    System.out.println("Merk Sepeda  = "+pgl.getMerk());
	}
}