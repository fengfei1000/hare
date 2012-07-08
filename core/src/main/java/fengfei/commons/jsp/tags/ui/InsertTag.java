 
package fengfei.commons.jsp.tags.ui;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class InsertTag extends SimpleTagSupport {
	private String name;

	@Override
	public void doTag() throws JspException, IOException {
		PageContext pageContext = (PageContext) getJspContext();
		ServletRequest request = pageContext.getRequest();
		DefineTag tag = (DefineTag) request.getAttribute(DefineTag.CONTEXT_KEY + name);
		if (tag != null) {
			tag.invoke(getJspContext().getOut());
		}
		super.doTag();
	}

	public String getName() {
		return name;
	}

	public void setName(
		String name) {
		this.name = name;
	}
}
