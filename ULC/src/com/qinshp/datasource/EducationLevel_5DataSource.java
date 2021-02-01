package com.qinshp.datasource;

import com.qinshp.controller.DataStorage;

import repast.simphony.context.Context;
import repast.simphony.data2.AggregateDataSource;

public class EducationLevel_5DataSource implements AggregateDataSource {

	@Override
	public String getId() {
		return "EducationLevel_5";
	}

	@Override
	public Class<?> getDataType() {
		return int.class;
	}

	@Override
	public Class<?> getSourceType() {
		return Context.class;
	}

	@Override
	public Object get(Iterable<?> objs, int size) {
		return DataStorage.getInstance().getEducationLevel_5();
	}

	@Override
	public void reset() {

	}

}
