 
package fengfei.commons.jsp.tags.ui;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ClearTag extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		getJspContext().getOut().clear();
		getJspContext().getOut().clearBuffer();
	}
}
