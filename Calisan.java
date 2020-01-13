public class Calisan {
    private String isim ;
    private int maas;
    private String departman;
    
    public Calisan(String isim, int maas, String departman){
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }
    public void Calis(){
        System.out.println("Çalışanlar çalışıyor.....");
    }
    public void bilgileriGoster(){
        System.out.println("İsim : "+isim);
        System.out.println("Maaş : "+maas);
        System.out.println("Departman : "+departman);
    }
    public void departmanDegistir(String yeniDepartman){
        System.out.println("Departman değiştiriliyor...");
        this.departman = yeniDepartman;
        System.out.println("Güncel departman : "+departman);
    }
    public void zam(int miktar){
        maas += miktar;
        System.out.println("Çalışanlara "+ miktar +"tl zam yapıldı. Güncel maaş : "+ maas);
    }
}
