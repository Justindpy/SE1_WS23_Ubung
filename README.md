# SE1_WS23_Ubung1

## Aufgabe 1-1

*Wie kann diese Kommunikationsverbindung nun dennoch mit Hilfe einer zusätzlichen Klasse, 
welche die dazu notwendige Objekt-Erzeugung übernimmt, aufgebaut werden? In welchem 
Package sollte diese zusätzliche Klasse liegen? Bitte beachten Sie dabei auch die Hinweise 
bzw. Anforderungen aus den Kommentaren der Klassen, Methoden und des Interfaces.*

Mit einer ausgelagerten Factory Klasse. Die Klasse sollte im Control Package liegen, da der 
Sinn einer Factory Klasse es ist Objekte zu kreieren. In unserem Fall soll man einen 
GermanTranslator instanzieren, welcher im Control Package liegt.

<br>
<br>

*Welches Entwurfsmuster (engl.: design pattern) könnte für die Problematik der ObjektErzeugung verwendet werden? Was ist der software-technische Nutzen bei der Verwendung 
des Entwurfsmusters? Gratistipp: Hinweise für das korrekte Pattern finden sie bei unten 
angegeben Video-Tutorien ;-)*
Factory Desing. Durch das Factory Design hat man eine strukturierte Entwicklung die man 
über ein ganzes Projekt lang verwendet kann. Zudem ist Wiederverwendbarkeit in zum 
Beispiel einer Kollaboration sehr einfach nachzustellen. 

<br>
<br>

*Wie muss man den Source Code des Interface ggf. anpassen, um mögliche auftretende 
Kompilierfehler zu beseitigen?*

Das Interface muss auf **public** gesetzt werden.

<br>
<br>

*Was ist der Vorteil einer separaten Test-Klasse?*

Man hat eine strikte Trennung des Anwendungscode und des Testcodes. Zusätzlich kann 
man den Soruce Code sowohl betrachten, als auch ausliefern, ohne den ganzen Testcode 
betrachten zu müssen.

<br>
<br>

*Was ist bei einem Blackbox-Test der Sinn von Äquivalenzklassen?*

Dass man eine möglichst breite Testabdeckung mit repräsentativen Werten erreicht.

<br>
<br>

*Warum ist ein Blackbox-Test mit JUnit auf der Klasse Client nicht unmittelbar durchführbar?*

Da die Methode display **nicht** public ist. Außerdem ist der Rückgabe Wert der Methode 
„void“, was es schwer macht, erwartete Werte abzugleichen


