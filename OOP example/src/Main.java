//www.patika.dev
public class Main {
    public static void main(String[] args) {

        OtogarManagerDal a1 = new OtogarManagerDal("Liavnur Nagihan Duman","kadın",18,"Kanberoğlu");
        a1.firma();

        System.out.println("Liva Hanım hangi firmadan ve  saat kaçta bilet aldınız?");
        UlusoyFirmaDal b1 = new UlusoyFirmaDal("Livanur Nagihan Duman","kadın",18,"Kanberoğlu",500);
        b1.firma("15:30");

        System.out.println("Zeynep hanım hangi firmadan ve saat kaçta bilet aldınız?");
        KamilKocFirmaDal c1 = new KamilKocFirmaDal("Zeynep Duman","kadın",45,"KamilKoç",430);
        c1.firma3("09:30");

        System.out.println("Orhan Bey hangi firmadan ve saat kaçta bilet aldı?");
        UlusoyFirmaDal d1 = new UlusoyFirmaDal("Orhan Duman","Erkek",50,"Ali Osman ULusoy",600);
        d1.firma("19:00");

        System.out.println("Kediniz Duman Beye  hangi firmadan ve ne kadara  bilet aldınız?");
        KanberogluFirmaDal e1 = new KanberogluFirmaDal("Duman","erkek kedi",1,"Kanberoğlu",250);
        e1.fiyat("250");

        System.out.println("Muhammet Esat Bey hangi firmadan ve ne kadara bilet aldınız?");
        LüxArtvinFirmaDal f1 = new LüxArtvinFirmaDal("Muhammet Esat Duman","Erkek",14,"Lüx Artvin");
        f1.fiyat("400");


    }
}
