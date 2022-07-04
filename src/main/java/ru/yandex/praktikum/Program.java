package ru.yandex.praktikum;

public class Program {
    public boolean result;
    public boolean checkIsAdult(int age){
        if (age >= 18){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
