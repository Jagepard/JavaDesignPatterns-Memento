/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Memento;

public interface CaretakerInterface {
    public MementoInterface undo();

    public void save(MementoInterface memento);
}
