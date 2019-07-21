- Q1301
    - 次の空白を埋めなさい

|            | １                                                        | ２                                                           |
|------------|-----------------------------------------------------------|--------------------------------------------------------------|
| コード     | item i = new Sword()                                      | `Monster` a = new `Slime()`                                  |
| イメージ図 | `Sword`インスタンス<<Itemです>>i                          | `Slime`インスタンス<<Monsterです>>a                          |
| 解説文     | `Swordインスタンス`を生成したが、ザックリと`Item`とみなす | `Slimeインスタンス`を生成したが、ザックリと`Monster`とみなす |

- Q1302
    - 次のようにクラスが宣言されています。

    A.java

    ```java
    public final class A extends Y{
        public void a(){System.out.print("Aa");}
        public void b(){System.out.print("Ab");}
        public void c(){System.out.print("Ac");}
    }
    ```

    B.java
    
    ```java
    public final class B extends Y{
        public void a(){System.out.print("Ba");}
        public void b(){System.out.print("Bb");}
        public void c(){System.out.print("Bc");}
    }
    ```

    X.java

    ```java
    public interface X { void a();}
    ```

    Y.java

    ```java
    public abstract class Y implements X {
        public abstract void a();
        public abstract void b();
    
    }
    ```

    このとき以下の問いに答えなさい。

    1. `X obj = new A();` としてAインスタンスを生成した後、変数objに対して呼ぶことができるメソッドを、a(), b(), c()の中から全てあげてください

    a()

    2. `Y y1 = new A(); Y y2 = new B();`としてAとBのインスタンスを生成した後、`y1.a(); y2.a();` を実行した場合に画面に表示される内容を答えてください

    AaBa

- Q1303
    - Q1302で用いたAクラスやBクラスのインスタンスをそれぞれ１つずつ生み出し、要素数２からなる単一の配列に格納するとします。格納した後には配列の中身をループで順に取り出して、それぞれのインスタンスのb()メソッドを呼ぶ必要があります。以上の前提に基づき、次の問いに答えてください。

        - 配列変数としてなにを用いるべきか答えてください

            Y
            
        - 問題文に記述された内容のプログラムを作成してください
