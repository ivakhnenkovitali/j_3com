import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] arr1 = new int[SIZE];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // foreach
        // for(тип имя_переменной : идет перебираемы_массив){
        //имя_пер
        //}
        // foreach прячет идексацию елеменов от 0 до length внутри себя переменная каждую
        /// каждую итерацию элемента
        // массива
        /// только для перебора всех элементов массива

        for (int elem : arr1) {
            /// elem = arr1[i];
            System.out.print(elem + " ");
        }


        System.out.println();
        // т к foreach копирует в переменную копии элементов м массива
        // то элементы массивао примитивов при помоци foreach изменить нельзя

        for (int elem : arr1) {
            elem = (int)  (Math.random() * 10);
        }
        for (int elem : arr1) {
            System.out.print(elem + " ");

        }

        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (int) (Math.random() * 10);

        }
        System.out.println(Arrays.toString(arr1));
        int num = 3; /// удалить третий элемент из массива

       // System.arraycopy(массив_откуда, позици_окгдова, поз_куда, сколько);
        //удоление элемента массива при помощи arraycopy
        System.arraycopy(arr1, num, arr1, num -1, arr1.length - num);
        System.out.println(Arrays.toString(arr1));
        arr1 = Arrays.copyOf(arr1, arr1.length-1);
        System.out.println(Arrays.toString(arr1));



    }

}

