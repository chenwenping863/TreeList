/**
 * Created by chenwenping on 17/3/5.
 */
public class Node {

    /**
     *
     */
    public int value;
    /**
     *
     */
    public Node left;
    /**
     *
     */
    public Node right;

    /**
     * @param value
     */
    public void store(int value) {
       // System.out.print("\n" + "store");
        System.out.print(" ");
        System.out.print(value + ",");
        if (value < this.value) {
            if (this.left == null) {
                this.left = new Node();
                this.left.value = value;
            } else {
                this.left.store(value);
            }
        } else if (value > this.value) {
            if (this.right == null) {
                this.right = new Node();
                this.right.value = value;
            } else {
                this.right.store(value);
            }
        }
    }

    /**
     * @param value
     * @return
     */
    public boolean find(int value) {
        if (value == this.value) {
            return true;
        } else if (value > this.value) {
            if (this.right == null) {
                return false;
            } else {
                return this.right.find(value);
            }
        } else {
            if (this.left == null) {
                return false;
            } else {
                return this.left.find(value);
            }
        }
    }

    /**
     *
     */
    public void preList() {
        System.out.print(this.value + ",");

        if (this.left == null) {
            this.left.preList();

        }

        if (this.right == null) {
            right.preList();
        }
    }

    /**
     *
     */
    public void moddleList() {
        if (left != null) {
            left.preList();
        }

        System.out.print(this.value + ",");

        if (right != null) {
            right.preList();
        }
    }

    /**
     *
     */
    public void afterList() {
        if (left != null) {
            left.preList();

        }
        if (right != null) {
            right.preList();

        }

        System.out.print(this.value + ",");
    }


}
