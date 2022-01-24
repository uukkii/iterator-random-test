## Домашнее задание к занятию 1.3: Поведенческие шаблоны. Command, CoR, Observer, Iterator

# Бесконечная итерация

**v. 1.1**

Исправления внесены. Метод random() в классе Randoms теперь выглядит так:
```
        public static int random() {
            return (int) (Math.random() * ((max - min) + 1)) + min;
        }
```


**v. 1.0**

Задание реализовано.

Вывод в консоль после выполнения:

```
5:12:33 PM: Executing task ':Main.main()'...

> Task :compileJava UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE

> Task :Main.main()
Сгенерированное число: 97
Сгенерированное число: 98
Сгенерированное число: 98
Сгенерированное число: 90
Сгенерированное число: 100
Выпало число 100, давайте на этом закончим

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 394ms
2 actionable tasks: 1 executed, 1 up-to-date
5:12:33 PM: Task execution finished ':Main.main()'.

```
