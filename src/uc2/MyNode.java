package uc2;


public class MyNode <T> implements INode<T> {
	
	private T key;
	private INode<T> next;
	
	public MyNode(T key) {
		this.key = key;
		this.next = null;
	}

	@Override
	public T getKey() {
		
		return null;
	}

	@Override
	public void setKey(T key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public INode<T> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<T> next) {
		this.next = next;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyNode{key=").append(key).append("}");
		if (next != null) {
			builder.append("->").append(next);
		}
		return builder.toString();	}
	
	

}
