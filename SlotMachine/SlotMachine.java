import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SlotMachine extends JFrame{

	JLabel first, second, third, text;
	SlotMachine(){
		setTitle("슬롯머신");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		
		setLayout(null);
		addKeyListener(new MyKeyAdapter());
		
		first = new JLabel("0",SwingConstants.CENTER);
		second = new JLabel("0",SwingConstants.CENTER);
		third = new JLabel("0",SwingConstants.CENTER);
		text = new JLabel("시작합니다.",SwingConstants.CENTER);
		
		first.setBackground(Color.ORANGE);
		first.setSize(70,100);
		first.setLocation(50, 50);
		first.setForeground(Color.WHITE);
		first.setFont(new Font("ARIAL",Font.ITALIC,30));
		first.setOpaque(true);
		
		second.setBackground(Color.ORANGE);
		second.setSize(70,100);
		second.setLocation(160, 50);
		second.setForeground(Color.WHITE);
		second.setFont(new Font("ARIAL",Font.ITALIC,30));
		second.setOpaque(true);
		
		third.setBackground(Color.ORANGE);
		third.setSize(70,100);
		third.setLocation(270, 50);
		third.setForeground(Color.WHITE);
		third.setFont(new Font("ARIAL",Font.ITALIC,30));
		third.setOpaque(true);
		
		text.setSize(300, 50);
		text.setLocation(40, 170);
		
		add(first);
		add(second);
		add(third);
		add(text);
		
		setVisible(true);
	}
	
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar()==' ' || e.getKeyChar()=='\n') {	
				//3개의 수를 (0~9)랜덤하게 발생
				first.setText((int)(Math.random()*5)+"");
				second.setText((int)(Math.random()*5)+"");
				third.setText((int)(Math.random()*5)+"");
				
				//모두 동일한 수일 때 “축하합니다”를, 아니면 "아쉽군요"를 출력
				if(first.getText().equals(second.getText()) && second.getText().equals(third.getText())) 
					text.setText("****축하합니다!****");
				else
					text.setText("아쉽군요");
			}
		}
	}

	public static void main(String[] args) {
		new SlotMachine();
	}
}
