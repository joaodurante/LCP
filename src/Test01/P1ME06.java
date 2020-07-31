package Test01;

public class P1ME06 {
    static int v1, v2;

    public P1ME06(){
        v1 = 1;
        v2 = 2;
    }

    void troca() {
        v1=v2 ;
    }

    public static void main(String[] args) {
        P1ME06 a= new P1ME06();
        P1ME06 b= new P1ME06();
        a.v2=5;
        a.troca();
        System.out.print(a.v1);
        System.out.print(a.v2);
        System.out.print(b.v1);
        System.out.print(b.v2);

    }
}