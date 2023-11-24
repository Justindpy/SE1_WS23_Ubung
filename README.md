# SE1_WS23_Ubung5

## Aufgabe 5-2

a)
<br>
Vorher:
**Als Student möchte ich mich auf Projektausschreibungen bewerben sowie nach diesen
suchen**
<br>
*Ist hier das Kriterium („S“)-mall aus den INVEST-Merkmale vollständig adressiert worden?* 
<br>
Nein, da die User Story zwei von einander unabhängige Anforderungen hat. 
Deshalb haben wir die User Story in zwei verschiedene aufgeteilt: 
<br>
1. **Als Student möchte ich mich auf auf Projektausschreibungen bewerben.**
2. **Als Student möchte ich mich nach Projektausschreibungen suchen.**
<br>
Akzeptanztest für erste User Story:
<br>
<ul><li> pdf Upload für Bewerbungsschreiben und Lebenslauf </li>
<li> Daten werden aus dem Studentenkonto gezogen und übermittelt </li> </ul>
Akzeptanztest für zweite User Story:
<br>
<ul><li>Suche ohne Filter, um alle Projektausschreibungen zu sehen</li>
<li>Filter über Schlagwörter</li>
<li>Sortieren (Alphabet, Datum, Gehalt, Dauer)</li> </ul>

b)
siehe erweitertes UML-UseCase Diagramm.

c)
### Textueller Use Case
Name des Systems: **Coll@HBRS**
<br>
Name des Use Case: **Als Student möchte ich mich nach Projektausschreibungen suchen.**
<br>
Teilnehmende Akteure: **Student**
<br>
Ereignisfluss: 
1. Student ist auf der Seite der Projektausschreibung
2. Student klickt auf "Jetzt bewerben!"
3. Student bekommt die Möglichkeit aus zwei Optionen zu wählen:
   <ul><li> Bewerbungsschreiben und Lebenslauf als PDF hochladen </li>
    <li> Daten werden aus ihrem Profil übernommen </li> </ul>
Vorbedingung: **Student hat ein gültiges Profil, ist eingeloggt und es gibt ein Projekt.***
<br>
Nachbedingung: **Student hat sich beworben und das Unternehmen wurde benachrichtigt.**
<br>
Qualitätsanforderung: **Das Unternehmen soll nach der Bewerbung innerhalb von einer Minute benachrichtigt werden.**

### Test Case
siehe Excel Datei
