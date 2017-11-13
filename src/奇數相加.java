public class 奇數相加 {
    public static void main(String[] args) {
    java.util.Scanner sc =new java.util.Scanner(System .in);
    Integer i;
    Integer sum=0;
    for(  i = 1; i <= 10; i=i+2) {
            System.out.println(i);
            sum=sum+i;
    }
    System.out.println(sum);
}
}

