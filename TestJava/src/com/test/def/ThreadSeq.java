package com.test.def;

class PrintThreadSeq implements Runnable{
	static Object lock = new Object();
	static int number = 1;
	int reminder;
	public PrintThreadSeq(int reminder) {
		this.reminder=reminder;
	}
	@Override
	public void run() {
		synchronized (lock) {
			while(number <11){
				while(number %3 != reminder){
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(number);
				number++;
				lock.notifyAll();
			}
		}		
	}
}
public class ThreadSeq {
	public static void main(String[] args) {
		PrintThreadSeq p1 = new PrintThreadSeq(1);
		PrintThreadSeq p2 = new PrintThreadSeq(2);
		PrintThreadSeq p3 = new PrintThreadSeq(0);
		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();
	}
}
	