package com.redhat.ceylon.compiler.model;

import java.util.Collections;
import java.util.List;


public class Class extends ClassOrInterface implements Functional {
	
    boolean isAbstract;
    boolean formal;    
	ParameterList parameterList;
	
	public boolean isFormal() {
		return formal;
	}

	public void setFormal(boolean formal) {
		this.formal = formal;
	}

	public boolean isAbstract() {
		return isAbstract;
	}
	
	public void setAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }
	
	public ParameterList getParameterList() {
        return parameterList;
    }
	
	public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }
		
	@Override
	public List<ParameterList> getParameterLists() {
	    if (parameterList==null) {
	        return Collections.emptyList();
	    }
	    else {
	        return Collections.singletonList(parameterList);
	    }
	}
	
	@Override
	public void addParameterList(ParameterList pl) {
	    parameterList = pl;
	}
    
}
