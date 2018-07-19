package HomeWork2;

public abstract class page {

	private String title;
	private String url;
	private String htmlContent;

	public page(String title, String url, String htmlContent) {
		super();
		this.title = title;
		this.url = url;
		this.htmlContent = htmlContent;
	}

	public abstract String htmlBuilder();

	public String getUrl() {
		return url;
	}

	public String getHtmlContent() {
		return htmlContent;
	}

	public String load() {

		return htmlContent;
	}

	public String refresh() {

		return load();
	}

	public String getTitle() {

		return title;
	}

	public String toString() {

		return this.title + " , " + this.url + " , " + this.htmlContent + "  .";
	}
}