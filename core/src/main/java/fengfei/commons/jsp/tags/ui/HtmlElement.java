package fengfei.commons.jsp.tags.ui;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * *
 * 
 
 * 
 * 基本的HTML元素对象
 * 
 * <pre>
 * 使用一:HtmlElement div=new HtmlElement(&quot;div&quot;);
 * 使用二:
 * 
 *  public class HtmlDiv extends HtmlElement {
 *  public HtmlRow() {
 *  	super(&quot;div&quot;);
 *  	}
 *  }
 *  HtmlDiv div=new HtmlDiv();s
 * </pre>
 * 
 */
public class HtmlElement {
	private String tagName;
	private Map<String, String> attributes = new HashMap<String, String>();
	private List<HtmlElement> children = new ArrayList<HtmlElement>();
	private String value = "";
	private String text = "";

	/**
	 * 以一个标签名称构造
	 * 
	 * @param tagName
	 */
	public HtmlElement(String tagName) {
		this.tagName = tagName;
	}

	/**
	 * 设置内含的文本值,该值将出现在内含子元素之前,开始标签之后
	 * 
	 * @param value
	 */
	public void setValue(
		String value) {
		this.value = value;
	}

	public List<HtmlElement> getChildren() {
		return children;
	}

	/**
	 * 添加一个子元素
	 * 
	 * @param element
	 */
	public void addChild(
		HtmlElement element) {
		this.children.add(element);
	}

	/**
	 * 添加一个属性
	 * 
	 * @param name
	 *            属性名称
	 * @param value
	 *            属性值
	 */
	public void addAttribute(
		String name,
		String value) {
		this.attributes.put(name, value);
	}

	/**
	 * 获取属性值
	 * 
	 * @param name
	 * @return
	 */
	public String getAttributeValue(
		String name) {
		return this.attributes.get(name);
	}

	/**
	 * 返回HTML
	 */
	@Override
	public String toString() {
		return this.toHtml();
	}

	/**
	 * 生成HTML
	 * 
	 * @return
	 */
	public String toHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		sb.append(this.tagName);
		sb.append(this.getAttr());
		sb.append(">");

		sb.append(this.value);
		for (HtmlElement e : this.children) {
			sb.append(e.toHtml());
		}
		sb.append(this.text);
		sb.append("</");
		sb.append(this.tagName);
		sb.append(">");

		return sb.toString();
	}

	public void printHtml(
		PrintWriter out) {
		out.print("<");
		out.print(this.tagName);
		out.print(this.getAttr());
		out.print(">");
		out.print(this.value);
		for (HtmlElement e : this.children) {
			e.printHtml(out);
		}
		out.print(this.text);
		out.print("</");
		out.print(this.tagName);
		out.print(">");
	}

	/**
	 * HTML 元素属性生成
	 * 
	 * @return
	 */
	protected String getAttr() {
		StringBuffer sb = new StringBuffer();
		Set<Entry<String, String>> attr = this.attributes.entrySet();
		for (Entry<String, String> entry : attr) {
			sb.append(" ");
			sb.append(entry.getKey());
			sb.append("=\"");
			sb.append(entry.getValue());
			sb.append("\"");
		}
		return sb.toString();
	}

	/**
	 * 
	 * 设置内含的值,该值将出现在内含子元素之后,结束标签之前
	 * 
	 * @param text
	 */
	public void setText(
		String text) {
		this.text = text;
	}

	public static void main(
		String[] args) {
		HtmlElement div1 = new HtmlElement("div");
		HtmlElement div2 = new HtmlElement("div");
		HtmlElement span = new HtmlElement("span");
		div1.addAttribute("class", "tuo");
		div1.addAttribute("id", "dd1");
		div1.addChild(div2);
		div1.addChild(span);
		div1.setValue("fds222222fds");
		div1.setText("wwwwwwwww");
		// System.out.println(div1.toHtml());
		// try {
		// PrintWriter out = new PrintWriter(new File("test.txt"));
		// PrintWriter out = new PrintWriter(System.out);
		// div1.printHtml(out);
		// out.flush();
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }
		PrintWriter out = new PrintWriter(System.out);
		div1.printHtml(out);
		out.flush();
	}
}
