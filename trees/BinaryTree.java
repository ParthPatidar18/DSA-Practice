package trees;
import java.util.*;
public class BinaryTree {

public static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
} 
static int idx=-1;
public  Node buildTrees(int nodes[]){
    idx++;
      if(nodes[idx]==-1){
        return null;

      }
      Node newNode=new Node(nodes[idx]);
      newNode.left=buildTrees(nodes);
      newNode.right=buildTrees(nodes);


    return newNode;
}
public static void  preoreder( Node root){
    if(root==null){
        return;
    }
System.out.print(root.data+" ");
preoreder(root.left);
preoreder(root.right);

}

public static void  inoreder( Node root){
    if(root==null){
        return;
    }
    inoreder(root.left);
System.out.print(root.data+" ");

inoreder(root.right);

}

public static void  postoreder( Node root){
    if(root==null){
        return;
    }

postoreder(root.left);
postoreder(root.right);
System.out.print(root.data+" ");

}

public static void levelOrder(Node root){
    if(root==null){
        return;
    }
Queue<Node> q= new LinkedList<>();
q.add(root);
q.add(null);
while(!q.isEmpty()){
    Node currNode=q.remove();
    if(currNode==null){
        System.out.println();
        if(q.isEmpty()){
            break;
        }else{
            q.add(null);
        }
    }else{
           System.out.print(currNode.data+" ");
           if(currNode.left!=null){
            q.add(currNode.left);
           }
           if(currNode.right !=null){
            q.add(currNode.right);
           }
    }
}
}
public static int countOfNodes(Node root){
    if(root==null){
        return 0;
    }
    int leftNodes=countOfNodes(root.left);
    int rightNodes=countOfNodes(root.right);
    return leftNodes+rightNodes+1;
}

public static int sumOfNodes(Node root){
    if(root==null){
        return 0;
    }
    int leftSum=sumOfNodes(root.left);
    int rightSum=sumOfNodes(root.right);
    return leftSum+rightSum+root.data;
}
public static int height(Node root){
    if(root==null){
        return 0;
    }
    int leftheight=height(root.left);
    int rightHeight=height(root.right);
    int maxheight=Math.max(leftheight, rightHeight)+1;
    return maxheight;
}
public static int diameter(Node root){
     if(root==null){
        return 0;
     }
    int dia1=diameter(root.left);
    int dia2=diameter(root.right);
    int dia3=height(root.left)+height(root.right)+1;


    return Math.max(dia3,Math.max(dia2, dia1));
}
static class TreeInfo{
    int ht;
    int diam;
    TreeInfo(int ht,int diam){
        this.diam=diam;
        this.ht=ht;
    }
}
public static TreeInfo diameter2(Node root){
    
    if(root==null){
        return new TreeInfo(0,0);
    }
    TreeInfo left=diameter2(root.left);
    TreeInfo right=diameter2(root.right);

    int myHeight=Math.max(left.ht, right.ht)+1;

    int dia1=left.diam;
    int dia2=right.diam;
    int dia3=left.ht+right.ht+1;
    int myDiam=Math.max(Math.max(dia2, dia1),dia3);

    TreeInfo myInfo=new TreeInfo(myHeight, myDiam);
    return myInfo;
}
    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=tree.buildTrees(nodes);
        System.out.println("preoreder->");
        preoreder(root);
        System.out.println();
        System.out.println("inoreder->");
        inoreder(root);
        System.out.println();
        System.out.println("postoreder->");
        postoreder(root);
        System.out.println();
        System.out.println("levelOrder->");
        levelOrder(root);
        System.out.println();
        System.out.println("countOfNodes->"+countOfNodes(root));
        System.out.println("sumOfNodes->"+sumOfNodes(root));
        System.out.println("height->"+height(root));
        
        System.out.println("diameter->"+diameter(root));
        System.out.println("diameter->"+diameter2(root).diam);


        
        
    }
}
