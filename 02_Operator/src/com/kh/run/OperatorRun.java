package com.kh.run;
 
import com.kh.operator.A_LogicalNegation;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Comparison;
import com.kh.operator.E_Logical;

public class OperatorRun {
	public static void main(String[] args) {
	// A_LogicalNegation a = new A_LogicalNegation();
	// a.method1();
		
		
		B_InDecrease b = new B_InDecrease();
		//b.method1();
		//b.method2();
		//b.method3();
		//b.method4();
			//b.quiz1();
		
		C_Arithmetic c =new C_Arithmetic();
		//c.method1();
		
		D_Comparison d = new D_Comparison();
		//d.method1();
		
		// d.method2();
		
		E_Logical e = new E_Logical();
		// e.method1();
		e.method2();
	}
}
