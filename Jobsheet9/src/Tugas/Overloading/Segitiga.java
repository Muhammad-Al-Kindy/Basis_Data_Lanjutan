package Tugas.Overloading;

public class Segitiga {
    private  int sudut,keliling;

    public  int totalSudut(int sudutA){
        return sudut = 180-sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }
    public int keliling(int sisiA, int sisiB,int sisiC){
        return keliling = sisiA+sisiB+sisiC;
    }
    public double keliling(int sisiA,int sisiB){
        double sisiC;
        sisiC = Math.sqrt(Math.pow(sisiA,2)+Math.pow(sisiB,2));
        return keliling = (int) (sisiA+sisiB+sisiC);
    }
}
