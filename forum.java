package HomeWork2;

public class forum extends page implements IChrome {

	public forum(String title, String url, String htmlContent) {
		super(title, url, htmlContent);

	}


	@Override
	public String htmlBuilder() {

		return "htmlContentForum";
	}

	@Override
	public String getHtmlChrome() {
		
		return this.htmlBuilder();
	}

}
