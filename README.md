# Skyshop

Skyshop - это простое приложение электронной коммерции, которое позволяет пользователям просматривать продукты, добавлять их в корзину и просматривать общую стоимость. Приложение также включает функциональность поиска для нахождения продуктов и статей.

## Технологии

- **Spring Boot**: 3.4.5
- **Spring Web**: 3.4.5
- **Java**: 17
- **Maven**: 3.9.1

## Установка

1. **Клонируйте репозиторий**:
   ```bash
   git clone <https://github.com/gface34rus/skyshop>
   cd skyshop
Установите зависимости: Убедитесь, что у вас установлен Maven, затем выполните:

mvn clean install
Запустите приложение:

mvn spring-boot:run
Использование
После запуска приложения вы можете использовать следующие конечные точки API:

Получить все продукты: GET /products
Получить все статьи: GET /articles
Поиск продуктов и статей: GET /search?pattern={pattern}
Добавить продукт в корзину: POST /basket/{id}
Получить корзину пользователя: GET /basket
Тестирование
Проект использует JUnit Jupiter для тестирования. Вы можете запустить тесты с помощью команды:

mvn test
Развертывание
Проект можно развернуть как приложение Spring Boot. Он может быть упакован в JAR файл и запущен с помощью команды:

java -jar target/skyshop-0.0.1-SNAPSHOT.jar
