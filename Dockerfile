FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . .
RUN mkdir -p bin && \
    javac -cp src -d bin src/application/Program.java
CMD ["java", "-cp", "bin", "application.Program"]