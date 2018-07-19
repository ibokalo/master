package HomeWork2;

public class aboutPage extends page implements IFF {

	public aboutPage(String title, String url, String htmlContent) {
		super(title, url, htmlContent);
		
	}

	@Override
	public String htmlBuilder() {
		
		return "htmlContentAboutPage";
	}

	@Override
	public String getHtmlFf() {
		
		return this.htmlBuilder();
	}
	

}
