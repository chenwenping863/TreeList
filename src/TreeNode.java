import java.util.Random;

/**
 * Created by chenwenping on 17/3/5.
 */
public class TreeNode {

    public static void main(String arg[]) {
        System.out.print("hello");
        System.out.print("\n");
        int[] data = new int[20];

        for (int i = 0 ;i < data.length; i++) {
           // data[i] = ((int) Math.random()*100) + 1;
            data[i] = new Random().nextInt(10) + 1;
            System.out.print(data[i] + ",");
         }

        Node node = new Node();
        node.value = data[0];
        System.out.print("store" + "\n");
        for (int i = 0; i < data.length; i++) {
           node.store(data[i]);
        }

        System.out.print(String.valueOf(node.find(data[19])));
        System.out.print("\n" + "preList");
      //  node.preList();

        System.out.print("\n" + "moddleList");
        node.moddleList();

        System.out.print("\n" + "afterList");
        node.afterList();
    }
}
