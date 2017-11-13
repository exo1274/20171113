public class 總和平均2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Integer i;
        Integer sum = 0;
        i = 1;
        while (i <= 10) {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}