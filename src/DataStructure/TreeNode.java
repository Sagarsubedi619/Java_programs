package DataStructure;

public class TreeNode {

    public TreeNode(int data){
        this.data=data;
    }
    int data;

    public TreeNode find(int data){
        if(this.data==data){
            return this;
        }
        if(data<this.data && leftChild!=null){
            this.leftChild.find(data);
        }
        if(rightChild!=null){

            this.rightChild.find(data);
        }
        return null;
    }

    public void insert(int data){
        if(data<=this.data){
            if(this.leftChild==null){
                leftChild=new TreeNode(data);
            }
            else{
                this.leftChild.insert(data);
            }
        }
        if(data>=this.data){
            if(this.rightChild==null){
                rightChild=new TreeNode(data);

            }
            else{
                this.rightChild.insert(data);
            }
        }
    }

    public int getData() {
        return data;
    }

    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }


}
