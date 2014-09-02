package Kapittel1;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class Oppgave121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(args[0]);
		Point2D[] points = new Point2D[N];
		for(int i = 0; i<N; i++){
			points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
			StdDraw.point(points[i].x(), points[i].y());
		}
		//Finding the closes pair of points
		double leastDist = 1;
		Point2D[] closestPoint = new Point2D[2];
		for(int i = 0; i<points.length;i++){
			for(int j = 0; j<points.length;j++){
				if(j != i && getDistance(points[i], points[j]) <leastDist){
					leastDist = getDistance(points[i], points[j]);
					closestPoint[0] = points[i];
					closestPoint[1] = points[j];
				}
			}
		}
		StdOut.println(leastDist);
		StdDraw.line(closestPoint[0].x(), closestPoint[0].y(), closestPoint[1].x(), closestPoint[1].y());

	}
	
	private static double getDistance(Point2D point1, Point2D point2){
		double x = point1.x() - point2.x();
		double y = point1.y() - point2.y();
		return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2))); 
	}

}
