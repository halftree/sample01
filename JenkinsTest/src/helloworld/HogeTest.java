package helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HogeTest {

	@Test
	public void test() {
		Hoge f = new Hoge();
		assertEquals(f.foo(),"foo" );
	}

}
