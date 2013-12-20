package cookie.model;

import java.util.ArrayList;
/**
 * Makes the array list of tips and cheats and returns them.
 * @author Kiani, CJ, Jaren, Noelle, Mady
 *
 */
public class Cookie

{

	private ArrayList<String> CheatList;

	public Cookie()
	{
		CheatList = new ArrayList<>();

		fillTheCheatList();
	}
	
	public ArrayList<String> getCheatList()
	{
		return CheatList;
	}
	/**
	 * List of cheats to appear
	 * 
	 */
	private void fillTheCheatList()
	{
		CheatList.add("\n **Auto Buy Stuff in the Shop**\n" + "setInterval(function() {" + " for(i=Game.UpgradesInStore.length-1; i >= 0; i--){" + " Game.UpgradesInStore[i].buy();" + " }"
				+ "for(i=Game.ObjectsById.length-1; i >= 0; i--){" + "Game.ObjectsById[i].buy();" + " }" + "}, 100);");
		CheatList.add("\n**Show Golden Cookie delay in Title Bar**\n" + "setInterval(function() {"
				+ " document.title='(' + Math.floor(Game.goldenCookie.delay / Game.fps) + ' s) '+Beautify(Game.cookies)+' '+(Game.cookies==1?'cookie':'cookies');" + "}, Math.floor(500/Game.fps));");
		CheatList.add("\n**Auto-click Cookie**\n" + "setTimeout(heartbeat,1);" +" function heartbeat(){" + "eventFire(document.querySelector('#bigCookie'),'click');" + "setTimeout(heartbeat,1);" + "}"
				+ "function eventFire(el, etype){" + "if (el.fireEvent) {" + "(el.fireEvent('on' + etype));" + "} else {" + "var evObj = document.createEvent('Events');"
				+ "evObj.initEvent(etype, true, false);" + "el.dispatchEvent(evObj);" + "}" + "}");
		CheatList.add("\n**Infinite Gold Cookie Clicker Variant**\n" + "setTimeout(heartbeat,1);" + "function heartbeat(){" + "eventFire(document.querySelector('#goldenCookie'),'click');"
				+ "setTimeout(heartbeat,1);" + "}" + "function eventFire(el, etype){" + "if (el.fireEvent) {" + "(el.fireEvent('on' + etype));" + "} else {"
				+ "var evObj = document.createEvent('Events');" + "evObj.initEvent(etype, true, false);" + "el.dispatchEvent(evObj);" + "}" + "}");
		CheatList.add("\n**Automatically Click Golden Cookies**\n"+"setInterval(function() {if(Game.goldenCookie.life > 0)Game.goldenCookie.click();}, 100);");
		CheatList.add("\n**Golden Cookies Appear Instantly**\n"+"setInterval(function(){Game.goldenCookie.delay=0;}, 0);");
		CheatList.add("\n**Next Upgrade From the Bingo Center Available Instantly**\n"+"setInterval(function(){Game.researchT=0;}, 0);");
		CheatList.add("\n**Elder Pledge Period Setter**\n"+"Game.pledgeT=time;");
		CheatList.add("\n**Enable Every Upgrade**\n"+"Game.UpgradesById.forEach(function(i) {if (i.bought === 0) { Game.cookies +=i.basePrice; i.buy(); }})");
		CheatList.add("\n**Set Cookie Output Rate**\n"+"Game.cookiesPs = DesiredAmountofCookiesPerSecond;");
		CheatList.add("\n**Completely Ruin the Fun of the Game with this one**\n"+"Game.RuinTheFun ()");
	}

	private ArrayList<String> TipList;

	{
		TipList = new ArrayList<>();

		fillTipList();
	}

	public ArrayList<String> getTipList()
	{
		return TipList;
	}
	/**
	 * List of tips to appear.
	 */
	private void fillTipList()
	{
		TipList.add("\n Don't miss your golden cookies they can be a game changer!");
		TipList.add("\n If you fall behind save your cookies and keep clicking!");
		TipList.add("\n Upgrades are a good way to get ahead!");
		TipList.add("\n Run in the background as much as possible.");
		TipList.add("\n Kill the sugar bunny!!!");
		TipList.add("\n While the golden cookie is running make sure you buy and click as much as possible!");
		TipList.add("\n Wrinkerls: At first they seem damaging, but once you click on them, you get +5% back plus all your cookies you lost!");
		TipList.add("\n Pop wrinklers during Golden Cookies!");
		TipList.add("\n Pumpkin cookies can sometimes be good for you and sometimes bad; they're a hit and miss.");
		
		
	}


}
