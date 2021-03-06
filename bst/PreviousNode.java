package main;

public class PreviousNode {
    public static Node prev(Node curr, int x) {

        if (curr == null || curr.isList) {
            return null;
        }

        if (curr.key >= x) {

            return prev(curr.left, x);
        } else {

            if (curr.right != null && !curr.right.isList) {

                if (checkRightSon(curr, x)) {

                    return prev(curr.right, x);
                } else {

                    return thisNode(curr, x);
                }
            } else {

                return thisNode(curr, x);
            }
        }
    }

    private static Node thisNode(Node curr, int x) {

        if (curr.key != x) {

            return curr;
        } else {

            return null;
        }
    }

    public static boolean checkRightSon(Node curr, int x) {
        return curr.right.minInTree().key < x;
    }
}
