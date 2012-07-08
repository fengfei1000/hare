package fengfei.commons.jsp.tags.ui;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DefineTag extends SimpleTagSupport {

	public final static String CONTEXT_KEY = "HARE_DEFINE_TAG_";
	private String name;

	@Override
	public void doTag() throws JspException, IOException {
		PageContext pageContext = (PageContext) getJspContext();
		try {
			pageContext.getOut().clear();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ServletRequest request = pageContext.getRequest();
		request.setAttribute(CONTEXT_KEY + name, this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void invoke(Writer out) throws IOException, JspException {
		getJspBody().invoke(out);
	}
}
