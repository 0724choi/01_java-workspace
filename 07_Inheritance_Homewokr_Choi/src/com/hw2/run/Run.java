package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Point;
import com.hw2.model.vo.Rectangle;

public class Run {
		
	public static void main(String[] args) {
		Point p[] = new Point[2];
		p[0] = new Point(1,2);
		p[1] = new Point(3,3);
		System.out.println("===========Point============");
		
		p[0].draw();
		p[1].draw();
		
		System.out.println("===========Circe============");
				
		Circle[] c = new Circle[2];
		c[0] = new Circle(1,2,3);
		c[1] = new Circle(3,3,4);
		
		c[0].draw();
		c[1].draw();
		
		System.out.println("===========Rectangle============");
		
		Rectangle[] r = new Rectangle[2];
		r[0] = new Rectangle(-1,-2,5,2);
		r[1] = new Rectangle(-2,5,2,8);
		
		
	
		r[0].draw();
		r[1].draw();
		
		
		System.out.println("최승균");
		
		}
		
		
	

}

