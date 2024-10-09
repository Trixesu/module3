package AlproModule3;

public class Soal6Kerucut {
    public static void main(String[] args) {
        
        double phi, jariJari, tinggi, volume, luasSelimut;
        
        jariJari = 7;
        tinggi = 12;
        phi = 3.14;
        
        volume = (1.0 / 3.0) * phi * (jariJari * jariJari) * tinggi;
        luasSelimut = (phi * (jariJari * jariJari)) + (phi * (jariJari * jariJari) * tinggi);
        
        System.out.println("Jari-Jari Kerucut : "+jariJari);
        System.out.println("Tinggi Kerucut : "+tinggi);
        System.out.println("Volume Kerucut : "+volume);
        System.out.println("Luas Kerucut   : "+luasSelimut);
    }
}