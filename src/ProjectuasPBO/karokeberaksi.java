
package ProjectuasPBO;

//scanner: gunanya proses membaca dan mem-parsing input 
//import java.util.Scanner;

public class karokeberaksi {
    public static void main(String[] args) {
        karokedetail karoke1 = new karokedetail("Dania", "03-10-2024", "pkt3", 2);

        System.out.println(karoke1.infodetail());
        System.out.println(karoke1.infoKaroke("laki-laki"));
            
        //eror handling: gunanya jika terdapat kesalahan dalam program, maka akan menampilkan informasi tentang kesalahan eror
        //try {
                //io sederhana 
               // Scanner scanner = new Scanner(System.in);
                //array: gunanya untuk menginputkan lebih jumlah data yang akan di tampilkan
                //karokedetail[] karoke = new karokedetail[2];

                //perulangan
                //for(int i=0; i<karoke.length; i++) {
                   // System.out.print("Nama Penyewa Karoke "+(i+1)+": ");
                   // String nama = scanner.nextLine();
                   // System.out.print("Tanggal Sewa Tempat "+(i+1)+": ");
                   // String tgl = scanner.nextLine();
                   // System.out.print("Paket Sewa Karoke "+(i+1)+": ");
                   // String sewa = scanner.nextLine();
                   // System.out.print("Waktu Sewa Karoke "+(i+1)+": ");
                   // int perjam = scanner.nextInt();
                   // scanner.nextLine();
                   // System.out.println("<<==============================>>");
                    
                     //obeject dari perulangan 
                   // karoke[i] = new karokedetail(nama, tgl, sewa, perjam);
                //}
                
                //perulangan 
               // for(karokedetail data: karoke) { 
                    //System.out.println("\n<<==========================>>");
                    //System.out.println("Data Penyewaan Karoke Bintang:");
                    //System.out.println(data.infodetail());
                //}
           
            //} catch (StringIndexOutOfBoundsException e){
              //System.out.println("Kesalahan Paket: "+e.getMessage());
            //} catch (Exception e){
              //System.out.println("Kesalahan Umum: "+e.getMessage());
            //}    
            
        
    }
}
