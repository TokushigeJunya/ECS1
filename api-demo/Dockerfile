# ビルドステージ：.war を作成
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app
COPY . /app
RUN mvn clean package -DskipTests

# 実行ステージ：Tomcat イメージを使用
FROM tomcat:10.1-jdk21-temurin

# 既存の ROOT アプリケーションを削除（任意）
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# WAR を配置（ROOT.war としてデプロイ）
COPY --from=build /app/target/api-demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080