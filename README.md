# Java版 unittest サンプル

準備

```bash
docker compose build
```

コードのビルド

```bash
docker compose run --rm myjava mvn package
```

テスト実行（JUnit + Mockito）

```bash
docker compose run --rm myjava mvn test
```

カバレッジレポート（JaCoCo）

```bash
docker compose run --rm myjava mvn verify
```

レポート出力先:

- `target/site/jacoco/index.html`

CLI実行（add / mult）

```bash
docker compose run --rm myjava mvn -q exec:java -Dexec.mainClass=unittestjava.Main -Dexec.args="2 6 add"
docker compose run --rm myjava mvn -q exec:java -Dexec.mainClass=unittestjava.Main -Dexec.args="2 6 mult"
```

assertサンプル実行（`-ea` を有効化）

```bash
docker compose run --rm myjava mvn -q exec:java -Dexec.mainClass=unittestjava.AssertAdd -Dexec.jvmArgs="-ea"
```

停止

```bash
docker compose down
```
