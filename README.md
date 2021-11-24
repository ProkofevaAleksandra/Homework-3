# Homework-3

Сравнительный анализ производительности Java коллекций.

Сравнение MyLinkedList и java.util.LinkedList.
![1 1](https://user-images.githubusercontent.com/92428972/143219597-c1ee903f-fc2f-4ac8-a626-cf88388eff0d.PNG)

       По результатам сравнительного анализа можно сделать вывод, что собственно реализованная коллекция MyLinkedList имеет такое же время добавления элементов, что и java.util.LinkedList. 
       Вставка элементов в MyLinkedList коллекцию происходит немного быстрее, если мы имеем небольшое количество элементов и чуть медленнее, чем в и java.util.LinkedList, если мы имеем большое количество элементов (более 30000).
       Удаление в коллекции MyLinkedList производится намного быстрее, чем в и java.util.LinkedList при любом количестве элементов.
       

Сравнение ArrayList и LinkedList.

       Доступ по индексу происходит очень быстро в ArrayList, так как построен он на базе массива. А добавление элементов в середину списка происходит медленно, т.к. нужно будет подвинуть каждый элемент, который идёт после, следовательно, для добавления (вставки) элементов в середину и конец списка удобно использовать LinkedList, что и показывает график времени работы. 
       Удаление элементов в ArrayList производится чуть быстрее, чем в LinkedList при любом количестве элементов. 


Сравнение HashSet и LinkedHashSet и TreeSet.

       По результатам сравнительного анализа можно сделать вывод, что для быстрого добавления элементов следует использовать HashSet. Для быстрого поиска стоит использовать LinkedHashSet, так как сохраняется порядок добавления элементов. TreeSet следует использовать, если мы хотим получить отсортированный набор элементов. 
       Удаление элементов в LinkedHashSet производится быстрее при небольшом наборе элементов. При большом наборе быстрее у HashSet.
       Поэтому если хотим сохранить порядок добавления элементов - используем LinkedHashSet, а если хотим получить отсортированный набор - тогда используем TreeSet.


Сравнение HashMap и LinkedHashMap и TreeMap.
 
       По результатам сравнительного анализа можно сделать вывод, что для быстрого добавления и поиска элементов следует использовать LinkedHashMap, так как сохраняется порядок добавления элементов. TreeSet следует использовать, если мы хотим получить отсортированный набор элементов. 
       Удаление элементов в HashMap производится быстрее при небольшом наборе элементов. При большом наборе быстрее у LinkedHashMap.
       Поэтому если хотим сохранить порядок добавления элементов - используем LinkedHashMap, а если хотим получить отсортированный по ключам набор - тогда используем TreeMap.


      

