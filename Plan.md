# План автоматизации тестирования

## 1. Сценарии

### №1 Оплата по первой карте
1. Ввести в поле "Номер карты" 4444 4444 4444 4441.
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об успешной операции

### №2 Оплата по второй карте
1. Ввести в поле "Номер карты" 4444 4444 4444 4442.
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №3 Покупка в кредит по первой карте
1. Ввести в поле "Номер карты" 4444 4444 4444 4441.
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об успешной операции.

### №4 Покупка в кредит по второй карте
1. Ввести в поле "Номер карты" 4444 4444 4444 4442.
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №5 При оплате по карте в поле "Владелец" ввести данные с "-"
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Ввести в поле "Владеле" фамилию через "-".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".
Ожидаемый результат: Сообщение об успешной операции.

### №6 При покупке в кредит по карте в поле "Владелец" ввести данные с "-"
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Ввести в поле "Владелец" фамилию через "-".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".
Ожидаемый результат: Сообщение об успешной операции.

### №7 При оплате по карте не заполнено поле "Номер карты"
1. Заполнить поле "Месяц".
2. Заполнить поле "Год".
3. Заполнить поле "Владелец".
4. Заполнить поле "CVC/CVV".
5. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение под незаполненным полем "Введите номер карты".

### №8 При оплате по карте не заполнено поле "Месяц"
1. Заполнить поле "Номер карты".
2. Заполнить поле "Год".
3. Заполнить поле "Владелец".
4. Заполнить поле "CVC/CVV".
5. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение под незаполненным полем "Введите месяц".

### №9 При оплате по карте не заполнено поле "Год"
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Владелец".
4. Заполнить поле "CVC/CVV".
5. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение под незаполненным полем "Введите год".

### №10 При оплате по карте не заполнено поле "Владелец"
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "CVC/CVV".
5. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение под незаполненным полем "Введите владельца".

### №11 При оплате по карте не заполнено поле "CVC/CVV"
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение под незаполненным полем "Введите CVC/CVV".

### №12 При покупке в кредит не заполнено поле "Номер карты"
1. Заполнить поле "Месяц".
2. Заполнить поле "Год".
3. Заполнить поле "Владелец".
4. Заполнить поле "CVC/CVV".
5. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение под незаполненным полем "Введите номер карты".

### №13 При покупке в кредит не заполнено поле "Месяц"
1. Заполнить поле "Номер карты".
2. Заполнить поле "Год".
3. Заполнить поле "Владелец".
4. Заполнить поле "CVC/CVV".
5. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение под незаполненным полем "Введите месяц".

### №14 При покупке в кредит не заполнено поле "Год"
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Владелец".
4. Заполнить поле "CVC/CVV".
5. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение под незаполненным полем "Введте год".

### №15 При покупке в кредит не заполнено поле "Владелец"
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "CVC/CVV".
5. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение под незаполненным полем "Введите владельца".

### №16 При покупке в кредит не заполнено поле "CVC/CVV"
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение под незаполненным полем "Введите CVC/CVV".

### №17 При покупке по карте использован номер, отсутствующй в базе данных
1. Ввести в поле "Номер карты" номер 1111 1111 1111 1111.
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №18 При покупке в кредит по карте использован номер, отсутствующий в базе данных  
1. Ввести в поле "Номер карты" номер 1111 1111 1111 1111
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №19 При оплате по карте ввести номер менее 16 знаков
1. Ввести в поле "Номер карты" менее 16 знаков.
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №20 При покупке в кредит в поле "Номер карты" ввести номер менее 16 знаков 
1. Ввести в поле "Номер карты" менее 16 знаков.
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №21 При оплате по карте в поле "Месяц" ввести меньшее число
1. Заполнить поле "Номер карты".
2. Ввести в поле "Месяц" месяц меньше текущего.
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №22 При покупке в кредит в поле "Месяц" ввести меньшее число
1. Заполнить поле "Номер карты".
2. Ввести в поле "Месяц" месяц меньше текущего.
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №23 При оплате по карте в поле "Год" ввести меньшее число  
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Ввести в поле "Год" год меньше текущего.
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №24 При покупке в кредит в поле "Год" ввести меньшее число   
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Ввести в поле "Год" год меньше текущего.
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №25 При оплате по карте в поле "Год" ввести большее число
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Ввести в поле "Год" число больше текущего.
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №26 При покупке в кредит в поле "Год" ввести большее число   
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Ввести в поле "Год" число больше текущего.
4. Заполнить поле "Владелец".
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №27 При оплате по карте в поле "Владелец" указано имя на кириллице   
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Ввести в поле "Владелец" имя на кириллице.
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №28 При покупке в кредит в поле "Владелец" указано имя на кириллице   
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить "Год".
4. Ввести в поле "Владелец" имя на кириллице.
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №29 При оплате по карте в поле "Владелец" ввести спецсимволы
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Ввести в поле "Владелец" спецсимволы.
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №30 При покупке в кредит в поле "Владелец" ввести спецсимволы
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить "Год".
4. Ввести в поле "Владелец" спецсимволы(*?!%).
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №31 При оплате по карте в поле "Владелец" вести цифры
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Ввести в поле "Владелец" цифры.
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №32 При покупке в кредит в поле "Владелец" ввести цифры   
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить "Год".
4. Ввести в поле "Владелец" имя с цифрами.
5. Заполнить поле "CVC/CVV".
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

### №33 При оплате по карте в поле "CVC/CVV" ввести менее 3-х цифр   
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить поле "Год".
4. Заполнить поле "Владелец".
5. Ввести поле "CVC/CVV" 2 знака.
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

#### №34 При покупке в кредит в поле "CVC/CVV" ввести менее 3-х цифр
1. Заполнить поле "Номер карты".
2. Заполнить поле "Месяц".
3. Заполнить "Год".
4. Заполнить поле "Владелец".
5. Ввести в поле "CVC/CVV" 2 знака.
6. Нажать на кнопку "Продолжить".  
Ожидаемый результат: Сообщение об ошибке.

## 2. Перечень используемых инструментов ##
- IntelliJ IDEA - среда для работы с программным кодом при написании тестов. 
- Docker - среда для изолированного развёртывания тестовых баз данных и работы с окружением.
- Git и GitHub - для управления версиями тестируемой среды и предоставления удалённого доступа.
- Java 11 - тесты будут написаны на этом языке программирования.
- Gradle - для сборки проекта на языке Java и управления зависимостями.
- Lombok - библиотека для сокращения написания программного кода.
- JUnit 5 - фреймворк для автоматического тестирования программ.
- Selenide - фреймворк для UI-тестирования.
- Faker - библиотека для генерации пользовательских данных.
- Allure - фреймворк для создания лаконичных и информативных отчётов о тестировании
  
## 3. Перечень и описание возможных рисков при автоматизации
* Технические неполадки (свет, Интернет).
* Устаревание автоматизированных тестов при внесении изменений в тестируемый сервис.
* Риск непредвиденных ошибок при запуске тестируемого сервиса.

## 4. Интервальная оценка с учётом рисков в часах
- Настройка, запуск СУБД и симулятора банковского сервиса - 4 часа.
- Написание и прогон авто-тестов - 192 часа.
- Интеграция инструментов для репортинга - 4 часа.
- Подготовка отчёта по итогам тестирования - 12 часов.

## 5. План сдачи работ
* Настройка окружения, написание и прогон авто-тестов - 10 июля - 24 июля.
* Подготовка отчётных документов - 25 июля - 31 июля.