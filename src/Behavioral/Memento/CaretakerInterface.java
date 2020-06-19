/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Memento;

import java.io.IOException;

public interface CaretakerInterface {
    public MementoInterface undo() throws IOException;

    public void save(MementoInterface memento) throws IOException, Exception;
}
