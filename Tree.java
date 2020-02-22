public class Tree<Item>{
    private class Node{
        Item key;
        Node up;
        Node next;
        Node previous;
        Node firstDown;
        public Node(Node UP,Node PREVIOUS,Item KEY){
            up = UP;
            key = KEY;
            previous = PREVIOUS;
        }
    }
    Node current = new Node(null,null,null);
    public Tree(){
    }
    
    public void isEmpty(){
        Node temp = current;
        moveToAnchor();
        boolean empty = (current.next == null && current.firstDown == null && current.key == null);
        current = temp;
    }

    public void addBranch(Item key){
       current.firstDown = new Node(current,null,key);
       current = current.firstDown;
    }
    public void addLeaf(Item key){
        current.next = new Node(current.up,current,key);
        current = current.next;
    }
    public void moveUp(){
        if(current.up != null){
            current = current.up;
        }
    }
    public void moveDown(){
        if(current.firstDown != null){
            current = current.firstDown;
        }
    }

    public void moveNext(){
        if(current.next != null){
            current = current.next;
        }
    }

    public void movePrevious(){
        if(current.previous != null){
            current = current.previous;
        }
    }

    public void moveToBranchAnchor(){
        while(current.previous != null){
            current = current.previous;
        }
    }

    public void moveToAnchor(){
        while(current.up != null){
            current = current.up;
        }
        while(current.previous != null){
            current = current.previous;
        }
    }
    
    public boolean canMoveUp(){
        return (current.up != null);
    }

    public boolean canMoveDown(){
        return (current.firstDown != null);
    }

    public boolean canMoveNext(){
        return (current.next != null);
    }

    public boolean canMovePrevious(){
        return (current.previous != null);
    }

    public Item returnKey(){
        return current.key;
    }

    public void setKey(Item key){
        current.key = key;
    }
    
    public void removeNext(){
        if(current.next != null){
            current.next = current.next.next;
        }
    }

    public void removeAllNext(){
        current.next = null;
    }

    public void removePrevious(){
        if(current.previous != null){
            if(current.previous.previous == null){
                current.previous = null;
                current.up.firstDown = current;
            } else {
                current.previous.previous.next = current;
                current.previous = current.previous.previous;
            }
        }
    }
    
    public void removeBranch(){
         current.firstDown = null;
    }
}
