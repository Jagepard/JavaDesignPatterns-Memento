/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Memento;

public class Memento implements MementoInterface{
    private final OriginatorInterface memento;

    public Memento(OriginatorInterface originator){
        this.memento = originator;
    }

    public OriginatorInterface getMemento() {
        return this.memento;
    }
}
