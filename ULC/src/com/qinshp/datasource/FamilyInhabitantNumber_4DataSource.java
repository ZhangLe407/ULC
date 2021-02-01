package com.qinshp.datasource;

import com.qinshp.controller.DataStorage;

import repast.simphony.context.Context;
import repast.simphony.data2.AggregateDataSource;

public class FamilyInhabitantNumber_4DataSource implements AggregateDataSource {

	@Override
	public String getId() {
		return "FamilyInhabitantNumber_4";
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
		return DataStorage.getInstance().getFamilyInhabitantNumber_4();
	}

	@Override
	public void reset() {

	}

}
