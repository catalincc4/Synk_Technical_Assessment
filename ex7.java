public class Main {
    static void printStaircase(int n){
        for(int i = 0; i < n; i++){
            //print spaces
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            // print #
            for(int k=0; k <= i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        printStaircase(10);
    }
}
