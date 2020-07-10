package Aula05;

public class Ex02 extends Ex01 {
    public Ex02(Integer n) {
        super(n);
    }

    public Integer arraySum(Integer[] array) {
        Integer sum = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] != null)
                sum += array[i];
            else
                break;
        }
        return sum;
    }

    public Integer[][] oddEven(Integer[] array) {
        Integer[] odd = new Integer[array.length];
        Integer[] even = new Integer[array.length];
        Integer[][] matr = new Integer[array.length][2];

        for(int i=0; i<array.length; i++) {
            if(array[i] != null) {
                if(array[i]%2 != 0){
                    for(int j=0; j < odd.length; j++) {
                        if(odd[j] == null){
                            odd[j] = array[i];
                            break;
                        }
                    }
                }else {
                    for(int j=0; j < even.length; j++) {
                        if(even[j] == null){
                            even[j] = array[i];
                            break;
                        }
                    }
                }
            }else{
                break;
            }
        }
        matr[0] = odd;
        matr[1] = even;
        return matr;
    }

    public Integer[] replaceMultipleBy3(Integer[] array) {
        Integer[] newArray = new Integer[array.length];

        for(int i=0; i<array.length; i++){
            if(array[i] != null){
                if(array[i] % 3 == 0)
                    newArray[i] = 0;
                else
                    newArray[i] = array[i];

                System.out.print(newArray[i] + " ");
            }else{
                break;
            }
        }
        return newArray;
    }

    private Integer computeFactorial(Integer num) {
        if(num <= 1)
            return 1;
        return num * this.computeFactorial(num-1);
    }

    public Integer[] computeFactorialArray(Integer[] array) {
        Integer[] newArray = new Integer[array.length];

        for(int i=0; i<array.length; i++) {
            if(array[i] != null){
                newArray[i] = this.computeFactorial(array[i]);
                System.out.print(newArray[i] + " ");
            }

            else
                break;
        }
        return newArray;
    }

    public static void main(String[] args) {
        Ex02 ex = new Ex02(100);
        System.out.println("SOMA: " + ex.arraySum(new Integer[]{1, 2, 3, 4}));

        Integer[][] res = ex.oddEven(new Integer[]{1, 2, 3, 4, 5, 6});
        System.out.print("IMPAR: ");
        for(int i=0; i<res[0].length; i++) {
            if(res[0][i] != null)
                System.out.print(res[0][i] + " ");
            else break;
        }
        System.out.print("\nPAR: ");
        for(int i=0; i<res[1].length; i++) {
            if(res[1][i] != null)
                System.out.print(res[1][i] + " ");
            else break;
        }
        System.out.print("\nSUBSTITUIR MULTIPLOS DE 3: ");
        ex.replaceMultipleBy3(new Integer[]{3,6,9,4,5,6,7,12,15});
        System.out.print("\nFATORIAL: ");
        ex.computeFactorialArray(new Integer[]{1,2,3,4,5,6});
    }
}











