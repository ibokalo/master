package HomeWork2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pageTest {

	public static void main(String[] args) {

		login login = new login("titleLogin", "www.login.com", "htmlContentLogin");
		forum forum1 = new forum("titleForum", "www.forum1.com", "htmlContentForum");
		forum forum2 = new forum("titleForum", "www.forum2.com", "htmlContentForum");
		homePage homePage = new homePage("titleHomePage", "www.HomePage1.com", "htmlContentHomePage");
		aboutPage aboutPage1 = new aboutPage("titleAboutPage", "www.aboutPage1.com", "htmlContentaboutPage");
		aboutPage aboutPage2 = new aboutPage("titleAboutPage", "www.aboutPage2.com", "htmlContentaboutPage");

		List<page> listPageAll = new ArrayList<>();
		listPageAll.add(login);
		listPageAll.add(forum1);
		listPageAll.add(forum2);
		listPageAll.add(homePage);
		listPageAll.add(aboutPage1);
		listPageAll.add(aboutPage2);
		
	
		
		System.out.println("All Pages:" + listPageAll);
		
		List<page> listPageChrome = new ArrayList<>();
		listPageChrome.add(login);
		listPageChrome.add(forum1);
		listPageChrome.add(forum2);
		listPageChrome.add(homePage);
		
		System.out.println("Chrome Pages:" + listPageChrome);
		
		List<page> listPageFf = new ArrayList<>();
		listPageFf.add(login);
		listPageFf.add(homePage);
		listPageFf.add(aboutPage1);
		listPageFf.add(aboutPage2);
		
		System.out.println("FF Pages:" + listPageFf);
		   
        for(page pages : listPageAll) {
        	System.out.print(pages.htmlBuilder());
        	System.out.println(pages.getTitle());
        	
            Map<String, List<page>> hashMap = new HashMap<>();

            for (page page : listPageAll) {
                System.out.println("Html content" + page.htmlBuilder());
                String pageTitle = page.getTitle();
                if (!hashMap.containsKey(pageTitle)) {
                    hashMap.put(pageTitle, new ArrayList<>());
                }
                hashMap.get(pageTitle).add(page);
            }

            System.out.println(hashMap);

            System.out.println("Unique titles:");

            for (Map.Entry<String, List<page>> entry : hashMap.entrySet()) {
                System.out.println(entry.getKey());
            }

        }
        
        
	}
}
