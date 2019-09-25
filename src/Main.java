public class Main {
    public static void main(String[] args) {
        System.out.print("Январь:");
        for (int m=1; m<=31; m++){
            System.out.print(" "+m);
            if (m % 7 == 0)
                System.out.println();
        }
    }
}