package host23.eksamen;

public class BTNode {
    BTNode left_child;
    BTNode right_child;
    char value;

    /**
     * Konstruktør som lager en ny node
     *
     * @param value Verdien dene noden skal ha
     */
    BTNode(char value) {
        this.value = value;
    }

    /**
     * Legger til en ny verdi i det binære treet
     *
     * @param value Verdien å legge til
     */
    void add(char value) {
        if (value < this.value) {
            if (this.left_child != null) {
                this.left_child.add(value);
            } else {
                this.left_child = new BTNode(value);
            }
        } else {
            if (this.right_child != null) {
                this.right_child.add(value);
            } else {
                this.right_child = new BTNode(value);
            }
        }
    }

    /**
     * Skriver ut inorden ved hjelp av rekursjon
     */
    public void printInOrder() {
        printInOrder(this = this.left_child);
        System.out.println(this.value);
        printInOrder(this = this.right_child);
    }

    public static void main(String[] args) {
        BTNode root = new BTNode('F');
        char values[] = "CIADHJBEG".toCharArray();
        for (char val : values) {
            root.add(val);
        }
        root.printInOrder();
    }
}
