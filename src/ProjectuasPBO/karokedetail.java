
package ProjectuasPBO;

//perulangan: guna untuk mewarisi method dari kelas parent
public class karokedetail extends karoke{
    //encapsulasi + variabel + atribut
    protected int perjam;

    //overloading
    public karokedetail(String nama, String tgl, String sewa, int perjam) {
        super(nama, tgl, sewa);
        this.perjam = perjam;
    }
    
     public void setPerjam(int perjam) {
        this.perjam = perjam;
    }
    
    public int getPerjam() {
        return perjam;
    }
    
    //seleksi if-else, switch-case
    public String getpaket(){
        String namapkt = getSewa().substring(0, 4);
        //seleksi switch-case
          switch(namapkt){
            case "pkt1":
                return "Paket Mandiri";
            case "pkt2":
                return "Paket Couple";
            case "pkt3":
                return "Paket Teman";
            case "pkt4":
                return "Paket Family";
            default:
                return "Paket Tidak Tersedia";
        }    
    }
    
    public String getketharga() {
        String desharga = getpaket();
        switch(desharga) {
            case "Paket Mandiri":
                return "60000";
            case "Paket Couple":
                return "80000";
            case "Paket Teman":
                return "120000";
            case "Paket Family":
                return "160000";
            default:
                return "Deskripsi Harga Tidak Tida Tersedia";
             
        }
            
    }
    
    public int gettotal () {  //nilai yg di ambil di awal yaitu getpaket variabel string dan jika berisi perhitungan maka, vairabel string harus do convert menjadi int
        String paket = getpaket();
        int jam = getPerjam();
        if (paket.equals("Paket Mandiri")) {
            return 60000 * jam;
        } else if (paket.equals("Paket Couple")) {
            return 80000 * jam;
        } else if (paket.equals("Paket Teman")) {
            return 120000 * jam;
        } else if (paket.equals("Paket Family")) {
                return 160000 * jam;
        } else {
            return 0;
        }
    }    
   
    //polymorp --> overriding: Kemampuan subclass untuk menimpa method dari superclass
   public String infodetail() {         //method infokaroke nanti akan memanggil dari class utama, tetapi akan menampilkan "infodetail" dan "infokaroke" jadi satu
       return super.infoKaroke()+
               "\nDeskripsi Paket : "+getpaket()+
               "\nDeskripsi Harga : "+getketharga()+
               "\nTotal Harga Sewa: "+gettotal();
       
    }  
}
