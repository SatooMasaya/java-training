- カプセル化
    - アクセス制御を可能にする

- 修飾子のアクセス制御
    - public
        - 指定されたメンバは全てのクラスからアクセスできる
        - 指定されたクラスは全てのクラスからアクセスできる
    - package private または、アクセス修飾子なし
        - 指定されたメンバは同一パッケージのクラスのみアクセスできる
        - 指定されたクラスは同一パッケージのクラスのみアクセスできる
    - private
        - 指定されたメンバは同一クラス内のみアクセスできる

- javaファイル作成のルール
    - 1 ファイルに 1 public クラス

- セッターメソッドを用いるメリット
    - 引数の妥当性の確認ができる
    - ファイルの修正の負担がへる