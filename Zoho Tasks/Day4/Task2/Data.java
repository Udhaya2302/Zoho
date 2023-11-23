package datas;

public class Data{

double weight;
double height;

 	public Data(double weight,double height)
	{
		this.weight=weight;
		this.height=height;
	}

 	public double getBmi()
	{
		return weight/(height*height);
	}

}