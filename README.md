# Mage.

---
Задача 10
Опишите класс Mage. В нем пропишите:

поле name (имя, строка);
поле level (уровень мага, число);
поле damage (урон, число);
поле type (тип магии, строка, может быть равен fire, ice, earth);
конструктор, инициализирующий данные поля (name, level, damage, type);
метод getInfo(), возвращающий строку вида {name, level, damage, type};
метод fight(Mage mage), этот метод должен вернуть имя мага-победителя. Кто из них победит решается следующем образом:
⚡ Маг огня побеждает мага льда, но проигрывает магу земли.
⚡ Маг льда побеждает мага земли, но проигрывает магу огня.
⚡ Маг земли побеждает мага огня, но проигрывает магу льда.
⚡Если же стихия магов одинаковая, то выигрывает более высокоуровневый маг, если же и уровни одинаковы, то тот, у которого больший урон, если же и урон одинаковый, то вернуть строку draw (ничья).

---
