package wildcard_extend_or_super;

import java.util.ArrayList;
import java.util.List;

public class TestingExtend {
    /**
     * In the case of List<? extends Animal>, the type of the list is a wildcard that represents an unknown specific subtype of Animal, or Animal itself. This means
     * that when you declare a List<? extends Animal>, you don't know the exact type of objects that can be stored in the list. It could be a list of Animal, Cat,
     * Dog, or any other subclass of Animal, but you can't be sure which one.
     *
     * Because of this unknown type, the compiler does not allow you to add elements to such a list, except for null. This is because if you were allowed to add elements,
     * you could potentially add an object of the wrong subtype, and it would violate the type safety of the collection. For example, if the list is actually a List<Cat>,
     * and you try to add a Dog to it, it would lead to runtime errors.
     *
     * On the other hand, you can read elements from the list because regardless of the actual subtype of the list, you know that all elements in the list are of
     * type Animal or its subtypes. So, you can safely read elements and treat them as animals.
     * @param list
     */
    public static void addingSubType(List<? super Animal> list){
        list.add(new Animal());
    }

    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        addingSubType(list);
        System.out.println(list);
    }
}
