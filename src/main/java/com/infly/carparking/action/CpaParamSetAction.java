package com.infly.carparking.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.dao.InsertDataDao;
import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.CpaParamBean;
import com.opensymphony.xwork2.ActionSupport;

public class CpaParamSetAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1304771205900265309L;
	private String name;
	private String address;
	private String tel;
	private int maxb;
	private int oneb;
	private int overb;
	private int maxs;
	private int ones;
	private int overs;
	private int pcn;
	private String type;
	private List<CpaParamBean> cpb;

	public List<CpaParamBean> getCpb() {
		return cpb;
	}

	public void setCpb(List<CpaParamBean> cpb) {
		this.cpb = cpb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getMaxb() {
		return maxb;
	}

	public void setMaxb(int maxb) {
		this.maxb = maxb;
	}

	public int getOneb() {
		return oneb;
	}

	public void setOneb(int oneb) {
		this.oneb = oneb;
	}

	public int getOverb() {
		return overb;
	}

	public void setOverb(int overb) {
		this.overb = overb;
	}

	public int getMaxs() {
		return maxs;
	}

	public void setMaxs(int maxs) {
		this.maxs = maxs;
	}

	public int getOnes() {
		return ones;
	}

	public void setOnes(int ones) {
		this.ones = ones;
	}

	public int getOvers() {
		return overs;
	}

	public void setOvers(int overs) {
		this.overs = overs;
	}

	public int getPcn() {
		return pcn;
	}

	public void setPcn(int pcn) {
		this.pcn = pcn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@SuppressWarnings("unchecked")
	public String execute() throws Exception{
		HttpSession session = ServletActionContext.getRequest().getSession();
		cpb = QueryDao.queryAllCpaParam();
		session.setAttribute("cpaname", cpb);
		CpaParamBean cpb = new CpaParamBean();
		
		cpb.setCpaParamAddress(address);
		cpb.setCpaParamMaxfeeBig(maxb);
		cpb.setCpaParamMaxfeeSmall(maxs);
		cpb.setCpaParamName(name);
		cpb.setCpaParamOneBig(oneb);
		cpb.setCpaParamOneSmall(ones);
		cpb.setCpaParamOverBig(overb);
		cpb.setCpaParamOverSmall(overs);
		cpb.setCpaParamPcn(pcn);
		cpb.setCpaParamTel(tel);
		cpb.setCpaParamType(type);
		
		InsertDataDao.cpaParamInsert(cpb);
		
		return SUCCESS;
	}
}
