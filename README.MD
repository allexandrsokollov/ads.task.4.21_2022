Условие задачи 4.21:

Дан массив/список чисел размера N. 
Разрешается выполнять только операции обмена двух элементов данного массива. 
Найти такую последовательность обменов, которая отсортирует числа в исходном 
массиве/списке. Кол-во обменов должно получиться не более N, сложность 
алгоритма - O(n*log(n)).

Подсказка: 
составляем массив из элементов 
(значение, первоначальная позиция, конечная позиция), 
первые два поля заполняем, сортируем по значению. 
Затем заполняем конченую позицию и сортируем второй раз по начальной позиции. 
Получили массив, для каждого элемента которого известно, 
где он должен оказаться, далее - очевидно.