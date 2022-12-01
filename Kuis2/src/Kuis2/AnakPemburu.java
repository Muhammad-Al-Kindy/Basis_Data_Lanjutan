package Kuis2;

public class AnakPemburu extends Pemburu implements IMengambilTelur{
    @Override
    public void mengambilTelur(Dinosaurus dino) {
        if (dino instanceof TyrannosaurusRex){
            System.out.println("Anak Pemburu mengambil telur TyrannosaurusRex");
        }else if (dino instanceof Oviraptor){
            System.out.println("Anak Pemburu mengambil telur Oviraptor");
        }else if (dino instanceof Triceratops){
            System.out.println("Anak Pemburu mengambil telur Triceratops");
        }
    }
    public void berburu(Dinosaurus dino){
        if (dino instanceof TyrannosaurusRex){
            System.out.println("Anak Pemburu berburu TyrannosaurusRex yang memiliki ciri ciri ");
            ((TyrannosaurusRex)dino).berjalan();
            ((TyrannosaurusRex)dino).makan();
        }else if (dino instanceof Oviraptor){
            System.out.println("Anak Pemburu berburu Oviraptor yang memiliki ciri ciri ");
            ((Oviraptor)dino).berjalan();
            ((Oviraptor)dino).makan();
        }else if (dino instanceof Triceratops){
            System.out.println("Anak Pemburu berburu Triceratops yang memiliki ciri ciri ");
            ((Triceratops)dino).berjalan();
            ((Triceratops)dino).makan();
        }
    }
}
