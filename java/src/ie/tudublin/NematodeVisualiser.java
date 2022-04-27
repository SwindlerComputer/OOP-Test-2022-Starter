package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{

		}		
		if (keyCode == RIGHT)
		{

		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();	
		loadNematodes(); // load nematodes in list
		

	}
	
	ArrayList<Nematode> nems = new ArrayList<>();
	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv","header");

		for(TableRow r:table.rows())
		{
			Nematode n = new Nematode(r);
			nematodes.add(n);
		}
	}


	public void draw()
	{	

		background(255);
		
		loadNematodes();

		for (Nematode nematode.getName());
		{
			nematode.setName(nematode.getName());
			nematode.setName(TableRow());
			fill(0, 400, 600);
			text(nematode.getName(),width/ 2, height / 4);
		}

		// arrows right and left
		float arrowhead = 25;
		stroke(255);
		//right
		line(width - width/4, height/2, width - ( (width/4) + width/6), height/2);
		line(width - width/4, height/2, width - width/4 - arrowhead, height/2 - arrowhead );

		//left
		line(width/4, height/2, (width/4) + (width/6), height/2);
		line(width/4, height/2, width/4 + arrowhead, height/2 - arrowhead);
		line(width/4, height/2, width/4 + arrowhead, height/2 + arrowhead); 
		
		
	}
	
}
