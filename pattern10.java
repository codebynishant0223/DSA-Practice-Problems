public class pattern10 {
    public static void main(String[] args) {
        for(int i =0; i<5; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
