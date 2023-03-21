public class KamilKocFirmaDal extends OtogarManagerDal{
    private int price3;
    public KamilKocFirmaDal(String name, String gender, int age,String firma,int price3) {
        super(name, gender, age,firma);
        this.price3 = price3;
    }

    public int getprice3(){
        return price3;
    }

    public void setPrice3(){
        this.price3 = price3;
    }

    public void firma3(String saat3){
        System.out.println(this.getname() + saat3 + " de KamilKoç firmasından bilet almıştır.");
    }

    public void fiyat(String fiyat3){
        System.out.println(this.getname() + fiyat3 + "  TL'ye KamilKoç firmasından bilet almıştır.");
    }
}
