package trash;


public class LinkedNode<T> {
    private LinkedNode<T> previous, next;
    private T data;

    public LinkedNode(LinkedNode<T> previous, T data, LinkedNode<T> next){
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public LinkedNode<T> getNext(){
        return this.next;
    }
    public LinkedNode<T> getPrevious(){
        return this.previous;
    }
    public void setNext(LinkedNode<T> next){
        this.next = next;
    }
    public void setPrevious(LinkedNode<T> previous){
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "LinkedNode{" +
                "previous=" + previous +
                ", next=" + next +
                ", data=" + data +
                "} \n";
    }
}
