package forelesninger;

public class F8_CircularBuffer {

    int size;
    char[] values;

    int head;
    int tail;
    int count;

    F8_CircularBuffer(int size){        // Konstruktør
        this.size = size;
        this.values = new char[size];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    // FIFO: Må kunne legge inn på slutten
    public void pushBack(char value){
        if (count+1 > size){
            throw new IndexOutOfBoundsException();
        }
        values[tail] = value;
        tail = (tail+1)%size;
        count++;
    }

    public char popFront(){
        if (count<=0){
            throw new IndexOutOfBoundsException();
        }
        char out = values[head];
        head = (head+1)%size;
        count--;
        return out;
    }

    public void print(){

        // [A B C D tomt tomt tomt]
        // h         t
        System.out.println();
        System.out.println(values);
        for (int i = 0; i < size; i++){
            if (i==head) System.out.print("h");
            else if (i==tail) System.out.print("t");
            else System.out.print(" ");
        }

    }

    public static void main(String[] args) {
        F8_CircularBuffer buffer = new F8_CircularBuffer(28);
        buffer.print();
        char[] c = "ALGORITMER OG DATASTRUKTURER".toCharArray();
        for (char ci : c){
            buffer.pushBack(ci);
            buffer.print();
        }

        while (buffer.count > 0){
            buffer.popFront();
            buffer.print();
        }
    }
}
