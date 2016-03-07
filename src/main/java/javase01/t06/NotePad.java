package javase01.t06;

/**
 * Class NotePad based on structure FIFO
 */
public class NotePad {

    private Note[] notes;
    private int size;
    private int index;

    /**
     * Created notepad fixed capability
     * @param cap capability
     */
    public NotePad(int cap) {
        this.notes = new Note[cap];
        for (int i = 0; i < cap; i++) {
            notes[i] = new Note();
        }
        this.size = cap;
        this.index = 0;
    }

    /**
     * add in tail
     * @param text note
     */
    public void add(String text) {
        if (size == index) throw new ArrayIndexOutOfBoundsException("Out of space");
        notes[index++].setItem(text);
    }

    /**
     * remove last
     */
    public void remove() {
        if (index == 0) throw new NullPointerException("Notepad is empty");
        notes[--index].setItem("");

    }


    public void showAll() {
        for (Note e : notes) {
            if (!e.getItem().equals(""))
                System.out.println(e.getItem());
        }
    }

    /**
     *
     * @param i index
     * @param text note
     */
    public void edit(int i, String text) {
        if (notes[i] == null) throw new NullPointerException("Such a record does not exist");
        notes[i].setItem(text);
    }

}
