package com.infly.carparking.bis;

public class LoginTestAction {/*
	private User user;
	private String tip_msg;
	private String continue_url;
	private String key;
	
	
	public String getContinue_url() {
		return continue_url;
	}
	public void setContinue_url(String continue_url) {
		this.continue_url = continue_url;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTip_msg() {
		return tip_msg;
	}
	public void setTip_msg(String tip_msg) {
		this.tip_msg = tip_msg;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	public String login(){
		if ("".equals(getUser().getName())){
			setTip_msg("input your name");
			return "error";
		}
		if ("".equals(getUser().getPassword())){
			setTip_msg("input your password");
			return "error";
		}
		if (isLogined(getUser().getName())){
			setTip_msg("Click here Now Continue");
			setContinue_url("loginContinue.action?key=" + getUser().getName());
			return "error";
		}
		else {
			ActionContext.getContext().getSession().put("user", getUser());
			ActionContext.getContext().getApplication().put(getUser().getName(), getUser().getName());
			setTip_msg(getUser().getName() + " Welcome Back");
			System.out.println(ServletActionContext.getRequest().getRemoteAddr());
			return "success";
		}
	}
	private boolean isLogined(String name){
		boolean flag = false;
		if (null != ActionContext.getContext().getApplication().get(name)){
			flag = true;
		}
		return flag;
	}
	public String loginContinue(){
		User temp = (User)ActionContext.getContext().getSession().remove("user");
		ActionContext.getContext().getSession().put("user", temp);
		ActionContext.getContext().getApplication().remove(ServletActionContext.getRequest().getParameter("key"));
		ActionContext.getContext().getApplication().put(ServletActionContext.getRequest().getParameter("key"), ServletActionContext.getRequest().getParameter("key"));
		setTip_msg(ServletActionContext.getRequest().getParameter("key")+"Welcome Back");
		return "success";
	}
	public String logout(){
		setKey(ServletActionContext.getRequest().getParameter("key"));
		if (null == getKey() || "".equals(getKey())){
			setTip_msg("Logout Failed");
			setContinue_url(null);
			return "success";
			}
		ActionContext.getContext().getSession().remove("user");
		ActionContext.getContext().getApplication().remove(getKey());
		setTip_msg("Logout success");
		setContinue_url(null);
		return "success";
	}*/
}
