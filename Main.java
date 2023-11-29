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
        
    }
}
