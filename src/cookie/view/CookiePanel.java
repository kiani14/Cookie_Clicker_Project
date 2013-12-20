package cookie.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import cookie.controller.CookieController;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;

public class CookiePanel extends JPanel
{
	private JButton cheatButton;
	private JButton tipButton;
	private JScrollPane cheatPane;
	private JScrollPane tipPane;
	private JTextArea cheatArea;
	private JTextArea tipArea;
	private SpringLayout baseLayout;

	private CookieController baseController;
	
	private Image baseImage;
	private ImageIcon pictureSource;
	private JLabel lblOrteildashnetorgcookieclicker;

	public CookiePanel(CookieController baseController)
	{
		this.baseController = baseController;

		cheatButton = new JButton("Click for Cheats!");
		cheatButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		tipButton = new JButton("Click for Tips!");
		tipButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, cheatButton, 0, SpringLayout.NORTH, tipButton);
		baseLayout.putConstraint(SpringLayout.WEST, cheatButton, 199, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, cheatButton, 387, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, tipButton, 784, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, tipButton, -379, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, tipButton, -202, SpringLayout.EAST, this);
		cheatArea = new JTextArea(40, 50);
		tipArea = new JTextArea(40, 50);
		cheatPane = new JScrollPane(cheatArea);
		baseLayout.putConstraint(SpringLayout.WEST, cheatPane, 53, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, cheatPane, -36, SpringLayout.NORTH, cheatButton);
		baseLayout.putConstraint(SpringLayout.EAST, cheatPane, 523, SpringLayout.WEST, this);
		tipPane = new JScrollPane(tipArea);
		baseLayout.putConstraint(SpringLayout.WEST, tipPane, 173, SpringLayout.EAST, cheatPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, tipPane, -36, SpringLayout.NORTH, tipButton);
		baseLayout.putConstraint(SpringLayout.EAST, tipPane, -73, SpringLayout.EAST, this);
		pictureSource = new ImageIcon(getClass().getResource("/cookie/view/images/background.jpg"));
		
		
		
		setupPanel();
		setupLayout();
		setupListeners1();
		setupListeners2();
	}

	/**
	 * Adds the components to the panel via the LayoutManager and sets the color
	 * and other basic info.
	 */
	private void setupPanel()
	{
		// this will be the same for every setupPanel layout
		this.setLayout(baseLayout);
		this.add(cheatButton);
		this.add(tipButton);
		this.setBackground(Color.BLUE);
		this.add(cheatPane);
		this.add(tipPane);
		cheatArea.setEditable(false);
		cheatArea.setLineWrap(true);
		cheatArea.setWrapStyleWord(true);	
		tipArea.setEditable(false);
		tipArea.setLineWrap(true);
		tipArea.setWrapStyleWord(true);
		
		JLabel lblCookie = new JLabel("Cookie Clicker Cheats and Tips!");
		baseLayout.putConstraint(SpringLayout.WEST, lblCookie, 314, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, lblCookie, -818, SpringLayout.SOUTH, this);
		lblCookie.setBackground(Color.BLACK);
		lblCookie.setForeground(Color.WHITE);
		lblCookie.setFont(new Font("DejaVu Sans Mono", Font.BOLD, 30));
		add(lblCookie);
		
		lblOrteildashnetorgcookieclicker = new JLabel("orteil.dashnet.org/cookieclicker/");
		baseLayout.putConstraint(SpringLayout.NORTH, tipPane, 23, SpringLayout.SOUTH, lblOrteildashnetorgcookieclicker);
		baseLayout.putConstraint(SpringLayout.NORTH, cheatPane, 23, SpringLayout.SOUTH, lblOrteildashnetorgcookieclicker);
		baseLayout.putConstraint(SpringLayout.NORTH, lblOrteildashnetorgcookieclicker, 6, SpringLayout.SOUTH, lblCookie);
		baseLayout.putConstraint(SpringLayout.WEST, lblOrteildashnetorgcookieclicker, 438, SpringLayout.WEST, this);
		lblOrteildashnetorgcookieclicker.setFont(new Font("DejaVu Sans", Font.PLAIN, 20));
		add(lblOrteildashnetorgcookieclicker);

	}

	private void setupLayout()
	{
		cheatButton.setIcon(new ImageIcon("C:\\Users\\kell7444\\Pictures\\large.png"));
		tipButton.setIcon(new ImageIcon("C:\\Users\\kell7444\\Pictures\\large.png"));
		baseLayout.putConstraint(SpringLayout.WEST, cheatArea, -126, SpringLayout.WEST, cheatButton);
	}

	private void setupListeners1()
	{
		cheatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				cheatArea.append(baseController.getCheatResults());
			}
		});
	}
	private void setupListeners2()
	{
		tipButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				tipArea.append(baseController.getTipResults());
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, getWidth(), getHeight(), null);
	}
}
