package Code;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;

public class Rule extends JFrame{
	
	JButton btn1;
	
	public Rule(String title)
	{
		super(title);
		addcontrols();
		showWindow();
		addEvents();
	}
	public void addcontrols()
	{
		JLayeredPane lay = getLayeredPane();
		
		JLabel bg1 = new JLabel();
		Image bgImage = Toolkit.getDefaultToolkit().createImage(Rule.class.getResource("/Picture/1233.png"));
		bg1.setIcon(new ImageIcon(bgImage));
				
		lay.add(bg1, Integer.valueOf(0));
		bg1.setBounds(0,0,1280,720);
		
		JLabel l1 = new JLabel("<html>1.Trang phục: Đặt quy định về trang phục <br>chuyên nghiệp và phù hợp với môi trường làm việc.</html>");
		l1.setForeground(new Color(232, 232, 232)); //set color for the text
		l1.setFont(new Font("ui-sans-serif", Font.BOLD, 15));
		lay.add(l1, Integer.valueOf(1));
		l1.setBounds(22, 13, 389, 46);
		l1.setOpaque(false);
		
		JLabel l0 = new JLabel("<html>2.Thái độ phục vụ: Yêu cầu nhân viên luôn lịch sự, niềm nở và chu đáo khi phục vụ khách hàng.</html>");
		l0.setForeground(new Color(232, 232, 232)); //set color for the text
		l0.setFont(new Font("ui-sans-serif", Font.BOLD, 15));
		lay.add(l0, Integer.valueOf(1));
		l0.setBounds(22, 62, 389, 46);
		l0.setOpaque(false);
		
		JLabel l2 = new JLabel("<html>3.Sạch sẽ và gọn gàng: Đảm bảo quán luôn sạch sẽ và gọn gàng, bao gồm cả khu vực phục vụ và khu vực làm việc.</html>");
		l2.setForeground(new Color(232, 232, 232)); //set color for the text
		l2.setFont(new Font("ui-sans-serif", Font.BOLD, 15));
		lay.add(l2, Integer.valueOf(1));
		l2.setBounds(22, 120, 389, 51);
		l2.setOpaque(false);
		
		JLabel l3 = new JLabel("<html>4.Thời gian làm việc: Xác định rõ thời gian làm việc và quy định về việc đến trễ, nghỉ phép và làm thêm giờ.</html>");
		l3.setForeground(new Color(232, 232, 232)); //set color for the text
		l3.setFont(new Font("ui-sans-serif", Font.BOLD, 15));
		lay.add(l3, Integer.valueOf(1));
		l3.setBounds(22, 190, 368, 51);
		l3.setOpaque(false);
		
		JLabel l4 = new JLabel("<html>5.Chất lượng sản phẩm: Đảm bảo nhân viên hiểu rõ về chất lượng sản phẩm và quy trình pha chế.</html>");
		l4.setForeground(new Color(232, 232, 232)); //set color for the text
		l4.setFont(new Font("ui-sans-serif", Font.BOLD, 15));
		lay.add(l4, Integer.valueOf(1));
		l4.setBounds(22, 250, 400, 51);
		l4.setOpaque(false);
		
		JLabel l5 = new JLabel("<html>6.Giao tiếp: Khuyến khích giao tiếp tích cực và hiệu quả tại quán.</html>");
		l5.setForeground(new Color(232, 232, 232)); //set color for the text
		l5.setFont(new Font("ui-sans-serif", Font.BOLD, 15));
		lay.add(l5, Integer.valueOf(1));
		l5.setBounds(22, 300, 374, 51);
		l5.setOpaque(false);
		
		JLabel l6 = new JLabel("<html>7.Xử lý khiếu nại: Đào tạo nhân viên về xử lý khiếu nại khách hàng chuyên nghiệp và tôn trọng.</html>");
		l6.setForeground(new Color(232, 232, 232)); //set color for the text
		l6.setFont(new Font("ui-sans-serif", Font.BOLD, 15));
		lay.add(l6, Integer.valueOf(1));
		l6.setBounds(22, 350, 395, 51);
		l6.setOpaque(false);
		
		JLabel l7 = new JLabel("<html>8.An toàn và vệ sinh: Tuân thủ các quy tắc an toàn và vệ sinh trong quá trình làm việc.</html>");
		l7.setForeground(new Color(232, 232, 232)); //set color for the text
		l7.setFont(new Font("ui-sans-serif", Font.BOLD, 15));
		lay.add(l7, Integer.valueOf(1));
		l7.setBounds(22, 400, 399, 51);
		l7.setOpaque(false);
		
		JLabel l8 = new JLabel("<html>9.Quy định về tiền lương và phúc lợi: Cung cấp thông tin rõ ràng về tiền lương, chế độ bảo hiểm và các phúc lợi khác.</html>");
		l8.setForeground(new Color(232, 232, 232)); //set color for the text
		l8.setFont(new Font("ui-sans-serif", Font.BOLD, 15));
		lay.add(l8, Integer.valueOf(1));
		l8.setBounds(22, 470, 410, 51);
		l8.setOpaque(false);
		
		JLabel l9 = new JLabel("<html>10.Đạo đức nghề nghiệp: Khuyến khích nhân viên thể hiện đạo đức nghề nghiệp và tôn trọng đối với khách hàng và đồng nghiệp.</html>");
		l9.setForeground(new Color(232, 232, 232)); //set color for the text
		l9.setFont(new Font("ui-sans-serif", Font.BOLD, 15));
		lay.add(l9, Integer.valueOf(1));
		l9.setBounds(22, 540, 379, 51);
		l9.setOpaque(false);
		
		btn1 = new JButton("Home");
		btn1.setContentAreaFilled(false);
		btn1.setForeground(new Color(168, 147, 103));
		Font btna = new Font(".VnVogue", Font.BOLD, 18);
		btn1.setFont(btna);
		btn1.setBorder(new EmptyBorder(0,  0,0,0));
		lay.add(btn1, Integer.valueOf(1));
		btn1.setBounds(329, 610, 85, 21);
		btn1.setOpaque(false);
		
	}
	
	public void addEvents()
	{
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Rule.this.setVisible(false);
				new Main("Main");
			}
		});
	}
	
	public static void main(String[] args)
	{
		new Rule("Rule");
	}
	public void showWindow()
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(450, 700);
		this.setLocationRelativeTo(null);
		this.setState(MAXIMIZED_BOTH);	
		this.setResizable(false);
	}

}
