package model.structures.impl;

import model.structures.IHashTable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    private int tableSize = 5;
    private HashTable hashTable;

    @BeforeEach
    void init() {
        hashTable = new HashTable<>(tableSize);
    }

    @Test
    void put1() {
        //Initialize
        int num = 2;
        int num2 = 4 / 2;

        //Act
        hashTable.put(num, "hey");

        //Assert
        assertEquals(1, hashTable.size());
    }

    @Test
    void put2() {
        //Initialize
        int num = 2;
        int num2 = 3;
        //Act
        hashTable.put(num, "hey");
        hashTable.put(num2, num2);

        assertEquals(2, hashTable.size());
    }

    @Test
    void put3() {
        //Initialize
        int num = 2;
        int num2 = 10;
        int num3 = 50;
        //Act
        hashTable.put(num, num2);
        hashTable.put(num3, num);
        //Assert
        assertEquals(2, hashTable.size());
    }

    @Test
    void remove1() {
        //Initialize
        int num = 2;
        int num2 = 10;
        int num3 = 50;
        //Act
        hashTable.put(num, "hey");
        hashTable.remove(num);
        hashTable.put(num, num2);
        hashTable.remove(num);
        hashTable.put(num3, "whatsup");
        hashTable.remove(num3);
        //Assert
        assertTrue(hashTable.isEmpty());
    }

    @Test
    void remove2() {
        //Initialize
        int num = 2;
        int num2 = 10;
        int num3 = 50;
        //Act
        hashTable.put(num, "hey");
        hashTable.remove(num);
        hashTable.put(num, num2);
        hashTable.remove(num);
        hashTable.put(num3, "whatsup");
        //Assert
        assertEquals(1, hashTable.size());
    }

    @Test
    void remove3() {
        //Initialize
        int num = 2;
        int num2 = 10;
        int num3 = 50;
        //Act
        hashTable.put(num, "hey");
        hashTable.remove(num);
        hashTable.put(num, num2);
        hashTable.remove(num);
        hashTable.put(num3, "whatsup");
        hashTable.remove(num3);
        hashTable.put(num, "Sup");
        hashTable.put(num, "Sup man");
        //Assert
        assertEquals(1, hashTable.size());
    }

    @Test
    void isEmpty1() {
        //Initialize
        int num = 30;
        int num2 = 3;
        int num3 = 100;
        //Act
        hashTable.put(num, num3);
        hashTable.remove(num);
        hashTable.put(num2, num2);
        hashTable.remove(num2);
        hashTable.put(num3, "whatsup");
        hashTable.remove(num3);
        hashTable.put(num, "Sup");
        hashTable.put(num3, "Sup man");
        //Assert
        assertEquals(2, hashTable.size());
    }

    @Test
    void isEmpty2() {
        //Initialize
        int num = 30;
        int num2 = 3;
        int num3 = 100;
        //Act
        hashTable.put(num, num3);
        hashTable.remove(num);
        hashTable.put(num2, num2);
        hashTable.remove(num2);
        hashTable.put(num3, "whatsup");
        hashTable.remove(num3);
        hashTable.put(num, "Sup");
        hashTable.put(num3, "Sup man");
        hashTable.put(num3, "go for it");
        hashTable.put(num3, "haa");
        hashTable.put(num2, "hey");
        hashTable.remove(num2);


        //Assert
        assertEquals(2, hashTable.size());
    }

    @Test
    void isEmpty3() {
        //Initialize
        int num = 30;
        int num2 = 3;
        int num3 = 100;
        //Act
        hashTable.put(num, num3);
        hashTable.remove(num);
        hashTable.put(num2, num2);
        hashTable.remove(num2);
        hashTable.put(num3, "whatsup");
        hashTable.remove(num3);
        hashTable.put(num, "Sup");
        hashTable.put(num3, "Sup man");
        hashTable.put(num3, "go for it");
        hashTable.put(num3, "haa");
        hashTable.put(num2, "hey");
        hashTable.remove(num2);
        hashTable.put(num3, "buddy");

        //Assert
        assertEquals(2, hashTable.size());
    }

}