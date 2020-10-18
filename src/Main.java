import data_structure.BinaryNode;

public class Main {



    public static void main(String[] args) {
        BinaryNode rootNode = null;
        rootNode = insert(rootNode,10);
        rootNode = insert(rootNode,12);
        rootNode = insert(rootNode,9);

        System.out.println(search(rootNode,9));
    }


    public static boolean search(BinaryNode rootNode, int data) {
        if (rootNode==null) {
            return false;
        }
        if (rootNode.value ==data) {
            return true;
        } else if (data<rootNode.value){
           return search(rootNode.leftSubTree,data);
        } else {
            return search(rootNode.rightSubTree,data);
        }

    }

    public static BinaryNode insert(BinaryNode rootNode,int data) {
        if (rootNode == null) {
            rootNode = newNode(data);
            return rootNode;
        } else {
            if (data<=rootNode.value) {
                rootNode.leftSubTree = insert(rootNode.leftSubTree,data);
            } else {
                rootNode.rightSubTree = insert(rootNode.rightSubTree,data);
            }
        }
        return rootNode;
    }

    public static BinaryNode newNode(int data){
        BinaryNode node = new BinaryNode();
        node.value = data;
        node.leftSubTree = null;
        node.rightSubTree = null;
        return node;
    }
}
