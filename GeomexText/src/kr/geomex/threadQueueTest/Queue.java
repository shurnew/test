package kr.geomex.threadQueueTest;

public class Queue<E> {
	public transient E[] elementData;
	public int capacity;
	public int dataSize;
	public final long WaitTime = 10L;
	public boolean enabledd = true;
	public int front;
	public int rear;

	public Queue() {
		this(10);
	}

	public Queue(int initialCapacity) {

		if (initialCapacity < 0) {
			throw new IllegalArgumentException("Illegal Capacity:" + initialCapacity);
		}
		
			elementData = (E[]) new Object[initialCapacity];
			this.capacity = initialCapacity;
		

	}

	public synchronized void add(E e) {

		if (e == null) {

			return;
		}
		dataSize++;
		if ((front + 1) % capacity == rear) {
			throw new IllegalArgumentException("Illegal Capacity: Queue is Full.");
		}
		elementData[front] = e;
		front = (front + 1) % capacity;
		try {
			notifyAll();
		} catch (Exception ex) {

		}
	}

	public synchronized E remove() {

		while (enabledd) {

			E answer = peek();
			if (answer != null) {
				return answer;
			}
			try {
				wait(WaitTime);
			} catch (InterruptedException e) {

			}
		}
		return null;
	}

	public E peek() {
		
		if(front == rear) {
			return null;
		}
		E oldValue = elementData[rear];
		if(oldValue != null) {
			dataSize--;
			elementData[rear]=null;
			rear=(rear+1)%capacity;
		}
		return oldValue;
	}
}
