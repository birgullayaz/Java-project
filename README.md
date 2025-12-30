# My Java Application

A simple Java web application built with Spring Boot.

## Web Uygulamasını Çalıştırma

### Gereksinimler
- ✅ Java 17 veya üzeri (Kurulu: Java 24.0.1)
- ✅ Maven Wrapper (Projeye dahil edildi - ekstra kurulum gerekmez!)

### ⚠️ ÖNEMLİ: JAVA_HOME Ayarlama

Eğer "JAVA_HOME not found" hatası alırsanız, önce JAVA_HOME'u ayarlayın:

**PowerShell'de:**
```powershell
$env:JAVA_HOME = "C:\Program Files\Eclipse Adoptium\jdk-21.0.3.9-hotspot"
```

**CMD'de:**
```cmd
set JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-21.0.3.9-hotspot
```

**Veya kolay yol - run.bat dosyasını kullanın:**
```cmd
run.bat
```

### Terminalde Çalıştırma (Önerilen - Maven Wrapper ile)

**1. Kolay Yol - run.bat kullanarak:**
```cmd
run.bat
```

**2. Maven Wrapper kullanarak (Maven kurulumu gerekmez):**
```powershell
.\mvnw.cmd spring-boot:run
```

Veya önce derleyip sonra çalıştırabilirsiniz:
```powershell
.\mvnw.cmd clean package
java -jar target/MyJavaApp-1.0.0.jar
```

**Not:** İlk çalıştırmada Maven Wrapper otomatik olarak Maven'i indirecektir. Bu sadece bir kez olur.

### Alternatif: Maven Kurulu İse

Eğer sisteminizde Maven kuruluysa:
```powershell
mvn spring-boot:run
```

2. **Uygulama çalıştıktan sonra tarayıcınızda açın:**
   - Ana sayfa: http://localhost:8081/
   - Hello endpoint: http://localhost:8081/hello
   
   **Not:** Port 8080 başka bir uygulama tarafından kullanılıyorsa, uygulama otomatik olarak 8081 portunda çalışacaktır.

### Konsol Uygulaması Olarak Çalıştırma (Eski Yöntem)

1. **Compile the Java file:**
   ```powershell
   javac src/main/java/HelloWorld.java
   ```

2. **Run the compiled program:**
   ```powershell
   java -cp src/main/java HelloWorld
   ```

## Project Structure

```
MyJavaApp/
├── src/
│   └── main/
│       └── java/
│           ├── com/example/
│           │   ├── MyJavaAppApplication.java
│           │   └── HelloWorldController.java
│           └── HelloWorld.java
├── .mvn/
│   └── wrapper/
│       ├── maven-wrapper.jar
│       └── maven-wrapper.properties
├── mvnw.cmd
├── pom.xml
└── README.md
```

## API Endpoints

- `GET /` - Ana sayfa mesajı (http://localhost:8081/)
- `GET /hello` - Hello World mesajı (http://localhost:8081/hello)

## Next Steps

- Add more REST endpoints
- Add database support
- Add frontend templates (Thymeleaf, etc.)
- Deploy to cloud platforms (Heroku, AWS, etc.)

