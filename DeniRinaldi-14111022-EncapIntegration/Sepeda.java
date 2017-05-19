public abstract class Sepeda {
    protected String model  = "Sepeda Balap";
    protected String merk = "Wim Cycle";

    protected String getModel(){
        return model;
    }
    protected String getMerk(){
        return merk;
    }    
    protected abstract void printModel();
	
    protected abstract void printMerk();
}