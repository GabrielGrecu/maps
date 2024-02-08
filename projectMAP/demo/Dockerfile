FROM openjdk:11

WORKDIR /app

COPY . /app

RUN javac -d . src/main/java/com/example/demo/EightQueens.java

CMD ["java", "-cp", ".", "com.example.demo.EightQueens"]
