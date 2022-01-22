# Metody i algorytmy kompilacji
Filip Tłuszcz
Kacper Piastowicz

## Opis gramatyki
### Ogólne
Gramatyka w dużej mierze przypomina tą z języka C. Pojedyncze zdania muszą być zakończone średnikiem. Tabulatory jak i znaki puste nie mają znaczenia, ponieważ są domyślnie pomijane.
### Zmienne
Język jest silnie typowany. Dostępne są następujące typy: int, double, bool. Z tego też powodu wymagana jest deklaracja zmiennej przed odwołaniem się do niej.  Między deklaracją zmiennej a jej typem powinien znajdować się separator “::” np. int::count = 0;. Do funkcji zmienne przekazywane są jako kopie. W przypadku gdy w bloku wyższym np. funkcji zadeklarowana zostanie zmienna o takiej samej nazwie jak w bloku niższym, niższa zmienna zostanie przykryta. Do ostatnio przykrytej zmiennej o danej nazwie można się odnosić za pomocą operatora “outer” np. outer i = 5;. Nazwa zmiennej nie może być taka sama jak nazwa funkcji. Odniesienie się do zmiennych wielokrotnie przykrytych nie jest możliwe.
### Operacje arytmetyczne
Dostępne jest dodawanie “+”, odejmowanie “-”, mnożenie “*”, dzielenie “/” oraz potęgowanie “**”. Możliwe jest wykonanie operacji pomiędzy doublem a intem, a wynik zostanie automatycznie zkonwertowany na double. Dostępny jest również operator unarny “-”.
### Operacje logiczne
Między typami logicznymi dostępne są dwie operacje logiczne and “and” oraz or “or”. Dostępne są również operacje porównawcze: <, >, <=, >=, ==.
Dostępny jest również operator unarny not “!”.
### Bloki
Bloki zamiast nawiasów są ograniczane zdaniami “then” oraz “end”. Każde otwarcie bloku oznacza dodanie nowego zasięgu (scope). Wewnątrz bloków naturalnie dostępne są wszystkie zmienne i funkcje z bloków starszych ale nie młodszych. W przypadku przykrycia zmiennej można się do niej odnieść operatorem “outer”. Bloki mogą być zagnieżdżane w sobie. Blok nie może stać w samotności (bez for, if itp.).
### Funkcje
Podczas deklaracji funkcji musi zostać określony jej typ zwrotu, który musi być oddzielony od nazwy takim samym operatorem jak w przypadku zmiennych np. int::foo(). Nazwa funkcji nie może być taka sama jak nazwa zmiennej. Return pozwala zwrócić wywołaniu funkcji wartość, aczkolwiek nie przerywa działania funkcji. Możliwe jest rekurencyjne wywoływanie funkcji.
### Pętle oraz if else
Dostępne pętle for, while, if. While oraz if wymagają aby znajdujące się w nich wyrażenia miały wartość boolowską. W For możliwa jest zarówno deklaracja zmiennej iterującej jak i użycie istniejącej zmiennej. Break nie jest zaimplementowany.
### Komentarze
Dostępne wersja jednolinijkowa “//” oraz wielolinijkowa (otwarcie “/*”, zamknięcie “*/”).
### Print
Dostępny print (samo wyświetlenie) oraz println (wyświetlenie oraz znak nowej linijki).

### Uruchomienie
aplikacja przechowywana jest jako .jar. Można ją uruchomić komenda

    java -jar <nazwa jara> <argument tu plik wejściowy z kodem>