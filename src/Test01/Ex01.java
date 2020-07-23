package Test01;

public class Ex01 {
    static String a,b;
    public static void main(String[] args) {
        Ex01 obj = new Ex01();
        int[] array = {1, 2, 3, 4, 5};
        a = "2";
        b = "5";

        obj.troca1(a,b);
        obj.troca2(array);
        System.out.print(a+"  "+b+" ");

        for(int x = 0; x<array.length; x++){
            System.out.print(array[x] + " ");
        }
    }

    void troca1 (String a, String b){
        String tmp = a;
        a = b;
        b = tmp;
    }

    void troca2(int array[]){
        for(int x = 0; x<array.length; x++){
            array[x] = array[x] * Integer.valueOf(a);
        }
    }
}
