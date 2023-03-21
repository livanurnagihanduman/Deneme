public class UlusoyFirmaDal extends OtogarManagerDal{

    private int price;
    public UlusoyFirmaDal(String name, String gender, int age,String firma,int price) {
        super(name, gender, age,firma);
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }



    public void firma(String saat){
        System.out.println(this.getname() + saat +   " da  Ali Osman Ulusoy firmasından bilet almıştır.");
    }
    public void fiyat(String fiyat){
        System.out.println(this.getname()  +  fiyat + "  TL'ye Ali Osman Ulusoy firmasından bilet almıştır. " );
    }
}
