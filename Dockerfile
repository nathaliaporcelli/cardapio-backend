FROM openjdk
WORKDIR /app

COPY . .
#COPY ./target/demo-0.0.1-SNAPSHOT.jar ./demo.jar
EXPOSE 8080

# Instalar as dependências e compilar a aplicação
RUN ./mvnw clean package -DskipTests
# Comando para executar a aplicação
CMD ["java", "-jar", "./target/Cardapio-0.0.1-SNAPSHOT.jar"]