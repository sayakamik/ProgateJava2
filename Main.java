public class Main {
    public static void main(String[] args) {
        // 比較演算子
        System.out.println(true);
        System.out.println(false);
        System.out.println(12/4 != 3);
        System.out.println(4 + 2 < 6);
        System.out.println(4 + 2 >= 6);
        boolean bool = (3 + 3 < 5);
        System.out.println(bool);
        // かつ、または
        System.out.println(true || false);
        System.out.println(false && true);
        System.out.println(8 < 5 && 3 >= 2);
        // 〜でない
        System.out.println(!(8 < 5));

        // 条件分岐if文
        if (true) {
          System.out.println("条件式がtrueのため、出力されます");
        }
        if (false) {
          System.out.println("条件式がfalseのため、出力されません");
        }
        int x = 5;
        if(x > 2){
          System.out.println("xは2より大きい");
        }
        if(x > 8){
          System.out.println("xは8より大きい");
        }
        // 条件分岐if, else if, else文
        int number = 12;
        if (number < 10) {
          System.out.println("10より小さい");
        }else if( number < 20) {
          System.out.println("10以上、20より小さい");
        }else {
          System.out.println("20以上");
        }
        // switch文
        int n = 0;
        switch (n) {
          case 1:
            System.out.println("大吉です");
            break;
          case 2:
            System.out.println("中吉です");
            break;
          default:
            System.out.println("凶です");
            break;
        }
    }
}
