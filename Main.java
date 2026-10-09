public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "1", "2", "3"},
                {"4", "5", "6", "7"} };
        try { int result = checkAndSum(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println(" Неверный размер массива.");
        } catch (MyArrayDataException e) {
            System.out.println("ошибка данных в ячейке [" + e.a + "][" + e.a + "]");
        }
        try {
            String errorElement = array[10][0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Выход за границы массива .");
        }
    }
    public static int checkAndSum(String[][] array)
            throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int a = 0; a < array.length; a++) {
            if (array[a].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                try { sum += Integer.parseInt(array[a][b]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(a, b);
                }
            }
        }
        return sum;
    }
}
class MyArraySizeException extends Exception {}
class MyArrayDataException extends Exception {
    public int a, b;
    public MyArrayDataException(int a, int b) {
        this.a = a; this.b = b;
    }
}
