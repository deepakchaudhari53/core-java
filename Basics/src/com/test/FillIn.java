package com.test;
class X{void do1(){}}
class Y extends X{void do2(){}}
public class FillIn {
public static void main(String[] args) {
	X x1 = new X();
	X x2 = new Y();
	Y y1 = new Y();
	/*
	 * which of the following lines, when uncommented, will the code compile fine?
	 */
//	x2.do2();
//	(Y)x2.do2();
//	((Y)x2).do2();
//	None of the above
}
}
