package cookie.controller;

import cookie.model.Cookie;
import cookie.view.CookieFrame;

/**
 * 
 * @author
 * @version
 */
public class CookieController
{
	private Cookie myCookie;
	private CookieFrame appFrame;
	private int clickCount;

	public CookieController()
	{
		myCookie = new Cookie();
		clickCount = 0;
	}

	public void start()
	{
		appFrame = new CookieFrame(this);
	}

	public Cookie getMyCookie()
	{
		return myCookie;

	}
	public String getCheatResults()
	{
		String currentResult = "";
		if (clickCount < myCookie.getCheatList().size())
		{
			currentResult = myCookie.getCheatList().get(clickCount)+"\n";
			clickCount++;
		}
		else 
		{
			clickCount = 0;
		}
		return currentResult;
	}
	
	public String getTipResults()
	{
		String currentResult = "";
		if (clickCount < myCookie.getTipList().size())
		{
			currentResult = myCookie.getTipList().get(clickCount)+"\n";
			clickCount++;
		}
		else 
		{
			clickCount = 0;
		}
		return currentResult;
	}
	
}
