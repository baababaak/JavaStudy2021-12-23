package a22_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import a22_윈도우빌더.Content.UserBeans;
import a22_윈도우빌더.Dao.UserDao;
import a22_윈도우빌더.Dto.UserEntity;
import a22_윈도우빌더.Service.UserService;
import db.DBConnectionMgr;

import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private UserBeans userBeans;
	private UserService userService;
	
	private JPanel mainCard;
	private CardLayout cardLayout;
	private JTextField usernameTextField;
	private JPasswordField passwordTextField;
	private JLabel userInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		userBeans = new UserBeans();
		userService = userBeans.getUserService();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 889, 458);
		mainCard = new JPanel();
		mainCard.setBorder(null);
		setContentPane(mainCard);
		cardLayout = new CardLayout(0, 0);
		mainCard.setLayout(cardLayout);
		
		cardLayout.show(mainCard, "loginPanel");
		
		JPanel loginPanel = new JPanel();
		mainCard.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);
		
		usernameTextField = new JTextField();
		usernameTextField.setHorizontalAlignment(SwingConstants.CENTER);
		usernameTextField.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		usernameTextField.setBounds(288, 102, 272, 48);
		loginPanel.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		passwordTextField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordTextField.setBounds(288, 160, 272, 48);
		loginPanel.add(passwordTextField);
		
		JLabel loginTitle = new JLabel("로그인 페이지");
		loginTitle.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		loginTitle.setBounds(355, 47, 145, 27);
		loginPanel.add(loginTitle);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Map<String, String> signinMessage = userService.signin(usernameTextField.getText(), passwordTextField.getText());
				JOptionPane.showMessageDialog(null, signinMessage.get("msg"), signinMessage.get("title"), JOptionPane.PLAIN_MESSAGE);
				if(signinMessage.get("code").equals("2")) {
					UserEntity userEntity = userService.getuser(usernameTextField.getText());
					userInfo.setText(userEntity.toString());
					cardLayout.show(mainCard, "indexPanel");
				}
			}
		});
		
		loginBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		loginBtn.setBounds(288, 235, 272, 48);
		loginPanel.add(loginBtn);
		
		JButton signupBtn = new JButton("회원가입");
		signupBtn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		signupBtn.setBounds(288, 293, 272, 48);
		loginPanel.add(signupBtn);
		
		JPanel indexPanel = new JPanel();
		mainCard.add(indexPanel, "indexPanel");
		indexPanel.setLayout(null);
		
		userInfo = new JLabel();
		JLabel userInfo = new JLabel("");
		userInfo.setHorizontalAlignment(SwingConstants.CENTER);
		userInfo.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		userInfo.setBounds(12, 160, 849, 34);
		indexPanel.add(userInfo);
		
		JButton btnNewButton = new JButton("로그아웃");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(764, 10, 97, 23);
		indexPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("마이페이지");
		btnNewButton_1.setBounds(655, 10, 97, 23);
		indexPanel.add(btnNewButton_1);
	}
}
