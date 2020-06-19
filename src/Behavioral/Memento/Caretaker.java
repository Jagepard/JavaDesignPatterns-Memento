/*
 * @author  : Jagepard <jagepard@yandex.ru>
 * @license https://mit-license.org/ MIT
 */

package Behavioral.Memento;

import java.io.*;
import java.util.LinkedList;

public class Caretaker implements CaretakerInterface {
    LinkedList<MementoInterface> history = new LinkedList<MementoInterface>();

    public MementoInterface undo() {
        return this.history.removeLast();
    }

    public void save(MementoInterface memento) throws Exception
    {
        //Serialization of object
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(memento);
        out.close();
        //De-serialization of object
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        this.history.add((MementoInterface) in.readObject());
        in.close();
    }
}
