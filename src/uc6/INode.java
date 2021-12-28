package uc6;

public interface INode <T>{
	T getKey();
	void setKey(T key);
	
	INode<T> getNext();
	void setNext(INode<T> next);
}
