package HomeWork2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class pageTest {

	public static void main(String[] args) {

		login login = new login("titleLogin", "www.login.com", "htmlContentLogin");
		forum forum1 = new forum("titleForum", "www.forum1.com", "htmlContentForum");
		forum forum2 = new forum("titleForum", "www.forum2.com", "htmlContentForum");
		homePage homePage = new homePage("titleHomePage", "www.HomePage.com", "htmlContentHomePage");
		aboutPage aboutPage1 = new aboutPage("titleAboutPage", "www.aboutPage1.com", "htmlContentaboutPage");
		aboutPage aboutPage2 = new aboutPage("titleAboutPage", "www.aboutPage2.com", "htmlContentaboutPage");

		List<page> listPageAll = new ArrayList<>();
		listPageAll.add(login);
		listPageAll.add(forum1);
		listPageAll.add(forum2);
		listPageAll.add(homePage);
		listPageAll.add(aboutPage1);
		listPageAll.add(aboutPage2);

		for (page page : listPageAll) {
			System.out.println("listPageAll :  " + page);
		}

		// Sposib #2 allPage
		/*
		 * Iterator<page> listPageAll1 = listPageAll.iterator(); while
		 * (listPageAll1.hasNext()) { System.out.println("listPageAll :   " +
		 * listPageAll1.next());
		 */

		List<page> listPageChrome = new ArrayList<>();
		listPageChrome.add(login);
		listPageChrome.add(forum1);
		listPageChrome.add(forum2);
		listPageChrome.add(homePage);

		for (page page : listPageChrome) {
			System.out.println("listPageChrome :  " + page);
		}

		List<page> listPageFf = new ArrayList<>();
		listPageFf.add(login);
		listPageFf.add(homePage);
		listPageFf.add(aboutPage1);
		listPageFf.add(aboutPage2);

		for (page page : listPageFf) {
			System.out.println("listPageFf :  " + page);
		}

		Map<String, List<page>> hashMap = new HashMap<>();

		for (page page : listPageAll) {
			System.out.println("Run htmlBuilder :   " + page.htmlBuilder());
			String pageTitle = page.getTitle();
			if (!hashMap.containsKey(pageTitle)) {
				hashMap.put(pageTitle, new ArrayList<>());
			}
			hashMap.get(pageTitle).add(page);
		}

		System.out.println("Maps :   " + hashMap);

		for (Map.Entry<String, List<page>> entry : hashMap.entrySet()) {
			System.out.println("Unique titles :  " + entry.getKey());
		}
	}
}
