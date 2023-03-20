import java.util.*;

// Учитывая двоичного дерева, верните порядок обхода значений его узлов.
// пример
// Input: root = [1,null,2,3]
// Output: [1,2,3]

public class Main {
    public static void main(String[] args) {
        task();
    }

    private static void task() {
        TreeNode tNode = new TreeNode(1,null, new TreeNode(2,null,new TreeNode(3)));
        System.out.println(preorderTraversal(tNode));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            list.add(root.val);
            list.addAll(preorderTraversal(root.left));
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }
}
