// Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.

// Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.

// Пример

// package org.stepic.java.example;

// public class Test {
//     public static void main(String[] args) {
//         System.out.println(getCallerClassAndMethodName());
//         anotherMethod();
//     }

//     private static void anotherMethod() {
//         System.out.println(getCallerClassAndMethodName());
//     }

//     public static String getCallerClassAndMethodName() {
//         // ...
//     }
// }
// При запуске эта программа должна вывести:
// null
// org.stepic.java.example.Test#main
// P.S. При тестировании этой программы в среде разработки вы можете получить другой результат: вместо null в первой строчке будет напечатан какой-то посторонний класс и метод. Это связано с тем, что среда разработки обычно запускает не ваш класс, а свой собственный, который затем уже вызывает ваш. Чтобы этого избежать, запускайте программу командой "java" в командной строке.

import java.math.*;
import java.util.Arrays;

public class Main {
public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Exception().getStackTrace();

        if (stackTraceElements.length > 2) {
            StackTraceElement callerElement = stackTraceElements[2];
            return callerElement.getClassName() + "#" + callerElement.getMethodName();
        }
        return null;
    }
}