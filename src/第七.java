public class 第七 {
    public static void main(String[] args) {
    java.util.Scanner sc =new java.util.Scanner(System .in);
        Integer i;
        Integer sum=0;
        int num;
        double avg;

        i=1;
        System .out .println("請輸入第"+i+"個數字") ;
        num= sc.nextInt() ;

        while (num !=99999) {
            sum=sum+num;
            i++;
            System .out .println("請輸入第"+i+"個數字") ;
            num= sc.nextInt() ;
        }

        avg=sum/i;
        System.out.println(sum );
        System.out.println(avg);
    }
}
