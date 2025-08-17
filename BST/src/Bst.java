public class Bst {

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    private Node root;


    public Bst(){
        this.root=null;
    }


    private Node insert(Node root ,int data){

    if(root==null){
        Node node= new Node(data);
        return node;
    }
    if (data < root.data) {
        root.left=insert(root.left,data);
    }
    else if (data > root.data){
        root.right=insert(root.right,data);
        }
    return root;
    }


    public void insert(int data){
        root=this.insert(root,data);
    }
    public Node findmin(Node root){
        while(root.left !=null){
            root=root.left;


        }
        return root;
    }


    private Node delete(Node root,int data){
       if(root==null){

           return null;

       }
        if (data<root.data){
            root.left=delete(root.left,data);
        }
        else if (data>root.data) {

            root.right=delete(root.right,data);}

            else{

                if(root.right==null&&root.left==null){
                    return null;
                }
                 if(root.left==null){
                    return root.right;

                }
                else if (root.right==null){
                    return root.left;
            }


                else {
                    Node successer=findmin(root.right);
                             root.data=successer.data;
                             root.right=delete(root.right, successer.data);
                 }


            }
        return root;
    }

    public void delete(int data){
        root=this.delete(root,data);
    }


        private boolean search(Node root, int data){

            if(root==null){
                return false;

            }
            if (root.data==data){
                return true;
            }



      return data < root.data?search(root.left,data):search(root.right,data);
        }
public boolean search(int data){
        return search(root,data);
}


    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + "\t");
        preOrder(node.left);
        preOrder(node.right);


    }
    //Inorder--> Left-->Root-->Right

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + "\t");
        inOrder(node.right);


    }

    //Post Order: Left-->Right-->Root
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "\t");
    }



}
