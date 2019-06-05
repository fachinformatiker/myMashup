# myMashup
Aufgabe 2. Semester - HS Bremen - Prog2 - Prof. Dr. Ing. Heiko Mosemann

---

### Task

Schreiben Sie ein Java-Programm (Konsole) welches folgende Eigenschaften hat:

● Einlesen von 3 Argumenten beim Programmstart, das erste Argument ist die Anzahl der Produzenten,
das zweite ist die Anzahl der Verbraucher, das dritte das 'sync' Argument (dazu später):
myMashup 20 21 7

● Zu jeder Zeit kann das Programm über die Eingabe der magischen Zahl 666 beendet werden.

● Direkt nach Programmstart wird für jeden gewünschten Produzenten ein Thread gestartet.
Achten Sie darauf wie Sie die Threads verwalten.

● Jeder Produzent produziert in seiner run() Methode ständig Instanzen von folgendem Objekt

class Candy
{
 private int hell;
 private String hope;
 private int producerID;
}

Die Attribute bekommen noch die entsprechenden Getter and Setter. Im Konstruktor von Candy
sollen die Attribute hell und hope mit Zufallszahlen [-9999..9999] und Zufallszeichenketten
mit einer Länge bis 20 Zeichen gefüllt werden, producerID ist klar.

● Die Instanzen von Candy werden in einem gemeinsamen Stack abgelegt.

● Nachdem alle Produzenten gestartet worden sind, werden die Verbraucher gestartet. Diese ziehen
in ihrer run() Methode ständig eine Candy-Instanz vom gemeinsamen Stack und geben den Zustand
der Attribute in der Konsole aus.

● Ist der Stack alle, gibt das Programm die Anzahl der insgesamt erzeugten CandyObjekte und die
Laufzeit aus und beendet sich kontrolliert.

Ist das Argument 'sync' beim Programmstart >0, dann sollen sich die Verbraucher und Produzenten
so synchronisieren, dass alle ungefähr gleich viel produzieren und verbrauchen und auf dem Stack
immer 'sync' Candy-Objekte liegen.
