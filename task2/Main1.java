package task2;

// Задача 2.
// Есть два самодельных класса коллекций:

// ImmutableList<T> — коллекция, 
// которая никогда ни при каких обстоятельствах не меняется. 
// Методы:
// getSize ()
// get (int i)

// - MutableList<T> — коллекция, 
// которая допускает изменения. 
// Методы:
// getSize ()
// get (int i)
// set (int i, T newValue)
// add (T newValue)
// remove (T value)

// Реализуйте такую схему наследования между двумя этими классами, 
// которая будет соответствовать принципу подстановки Лисков.

public class Main1 {
    public static void main(String[] args) {
        ImmutableList immutableList = new ImmutableList();
        immutableList.spisok();
        immutableList.getInt(3);
        immutableList.getSize();
        System.out.println("--------------------");
        MutableList<Double> mutableList = new MutableList<>();
        mutableList.addInList(3.0);
        mutableList.addInList(3.2);
        mutableList.addInList(1.1);
        mutableList.addInList(7.4);
        mutableList.addInList(8.9);
        mutableList.addInList(5.6);
        mutableList.spisok();
        mutableList.getInt(3);
        mutableList.removeInList(4.0);
        mutableList.getSize();
        mutableList.spisok();
    }
}
