- エラー
    - 文法エラー（開発者の過失）
        - コードの形式的誤りで起こるエラー
            - コンパイラが指摘したコードの箇所を修正する
    - 実行時エラー（実行中の例外）
        - 実行中に想定外の自体が発生し動作継続できないことで起こるエラー
            - 事前に「エラーが発生した時の対応策」を記述して、事態を回避する
    - 論理エラー（開発者の過失）
        - 記述した処理内容に誤りがあったため起こるエラー
            - 自力で解決

- 例外の種類
    - Error系例外(回復見込みなし、catchする必要なし)
        - OutOfMemoryError
        - ClassFormatError
        - etc
    - Exception系例外(回復見込みあり、catchすべき)
        - IOexception
        - ConnectException
        - etc
    - RuntimeException系例外(回復見込みあり、回復は必須ではない、catchしなくても良い)
        - NullPointerException
        - ArrayIndexOutOfBoundsException
        - etc

- 例外の処理
    - try-catch文に加えて、finallyブロックを追加すれば、例外処理後に、finallyブロックの中の処理が行われる
    - Exception 系例外が怒る可能性がある場合は、try-catch 文が必須である
    - throw 文を使うことで、自ら例外を投げることができる

