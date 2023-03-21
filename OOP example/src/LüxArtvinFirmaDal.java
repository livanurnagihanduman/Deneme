public class LüxArtvinFirmaDal extends OtogarManagerDal{

    private int price4;
    public LüxArtvinFirmaDal(String name, String gender, int age, String firma) {
        super(name, gender, age, firma);
        this.price4 = price4;
    }

    public int getprice4(){
        return price4;
    }

    public void setPrice4(){
        this.price4 = price4;
    }

    public void fiyat(String fiyat4){
        System.out.println(this.getname() + fiyat4 + " TL'ye LüxArtvin firmasından bilet almıştır.");
    }
}
