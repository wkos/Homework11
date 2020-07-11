package pl.wkos.homework112;

import java.util.Arrays;

public class NamesHolder {
    private String[] names;
    private int currentEmptyIndex;

    public NamesHolder(int size) {
        this.names = new String[size];
        currentEmptyIndex = 0;
    }

    public void add(String name) {
        if (name == null)
            throw new NullPointerException("Nie podałęś nazwy");
        if (currentEmptyIndex >= names.length)
            throw new IndexOutOfBoundsException("Brak miejsca");
        for (int i = 0; i < currentEmptyIndex; i++)
            if (names[i] == name) {
                throw new IllegalArgumentException("Ta nazwa już jest");
            }
        names[currentEmptyIndex++] = name;
    }

    public void remove(String name) {
        if (name == null)
            throw new NullPointerException("Nie podałeś nazwy");
        int i = 0;
        while (i < currentEmptyIndex && names[i] != name) i++;
        if (i < currentEmptyIndex) {
            while (i < currentEmptyIndex - 1) names[i] = names[++i];
            currentEmptyIndex--;
            names[currentEmptyIndex] = null;
        } else
            throw new IllegalArgumentException("Nie ma takiej nazwy");
    }

    public int size() {
        return currentEmptyIndex;
    }

    public boolean contains(String name) {
        if (name == null)
            throw new IllegalArgumentException("Nie podałęś nazwy");
        for (String item : names)
            if (item == name) return true;
        return false;
    }

    @Override
    public String toString() {
        return "NamesHolder{" +
                "names=" + Arrays.toString(names) +
                ", currentEmptyIndex=" + currentEmptyIndex +
                ", size=" + size() +
                '}';
    }
}
