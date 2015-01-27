package com.hascode.tutorial.audit;

import org.audit4j.core.MetaData;

public class AuditMeta implements MetaData {
	private static final long serialVersionUID = 1L;

	@Override
	public String getActor() {
		return "anonymous";
	}

}
