package model.structures;

public interface IHashTable<K, V> {
    void put(K key, V value);
    void remove(K key);
    boolean isEmpty();
    int hash(K key);
    V get(K key);
    int size();
}
