package org.example.meaningful_null_pointer_exeptions;

import org.junit.jupiter.api.Test;

public class NPEExample {

    @Test
    public void npeExample() {
        class PersonClass {
            final String name;
            final int age;

            PersonClass(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        PersonClass person = new PersonClass("Mikami", 31);
        System.out.println(person.name.toLowerCase());

        PersonClass person3 = null;
        System.out.println(person3.name.toLowerCase());

    }
}
