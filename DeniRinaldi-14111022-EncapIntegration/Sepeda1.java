public class Sepeda1 {
    private int gigi;
    private String merk;
    
    //konstruktor
    public Sepeda1(){
        this.gigi=0;
        this.merk="Merk Sepeda";
    }
    public Sepeda1(int g, String m){
        this.gigi = g;
        this.merk = m;
    }    
    public void setGigi(int g){
        this.gigi=g;
    }
    public void setMerk(String m){
        this.merk = m;        
    }
    public int getGigi(){
        return this.gigi;
    }
    public String getMerk(){
        return this.merk;
    }    
}