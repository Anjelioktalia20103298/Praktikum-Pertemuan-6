package pert6latih01;

/**
 *
 * @author Anjeli Oktalia_20103298
 */
public class luassegi3 {
 /*
    Luas segi 3 = Alas * Tinggi * 0.5
    Luas Float/Double
    Tinggi : Float/Double
    Alas : Float/Double
    */   
    private float alas;
    private float tinggi;
    double Luas;
    
    /*
        konstraktor
    */
    public luassegi3 (float AL, float TG){
        this.setAlas(AL);
        this.setTinggi(TG);
    } 
    /*
    Method setAlas
    parameter : float AL
    Untuk set nilai ke property/Atribut alas
    */
    
    public void setAlas(float AL){
        this.alas = AL;
    }
    public void setTinggi(float TG){
        this.tinggi = TG;
    }
    private double HitungLuas(){
        this.Luas = 0.5 * this.alas * this.tinggi;
        return this.Luas;
    }
    public void CetakLuas(){
        this.HitungLuas();
        System.out.println("Hitung Luas Segitiga");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nilai Alas      : "+this.alas+ " cm");
        System.out.println("Nilai Tinggi    : "+this.tinggi+ " cm");
        System.out.println("Nilai Luas      : "+this.Luas+ " cm²");
    }
}
