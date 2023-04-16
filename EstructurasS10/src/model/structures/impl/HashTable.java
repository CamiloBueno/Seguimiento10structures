package model.structures.impl;

import model.structures.HashNode;
import model.structures.IHashTable;

import java.util.Objects;

public class HashTable<K, V> implements IHashTable<K, V> {
    private final HashNode<K, V>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        table = (HashNode<K, V>[]) new HashNode<?, ?>[capacity];
        size = 0;
    }

    @Override
    public void put(K key, V value) {
        int i = hash(key);
        HashNode<K, V> node = new HashNode<>(key, value);
        HashNode<K, V> head = table[i];
        while (head != null) {
            if (head.getKey() == key) {
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }
        node.setNext(table[i]);
        table[i] = node;
        size++;
    }

    @Override
    public void remove(K key) {
        int i = hash(key);
        HashNode<K, V> prev = null;
        HashNode<K, V> head = table[i];
        while (head != null) {
            if (head.getKey() == key) {
                if (prev == null)
                    table[i] = head.getNext();
                else
                    prev.setNext(head.getNext());
                size--;
                return;
            }
            prev = head;
            head = head.getNext();
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int hash(K key) {
        return Math.abs(Objects.hashCode(key)) % table.length;
    }

    @Override
    public V get(K key) {
        int i = hash(key);
        HashNode<K, V> head = table[i];
        while (head != null) {
            if (head.getNext() == key)
                return head.getValue();
            head = head.getNext();
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
