package org.example.records;

import org.junit.jupiter.api.Test;

public class Records {
    @Test
    public void recordsExample() {
        Person person1 = new Person("Kami", 32);
        PersonRecords person2 = new PersonRecords("Kami", 32);

        System.out.println(person1.getAge());
        System.out.println(person2.age());
    }
}
