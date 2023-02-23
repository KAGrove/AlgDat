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
        int pos = (begin-1+capacity) % capacity;

        values[pos] = value;
        begin = pos;
        size++;
    }
    char popFront() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Køen er tom!");
        }
        char fjerne = values[begin];
        values[begin] = ' ';    // Mellomrommet mellom ' ' er viktig, -> tom char.
        begin = (fjerne+1) % capacity;
        size--;
        return fjerne;
    }
    char popBack() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Køen er tom!");
        }
        end = (end-1+capacity) % capacity;
        char fjerne = values[end];
        size--;
        return fjerne;
    }
}

