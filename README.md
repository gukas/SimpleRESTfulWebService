# SimpleRESTfulWebService

REST веб-сервис с использованием Spring, работающий с локальной БД через jooq

Методы:
http://localhost:8080/greeting?name=abc
Возвращает приветствие. Может принимать опциональный параметр name

http://localhost:8080/get-quote
Ходит по сети и возвращает контент из другого REST веб-сервисa http://gturnquist-quoters.cfapps.io/api/random

http://localhost:8080/get-author?id=1
Возращает контент из БД по id записи

http://localhost:8080/add-author?id=1&name=leo&surname=tolstoy
Добавляет/обновляет запись в БД по id
