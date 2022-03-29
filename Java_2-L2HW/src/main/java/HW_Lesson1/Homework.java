package HW_Lesson1;

public class Homework {

    public static void main(String[] args) {

        final String [][] array = new String[][]
                {{"1", "2", "3", "4"},
                 {"1", "2", "3", "4"},
                 {"1", "2", "3", "4"},
                 {"1", "2", "3", "4"},};

        try {
            try {
                System.out.println("Сумма элементов массива: " + invertArray(array));
            } catch (MyArraySizeException e) {
                System.out.println("Вы вышли за границы массива!!!");
            }
        }

        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение входных данных! \n Ошибка в ячейке: " + "[" + e.i + "," + e.j + "]");
        }
    }

    public static int invertArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int k = 0;

        if (array.length != 4) {
            throw new MyArraySizeException(String.format("Неправильный размер массива (число строк)"));
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(String.format("Неправильный размер массива: ошибка в " + i + " строке"));
            }
            for (int j = 0; j < array.length; j++) {
                try {
                    k += Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return k;
    }
}
