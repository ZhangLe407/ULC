package com.qinshp.datasource;

import com.qinshp.controller.DataStorage;

import repast.simphony.context.Context;
import repast.simphony.data2.AggregateDataSource;

public class FamilyInhabitantNumber_3DataSource implements AggregateDataSource {

	@Override
	public String getId() {
		return "FamilyInhabitantNumber_3";
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
		return DataStorage.getInstance().getFamilyInhabitantNumber_3();
	}

	@Override
	public void reset() {

	}

}
