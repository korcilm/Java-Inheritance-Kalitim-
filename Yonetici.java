public class Yonetici extends Calisan {
    private int sorumluKisiSayisi;
        
    public Yonetici(String isim, int maas, String departman, int sorumluKisiSayisi){
        super(isim, maas, departman);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }
    public void sorumluSayisi(){
        this.sorumluKisiSayisi = sorumluKisiSayisi;
        System.out.println(sorumluKisiSayisi+" kişiden sorumlu yönetici.");

    }
}
