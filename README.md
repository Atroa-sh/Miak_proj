# Metody i algorytmy kompilacji
Filip Tłuszcz
Kacper Piastowicz

## Opis gramatyki
### Ogólne
Gramatyka w dużej mierze przypomina tą z języka C. Pojedyncze zdania muszą być zakończone średnikiem. Tabulatory jak i znaki puste nie mają znaczenia, ponieważ są domyślnie pomijane.
### Zmienne
Język jest silnie typowany. Dostępne są następujące typy: int, double, bool. Z tego też powodu wymagana jest deklaracja zmiennej przed odwołaniem się do niej.  Między deklaracją zmiennej a jej typem powinien znajdować się separator “::” np. int::count = 0;. Do funkcji zmienne przekazywane są jako kopie. W przypadku gdy w bloku wyższym np. funkcji zadeklarowana zostanie zmienna o takiej samej nazwie jak w bloku niższym, niższa zmienna zostanie przykryta. Do ostatnio przykrytej zmiennej o danej nazwie można się odnosić za pomocą operatora “outer” np. outer i = 5;. Nazwa zmiennej nie może być taka sama jak nazwa funkcji. Odniesienie się do zmiennych wielokrotnie przykrytych nie jest możliwe.

    int::a = 2;
    double::b = 2.;
    bool::c = true;

### Operacje arytmetyczne
Dostępne jest dodawanie “+”, odejmowanie “-”, mnożenie “\*”, dzielenie “/” oraz potęgowanie “\*\*”. Możliwe jest wykonanie operacji pomiędzy doublem a intem, a wynik zostanie automatycznie zkonwertowany na double. Dostępny jest również operator unarny “-”.

    int::a = 1+2-3*4/5**6;

### Operacje logiczne
Między typami logicznymi dostępne są dwie operacje logiczne and “and” oraz or “or”. Dostępne są również operacje porównawcze: <, >, <=, >=, ==.
Dostępny jest również operator unarny not “!”.

    bool::b = (true or false) and true == true;

### Bloki
Bloki zamiast nawiasów są ograniczane zdaniami “then” oraz “end”. Każde otwarcie bloku oznacza dodanie nowego zasięgu (scope). Wewnątrz bloków naturalnie dostępne są wszystkie zmienne i funkcje z bloków starszych ale nie młodszych. W przypadku przykrycia zmiennej można się do niej odnieść operatorem “outer”. Bloki mogą być zagnieżdżane w sobie. Blok nie może stać w samotności (bez for, if itp.).

    int::a = 2;
    
    if(1 == 1) then
        int::a=1; // a przykrywa 'zewnętrzne' a
        println a;
        println outer a; // odwołanie do a z poprzedniego scope'u
    end

    println a; // a z tego scope'u

### Funkcje
Podczas deklaracji funkcji musi zostać określony jej typ zwrotu, który musi być oddzielony od nazwy takim samym operatorem jak w przypadku zmiennych np. int::foo(). Nazwa funkcji nie może być taka sama jak nazwa zmiennej. Return pozwala zwrócić wywołaniu funkcji wartość, aczkolwiek nie przerywa działania funkcji. Możliwe jest rekurencyjne wywoływanie funkcji.

    int::foo(int::a, int::b, bool:c) then
        if(c) then
            return a;
        end else then
            return b;
        end
    end

### Pętle oraz if else
Dostępne pętle for, while, if. While oraz if wymagają aby znajdujące się w nich wyrażenia miały wartość boolowską. W For możliwa jest zarówno deklaracja zmiennej iterującej jak i użycie istniejącej zmiennej. Break nie jest zaimplementowany.

    if(1 == 1) then
        for(int::i=0; i<10; i=i+1) then
            println i;
        end
        println 1==1;
    end else then
        println 1 != 1;
    end

### Komentarze
Dostępne wersja jednolinijkowa “//” oraz wielolinijkowa (otwarcie “/\*”, zamknięcie “\*/”).

    println 1; // to jest komentarz i jest pomijany przez parser 

### Print
Dostępny print (samo wyświetlenie) oraz println (wyświetlenie oraz znak nowej linijki).

    print 1; // wypisuje napis "1"
    println 1; // wypisuje napis "1\n"

### Funkcje wbudowane
#### Tworzenie sceny
Odpowiada za tworzenie sceny, ograniczonej rozmiarami podanymi jako argumenty funkcji.

    createScene(width, height);

#### Tworzenie prostopadłościanu
Odpowiada za tworzenie pudełka, na pozycji (x,y,z) podanej jako trzy pierwsze argumenty ograniczonego rozmiarami (width,height,legth), w kolorach (r,g,b).

    createBox(x,y,z, width,height,legth, r,g,b);

#### Budowanie sceny
Stworzenie końcowego dokumentu <i>HTML</i>

    buildScene();

### Uruchomienie
aplikacja przechowywana jest jako .jar. Można ją uruchomić komenda

    java -jar <nazwa jara> <argument tu plik wejściowy z kodem>