[![Build status](https://ci.appveyor.com/api/projects/status/pmu9loamaxoxwq3b?svg=true)](https://ci.appveyor.com/project/Daru42ru/diploma)
## Дипломный проект по профессии «Тестировщик»
### Документы
1. [План автоматизации тестирования](https://github.com/Daru42ru/Diploma/blob/main/Plan.md)
### Предустановленное окружение
- IntelliJ IDEA
- Docker Desktop
### Запуск проекта по тестированию сервиса для покупки туров
1. Запустить Docker Desktop.
2. Склонированный проект окрыть в IDEA.
3. Открыть терминал в IDEA.
4. Запустить контейнеры командой `docker-compose up`.
5. Запустить приложение командой:
   - Для работы с MySQL `java "-Dspring.datasource.url=jdbc:mysql://localhost:3306/app" -jar aqa-shop.jar`.
   - Для работы с Postgres `java "-Dspring.datasource.url=jdbc:postgresql://localhost:5432/app" -jar aqa-shop.jar`.
6. Проверить доступность приложения в браузере по ссылке http://localhost:8080/.
7. Запустить тесты командой:
   - Для работы с MySQL `java "./gradlew clean test "-Ddb.url=jdbc:mysql://localhost:3306/app"`.
   - Для работы с Postgres `java "./gradlew clean test "-Ddb.url=jdbc:postgresql://localhost:5432/app"`.
8. Запустить Allure для создания отчёта командой `./gradlew allureServe`.
9. Остановить Allure комбинацией клавиш **Ctrl+C**, а после ввести **Y** для подтверждения.
10. Остановить приложение комбинацией клавиш **Ctrl+C**.
11. Остановить работу контейнеров командой `docker-compose down`.
