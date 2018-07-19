package HomeWork2;

public class homePage extends page implements IChrome, IFF {

	public homePage(String title, String url, String htmlContent) {
		super(title, url, htmlContent);

	}


	@Override
	public String htmlBuilder() {

		return "htmlContentHomePage";
	}

	@Override
	public String getHtmlChrome() {
		
		return this.htmlBuilder();
	}

	@Override
	public String getHtmlFf() {
		
		return this.htmlBuilder();
	}

}
