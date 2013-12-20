package cookie.view;

import javax.swing.JFrame;

import cookie.controller.CookieController;

public class CookieFrame extends JFrame
{
	private CookieController baseController;
	private CookiePanel basePanel;

	/**
	 * Creates a JFrame based window for the loop project.
	 * 
	 * @param baseController
	 *            A link to the controller for the MVC paradigm
	 */
	public CookieFrame(CookieController baseController)
	{
		this.baseController = baseController;
		this.basePanel = new CookiePanel(baseController);

		setupFrame();
	}

	/**
	 * Sets up the frame for the GUI.
	 */

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1280, 1024);
		this.setVisible(true);
	}

}
