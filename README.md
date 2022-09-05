# sort\_integer\_with_java with junit

Just a Junit test  to test sort\_integer\_with_java


-- pom.xml <br/>
dependency : sort\_integer\_with_java<br/>
dependency : junit (4.12)<br/>

<br/>
-- SortIntegersTest.java<br/>
public void testSort() {<br/>
&nbsp;&nbsp;&nbsp;&nbsp;int [] intsToSort = {3,1,2};<br/>
&nbsp;&nbsp;&nbsp;&nbsp;int [] expectedIntSorted = {1,2,3};<br/>
&nbsp;&nbsp;&nbsp;&nbsp;SortIntegers.sort(intsToSort);<br/>
&nbsp;&nbsp;&nbsp;&nbsp;assertArrayEquals(expectedIntSorted, intsToSort);<br/>
	