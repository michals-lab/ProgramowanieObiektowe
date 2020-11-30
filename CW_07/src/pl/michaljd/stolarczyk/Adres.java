package pl.michaljd.stolarczyk;

public class Adres {

    private String ulica;
    private String numer_domu;
    private String numer_mieszkania="";
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, String numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, String numer_domu, String numer_mieszkania, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(){
        System.out.println(this.kod_pocztowy+" "+this.miasto);
        System.out.println(this.ulica+" "+this.numer_domu);
        if(!this.numer_mieszkania.equals("")){
            System.out.println("/"+this.numer_mieszkania);
        }
    }

    public boolean przed(Adres kod_p){
        int[] tab={0,1,3,4,5};
        StringBuilder tmp = new StringBuilder();
        StringBuilder kod = new StringBuilder();
        for(int i:tab){
            tmp.append(kod_p.kod_pocztowy.charAt(i));
            kod.append(this.kod_pocztowy.charAt(i));
        }
        int x=Integer.parseInt((tmp.toString()));
        int y=Integer.parseInt((kod.toString()));
        return x<y;
    }
}
