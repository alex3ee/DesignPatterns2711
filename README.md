# DesignPatterns2711
Lab1
ДЗ- 1) Применить к иерархии File System паттерн Singleton. 2) Применить к иерархии 2 любой паттерн фабрик (или все сразу)

Lab2
Дополнить класс ConnectionPoolGrowLimit из проекта patterns_demo следующим функциональном:
1) Сделать pool с "восстановлением размера". Т.е. pool растет до определенного лимита (например с 10ти исходных ресурсов до 20ти). 
Но при снижении нагрузки (т.е. при возврате в pool более чем 70% соединений) удаляет лишние добавленные ресурсы (т.е. уменьшает свой размер с 20ти обратно до 10ти)
2) Добавить запрет использования ресурса из pool-а по ссылке, после того как он был возвращен в pool.
