# master
# HomeWork2

Є web site, в якого є перелік сторінок (pages). Кожна сторінка (page) відкривається тільки у специфічному браузері (Chrome, FF).
Кожна веб сторінка (page) має 3 характеристики - title і url, htmlContent. 
На сайті є 2 різні about пейджі з однаковим тайтлом (title) але різними url, та 2 форум (forum) пейджі з однаковим тайтлом але різними url.
Наприклад login page відкривається в двох браузерах, home page теж, всі forum page тільки у Chrome, всі about page тільки в FF. 
Кожна сторінка (page) містить метод представлення (htmlBuilder), який в кожної сторінки (page) різний і він використовує атрибут htmlContent.
Будь яка сторінка повинна вміти робити 2 дії - перезавантажуватись (refresh) та завантажуватись (load) - ці методи у всіх сторінок працюють одинаково, а також мати методи які повертають html сторінки у браузері, в якому вона може відкриватись (get html Chrome, get html FF).

P.S.:(тобто загалом на сайті 6 сторінок (pages)). 

Tasks:
1. Створити колекцію всіх можливих сторінок сайту
2. Вивести на екран колекцію всіх можливих пейджів сайту. 
3. Вивести на екран колекцію тільки тих пейджів, які відкриваються в ФФ і колекцію тих які відкриваються тільки в Хромі.
4. Вивести на екран результат виконання htlmBuilder кожної сторінки
5. Вивести на екран множину унікальних title всіх пейджів сайту
6. Вивести на екран мапу, яка буде містити ключ - title сторінки, value - список сторінок з таким title, пройтись по мапі та вивести на екран htmlContent кожної з сторінок доданих у мапу
