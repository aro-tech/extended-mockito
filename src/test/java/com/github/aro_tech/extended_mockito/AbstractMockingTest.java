package com.github.aro_tech.extended_mockito;

import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMockingTest {

	protected static interface TestInterface {
		public boolean doAThingWithAString(String arg);
	
		public boolean doAThingWithAList(List<String> arg);
	
		public boolean doAThingWithASet(Set<String> arg);
	
		public boolean doAThingWithAMap(Map<String, TestBean> arg);
	
		public boolean doAThingWithAnInt(int arg);
	
		public boolean doAThingWithALong(long arg);
	
		public boolean doAThingWithADouble(double arg);
	
		public boolean doAThingWithAFloat(float arg);
	
		public boolean doAThingWithAByte(byte arg);
	
		public boolean doAThingWithAChar(char arg);
	
		public boolean doAThingWithAShort(short arg);
	
		public boolean doAThingWithATestBean(TestBean arg);
	
	}

	protected static class TestBean {
		String toStr;
	
		/**
		 * 
		 * Constructor
		 * 
		 * @param toStr
		 *            The value which will appear in toString()
		 */
		public TestBean(String toStr) {
			this.toStr = toStr;
		}
	
		@Override
		public String toString() {
			return toStr;
		}
	}

	protected TestInterface mock = makeMock();

	public AbstractMockingTest() {
		super();
	}
	
	protected abstract TestInterface makeMock();

}