public class segitigaNim {
    public static void main(String[] args) {
        int nim[] = {2,1,4,1,7,6,2,0,5,7};
        int i=0;
        do {
            int j= nim.length;
            do {
                if (j<=9){
                System.out.print(" ");
                }
                j--;
            }while (j>i);
            int k =0;
            do {
                System.out.print(nim[i]);
                k++;
            }while (k<=i);
            int l=0;
            do {
                if (l>0) {
                    System.out.print(nim[i]);
                }
                l++;
            }while (l<=i);
            System.out.println();
            i++;
        }while (i< nim.length);
    }
}
