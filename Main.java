public class Main {   
    public static void main(String[] args) {
        Yonetici yonetici1 = new Yonetici("Mehmet",2900,"yazılım",25);
        yonetici1.Calis();
        yonetici1.bilgileriGoster();
        yonetici1.departmanDegistir("donanım");
        yonetici1.sorumluSayisi();
        yonetici1.zam(195);   
    }  
}
