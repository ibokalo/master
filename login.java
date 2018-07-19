package HomeWork2;

public class login extends page implements IChrome, IFF {
	

	public login(String title, String url, String htmlContent) {
		super(title, url, htmlContent);

	}

	@Override
	public String htmlBuilder() {

		return "htmlContentLogin";
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
