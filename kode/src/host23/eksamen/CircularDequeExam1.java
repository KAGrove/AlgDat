package host23.eksamen;

import java.util.Deque;

public class CircularDequeExam1 {
    int begin; //< Starten av køen
    int end; //< slutten av køen
    int capacity; //< maksimal størrelse på køen
    int size; //< antall elementer i køen så langt
    char[] values;
    CircularDequeExam1(int capacity) {
        this.begin = 0;
        this.end = 0;
        this.capacity = capacity;
        this.size = 0;
        this.values = new char[capacity];
    }
    void pushBack(char value) {
        if(size == capacity){
            throw new ArrayIndexOutOfBoundsException("Køen er full!");
        }
        values[end] = value;
        end = (end+1) % capacity;
        size++;
    }
    void pushFront(char value) {
        if(size == capacity){
            throw new ArrayIndexOutOfBoundsException("Køen er full!");
        }
        values[begin] = value;
        begin = (begin-1) % capacity;
        size++;
    }
    char popFront() {
        /**
         * Denne må du implementere
         */
        throw new UnsupportedOperationException("Not implemented");
    }
    char popBack() {
        /**
         * Denne må du implementere
         */
        throw new UnsupportedOperationException("Not implemented");
    }
}
