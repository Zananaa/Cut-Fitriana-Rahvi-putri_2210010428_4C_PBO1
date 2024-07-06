
package ProjectuasPBO;

public class karoke {
    //encapsulasi + atribut: guna uttuk menjaga proses program tidak bisa di akses dengan semabarang oelh proses program class lain
    protected String nama;
    protected String tgl;
    protected String sewa;

    //contructor: guna sebagai mehyiapkan nilai untuk class
    public karoke(String nama, String tgl,String sewa) {
        this.nama = nama;
        this.tgl = tgl;
        this.sewa = sewa;
    }
    
    //mutator: guna untuk mengubah atau mengatur nilai 
    public void setNama (String nama) {
        this.nama = nama;
    }

   
    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public void setSewa(String sewa) {
        this.sewa = sewa;
    }
    
    //acsessor: guna untuk mengambil nilai
    public String getNama() {
        return nama; //pengambilan nilai nama
    }

     public String getTgl() {
        return tgl; //pengambilan nilai nama
    }

    public String getSewa() {
        return sewa; //pengambian nilai sewa
    }

    //penambahan method lain: guna untuk mengambil nilai
    public String infoKaroke() {
        return "\nNama Penyewa: "+getNama()+
                "\nTanggal Sewa: "+getTgl()+
                "\nSewa Paket  : "+getSewa();
        
        
    }
    //polymorphs: guna untuk membuat objek yang berbeda
    //overload:  kemampuan membuat method yang sama namun parameternya berbeda
    public String infoKaroke(String jenkel) {
      return infoKaroke()+ "\nJenis Kelamin: " + jenkel;
    }
}
