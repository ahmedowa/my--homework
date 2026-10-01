//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
  public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // System.out.print("Hello and welcome!");//
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
      mymetod();
        method(2);
         project(-5);
        numbereght("text",3);
        theyear(2026);
        Array();
        mast();
        woorkbook();
        fillDiagonal();
        createArray(5,10);
    }





  public static void printThreeWords()   {
    System.out.println("Orange");
    System.out.println("Banana");
  System.out.println("Apple");
  }


   public static void checkSumSign()    {
  int a=1;
  int b=2;
       int sum=a+b;
     if(a+b>=0) {
        System.out.println("Сумма положительная");
        } else {

        System.out.println("Сумма отрицательная");
     }
   }


         public static void printColor()  {
          int value=5;
          if (value <=0)  {
           System.out.println("Красный");
       }    else if(value>0 && value<=100) {

               System.out.println("Желтый");
       }   else if(value>100)  {
               System.out.println("Зеленый");
              }
          }
    public static void compareNumbers()  {
        int a=8;
        int b=3;
        if (a>=b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");

        }
    }
    public static  boolean mymetod()   {
         int a=5;
         int b=7;
       int result= a+b;
        if (a+b>=10 && a+b<=20) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
    public static void method(int a)  {
        if (a >=0)    {
        System.out.println("Положительное");
    } else  {
        System.out.println("Отрицательное");
    }
    }
    public static boolean  project(int a)  {
        if(a<0) {
            System.out.println(true);
            return true;
        } else  {
            System.out.println(false);
            return false;
          }
        }
    public static void numbereght(String text, int times) {
        for (int a = 0; a < times; a++) {
            System.out.println(text);
        }
    }
    public static boolean theyear(int year) {
        if (year % 400 == 0) {
            System.out.println(true);
            return true;
        } else if (year % 100 == 0) {
            System.out.println(false);
            return false;
        } else  if (year % 4 == 0)  {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;

        }
    }
    public static void Array() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0} ;
        for (int a = 0; a < array.length; a++) {
            if (array[a] == 1) {
                array[a] = 0;
            }   else {
                array[a] = 1;
            }
        }
    }



        public static void mast()  {
                int[] array = new int[100];
                for (int a = 0; a < array.length; a++) {
                    array[a] = a+ 1;
                }

        }
            public static void woorkbook() {
                    int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                    for (int a = 0; a < array.length; a++) {
                        if (array[a] < 6) { array[a] = array[a] * 2;
    }
                    }
            }



public static void fillDiagonal() {
    int[][] matrix = new int[5][5];
    for (int a = 0; a < matrix.length; a++) {
        matrix[a][a] = 1;
        matrix[a][matrix.length-1-a]=1;

    }
}
    public static int[] createArray(int length, int initialValue) {
        int[] array = new int[length];
        for (int a = 0; a < length; a++) {
            array[a] = initialValue; }
        return array;
    }
}



























































