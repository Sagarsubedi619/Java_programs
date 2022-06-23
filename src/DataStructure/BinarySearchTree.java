package DataStructure;

public class BinarySearchTree {
    TreeNode rootNode;

    public TreeNode find(int data){
        if(this.rootNode!=null){
            return rootNode.find(data);
        }
        else {
            return null;
        }
       }
    public void insert(int data){
        if(this.rootNode==null){
            this.rootNode=new TreeNode(data);
        }
        else{
            rootNode.insert(data);
        }
    }
}
