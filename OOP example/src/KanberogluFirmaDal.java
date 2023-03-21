public class KanberogluFirmaDal extends OtogarManagerDal{

    private int price2;
    public KanberogluFirmaDal(String name,String gender,int age,String firma,int price2){
        super(name,gender,age,firma);
        this.price2 = price2;
    }

    public int getprice2(){
        return price2;
    }

    public void setprice2(){
        this.price2 = price2;
    }

    public void firma(String saat2){
        System.out.println(this.getname()  +  saat2  + "  da  Kanberoğlu firmasından bilet almıştır.");
    }

    public void fiyat(String fiyat2){
        System.out.println(this.getname() + fiyat2 + "  TL'ye Kanberoğlu firmasından bilet almıştır.");
    }

    public void cinsiyet(String cinsiyet){
        System.out.println(this.getname() + cinsiyet + "  'dır.");
    }


}
