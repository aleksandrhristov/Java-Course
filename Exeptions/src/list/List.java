package list;

/**
 * Created by clouway on 15.04.16.
 */
public class List {
    private Object[] list;
    private int lenght;
    private int iterator = 0;

    /**
     * constructor for the list with 1 parameter
     *
     * @param lenght
     */
    public List(int lenght) {
        this.lenght = lenght;
        list = new Object[lenght];
    }

    /**
     * adding new item to the list;
     *
     * @param obj
     */
    public void add(Object obj) {
        if (iterator < lenght) {
            list[iterator] = obj;
            iterator++;
        } else {
            try {
                throw new FullListException();
            } catch (FullListException e) {
                e.printStackTrace();
            }
        }
    }

    public String printAllElements() {
        String str = "";
        for (int i = 0; i < lenght; i++) {
            str += list[i] + " ";
        }
        return str;
    }

    public void remove(Object obj) {
        int i = 0;
        if (list[i] != null) {
            while (i < lenght) {
                if (list[i] == null) {
                    while (i < lenght) {
                        if (i + 1 < lenght) {
                            list[i] = list[i + 1];
                            i++;
                        } else if (i + 1 == lenght) {
                            list[i] = null;
                            i++;
                        } else {
                            i++;
                        }
                    }
                }
                if (list[i] == obj) list[i] = null;
                if (i > 0 || i == lenght) i--;
                i++;
            }
        }
    }
}
