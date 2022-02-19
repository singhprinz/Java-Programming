import java.awt.*;
import java.awt.event.*;
class StopWatch extends Frame implements Runnable,ActionListener
{
	Frame f;
	Button start,stop,reset;
	Label l1;
	Font fo;
	int ms=0,s=0,m=0,h=0;
	Thread th;
	public static void main(String args[])
	{
		new StopWatch();
	}
	public StopWatch()
	{
		f=new Frame("StopWatch");
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		l1=new Label("00:00:00:00");
		l1.setBounds(100,100,150,28);
		fo=new Font("Times Roman",Font.BOLD,20);
		l1.setFont(fo);	
		l1.setForeground(new Color(112,241,75));
		l1.setBackground(new Color(0,0,200));
		f.add(l1);
		start=new Button("Start");
		stop=new Button("Stop");
		reset=new Button("Reset");
		start.setFont(fo);
		stop.setFont(fo);
		reset.setFont(fo);
		start.setBounds(30,200,100,28);
		stop.setBounds(150,200,100,28);
		reset.setBounds(270,200,100,28);
		f.add(start);
		f.add(stop);
		f.add(reset);
		f.setBackground(new Color(0,0,200));
		start.addActionListener(this);
		stop.addActionListener(this);
		reset.addActionListener(this);
	}
	public void run()
	{
		while(true)
		{
			l1.setText(h+":"+m+":"+s+":"+ms);
			try
			{
				th.sleep(100);
			}
			catch(Exception e)
			{
			}
			ms++;
			if(ms==10)
			{
				ms=0;
				s++;
				if(s==60)
				{
					s=0;
					m++;
					if(m==60)
					{
						m=0;
						h++;
					}
				}
			}
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="Start")
		{
			th=new Thread(this);
			th.start();
		}
		else if(e.getActionCommand()=="Stop")
		{
			th.stop();
		}
		else
		{
			h=0;
			m=0;
			s=0;
			ms=0;
			l1.setText(h+":"+m+":"+s+":"+ms);
		}
	}
}