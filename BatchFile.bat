@echo OFF
IF EXIST C:\Users\Qamar\Documents\MAin.class DEL C:\Users\Qamar\Documents\MAin.class
javac C:\Users\Qamar\Documents\MAin.java
IF EXIST C:\Users\Qamar\Documents\MAin.class (cls
java -cp C:\Users\Qamar\Documents\ MAin)
pause
exit