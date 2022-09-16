public class segitigaPerjumlahan {
    public static void main(String[] args) {
        int b=0;
        int nim[] = {2,1,4,1,7,6,2,0,5,7};
        for (int i=0;i<10;i++){
            int a=0;
            a += nim[i];
            b +=a;
        }
        System.out.println("Jumlah dari nim : "+b);
    }
}
