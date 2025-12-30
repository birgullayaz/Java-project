@echo off
echo Java Web Uygulamasini Baslatiliyor...
echo.

REM JAVA_HOME'u otomatik ayarla
set "JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-21.0.3.9-hotspot"

REM Eğer yukarıdaki yol yoksa, alternatif yolları dene
if not exist "%JAVA_HOME%\bin\java.exe" (
    set "JAVA_HOME=C:\Program Files\Java\jdk-21"
)
if not exist "%JAVA_HOME%\bin\java.exe" (
    echo JAVA_HOME bulunamadi! Lutfen JAVA_HOME'u manuel olarak ayarlayin.
    pause
    exit /b 1
)

echo JAVA_HOME: %JAVA_HOME%
echo.

REM Maven Wrapper ile uygulamayı başlat
call mvnw.cmd spring-boot:run

pause

