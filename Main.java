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
        // while文
        int number2 = 10;
        while(number2 > 0){
          System.out.println(number2);
          number2 --;
        }
        // for文
        for(int i = 1; i <= 5; i++){
          System.out.println( i+ "回目のループです");
        }

        System.out.println("=== while文 ===");
          int k = 1;
          while (k < 10) {
            // iが5の倍数のとき、繰り返し処理を終了
            if(k % 5 == 0){
              break;
            }
            System.out.println(k);
            k++;
          }

          System.out.println("=== for文 ===");
          for (int j = 1; j < 10; j++) {
            // jが3の倍数のとき、処理をスキップ
            if(j % 3 == 0){
              continue;
            }
            System.out.println(j);
          }
          // 配列
          String[] animals ={"にんじゃわんこ", "ひつじ仙人","ベイビーわんこ"};
          // インデックス番号が0の要素を出力してください
          System.out.println(animals[0]);
          // インデックス番号が2の要素を出力してください
          System.out.println(animals[2]);
          // 上書き
          animals[0] = "わんこ";
          System.out.println(animals[0]);

          // 配列と繰り返し
          String[] names = {"A", "B", "C"};
          // for文を用いて、「私の名前は◯◯です」と出力してください
          for(int i = 0; i < names.length; i++){
            System.out.println("私の名前は" + names[i] + "です");
          }
          // 拡張for分へ書き換え(こっちのほうが楽)
          int[] ages = {27, 30, 80};
          for(int age: ages){
            System.out.println(age);
          }
    }
}
