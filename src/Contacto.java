public class Contacto {
    private String nomb;
    private int telf;

    public Contacto(String nomb,int telf){
        this.nomb=nomb;
        this.telf=telf;

    }
    public Contacto(String nomb){
        this.nomb=nomb;
        this.telf=0;
    }
    public String getNomb(){
        return nomb;
    }
    public int getTelf(){
        return  telf;
    }
    public void setNomb(String nomb){
        this.nomb=nomb;
    }
    public void setTelf(int telf){
        this.telf=telf;
    }
    public boolean equal(Contacto c){
        if(this.nomb.trim().equalsIgnoreCase(c.getNomb().trim())){
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return ""+nomb+" "+telf;
    }
}