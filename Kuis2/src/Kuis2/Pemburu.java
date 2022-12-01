package Kuis2;

public class Pemburu {
    public void berburu(Dinosaurus dino){
        if (dino instanceof TyrannosaurusRex){
        System.out.println("Pemburu berburu TyrannosaurusRex yang memiliki ciri ciri ");
        ((TyrannosaurusRex)dino).berjalan();
        ((TyrannosaurusRex)dino).makan();
        }else if (dino instanceof Oviraptor){
            System.out.println("Pemburu berburu Oviraptor yang memiliki ciri ciri ");
            ((Oviraptor)dino).berjalan();
            ((Oviraptor)dino).makan();
        }else if (dino instanceof Triceratops){
            System.out.println("Pemburu berburu Triceratops yang memiliki ciri ciri ");
            ((Triceratops)dino).berjalan();
            ((Triceratops)dino).makan();
        }
    }
}
