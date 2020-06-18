/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Memento;

import java.util.LinkedList;

public class Caretaker implements CaretakerInterface {
    LinkedList<MementoInterface> history = new LinkedList<MementoInterface>();

    public MementoInterface undo() {
        return this.history.removeLast();
    }

    public void save(MementoInterface memento) {
        this.history.add(memento);
    }
}
